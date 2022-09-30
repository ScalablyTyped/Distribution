package typings.googleCloudSpanner.protosMod.google.protobuf

import typings.googleCloudSpanner.protosMod.google.protobuf.UninterpretedOption.INamePart
import typings.long.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UninterpretedOption. */
trait IUninterpretedOption extends StObject {
  
  /** UninterpretedOption aggregateValue */
  var aggregateValue: js.UndefOr[String | Null] = js.undefined
  
  /** UninterpretedOption doubleValue */
  var doubleValue: js.UndefOr[Double | Null] = js.undefined
  
  /** UninterpretedOption identifierValue */
  var identifierValue: js.UndefOr[String | Null] = js.undefined
  
  /** UninterpretedOption name */
  var name: js.UndefOr[js.Array[INamePart] | Null] = js.undefined
  
  /** UninterpretedOption negativeIntValue */
  var negativeIntValue: js.UndefOr[Double | ^ | String | Null] = js.undefined
  
  /** UninterpretedOption positiveIntValue */
  var positiveIntValue: js.UndefOr[Double | ^ | String | Null] = js.undefined
  
  /** UninterpretedOption stringValue */
  var stringValue: js.UndefOr[js.typedarray.Uint8Array | String | Null] = js.undefined
}
object IUninterpretedOption {
  
  inline def apply(): IUninterpretedOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUninterpretedOption]
  }
  
  extension [Self <: IUninterpretedOption](x: Self) {
    
    inline def setAggregateValue(value: String): Self = StObject.set(x, "aggregateValue", value.asInstanceOf[js.Any])
    
    inline def setAggregateValueNull: Self = StObject.set(x, "aggregateValue", null)
    
    inline def setAggregateValueUndefined: Self = StObject.set(x, "aggregateValue", js.undefined)
    
    inline def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueNull: Self = StObject.set(x, "doubleValue", null)
    
    inline def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    inline def setIdentifierValue(value: String): Self = StObject.set(x, "identifierValue", value.asInstanceOf[js.Any])
    
    inline def setIdentifierValueNull: Self = StObject.set(x, "identifierValue", null)
    
    inline def setIdentifierValueUndefined: Self = StObject.set(x, "identifierValue", js.undefined)
    
    inline def setName(value: js.Array[INamePart]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: INamePart*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setNegativeIntValue(value: Double | ^ | String): Self = StObject.set(x, "negativeIntValue", value.asInstanceOf[js.Any])
    
    inline def setNegativeIntValueNull: Self = StObject.set(x, "negativeIntValue", null)
    
    inline def setNegativeIntValueUndefined: Self = StObject.set(x, "negativeIntValue", js.undefined)
    
    inline def setPositiveIntValue(value: Double | ^ | String): Self = StObject.set(x, "positiveIntValue", value.asInstanceOf[js.Any])
    
    inline def setPositiveIntValueNull: Self = StObject.set(x, "positiveIntValue", null)
    
    inline def setPositiveIntValueUndefined: Self = StObject.set(x, "positiveIntValue", js.undefined)
    
    inline def setStringValue(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueNull: Self = StObject.set(x, "stringValue", null)
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
