package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Concept in target system for element
  */
trait ConceptMapGroupElementTarget extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'equivalence'.
    */
  var _equivalence: js.UndefOr[Element] = js.undefined
  /**
    * Code that identifies the target element
    */
  var code: js.UndefOr[typings.fhir.fhir.code] = js.undefined
  /**
    * Description of status/issues in mapping
    */
  var comment: js.UndefOr[String] = js.undefined
  /**
    * Other elements required for this mapping (from context)
    */
  var dependsOn: js.UndefOr[js.Array[ConceptMapGroupElementTargetDependsOn]] = js.undefined
  /**
    * Display for the code
    */
  var display: js.UndefOr[String] = js.undefined
  /**
    * relatedto | equivalent | equal | wider | subsumes | narrower | specializes | inexact | unmatched | disjoint
    */
  var equivalence: js.UndefOr[code] = js.undefined
  /**
    * Other concepts that this mapping also produces
    */
  var product: js.UndefOr[js.Array[ConceptMapGroupElementTargetDependsOn]] = js.undefined
}

object ConceptMapGroupElementTarget {
  @scala.inline
  def apply(
    _code: Element = null,
    _comment: Element = null,
    _display: Element = null,
    _equivalence: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    code: code = null,
    comment: String = null,
    dependsOn: js.Array[ConceptMapGroupElementTargetDependsOn] = null,
    display: String = null,
    equivalence: code = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    product: js.Array[ConceptMapGroupElementTargetDependsOn] = null
  ): ConceptMapGroupElementTarget = {
    val __obj = js.Dynamic.literal()
    if (_code != null) __obj.updateDynamic("_code")(_code)
    if (_comment != null) __obj.updateDynamic("_comment")(_comment)
    if (_display != null) __obj.updateDynamic("_display")(_display)
    if (_equivalence != null) __obj.updateDynamic("_equivalence")(_equivalence)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (code != null) __obj.updateDynamic("code")(code)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (dependsOn != null) __obj.updateDynamic("dependsOn")(dependsOn)
    if (display != null) __obj.updateDynamic("display")(display)
    if (equivalence != null) __obj.updateDynamic("equivalence")(equivalence)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (product != null) __obj.updateDynamic("product")(product)
    __obj.asInstanceOf[ConceptMapGroupElementTarget]
  }
}

