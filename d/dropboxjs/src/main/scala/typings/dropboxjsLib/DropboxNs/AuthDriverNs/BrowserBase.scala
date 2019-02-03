package typings
package dropboxjsLib.DropboxNs.AuthDriverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.AuthDriver.BrowserBase")
@js.native
class BrowserBase protected () extends js.Object {
  def this(options: dropboxjsLib.Anon_RememberUser) = this()
  def authType(): java.lang.String = js.native
  def locationStateParam(url: java.lang.String): java.lang.String = js.native
  def onAuthStepChange(client: dropboxjsLib.DropboxNs.Client, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

/* static members */
@JSGlobal("Dropbox.AuthDriver.BrowserBase")
@js.native
object BrowserBase extends js.Object {
  def cleanupLocation(): scala.Unit = js.native
  def currentLocation(): java.lang.String = js.native
  def localStorage(): stdLib.Storage = js.native
}

