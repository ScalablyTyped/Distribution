package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitmentsScopedList extends js.Object {
  /** [Output Only] List of commitments contained in this scope. */
  var commitments: js.UndefOr[js.Array[Commitment]] = js.native
  /** [Output Only] Informational warning which replaces the list of commitments when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}

object CommitmentsScopedList {
  @scala.inline
  def apply(): CommitmentsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitmentsScopedList]
  }
  @scala.inline
  implicit class CommitmentsScopedListOps[Self <: CommitmentsScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommitmentsVarargs(value: Commitment*): Self = this.set("commitments", js.Array(value :_*))
    @scala.inline
    def setCommitments(value: js.Array[Commitment]): Self = this.set("commitments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommitments: Self = this.set("commitments", js.undefined)
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

