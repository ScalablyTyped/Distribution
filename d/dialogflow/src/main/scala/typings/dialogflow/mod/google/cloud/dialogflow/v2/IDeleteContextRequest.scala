package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DeleteContextRequest. */
trait IDeleteContextRequest extends StObject {
  
  /** DeleteContextRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IDeleteContextRequest {
  
  @scala.inline
  def apply(): IDeleteContextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeleteContextRequest]
  }
  
  @scala.inline
  implicit class IDeleteContextRequestMutableBuilder[Self <: IDeleteContextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
