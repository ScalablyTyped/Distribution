package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitana", "MergeConflict")
@js.native
class MergeConflict protected () extends AbstractRepositoryObject {
  def this(repository: js.Any, `object`: js.Any) = this()
  def commit(branchId: js.Any): js.Any = js.native
  def resolve(resolutionsArrayOrString: js.Any, callback: js.Any): js.Any = js.native
}

/* static members */
@JSImport("gitana", "MergeConflict")
@js.native
object MergeConflict extends js.Object {
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  def implement(args: js.Any*): js.Any = js.native
  def valueOf(`type`: js.Any): js.Any = js.native
}

