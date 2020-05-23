package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitana", "TraversalResults")
@js.native
class TraversalResults protected () extends AbstractPersistable {
  def this(branch: js.Any, `object`: js.Any) = this()
  def association(id: String): Association = js.native
  def associationCount(callback: js.Any): this.type = js.native
  def associations(): NodeMap = js.native
  def center(): js.Any = js.native
  def clear(): Unit = js.native
  def node(id: String): Node = js.native
  def nodeCount(callback: js.Any): this.type = js.native
  def nodes(): NodeMap = js.native
}

/* static members */
@JSImport("gitana", "TraversalResults")
@js.native
object TraversalResults extends js.Object {
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  def implement(args: js.Any*): js.Any = js.native
  def valueOf(`type`: js.Any): js.Any = js.native
}

