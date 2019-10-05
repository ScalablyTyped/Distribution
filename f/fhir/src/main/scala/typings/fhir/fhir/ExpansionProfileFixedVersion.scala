package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fix use of a code system to a particular version
  */
trait ExpansionProfileFixedVersion extends BackboneElement {
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * default | check | override
    */
  var mode: code
  /**
    * System to have its version fixed
    */
  var system: uri
  /**
    * Specific version of the code system referred to
    */
  var version: String
}

object ExpansionProfileFixedVersion {
  @scala.inline
  def apply(
    mode: code,
    system: uri,
    version: String,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _mode: Element = null,
    _system: Element = null,
    _version: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): ExpansionProfileFixedVersion = {
    val __obj = js.Dynamic.literal(mode = mode, system = system, version = version)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_mode != null) __obj.updateDynamic("_mode")(_mode)
    if (_system != null) __obj.updateDynamic("_system")(_system)
    if (_version != null) __obj.updateDynamic("_version")(_version)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[ExpansionProfileFixedVersion]
  }
}

