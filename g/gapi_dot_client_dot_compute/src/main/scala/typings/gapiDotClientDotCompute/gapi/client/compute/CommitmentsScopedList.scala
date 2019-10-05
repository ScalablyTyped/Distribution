package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClientDotCompute.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitmentsScopedList extends js.Object {
  /** [Output Only] List of commitments contained in this scope. */
  var commitments: js.UndefOr[js.Array[Commitment]] = js.undefined
  /** [Output Only] Informational warning which replaces the list of commitments when the list is empty. */
  var warning: js.UndefOr[Anon_Code] = js.undefined
}

object CommitmentsScopedList {
  @scala.inline
  def apply(commitments: js.Array[Commitment] = null, warning: Anon_Code = null): CommitmentsScopedList = {
    val __obj = js.Dynamic.literal()
    if (commitments != null) __obj.updateDynamic("commitments")(commitments)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[CommitmentsScopedList]
  }
}

