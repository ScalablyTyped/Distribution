package typings.dropboxjs.DropboxNs.FileNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.File.Stat")
@js.native
class Stat () extends js.Object {
  var clientModifiedAt: Date = js.native
  var contentHash: String = js.native
  var hasThumbnail: Boolean = js.native
  var humanSize: String = js.native
  var inAppFolder: Boolean = js.native
  var isFile: Boolean = js.native
  var isFolder: Boolean = js.native
  var isRemoved: Boolean = js.native
  var mimeType: String = js.native
  var modifiedAt: Date = js.native
  var name: String = js.native
  var path: String = js.native
  var size: Double = js.native
  var typeIcon: String = js.native
  var versionTag: String = js.native
  def toJSON(): js.Object = js.native
}

/* static members */
@JSGlobal("Dropbox.File.Stat")
@js.native
object Stat extends js.Object {
  def parse(metadata: js.Object): Stat = js.native
}

