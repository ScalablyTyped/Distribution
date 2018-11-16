package typings
package dropboxjsLib.DropboxNs.HttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.Http.UploadCursor")
@js.native
class UploadCursor protected () extends js.Object {
  def this(cursorData: java.lang.String) = this()
  def this(cursorData: js.Object) = this()
  var expiresAt: stdLib.Date = js.native
  var offset: scala.Double = js.native
  var tag: java.lang.String = js.native
  def toJSON(): js.Object = js.native
}

@JSGlobal("Dropbox.Http.UploadCursor")
@js.native
object UploadCursor extends js.Object {
  def parse(cursorData: java.lang.String): dropboxjsLib.DropboxNs.HttpNs.UploadCursor = js.native
  def parse(cursorData: js.Object): dropboxjsLib.DropboxNs.HttpNs.UploadCursor = js.native
}

