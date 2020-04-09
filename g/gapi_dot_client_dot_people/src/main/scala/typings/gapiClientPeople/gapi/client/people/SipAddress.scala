package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SipAddress extends js.Object {
  /**
    * Output only. The type of the SIP address translated and formatted in the
    * viewer's account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.undefined
  /** Metadata about the SIP address. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /**
    * The type of the SIP address. The type can be custom or or one of these
    * predefined values:
    *
    * &#42; `home`
    * &#42; `work`
    * &#42; `mobile`
    * &#42; `other`
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * The SIP address in the
    * [RFC 3261 19.1](https://tools.ietf.org/html/rfc3261#section-19.1) SIP URI
    * format.
    */
  var value: js.UndefOr[String] = js.undefined
}

object SipAddress {
  @scala.inline
  def apply(
    formattedType: String = null,
    metadata: FieldMetadata = null,
    `type`: String = null,
    value: String = null
  ): SipAddress = {
    val __obj = js.Dynamic.literal()
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SipAddress]
  }
}

