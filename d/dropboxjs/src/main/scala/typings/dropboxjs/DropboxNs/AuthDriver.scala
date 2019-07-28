package typings.dropboxjs.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.AuthDriver")
@js.native
class AuthDriver () extends js.Object {
  def authType(): String = js.native
  def doAuthorize(authUrl: String, stateParam: String, client: Client, callback: QueryParamsCallback): Unit = js.native
  def getStateParam(client: Client, callback: js.Function1[/* state */ String, Unit]): Unit = js.native
  def onAuthStepChange(client: Client, callback: js.Function0[Unit]): Unit = js.native
  def resumeAuthorize(stateParam: String, client: Client, callback: QueryParamsCallback): Unit = js.native
  def url(): String = js.native
}

