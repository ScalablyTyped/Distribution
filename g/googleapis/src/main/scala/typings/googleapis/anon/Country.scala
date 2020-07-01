package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Country extends js.Object {
  var country: js.UndefOr[String] = js.native
  var language: js.UndefOr[String] = js.native
  var variant: js.UndefOr[String] = js.native
}

object Country {
  @scala.inline
  def apply(country: String = null, language: String = null, variant: String = null): Country = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[Country]
  }
}

