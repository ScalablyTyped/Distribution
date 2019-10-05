package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Logical network location for application activity
  */
trait AuditEventAgentNetwork extends BackboneElement {
  /**
    * Contains extended information for property 'address'.
    */
  var _address: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Identifier for the network access point of the user device
    */
  var address: js.UndefOr[String] = js.undefined
  /**
    * The type of network access point
    */
  var `type`: js.UndefOr[code] = js.undefined
}

object AuditEventAgentNetwork {
  @scala.inline
  def apply(
    _address: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _type: Element = null,
    address: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    `type`: code = null
  ): AuditEventAgentNetwork = {
    val __obj = js.Dynamic.literal()
    if (_address != null) __obj.updateDynamic("_address")(_address)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (address != null) __obj.updateDynamic("address")(address)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AuditEventAgentNetwork]
  }
}

