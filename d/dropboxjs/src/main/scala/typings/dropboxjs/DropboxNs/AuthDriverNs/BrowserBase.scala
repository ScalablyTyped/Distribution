package typings.dropboxjs.DropboxNs.AuthDriverNs

import typings.dropboxjs.Anon_RememberUser
import typings.dropboxjs.DropboxNs.Client
import typings.std.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.AuthDriver.BrowserBase")
@js.native
class BrowserBase protected () extends js.Object {
  def this(options: Anon_RememberUser) = this()
  def authType(): String = js.native
  def locationStateParam(url: String): String = js.native
  def onAuthStepChange(client: Client, callback: js.Function0[Unit]): Unit = js.native
}

/* static members */
@JSGlobal("Dropbox.AuthDriver.BrowserBase")
@js.native
object BrowserBase extends js.Object {
  def cleanupLocation(): Unit = js.native
  def currentLocation(): String = js.native
  def localStorage(): Storage = js.native
}

