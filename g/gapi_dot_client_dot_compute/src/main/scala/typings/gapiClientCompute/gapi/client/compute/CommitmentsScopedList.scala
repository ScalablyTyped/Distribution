package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClientCompute.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitmentsScopedList extends js.Object {
  /** [Output Only] List of commitments contained in this scope. */
  var commitments: js.UndefOr[js.Array[Commitment]] = js.undefined
  /** [Output Only] Informational warning which replaces the list of commitments when the list is empty. */
  var warning: js.UndefOr[AnonCode] = js.undefined
}

object CommitmentsScopedList {
  @scala.inline
  def apply(commitments: js.Array[Commitment] = null, warning: AnonCode = null): CommitmentsScopedList = {
    val __obj = js.Dynamic.literal()
    if (commitments != null) __obj.updateDynamic("commitments")(commitments.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitmentsScopedList]
  }
}

