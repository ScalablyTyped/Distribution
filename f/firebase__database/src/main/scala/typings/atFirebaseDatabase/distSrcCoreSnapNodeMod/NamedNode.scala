package typings.atFirebaseDatabase.distSrcCoreSnapNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/snap/Node", "NamedNode")
@js.native
class NamedNode protected () extends js.Object {
  def this(name: String, node: Node) = this()
  var MAX: typings.atFirebaseDatabase.distSrcCoreSnapChildrenNodeMod.distSrcCoreSnapNodeMod.NamedNode = js.native
  var MIN: typings.atFirebaseDatabase.distSrcCoreSnapChildrenNodeMod.distSrcCoreSnapNodeMod.NamedNode = js.native
  var name: String = js.native
  var node: Node = js.native
}

/* static members */
@JSImport("@firebase/database/dist/src/core/snap/Node", "NamedNode")
@js.native
object NamedNode extends js.Object {
  /**
    *
    * @param {!string} name
    * @param {!Node} node
    * @return {NamedNode}
    */
  def Wrap(name: String, node: Node): NamedNode = js.native
}

