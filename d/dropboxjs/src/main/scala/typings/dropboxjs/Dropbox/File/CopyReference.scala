package typings.dropboxjs.Dropbox.File

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.File.CopyReference")
@js.native
class CopyReference () extends js.Object {
  var expiresAt: Date = js.native
  var tag: String = js.native
  def toJSON(): js.Object = js.native
}

/* static members */
@JSGlobal("Dropbox.File.CopyReference")
@js.native
object CopyReference extends js.Object {
  def parse(refData: String): CopyReference = js.native
  def parse(refData: js.Object): CopyReference = js.native
}

