package typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CigarUnit extends js.Object {
  var operation: js.UndefOr[String] = js.undefined
  /** The number of genomic bases that the operation runs for. Required. */
  var operationLength: js.UndefOr[String] = js.undefined
  /**
    * `referenceSequence` is only used at mismatches
    * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
    * Filling this field replaces SAM's MD tag. If the relevant information is
    * not available, this field is unset.
    */
  var referenceSequence: js.UndefOr[String] = js.undefined
}

object CigarUnit {
  @scala.inline
  def apply(operation: String = null, operationLength: String = null, referenceSequence: String = null): CigarUnit = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (operationLength != null) __obj.updateDynamic("operationLength")(operationLength)
    if (referenceSequence != null) __obj.updateDynamic("referenceSequence")(referenceSequence)
    __obj.asInstanceOf[CigarUnit]
  }
}

