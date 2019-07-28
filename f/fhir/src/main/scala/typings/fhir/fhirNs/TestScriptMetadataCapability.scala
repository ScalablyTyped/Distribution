package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Capabilities  that are assumed to function correctly on the FHIR server being tested
  */
trait TestScriptMetadataCapability extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'destination'.
    */
  var _destination: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'link'.
    */
  var _link: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'origin'.
    */
  var _origin: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'required'.
    */
  var _required: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'validated'.
    */
  var _validated: js.UndefOr[Element] = js.undefined
  /**
    * Required Capability Statement
    */
  var capabilities: Reference
  /**
    * The expected capabilities of the server
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Which server these requirements apply to
    */
  var destination: js.UndefOr[integer] = js.undefined
  /**
    * Links to the FHIR specification
    */
  var link: js.UndefOr[js.Array[uri]] = js.undefined
  /**
    * Which origin server these requirements apply to
    */
  var origin: js.UndefOr[js.Array[integer]] = js.undefined
  /**
    * Are the capabilities required?
    */
  var required: js.UndefOr[Boolean] = js.undefined
  /**
    * Are the capabilities validated?
    */
  var validated: js.UndefOr[Boolean] = js.undefined
}

object TestScriptMetadataCapability {
  @scala.inline
  def apply(
    capabilities: Reference,
    _description: Element = null,
    _destination: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _link: js.Array[Element] = null,
    _origin: js.Array[Element] = null,
    _required: Element = null,
    _validated: Element = null,
    description: String = null,
    destination: js.UndefOr[integer] = js.undefined,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    link: js.Array[uri] = null,
    modifierExtension: js.Array[Extension] = null,
    origin: js.Array[integer] = null,
    required: js.UndefOr[Boolean] = js.undefined,
    validated: js.UndefOr[Boolean] = js.undefined
  ): TestScriptMetadataCapability = {
    val __obj = js.Dynamic.literal(capabilities = capabilities)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_destination != null) __obj.updateDynamic("_destination")(_destination)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_link != null) __obj.updateDynamic("_link")(_link)
    if (_origin != null) __obj.updateDynamic("_origin")(_origin)
    if (_required != null) __obj.updateDynamic("_required")(_required)
    if (_validated != null) __obj.updateDynamic("_validated")(_validated)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(destination)) __obj.updateDynamic("destination")(destination)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (link != null) __obj.updateDynamic("link")(link)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (!js.isUndefined(validated)) __obj.updateDynamic("validated")(validated)
    __obj.asInstanceOf[TestScriptMetadataCapability]
  }
}

