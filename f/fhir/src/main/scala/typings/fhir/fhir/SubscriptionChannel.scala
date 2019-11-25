package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The channel on which to report matches to the criteria
  */
trait SubscriptionChannel extends BackboneElement {
  /**
    * Contains extended information for property 'endpoint'.
    */
  var _endpoint: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'header'.
    */
  var _header: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'payload'.
    */
  var _payload: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Where the channel points to
    */
  var endpoint: js.UndefOr[uri] = js.undefined
  /**
    * Usage depends on the channel type
    */
  var header: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Mimetype to send, or omit for no payload
    */
  var payload: js.UndefOr[String] = js.undefined
  /**
    * rest-hook | websocket | email | sms | message
    */
  var `type`: code
}

object SubscriptionChannel {
  @scala.inline
  def apply(
    `type`: code,
    _endpoint: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _header: js.Array[Element] = null,
    _id: Element = null,
    _payload: Element = null,
    _type: Element = null,
    endpoint: uri = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    header: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    payload: String = null
  ): SubscriptionChannel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_endpoint != null) __obj.updateDynamic("_endpoint")(_endpoint.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_header != null) __obj.updateDynamic("_header")(_header.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_payload != null) __obj.updateDynamic("_payload")(_payload.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionChannel]
  }
}

