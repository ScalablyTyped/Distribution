package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
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
  var warning: js.UndefOr[Code] = js.native
}

object SchemaCommitmentsScopedList {
  @scala.inline
  def apply(): SchemaCommitmentsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommitmentsScopedList]
  }
  @scala.inline
  implicit class SchemaCommitmentsScopedListOps[Self <: SchemaCommitmentsScopedList] (val x: Self) extends AnyVal {
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
    def setCommitmentsVarargs(value: SchemaCommitment*): Self = this.set("commitments", js.Array(value :_*))
    @scala.inline
    def setCommitments(value: js.Array[SchemaCommitment]): Self = this.set("commitments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommitments: Self = this.set("commitments", js.undefined)
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

