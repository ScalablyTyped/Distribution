package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitana", "Deletion")
@js.native
class Deletion protected () extends AbstractRepositoryObject {
  def this(branch: js.Any, `object`: js.Any) = this()
  def restore(data: js.Any, callback: js.Any): js.Any = js.native
}

/* static members */
@JSImport("gitana", "Deletion")
@js.native
object Deletion extends js.Object {
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  def implement(args: js.Any*): js.Any = js.native
  def valueOf(`type`: js.Any): js.Any = js.native
}

