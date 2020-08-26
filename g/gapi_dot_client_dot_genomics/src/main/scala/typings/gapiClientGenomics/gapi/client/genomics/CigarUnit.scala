package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CigarUnit extends js.Object {
  var operation: js.UndefOr[String] = js.native
  /** The number of genomic bases that the operation runs for. Required. */
  var operationLength: js.UndefOr[String] = js.native
  /**
    * `referenceSequence` is only used at mismatches
    * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
    * Filling this field replaces SAM's MD tag. If the relevant information is
    * not available, this field is unset.
    */
  var referenceSequence: js.UndefOr[String] = js.native
}

object CigarUnit {
  @scala.inline
  def apply(): CigarUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CigarUnit]
  }
  @scala.inline
  implicit class CigarUnitOps[Self <: CigarUnit] (val x: Self) extends AnyVal {
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
    def setOperation(value: String): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    @scala.inline
    def setOperationLength(value: String): Self = this.set("operationLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationLength: Self = this.set("operationLength", js.undefined)
    @scala.inline
    def setReferenceSequence(value: String): Self = this.set("referenceSequence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceSequence: Self = this.set("referenceSequence", js.undefined)
  }
  
}

