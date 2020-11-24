package typings.firebaseStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerResponse extends js.Object {
  
  var serverResponse: String | Null = js.native
}
object ServerResponse {
  
  @scala.inline
  def apply(): ServerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerResponse]
  }
  
  @scala.inline
  implicit class ServerResponseOps[Self <: ServerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setServerResponse(value: String): Self = this.set("serverResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerResponseNull: Self = this.set("serverResponse", null)
  }
}
