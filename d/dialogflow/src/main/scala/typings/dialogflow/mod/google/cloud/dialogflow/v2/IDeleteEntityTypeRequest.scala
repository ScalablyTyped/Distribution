package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DeleteEntityTypeRequest. */
@js.native
trait IDeleteEntityTypeRequest extends StObject {
  
  /** DeleteEntityTypeRequest name */
  var name: js.UndefOr[String | Null] = js.native
}
object IDeleteEntityTypeRequest {
  
  @scala.inline
  def apply(): IDeleteEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeleteEntityTypeRequest]
  }
  
  @scala.inline
  implicit class IDeleteEntityTypeRequestMutableBuilder[Self <: IDeleteEntityTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
