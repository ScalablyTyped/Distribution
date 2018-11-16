package typings
package gitLib.gitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git", "FileWindow")
@js.native
class FileWindow protected () extends js.Object {
  def this(idxfile: js.Any, version: js.Any) = this()
  var global_offset: js.Any = js.native
  var idxfile: js.Any = js.native
  var offset: js.Any = js.native
  var seek_offset: js.Any = js.native
  var version: js.Any = js.native
  def close(): scala.Unit = js.native
  def index(idx: js.Array[_]): scala.Unit = js.native
  def index(idx: scala.Double): scala.Unit = js.native
  def unmap(): scala.Unit = js.native
}

