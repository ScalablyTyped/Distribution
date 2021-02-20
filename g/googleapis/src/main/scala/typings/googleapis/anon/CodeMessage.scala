package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeMessage extends StObject {
  
  var code: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
}
object CodeMessage {
  
  @scala.inline
  def apply(): CodeMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeMessage]
  }
  
  @scala.inline
  implicit class CodeMessageMutableBuilder[Self <: CodeMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
