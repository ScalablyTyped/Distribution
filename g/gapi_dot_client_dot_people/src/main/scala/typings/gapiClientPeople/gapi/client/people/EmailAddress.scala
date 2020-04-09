package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailAddress extends js.Object {
  /** The display name of the email. */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * Output only. The type of the email address translated and formatted in the
    * viewer's account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.undefined
  /** Metadata about the email address. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /**
    * The type of the email address. The type can be custom or one of these
    * predefined values:
    *
    * &#42; `home`
    * &#42; `work`
    * &#42; `other`
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** The email address. */
  var value: js.UndefOr[String] = js.undefined
}

object EmailAddress {
  @scala.inline
  def apply(
    displayName: String = null,
    formattedType: String = null,
    metadata: FieldMetadata = null,
    `type`: String = null,
    value: String = null
  ): EmailAddress = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailAddress]
  }
}

