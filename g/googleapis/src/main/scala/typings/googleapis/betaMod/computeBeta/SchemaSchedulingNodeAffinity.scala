package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node Affinity: the configuration of desired nodes onto which this Instance
  * could be scheduled.
  */
trait SchemaSchedulingNodeAffinity extends StObject {
  
  /**
    * Corresponds to the label key of Node resource.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the operation of node selection.
    */
  var operator: js.UndefOr[String] = js.undefined
  
  /**
    * Corresponds to the label values of Node resource.
    */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaSchedulingNodeAffinity {
  
  inline def apply(): SchemaSchedulingNodeAffinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchedulingNodeAffinity]
  }
  
  extension [Self <: SchemaSchedulingNodeAffinity](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
