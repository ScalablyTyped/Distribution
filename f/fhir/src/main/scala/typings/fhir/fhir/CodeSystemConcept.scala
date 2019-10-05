package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Concepts in the code system
  */
trait CodeSystemConcept extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'definition'.
    */
  var _definition: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.undefined
  /**
    * Code that identifies concept
    */
  var code: typings.fhir.fhir.code
  /**
    * Child Concepts (is-a/contains/categorizes)
    */
  var concept: js.UndefOr[js.Array[CodeSystemConcept]] = js.undefined
  /**
    * Formal definition
    */
  var definition: js.UndefOr[String] = js.undefined
  /**
    * Additional representations for the concept
    */
  var designation: js.UndefOr[js.Array[CodeSystemConceptDesignation]] = js.undefined
  /**
    * Text to display to the user
    */
  var display: js.UndefOr[String] = js.undefined
  /**
    * Property value for the concept
    */
  var property: js.UndefOr[js.Array[CodeSystemConceptProperty]] = js.undefined
}

object CodeSystemConcept {
  @scala.inline
  def apply(
    code: code,
    _code: Element = null,
    _definition: Element = null,
    _display: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    concept: js.Array[CodeSystemConcept] = null,
    definition: String = null,
    designation: js.Array[CodeSystemConceptDesignation] = null,
    display: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    property: js.Array[CodeSystemConceptProperty] = null
  ): CodeSystemConcept = {
    val __obj = js.Dynamic.literal(code = code)
    if (_code != null) __obj.updateDynamic("_code")(_code)
    if (_definition != null) __obj.updateDynamic("_definition")(_definition)
    if (_display != null) __obj.updateDynamic("_display")(_display)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (concept != null) __obj.updateDynamic("concept")(concept)
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (designation != null) __obj.updateDynamic("designation")(designation)
    if (display != null) __obj.updateDynamic("display")(display)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (property != null) __obj.updateDynamic("property")(property)
    __obj.asInstanceOf[CodeSystemConcept]
  }
}

