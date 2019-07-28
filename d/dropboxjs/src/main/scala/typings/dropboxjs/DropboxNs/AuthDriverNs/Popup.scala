package typings.dropboxjs.DropboxNs.AuthDriverNs

import typings.dropboxjs.DropboxNs.RedirectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.AuthDriver.Popup")
@js.native
class Popup () extends IAuthDriver {
  def this(options: RedirectOptions) = this()
  def url(): String = js.native
}

/* static members */
@JSGlobal("Dropbox.AuthDriver.Popup")
@js.native
object Popup extends js.Object {
  def locationOrigin(location: String): String = js.native
  def oauthReceiver(): Unit = js.native
}

