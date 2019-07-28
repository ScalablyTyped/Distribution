package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Same source and target systems
  */
trait ConceptMapGroup extends BackboneElement {
  /**
    * Contains extended information for property 'source'.
    */
  var _source: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'sourceVersion'.
    */
  var _sourceVersion: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'target'.
    */
  var _target: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'targetVersion'.
    */
  var _targetVersion: js.UndefOr[Element] = js.undefined
  /**
    * Mappings for a concept from the source set
    */
  var element: js.Array[ConceptMapGroupElement]
  /**
    * Code System (if value set crosses code systems)
    */
  var source: js.UndefOr[uri] = js.undefined
  /**
    * Specific version of the  code system
    */
  var sourceVersion: js.UndefOr[String] = js.undefined
  /**
    * System of the target (if necessary)
    */
  var target: js.UndefOr[uri] = js.undefined
  /**
    * Specific version of the  code system
    */
  var targetVersion: js.UndefOr[String] = js.undefined
  /**
    * When no match in the mappings
    */
  var unmapped: js.UndefOr[ConceptMapGroupUnmapped] = js.undefined
}

object ConceptMapGroup {
  @scala.inline
  def apply(
    element: js.Array[ConceptMapGroupElement],
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _source: Element = null,
    _sourceVersion: Element = null,
    _target: Element = null,
    _targetVersion: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    source: uri = null,
    sourceVersion: String = null,
    target: uri = null,
    targetVersion: String = null,
    unmapped: ConceptMapGroupUnmapped = null
  ): ConceptMapGroup = {
    val __obj = js.Dynamic.literal(element = element)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_source != null) __obj.updateDynamic("_source")(_source)
    if (_sourceVersion != null) __obj.updateDynamic("_sourceVersion")(_sourceVersion)
    if (_target != null) __obj.updateDynamic("_target")(_target)
    if (_targetVersion != null) __obj.updateDynamic("_targetVersion")(_targetVersion)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (source != null) __obj.updateDynamic("source")(source)
    if (sourceVersion != null) __obj.updateDynamic("sourceVersion")(sourceVersion)
    if (target != null) __obj.updateDynamic("target")(target)
    if (targetVersion != null) __obj.updateDynamic("targetVersion")(targetVersion)
    if (unmapped != null) __obj.updateDynamic("unmapped")(unmapped)
    __obj.asInstanceOf[ConceptMapGroup]
  }
}

