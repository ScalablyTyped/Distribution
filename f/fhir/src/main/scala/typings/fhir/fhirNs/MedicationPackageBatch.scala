package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies a single production run
  */
trait MedicationPackageBatch extends BackboneElement {
  /**
    * Contains extended information for property 'expirationDate'.
    */
  var _expirationDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'lotNumber'.
    */
  var _lotNumber: js.UndefOr[Element] = js.undefined
  /**
    * When batch will expire
    */
  var expirationDate: js.UndefOr[dateTime] = js.undefined
  /**
    * Identifier assigned to batch
    */
  var lotNumber: js.UndefOr[String] = js.undefined
}

object MedicationPackageBatch {
  @scala.inline
  def apply(
    _expirationDate: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _lotNumber: Element = null,
    expirationDate: dateTime = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    lotNumber: String = null,
    modifierExtension: js.Array[Extension] = null
  ): MedicationPackageBatch = {
    val __obj = js.Dynamic.literal()
    if (_expirationDate != null) __obj.updateDynamic("_expirationDate")(_expirationDate)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_lotNumber != null) __obj.updateDynamic("_lotNumber")(_lotNumber)
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lotNumber != null) __obj.updateDynamic("lotNumber")(lotNumber)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[MedicationPackageBatch]
  }
}

