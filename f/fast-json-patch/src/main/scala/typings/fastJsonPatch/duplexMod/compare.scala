package typings.fastJsonPatch.duplexMod

import typings.fastJsonPatch.coreMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-patch/commonjs/duplex", "compare")
@js.native
object compare extends js.Object {
  def apply(tree1: js.Array[_], tree2: js.Array[_]): js.Array[Operation] = js.native
  def apply(tree1: js.Array[_], tree2: js.Array[_], invertible: Boolean): js.Array[Operation] = js.native
  def apply(tree1: js.Array[_], tree2: js.Object): js.Array[Operation] = js.native
  def apply(tree1: js.Array[_], tree2: js.Object, invertible: Boolean): js.Array[Operation] = js.native
  def apply(tree1: js.Object, tree2: js.Array[_]): js.Array[Operation] = js.native
  def apply(tree1: js.Object, tree2: js.Array[_], invertible: Boolean): js.Array[Operation] = js.native
  def apply(tree1: js.Object, tree2: js.Object): js.Array[Operation] = js.native
  def apply(tree1: js.Object, tree2: js.Object, invertible: Boolean): js.Array[Operation] = js.native
}

