package typings.elv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elv", JSImport.Namespace)
@js.native
object elvMod extends js.Object {
  def apply(`val`: js.Any): Boolean = js.native
  def coalesce(args: js.Any*): js.Any = js.native
  def ncoalesce(args: js.Any*): js.Any = js.native
  def populated(`val`: js.Any): Boolean = js.native
  def tryGet(`val`: js.Array[_], index: Double): js.Any = js.native
  def tryGet(`val`: js.Array[_], index: Double, `def`: js.Any): js.Any = js.native
  @js.native
  object behavior extends js.Object {
    var enableFalse: Boolean = js.native
    var enableNaN: Boolean = js.native
    var enableNull: Boolean = js.native
    var enableUndefined: Boolean = js.native
  }
  
}

