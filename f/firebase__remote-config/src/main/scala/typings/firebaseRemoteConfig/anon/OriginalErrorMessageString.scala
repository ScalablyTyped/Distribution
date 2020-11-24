package typings.firebaseRemoteConfig.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginalErrorMessageString extends js.Object {
  
  var originalErrorMessage: String = js.native
}
object OriginalErrorMessageString {
  
  @scala.inline
  def apply(originalErrorMessage: String): OriginalErrorMessageString = {
    val __obj = js.Dynamic.literal(originalErrorMessage = originalErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalErrorMessageString]
  }
  
  @scala.inline
  implicit class OriginalErrorMessageStringOps[Self <: OriginalErrorMessageString] (val x: Self) extends AnyVal {
    
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
    def setOriginalErrorMessage(value: String): Self = this.set("originalErrorMessage", value.asInstanceOf[js.Any])
  }
}
