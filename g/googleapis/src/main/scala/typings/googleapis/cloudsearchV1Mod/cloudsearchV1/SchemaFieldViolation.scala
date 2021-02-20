package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaFieldViolation extends StObject {
  
  /**
    * Description of the error.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Path of field with violation.
    */
  var field: js.UndefOr[String] = js.native
}
object SchemaFieldViolation {
  
  @scala.inline
  def apply(): SchemaFieldViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFieldViolation]
  }
  
  @scala.inline
  implicit class SchemaFieldViolationMutableBuilder[Self <: SchemaFieldViolation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
