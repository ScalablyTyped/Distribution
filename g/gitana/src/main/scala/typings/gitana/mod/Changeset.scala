package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitana", "Changeset")
@js.native
class Changeset protected () extends AbstractRepositoryObject {
  def this(repository: js.Any, `object`: js.Any) = this()
  def listNodes(pagination: js.Any): NodeMap = js.native
}

/* static members */
@JSImport("gitana", "Changeset")
@js.native
object Changeset extends js.Object {
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  def implement(args: js.Any*): js.Any = js.native
  def valueOf(`type`: js.Any): js.Any = js.native
}

