package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_FamilyNameFormatted extends js.Object {
  var familyName: js.UndefOr[String] = js.native
  var formatted: js.UndefOr[String] = js.native
  var givenName: js.UndefOr[String] = js.native
  var honorificPrefix: js.UndefOr[String] = js.native
  var honorificSuffix: js.UndefOr[String] = js.native
  var middleName: js.UndefOr[String] = js.native
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
    if (familyName != null) __obj.updateDynamic("familyName")(familyName.asInstanceOf[js.Any])
    if (formatted != null) __obj.updateDynamic("formatted")(formatted.asInstanceOf[js.Any])
    if (givenName != null) __obj.updateDynamic("givenName")(givenName.asInstanceOf[js.Any])
    if (honorificPrefix != null) __obj.updateDynamic("honorificPrefix")(honorificPrefix.asInstanceOf[js.Any])
    if (honorificSuffix != null) __obj.updateDynamic("honorificSuffix")(honorificSuffix.asInstanceOf[js.Any])
    if (middleName != null) __obj.updateDynamic("middleName")(middleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FamilyNameFormatted]
  }
}

