package typings
package dropboxjsLib.DropboxNs.FileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.File.CopyReference")
@js.native
class CopyReference () extends js.Object {
  var expiresAt: stdLib.Date = js.native
  var tag: java.lang.String = js.native
  def toJSON(): js.Object = js.native
}

/* static members */
@JSGlobal("Dropbox.File.CopyReference")
@js.native
object CopyReference extends js.Object {
  def parse(refData: java.lang.String): dropboxjsLib.DropboxNs.FileNs.CopyReference = js.native
  def parse(refData: js.Object): dropboxjsLib.DropboxNs.FileNs.CopyReference = js.native
}

