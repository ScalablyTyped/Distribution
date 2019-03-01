package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailAddress extends js.Object {
  /** The display name of the email. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The read-only type of the email address translated and formatted in the
    * viewer's account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[java.lang.String] = js.undefined
  /** Metadata about the email address. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /**
    * The type of the email address. The type can be custom or predefined.
    * Possible values include, but are not limited to, the following:
    *
    * &#42; `home`
    * &#42; `work`
    * &#42; `other`
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** The email address. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object EmailAddress {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    formattedType: java.lang.String = null,
    metadata: FieldMetadata = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): EmailAddress = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[EmailAddress]
  }
}

