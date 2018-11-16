package typings
package dropboxjsLib.DropboxNs.FileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.File.ShareUrl")
@js.native
class ShareUrl () extends js.Object {
  var expiresAt: stdLib.Date = js.native
  var isDirect: scala.Boolean = js.native
  var isPreview: scala.Boolean = js.native
  var url: java.lang.String = js.native
  def toJSON(): js.Object = js.native
}

@JSGlobal("Dropbox.File.ShareUrl")
@js.native
object ShareUrl extends js.Object {
  def parse(urlData: java.lang.String, isDirect: scala.Boolean): dropboxjsLib.DropboxNs.FileNs.ShareUrl = js.native
  def parse(urlData: js.Object, isDirect: scala.Boolean): dropboxjsLib.DropboxNs.FileNs.ShareUrl = js.native
}

