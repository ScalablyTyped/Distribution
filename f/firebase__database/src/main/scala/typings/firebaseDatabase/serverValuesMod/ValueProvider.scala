package typings.firebaseDatabase.serverValuesMod

import typings.firebaseDatabase.nodeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueProvider extends js.Object {
  def getImmediateChild(childName: String): ValueProvider
  def node(): Node
}

object ValueProvider {
  @scala.inline
  def apply(getImmediateChild: String => ValueProvider, node: () => Node): ValueProvider = {
    val __obj = js.Dynamic.literal(getImmediateChild = js.Any.fromFunction1(getImmediateChild), node = js.Any.fromFunction0(node))
    __obj.asInstanceOf[ValueProvider]
  }
}

