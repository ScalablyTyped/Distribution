package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s phone number.
  */
@js.native
trait Schema$PhoneNumber extends js.Object {
  /**
    * The read-only canonicalized [ITU-T
    * E.164](https://law.resource.org/pub/us/cfr/ibr/004/itu-t.E.164.1.2008.pdf)
    * form of the phone number.
    */
  var canonicalForm: js.UndefOr[String] = js.native
  /**
    * The read-only type of the phone number translated and formatted in the
    * viewer&#39;s account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.native
  /**
    * Metadata about the phone number.
    */
  var metadata: js.UndefOr[Schema$FieldMetadata] = js.native
  /**
    * The type of the phone number. The type can be custom or one of these
    * predefined values:  * `home` * `work` * `mobile` * `homeFax` * `workFax`
    * * `otherFax` * `pager` * `workMobile` * `workPager` * `main` *
    * `googleVoice` * `other`
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The phone number.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$PhoneNumber {
  @scala.inline
  def apply(
    canonicalForm: String = null,
    formattedType: String = null,
    metadata: Schema$FieldMetadata = null,
    `type`: String = null,
    value: String = null
  ): Schema$PhoneNumber = {
    val __obj = js.Dynamic.literal()
    if (canonicalForm != null) __obj.updateDynamic("canonicalForm")(canonicalForm.asInstanceOf[js.Any])
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PhoneNumber]
  }
}

