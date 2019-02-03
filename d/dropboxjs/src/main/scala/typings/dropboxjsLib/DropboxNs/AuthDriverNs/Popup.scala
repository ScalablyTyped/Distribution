package typings
package dropboxjsLib.DropboxNs.AuthDriverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.AuthDriver.Popup")
@js.native
class Popup () extends IAuthDriver {
  def this(options: dropboxjsLib.DropboxNs.RedirectOptions) = this()
  def url(): java.lang.String = js.native
}

/* static members */
@JSGlobal("Dropbox.AuthDriver.Popup")
@js.native
object Popup extends js.Object {
  def locationOrigin(location: java.lang.String): java.lang.String = js.native
  def oauthReceiver(): scala.Unit = js.native
}

