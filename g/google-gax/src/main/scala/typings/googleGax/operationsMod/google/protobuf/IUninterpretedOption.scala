package typings.googleGax.operationsMod.google.protobuf

import typings.googleGax.operationsMod.google.protobuf.UninterpretedOption.INamePart
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UninterpretedOption. */
@js.native
trait IUninterpretedOption extends StObject {
  
  /** UninterpretedOption aggregateValue */
  var aggregateValue: js.UndefOr[String | Null] = js.native
  
  /** UninterpretedOption doubleValue */
  var doubleValue: js.UndefOr[Double | Null] = js.native
  
  /** UninterpretedOption identifierValue */
  var identifierValue: js.UndefOr[String | Null] = js.native
  
  /** UninterpretedOption name */
  var name: js.UndefOr[js.Array[INamePart] | Null] = js.native
  
  /** UninterpretedOption negativeIntValue */
  var negativeIntValue: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  
  /** UninterpretedOption positiveIntValue */
  var positiveIntValue: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  
  /** UninterpretedOption stringValue */
  var stringValue: js.UndefOr[Uint8Array | Null] = js.native
}
object IUninterpretedOption {
  
  @scala.inline
  def apply(): IUninterpretedOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUninterpretedOption]
  }
  
  @scala.inline
  implicit class IUninterpretedOptionMutableBuilder[Self <: IUninterpretedOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregateValue(value: String): Self = StObject.set(x, "aggregateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateValueNull: Self = StObject.set(x, "aggregateValue", null)
    
    @scala.inline
    def setAggregateValueUndefined: Self = StObject.set(x, "aggregateValue", js.undefined)
    
    @scala.inline
    def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleValueNull: Self = StObject.set(x, "doubleValue", null)
    
    @scala.inline
    def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    @scala.inline
    def setIdentifierValue(value: String): Self = StObject.set(x, "identifierValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierValueNull: Self = StObject.set(x, "identifierValue", null)
    
    @scala.inline
    def setIdentifierValueUndefined: Self = StObject.set(x, "identifierValue", js.undefined)
    
    @scala.inline
    def setName(value: js.Array[INamePart]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: INamePart*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    @scala.inline
    def setNegativeIntValue(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = StObject.set(x, "negativeIntValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeIntValueNull: Self = StObject.set(x, "negativeIntValue", null)
    
    @scala.inline
    def setNegativeIntValueUndefined: Self = StObject.set(x, "negativeIntValue", js.undefined)
    
    @scala.inline
    def setPositiveIntValue(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = StObject.set(x, "positiveIntValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositiveIntValueNull: Self = StObject.set(x, "positiveIntValue", null)
    
    @scala.inline
    def setPositiveIntValueUndefined: Self = StObject.set(x, "positiveIntValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: Uint8Array): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueNull: Self = StObject.set(x, "stringValue", null)
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
