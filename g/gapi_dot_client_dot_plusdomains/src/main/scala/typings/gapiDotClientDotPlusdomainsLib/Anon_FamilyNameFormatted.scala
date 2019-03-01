package typings
package gapiDotClientDotPlusdomainsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FamilyNameFormatted extends js.Object {
  /** The family name (last name) of this person. */
  var familyName: js.UndefOr[java.lang.String] = js.undefined
  /** The full name of this person, including middle names, suffixes, etc. */
  var formatted: js.UndefOr[java.lang.String] = js.undefined
  /** The given name (first name) of this person. */
  var givenName: js.UndefOr[java.lang.String] = js.undefined
  /** The honorific prefixes (such as "Dr." or "Mrs.") for this person. */
  var honorificPrefix: js.UndefOr[java.lang.String] = js.undefined
  /** The honorific suffixes (such as "Jr.") for this person. */
  var honorificSuffix: js.UndefOr[java.lang.String] = js.undefined
  /** The middle name of this person. */
  var middleName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_FamilyNameFormatted {
  @scala.inline
  def apply(
    familyName: java.lang.String = null,
    formatted: java.lang.String = null,
    givenName: java.lang.String = null,
    honorificPrefix: java.lang.String = null,
    honorificSuffix: java.lang.String = null,
    middleName: java.lang.String = null
  ): Anon_FamilyNameFormatted = {
    val __obj = js.Dynamic.literal()
    if (familyName != null) __obj.updateDynamic("familyName")(familyName)
    if (formatted != null) __obj.updateDynamic("formatted")(formatted)
    if (givenName != null) __obj.updateDynamic("givenName")(givenName)
    if (honorificPrefix != null) __obj.updateDynamic("honorificPrefix")(honorificPrefix)
    if (honorificSuffix != null) __obj.updateDynamic("honorificSuffix")(honorificSuffix)
    if (middleName != null) __obj.updateDynamic("middleName")(middleName)
    __obj.asInstanceOf[Anon_FamilyNameFormatted]
  }
}

