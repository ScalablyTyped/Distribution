package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPermissionConstraint extends StObject {
  
  /**
    * Key of the constraint.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of allowed values.
    */
  var values: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaPermissionConstraint {
  
  inline def apply(): SchemaPermissionConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermissionConstraint]
  }
  
  extension [Self <: SchemaPermissionConstraint](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
