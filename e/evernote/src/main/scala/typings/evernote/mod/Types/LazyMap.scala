package typings.evernote.mod.Types

import typings.evernote.anon.FullMap
import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Types.LazyMap")
@js.native
class LazyMap () extends js.Object {
  def this(args: FullMap) = this()
  var fullMap: js.UndefOr[Map[String, String]] = js.native
  var keysOnly: js.UndefOr[Set[String]] = js.native
}

