package typings.dropboxjs.DropboxNs.HttpNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.Http.UploadCursor")
@js.native
class UploadCursor protected () extends js.Object {
  def this(cursorData: String) = this()
  def this(cursorData: js.Object) = this()
  var expiresAt: Date = js.native
  var offset: Double = js.native
  var tag: String = js.native
  def toJSON(): js.Object = js.native
}

/* static members */
@JSGlobal("Dropbox.Http.UploadCursor")
@js.native
object UploadCursor extends js.Object {
  def parse(cursorData: String): UploadCursor = js.native
  def parse(cursorData: js.Object): UploadCursor = js.native
}

