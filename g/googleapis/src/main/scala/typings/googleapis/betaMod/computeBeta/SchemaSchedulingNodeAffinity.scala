package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSchedulingNodeAffinity extends StObject {
  
  /**
    * Corresponds to the label key of Node resource.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Defines the operation of node selection. Valid operators are IN for affinity and NOT_IN for anti-affinity.
    */
  var operator: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Corresponds to the label values of Node resource.
    */
  var values: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaSchedulingNodeAffinity {
  
  inline def apply(): SchemaSchedulingNodeAffinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchedulingNodeAffinity]
  }
  
  extension [Self <: SchemaSchedulingNodeAffinity](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorNull: Self = StObject.set(x, "operator", null)
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
