package typings
package atFirebaseDatabaseLib.distSrcCoreSnapChildrenNodeMod.distSrcCoreSnapNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedNode extends js.Object {
  var MAX: NamedNode
  var MIN: NamedNode
}

object NamedNode {
  @scala.inline
  def apply(MAX: NamedNode, MIN: NamedNode): NamedNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MAX")(MAX)
    __obj.updateDynamic("MIN")(MIN)
    __obj.asInstanceOf[NamedNode]
  }
}

