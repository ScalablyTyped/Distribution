package typings.gapiAuth2.gapi.auth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SigninOptionsBuilder extends js.Object {
  
  def setAppPackageName(name: String): js.Any = js.native
  
  def setFetchBasicProfile(fetch: Boolean): js.Any = js.native
  
  def setLoginHint(hint: String): js.Any = js.native
  
  def setPrompt(prompt: String): js.Any = js.native
  
  def setScope(scope: String): js.Any = js.native
}
object SigninOptionsBuilder {
  
  @scala.inline
  def apply(
    setAppPackageName: String => js.Any,
    setFetchBasicProfile: Boolean => js.Any,
    setLoginHint: String => js.Any,
    setPrompt: String => js.Any,
    setScope: String => js.Any
  ): SigninOptionsBuilder = {
    val __obj = js.Dynamic.literal(setAppPackageName = js.Any.fromFunction1(setAppPackageName), setFetchBasicProfile = js.Any.fromFunction1(setFetchBasicProfile), setLoginHint = js.Any.fromFunction1(setLoginHint), setPrompt = js.Any.fromFunction1(setPrompt), setScope = js.Any.fromFunction1(setScope))
    __obj.asInstanceOf[SigninOptionsBuilder]
  }
  
  @scala.inline
  implicit class SigninOptionsBuilderOps[Self <: SigninOptionsBuilder] (val x: Self) extends AnyVal {
    
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
    def setSetAppPackageName(value: String => js.Any): Self = this.set("setAppPackageName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFetchBasicProfile(value: Boolean => js.Any): Self = this.set("setFetchBasicProfile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLoginHint(value: String => js.Any): Self = this.set("setLoginHint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPrompt(value: String => js.Any): Self = this.set("setPrompt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetScope(value: String => js.Any): Self = this.set("setScope", js.Any.fromFunction1(value))
  }
}
