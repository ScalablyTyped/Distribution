package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$CommitmentsScopedList extends js.Object {
  /**
    * [Output Only] A list of commitments contained in this scope.
    */
  var commitments: js.UndefOr[js.Array[Schema$Commitment]] = js.native
  /**
    * [Output Only] Informational warning which replaces the list of
    * commitments when the list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$CommitmentsScopedList {
  @scala.inline
  def apply(commitments: js.Array[Schema$Commitment] = null, warning: Anon_Code = null): Schema$CommitmentsScopedList = {
    val __obj = js.Dynamic.literal()
    if (commitments != null) __obj.updateDynamic("commitments")(commitments.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CommitmentsScopedList]
  }
}

