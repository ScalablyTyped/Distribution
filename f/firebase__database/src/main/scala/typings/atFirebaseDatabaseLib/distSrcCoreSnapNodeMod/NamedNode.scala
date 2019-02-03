package typings
package atFirebaseDatabaseLib.distSrcCoreSnapNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/snap/Node", "NamedNode")
@js.native
class NamedNode protected () extends js.Object {
  def this(name: java.lang.String, node: Node) = this()
  var MAX: atFirebaseDatabaseLib.distSrcCoreSnapChildrenNodeMod.distSrcCoreSnapNodeMod.NamedNode = js.native
  var MIN: atFirebaseDatabaseLib.distSrcCoreSnapChildrenNodeMod.distSrcCoreSnapNodeMod.NamedNode = js.native
  var name: java.lang.String = js.native
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
  def Wrap(name: java.lang.String, node: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode = js.native
}

