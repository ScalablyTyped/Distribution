package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Where messages should be sent
  */
trait CapabilityStatementMessagingEndpoint extends BackboneElement {
  /**
    * Contains extended information for property 'address'.
    */
  var _address: js.UndefOr[Element] = js.undefined
  /**
    * Network address or identifier of the end-point
    */
  var address: uri
  /**
    * http | ftp | mllp +
    */
  var protocol: Coding
}

object CapabilityStatementMessagingEndpoint {
  @scala.inline
  def apply(
    address: uri,
    protocol: Coding,
    _address: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): CapabilityStatementMessagingEndpoint = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    if (_address != null) __obj.updateDynamic("_address")(_address.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementMessagingEndpoint]
  }
}

