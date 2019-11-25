package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Responsible for the account
  */
trait AccountGuarantor extends BackboneElement {
  /**
    * Contains extended information for property 'onHold'.
    */
  var _onHold: js.UndefOr[Element] = js.undefined
  /**
    * Credit or other hold applied
    */
  var onHold: js.UndefOr[Boolean] = js.undefined
  /**
    * Responsible entity
    */
  var party: Reference
  /**
    * Guarrantee account during
    */
  var period: js.UndefOr[Period] = js.undefined
}

object AccountGuarantor {
  @scala.inline
  def apply(
    party: Reference,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _onHold: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    onHold: js.UndefOr[Boolean] = js.undefined,
    period: Period = null
  ): AccountGuarantor = {
    val __obj = js.Dynamic.literal(party = party.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_onHold != null) __obj.updateDynamic("_onHold")(_onHold.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(onHold)) __obj.updateDynamic("onHold")(onHold.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountGuarantor]
  }
}

