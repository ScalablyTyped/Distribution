package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Name extends js.Object {
  /**
               * The read-only display name formatted according to the locale specified by
               * the viewer's account or the `Accept-Language` HTTP header.
               */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The read-only display name with the last name first formatted according to
               * the locale specified by the viewer's account or the
               * `Accept-Language` HTTP header.
               */
  var displayNameLastFirst: js.UndefOr[java.lang.String] = js.undefined
  /** The family name. */
  var familyName: js.UndefOr[java.lang.String] = js.undefined
  /** The given name. */
  var givenName: js.UndefOr[java.lang.String] = js.undefined
  /** The honorific prefixes, such as `Mrs.` or `Dr.` */
  var honorificPrefix: js.UndefOr[java.lang.String] = js.undefined
  /** The honorific suffixes, such as `Jr.` */
  var honorificSuffix: js.UndefOr[java.lang.String] = js.undefined
  /** Metadata about the name. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** The middle name(s). */
  var middleName: js.UndefOr[java.lang.String] = js.undefined
  /** The family name spelled as it sounds. */
  var phoneticFamilyName: js.UndefOr[java.lang.String] = js.undefined
  /** The full name spelled as it sounds. */
  var phoneticFullName: js.UndefOr[java.lang.String] = js.undefined
  /** The given name spelled as it sounds. */
  var phoneticGivenName: js.UndefOr[java.lang.String] = js.undefined
  /** The honorific prefixes spelled as they sound. */
  var phoneticHonorificPrefix: js.UndefOr[java.lang.String] = js.undefined
  /** The honorific suffixes spelled as they sound. */
  var phoneticHonorificSuffix: js.UndefOr[java.lang.String] = js.undefined
  /** The middle name(s) spelled as they sound. */
  var phoneticMiddleName: js.UndefOr[java.lang.String] = js.undefined
}

