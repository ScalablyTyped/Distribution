package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If the endpoint is a RESTful one
  */
trait CapabilityStatementRest extends BackboneElement {
  /**
    * Contains extended information for property 'compartment'.
    */
  var _compartment: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  /**
    * Compartments served/used by system
    */
  var compartment: js.UndefOr[js.Array[uri]] = js.undefined
  /**
    * General description of implementation
    */
  var documentation: js.UndefOr[String] = js.undefined
  /**
    * What operations are supported?
    */
  var interaction: js.UndefOr[js.Array[CapabilityStatementRestInteraction]] = js.undefined
  /**
    * client | server
    */
  var mode: code
  /**
    * Definition of an operation or a custom query
    */
  var operation: js.UndefOr[js.Array[CapabilityStatementRestOperation]] = js.undefined
  /**
    * Resource served on the REST interface
    */
  var resource: js.UndefOr[js.Array[CapabilityStatementRestResource]] = js.undefined
  /**
    * Search parameters for searching all resources
    */
  var searchParam: js.UndefOr[js.Array[CapabilityStatementRestResourceSearchParam]] = js.undefined
  /**
    * Information about security of implementation
    */
  var security: js.UndefOr[CapabilityStatementRestSecurity] = js.undefined
}

object CapabilityStatementRest {
  @scala.inline
  def apply(
    mode: code,
    _compartment: js.Array[Element] = null,
    _documentation: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _mode: Element = null,
    compartment: js.Array[uri] = null,
    documentation: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    interaction: js.Array[CapabilityStatementRestInteraction] = null,
    modifierExtension: js.Array[Extension] = null,
    operation: js.Array[CapabilityStatementRestOperation] = null,
    resource: js.Array[CapabilityStatementRestResource] = null,
    searchParam: js.Array[CapabilityStatementRestResourceSearchParam] = null,
    security: CapabilityStatementRestSecurity = null
  ): CapabilityStatementRest = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (_compartment != null) __obj.updateDynamic("_compartment")(_compartment.asInstanceOf[js.Any])
    if (_documentation != null) __obj.updateDynamic("_documentation")(_documentation.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_mode != null) __obj.updateDynamic("_mode")(_mode.asInstanceOf[js.Any])
    if (compartment != null) __obj.updateDynamic("compartment")(compartment.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (interaction != null) __obj.updateDynamic("interaction")(interaction.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (searchParam != null) __obj.updateDynamic("searchParam")(searchParam.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementRest]
  }
}

