package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  /**
    * The read-only display name formatted according to the locale specified by
    * the viewer's account or the `Accept-Language` HTTP header.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * The read-only display name with the last name first formatted according to
    * the locale specified by the viewer's account or the
    * `Accept-Language` HTTP header.
    */
  var displayNameLastFirst: js.UndefOr[String] = js.undefined
  /** The family name. */
  var familyName: js.UndefOr[String] = js.undefined
  /** The given name. */
  var givenName: js.UndefOr[String] = js.undefined
  /** The honorific prefixes, such as `Mrs.` or `Dr.` */
  var honorificPrefix: js.UndefOr[String] = js.undefined
  /** The honorific suffixes, such as `Jr.` */
  var honorificSuffix: js.UndefOr[String] = js.undefined
  /** Metadata about the name. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** The middle name(s). */
  var middleName: js.UndefOr[String] = js.undefined
  /** The family name spelled as it sounds. */
  var phoneticFamilyName: js.UndefOr[String] = js.undefined
  /** The full name spelled as it sounds. */
  var phoneticFullName: js.UndefOr[String] = js.undefined
  /** The given name spelled as it sounds. */
  var phoneticGivenName: js.UndefOr[String] = js.undefined
  /** The honorific prefixes spelled as they sound. */
  var phoneticHonorificPrefix: js.UndefOr[String] = js.undefined
  /** The honorific suffixes spelled as they sound. */
  var phoneticHonorificSuffix: js.UndefOr[String] = js.undefined
  /** The middle name(s) spelled as they sound. */
  var phoneticMiddleName: js.UndefOr[String] = js.undefined
}

object Name {
  @scala.inline
  def apply(
    displayName: String = null,
    displayNameLastFirst: String = null,
    familyName: String = null,
    givenName: String = null,
    honorificPrefix: String = null,
    honorificSuffix: String = null,
    metadata: FieldMetadata = null,
    middleName: String = null,
    phoneticFamilyName: String = null,
    phoneticFullName: String = null,
    phoneticGivenName: String = null,
    phoneticHonorificPrefix: String = null,
    phoneticHonorificSuffix: String = null,
    phoneticMiddleName: String = null
  ): Name = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (displayNameLastFirst != null) __obj.updateDynamic("displayNameLastFirst")(displayNameLastFirst.asInstanceOf[js.Any])
    if (familyName != null) __obj.updateDynamic("familyName")(familyName.asInstanceOf[js.Any])
    if (givenName != null) __obj.updateDynamic("givenName")(givenName.asInstanceOf[js.Any])
    if (honorificPrefix != null) __obj.updateDynamic("honorificPrefix")(honorificPrefix.asInstanceOf[js.Any])
    if (honorificSuffix != null) __obj.updateDynamic("honorificSuffix")(honorificSuffix.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (middleName != null) __obj.updateDynamic("middleName")(middleName.asInstanceOf[js.Any])
    if (phoneticFamilyName != null) __obj.updateDynamic("phoneticFamilyName")(phoneticFamilyName.asInstanceOf[js.Any])
    if (phoneticFullName != null) __obj.updateDynamic("phoneticFullName")(phoneticFullName.asInstanceOf[js.Any])
    if (phoneticGivenName != null) __obj.updateDynamic("phoneticGivenName")(phoneticGivenName.asInstanceOf[js.Any])
    if (phoneticHonorificPrefix != null) __obj.updateDynamic("phoneticHonorificPrefix")(phoneticHonorificPrefix.asInstanceOf[js.Any])
    if (phoneticHonorificSuffix != null) __obj.updateDynamic("phoneticHonorificSuffix")(phoneticHonorificSuffix.asInstanceOf[js.Any])
    if (phoneticMiddleName != null) __obj.updateDynamic("phoneticMiddleName")(phoneticMiddleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

