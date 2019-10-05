package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of a reaction that follows immunization
  */
trait ImmunizationReaction extends BackboneElement {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'reported'.
    */
  var _reported: js.UndefOr[Element] = js.undefined
  /**
    * When reaction started
    */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * Additional information on reaction
    */
  var detail: js.UndefOr[Reference] = js.undefined
  /**
    * Indicates self-reported reaction
    */
  var reported: js.UndefOr[Boolean] = js.undefined
}

object ImmunizationReaction {
  @scala.inline
  def apply(
    _date: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _reported: Element = null,
    date: dateTime = null,
    detail: Reference = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    reported: js.UndefOr[Boolean] = js.undefined
  ): ImmunizationReaction = {
    val __obj = js.Dynamic.literal()
    if (_date != null) __obj.updateDynamic("_date")(_date)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_reported != null) __obj.updateDynamic("_reported")(_reported)
    if (date != null) __obj.updateDynamic("date")(date)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (!js.isUndefined(reported)) __obj.updateDynamic("reported")(reported)
    __obj.asInstanceOf[ImmunizationReaction]
  }
}

