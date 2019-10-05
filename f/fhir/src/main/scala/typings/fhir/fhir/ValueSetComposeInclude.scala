package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Include one or more codes from a code system or other value set(s)
  */
trait ValueSetComposeInclude extends BackboneElement {
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueSet'.
    */
  var _valueSet: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * A concept defined in the system
    */
  var concept: js.UndefOr[js.Array[ValueSetComposeIncludeConcept]] = js.undefined
  /**
    * Select codes/concepts by their properties (including relationships)
    */
  var filter: js.UndefOr[js.Array[ValueSetComposeIncludeFilter]] = js.undefined
  /**
    * The system the codes come from
    */
  var system: js.UndefOr[uri] = js.undefined
  /**
    * Select only contents included in this value set
    */
  var valueSet: js.UndefOr[js.Array[uri]] = js.undefined
  /**
    * Specific version of the code system referred to
    */
  var version: js.UndefOr[String] = js.undefined
}

object ValueSetComposeInclude {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _system: Element = null,
    _valueSet: js.Array[Element] = null,
    _version: Element = null,
    concept: js.Array[ValueSetComposeIncludeConcept] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    filter: js.Array[ValueSetComposeIncludeFilter] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    system: uri = null,
    valueSet: js.Array[uri] = null,
    version: String = null
  ): ValueSetComposeInclude = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_system != null) __obj.updateDynamic("_system")(_system)
    if (_valueSet != null) __obj.updateDynamic("_valueSet")(_valueSet)
    if (_version != null) __obj.updateDynamic("_version")(_version)
    if (concept != null) __obj.updateDynamic("concept")(concept)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (system != null) __obj.updateDynamic("system")(system)
    if (valueSet != null) __obj.updateDynamic("valueSet")(valueSet)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ValueSetComposeInclude]
  }
}

