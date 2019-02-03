package typings
package gitLib.gitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git", "LooseStorage")
@js.native
class LooseStorage protected () extends js.Object {
  def this(directory: js.Any) = this()
  var directory: js.Any = js.native
  def find(sha1: js.Any): RawObject = js.native
  def get_raw_object(buf: js.Any): RawObject = js.native
  def is_legacy_loose_object(buf: js.Any): scala.Boolean = js.native
  def put_raw_object(content: js.Any, `type`: js.Any, callback: js.Function): scala.Unit = js.native
  def unpack_object_header_gently(buf: js.Any): js.Array[_] = js.native
}

/* static members */
@JSImport("git", "LooseStorage")
@js.native
object LooseStorage extends js.Object {
  def verify_header(`type`: js.Any, size: js.Any): scala.Unit = js.native
}

