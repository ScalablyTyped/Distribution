package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCommitmentsScopedList extends js.Object {
  /**
    * [Output Only] A list of commitments contained in this scope.
    */
  var commitments: js.UndefOr[js.Array[SchemaCommitment]] = js.native
  /**
    * [Output Only] Informational warning which replaces the list of
    * commitments when the list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaCommitmentsScopedList {
  @scala.inline
  def apply(commitments: js.Array[SchemaCommitment] = null, warning: AnonCode = null): SchemaCommitmentsScopedList = {
    val __obj = js.Dynamic.literal()
    if (commitments != null) __obj.updateDynamic("commitments")(commitments.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCommitmentsScopedList]
  }
}

