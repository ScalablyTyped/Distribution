package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom constraint that specifies a key and a list of allowed values for
  * Istio attributes.
  */
@js.native
trait SchemaPermissionConstraint extends StObject {
  
  /**
    * Key of the constraint.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * A list of allowed values.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}
object SchemaPermissionConstraint {
  
  @scala.inline
  def apply(): SchemaPermissionConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermissionConstraint]
  }
  
  @scala.inline
  implicit class SchemaPermissionConstraintMutableBuilder[Self <: SchemaPermissionConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
