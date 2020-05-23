package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthDriver_ extends js.Object {
  def authType(): String
  def doAuthorize(authUrl: String, stateParam: String, client: Client, callback: QueryParamsCallback): Unit
  def getStateParam(client: Client, callback: js.Function1[/* state */ String, Unit]): Unit
  def onAuthStepChange(client: Client, callback: js.Function0[Unit]): Unit
  def resumeAuthorize(stateParam: String, client: Client, callback: QueryParamsCallback): Unit
  def url(): String
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
}

