package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional representations for the concept
  */
trait CodeSystemConceptDesignation extends BackboneElement {
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  /**
    * Human language of the designation
    */
  var language: js.UndefOr[code] = js.undefined
  /**
    * Details how this designation would be used
    */
  var use: js.UndefOr[Coding] = js.undefined
  /**
    * The text value for this designation
    */
  var value: String
}

object CodeSystemConceptDesignation {
  @scala.inline
  def apply(
    value: String,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _language: Element = null,
    _value: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    language: code = null,
    modifierExtension: js.Array[Extension] = null,
    use: Coding = null
  ): CodeSystemConceptDesignation = {
    val __obj = js.Dynamic.literal(value = value)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_value != null) __obj.updateDynamic("_value")(_value)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (language != null) __obj.updateDynamic("language")(language)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (use != null) __obj.updateDynamic("use")(use)
    __obj.asInstanceOf[CodeSystemConceptDesignation]
  }
}

