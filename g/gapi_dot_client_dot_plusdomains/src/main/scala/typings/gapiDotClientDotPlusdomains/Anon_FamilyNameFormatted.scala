package typings.gapiDotClientDotPlusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FamilyNameFormatted extends js.Object {
  /** The family name (last name) of this person. */
  var familyName: js.UndefOr[String] = js.undefined
  /** The full name of this person, including middle names, suffixes, etc. */
  var formatted: js.UndefOr[String] = js.undefined
  /** The given name (first name) of this person. */
  var givenName: js.UndefOr[String] = js.undefined
  /** The honorific prefixes (such as "Dr." or "Mrs.") for this person. */
  var honorificPrefix: js.UndefOr[String] = js.undefined
  /** The honorific suffixes (such as "Jr.") for this person. */
  var honorificSuffix: js.UndefOr[String] = js.undefined
  /** The middle name of this person. */
  var middleName: js.UndefOr[String] = js.undefined
}

object Anon_FamilyNameFormatted {
  @scala.inline
  def apply(
    familyName: String = null,
    formatted: String = null,
    givenName: String = null,
    honorificPrefix: String = null,
    honorificSuffix: String = null,
    middleName: String = null
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

