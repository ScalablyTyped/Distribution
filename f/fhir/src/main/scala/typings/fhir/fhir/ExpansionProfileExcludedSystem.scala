package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Systems/Versions to be exclude
  */
trait ExpansionProfileExcludedSystem extends BackboneElement {
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * The specific code system to be excluded
    */
  var system: uri
  /**
    * Specific version of the code system referred to
    */
  var version: js.UndefOr[String] = js.undefined
}

object ExpansionProfileExcludedSystem {
  @scala.inline
  def apply(
    system: uri,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _system: Element = null,
    _version: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    version: String = null
  ): ExpansionProfileExcludedSystem = {
    val __obj = js.Dynamic.literal(system = system)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_system != null) __obj.updateDynamic("_system")(_system)
    if (_version != null) __obj.updateDynamic("_version")(_version)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ExpansionProfileExcludedSystem]
  }
}

