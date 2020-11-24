package typings.dropboxjs.Dropbox.AuthDriver

import typings.dropboxjs.Dropbox.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserBase extends js.Object {
  
  def authType(): String = js.native
  
  def locationStateParam(url: String): String = js.native
  
  def onAuthStepChange(client: Client, callback: js.Function0[Unit]): Unit = js.native
}
object BrowserBase {
  
  @scala.inline
  def apply(
    authType: () => String,
    locationStateParam: String => String,
    onAuthStepChange: (Client, js.Function0[Unit]) => Unit
  ): BrowserBase = {
    val __obj = js.Dynamic.literal(authType = js.Any.fromFunction0(authType), locationStateParam = js.Any.fromFunction1(locationStateParam), onAuthStepChange = js.Any.fromFunction2(onAuthStepChange))
    __obj.asInstanceOf[BrowserBase]
  }
  
  @scala.inline
  implicit class BrowserBaseOps[Self <: BrowserBase] (val x: Self) extends AnyVal {
    
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
    def setAuthType(value: () => String): Self = this.set("authType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLocationStateParam(value: String => String): Self = this.set("locationStateParam", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAuthStepChange(value: (Client, js.Function0[Unit]) => Unit): Self = this.set("onAuthStepChange", js.Any.fromFunction2(value))
  }
}
