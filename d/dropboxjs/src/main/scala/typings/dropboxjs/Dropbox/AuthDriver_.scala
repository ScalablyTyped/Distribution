package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthDriver_ extends js.Object {
  
  def authType(): String = js.native
  
  def doAuthorize(authUrl: String, stateParam: String, client: Client, callback: QueryParamsCallback): Unit = js.native
  
  def getStateParam(client: Client, callback: js.Function1[/* state */ String, Unit]): Unit = js.native
  
  def onAuthStepChange(client: Client, callback: js.Function0[Unit]): Unit = js.native
  
  def resumeAuthorize(stateParam: String, client: Client, callback: QueryParamsCallback): Unit = js.native
  
  def url(): String = js.native
}
object AuthDriver_ {
  
  @scala.inline
  def apply(
    authType: () => String,
    doAuthorize: (String, String, Client, QueryParamsCallback) => Unit,
    getStateParam: (Client, js.Function1[/* state */ String, Unit]) => Unit,
    onAuthStepChange: (Client, js.Function0[Unit]) => Unit,
    resumeAuthorize: (String, Client, QueryParamsCallback) => Unit,
    url: () => String
  ): AuthDriver_ = {
    val __obj = js.Dynamic.literal(authType = js.Any.fromFunction0(authType), doAuthorize = js.Any.fromFunction4(doAuthorize), getStateParam = js.Any.fromFunction2(getStateParam), onAuthStepChange = js.Any.fromFunction2(onAuthStepChange), resumeAuthorize = js.Any.fromFunction3(resumeAuthorize), url = js.Any.fromFunction0(url))
    __obj.asInstanceOf[AuthDriver_]
  }
  
  @scala.inline
  implicit class AuthDriver_Ops[Self <: AuthDriver_] (val x: Self) extends AnyVal {
    
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
    def setDoAuthorize(value: (String, String, Client, QueryParamsCallback) => Unit): Self = this.set("doAuthorize", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetStateParam(value: (Client, js.Function1[/* state */ String, Unit]) => Unit): Self = this.set("getStateParam", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnAuthStepChange(value: (Client, js.Function0[Unit]) => Unit): Self = this.set("onAuthStepChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResumeAuthorize(value: (String, Client, QueryParamsCallback) => Unit): Self = this.set("resumeAuthorize", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUrl(value: () => String): Self = this.set("url", js.Any.fromFunction0(value))
  }
}
