package typings
package dropboxjsLib.DropboxNs.FileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.File.Stat")
@js.native
class Stat () extends js.Object {
  var clientModifiedAt: stdLib.Date = js.native
  var contentHash: java.lang.String = js.native
  var hasThumbnail: scala.Boolean = js.native
  var humanSize: java.lang.String = js.native
  var inAppFolder: scala.Boolean = js.native
  var isFile: scala.Boolean = js.native
  var isFolder: scala.Boolean = js.native
  var isRemoved: scala.Boolean = js.native
  var mimeType: java.lang.String = js.native
  var modifiedAt: stdLib.Date = js.native
  var name: java.lang.String = js.native
  var path: java.lang.String = js.native
  var size: scala.Double = js.native
  var typeIcon: java.lang.String = js.native
  var versionTag: java.lang.String = js.native
  def toJSON(): js.Object = js.native
}

@JSGlobal("Dropbox.File.Stat")
@js.native
object Stat extends js.Object {
  def parse(metadata: js.Object): dropboxjsLib.DropboxNs.FileNs.Stat = js.native
}

