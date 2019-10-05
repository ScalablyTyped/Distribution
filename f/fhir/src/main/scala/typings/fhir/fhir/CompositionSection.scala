package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Composition is broken into sections
  */
trait CompositionSection extends BackboneElement {
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  /**
    * Classification of section (recommended)
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Why the section is empty
    */
  var emptyReason: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * A reference to data that supports this section
    */
  var entry: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * working | snapshot | changes
    */
  var mode: js.UndefOr[code] = js.undefined
  /**
    * Order of section entries
    */
  var orderedBy: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Nested Section
    */
  var section: js.UndefOr[js.Array[CompositionSection]] = js.undefined
  /**
    * Text summary of the section, for human interpretation
    */
  var text: js.UndefOr[Narrative] = js.undefined
  /**
    * Label for section (e.g. for ToC)
    */
  var title: js.UndefOr[String] = js.undefined
}

object CompositionSection {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _mode: Element = null,
    _title: Element = null,
    code: CodeableConcept = null,
    emptyReason: CodeableConcept = null,
    entry: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    mode: code = null,
    modifierExtension: js.Array[Extension] = null,
    orderedBy: CodeableConcept = null,
    section: js.Array[CompositionSection] = null,
    text: Narrative = null,
    title: String = null
  ): CompositionSection = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_mode != null) __obj.updateDynamic("_mode")(_mode)
    if (_title != null) __obj.updateDynamic("_title")(_title)
    if (code != null) __obj.updateDynamic("code")(code)
    if (emptyReason != null) __obj.updateDynamic("emptyReason")(emptyReason)
    if (entry != null) __obj.updateDynamic("entry")(entry)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (orderedBy != null) __obj.updateDynamic("orderedBy")(orderedBy)
    if (section != null) __obj.updateDynamic("section")(section)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[CompositionSection]
  }
}

