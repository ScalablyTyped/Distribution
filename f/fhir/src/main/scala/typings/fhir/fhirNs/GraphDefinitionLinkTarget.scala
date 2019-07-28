package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Potential target for the link
  */
trait GraphDefinitionLinkTarget extends BackboneElement {
  /**
    * Contains extended information for property 'profile'.
    */
  var _profile: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Compartment Consistency Rules
    */
  var compartment: js.UndefOr[js.Array[GraphDefinitionLinkTargetCompartment]] = js.undefined
  /**
    * Additional links from target resource
    */
  var link: js.UndefOr[js.Array[GraphDefinitionLink]] = js.undefined
  /**
    * Profile for the target resource
    */
  var profile: js.UndefOr[uri] = js.undefined
  /**
    * Type of resource this link refers to
    */
  var `type`: code
}

object GraphDefinitionLinkTarget {
  @scala.inline
  def apply(
    `type`: code,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _profile: Element = null,
    _type: Element = null,
    compartment: js.Array[GraphDefinitionLinkTargetCompartment] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    link: js.Array[GraphDefinitionLink] = null,
    modifierExtension: js.Array[Extension] = null,
    profile: uri = null
  ): GraphDefinitionLinkTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_profile != null) __obj.updateDynamic("_profile")(_profile)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (compartment != null) __obj.updateDynamic("compartment")(compartment)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (link != null) __obj.updateDynamic("link")(link)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    __obj.asInstanceOf[GraphDefinitionLinkTarget]
  }
}

