package typings.dropboxjs.Dropbox.File

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.File.ShareUrl")
@js.native
class ShareUrl () extends js.Object {
  var expiresAt: Date = js.native
  var isDirect: Boolean = js.native
  var isPreview: Boolean = js.native
  var url: String = js.native
  def toJSON(): js.Object = js.native
}

/* static members */
@JSGlobal("Dropbox.File.ShareUrl")
@js.native
object ShareUrl extends js.Object {
  def parse(urlData: String, isDirect: Boolean): ShareUrl = js.native
  def parse(urlData: js.Object, isDirect: Boolean): ShareUrl = js.native
}

