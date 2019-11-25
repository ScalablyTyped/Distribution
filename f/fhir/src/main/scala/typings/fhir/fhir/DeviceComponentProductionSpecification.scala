package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specification details such as Component Revisions, or Serial Numbers
  */
trait DeviceComponentProductionSpecification extends BackboneElement {
  /**
    * Contains extended information for property 'productionSpec'.
    */
  var _productionSpec: js.UndefOr[Element] = js.undefined
  /**
    * Internal component unique identification
    */
  var componentId: js.UndefOr[Identifier] = js.undefined
  /**
    * A printable string defining the component
    */
  var productionSpec: js.UndefOr[String] = js.undefined
  /**
    * Type or kind of production specification, for example serial number or software revision
    */
  var specType: js.UndefOr[CodeableConcept] = js.undefined
}

object DeviceComponentProductionSpecification {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _productionSpec: Element = null,
    componentId: Identifier = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    productionSpec: String = null,
    specType: CodeableConcept = null
  ): DeviceComponentProductionSpecification = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_productionSpec != null) __obj.updateDynamic("_productionSpec")(_productionSpec.asInstanceOf[js.Any])
    if (componentId != null) __obj.updateDynamic("componentId")(componentId.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (productionSpec != null) __obj.updateDynamic("productionSpec")(productionSpec.asInstanceOf[js.Any])
    if (specType != null) __obj.updateDynamic("specType")(specType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceComponentProductionSpecification]
  }
}

