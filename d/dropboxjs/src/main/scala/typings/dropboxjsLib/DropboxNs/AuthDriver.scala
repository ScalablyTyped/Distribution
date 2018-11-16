package typings
package dropboxjsLib.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.AuthDriver")
@js.native
class AuthDriver () extends js.Object {
  def authType(): java.lang.String = js.native
  def doAuthorize(
    authUrl: java.lang.String,
    stateParam: java.lang.String,
    client: Client,
    callback: QueryParamsCallback
  ): scala.Unit = js.native
  def getStateParam(client: Client, callback: js.Function1[/* state */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def onAuthStepChange(client: Client, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def resumeAuthorize(stateParam: java.lang.String, client: Client, callback: QueryParamsCallback): scala.Unit = js.native
  def url(): java.lang.String = js.native
}

