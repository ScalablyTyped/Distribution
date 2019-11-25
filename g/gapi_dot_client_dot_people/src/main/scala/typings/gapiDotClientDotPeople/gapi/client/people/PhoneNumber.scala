package typings.gapiDotClientDotPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneNumber extends js.Object {
  /**
    * The read-only canonicalized [ITU-T E.164](https://law.resource.org/pub/us/cfr/ibr/004/itu-t.E.164.1.2008.pdf)
    * form of the phone number.
    */
  var canonicalForm: js.UndefOr[String] = js.undefined
  /**
    * The read-only type of the phone number translated and formatted in the
    * viewer's account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.undefined
  /** Metadata about the phone number. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /**
    * The type of the phone number. The type can be custom or predefined.
    * Possible values include, but are not limited to, the following:
    *
    * &#42; `home`
    * &#42; `work`
    * &#42; `mobile`
    * &#42; `homeFax`
    * &#42; `workFax`
    * &#42; `otherFax`
    * &#42; `pager`
    * &#42; `workMobile`
    * &#42; `workPager`
    * &#42; `main`
    * &#42; `googleVoice`
    * &#42; `other`
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** The phone number. */
  var value: js.UndefOr[String] = js.undefined
}

object PhoneNumber {
  @scala.inline
  def apply(
    canonicalForm: String = null,
    formattedType: String = null,
    metadata: FieldMetadata = null,
    `type`: String = null,
    value: String = null
  ): PhoneNumber = {
    val __obj = js.Dynamic.literal()
    if (canonicalForm != null) __obj.updateDynamic("canonicalForm")(canonicalForm.asInstanceOf[js.Any])
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumber]
  }
}

