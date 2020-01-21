package typings.gapiClientBlogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCountry extends js.Object {
  /** The user's country setting. */
  var country: js.UndefOr[String] = js.undefined
  /** The user's language setting. */
  var language: js.UndefOr[String] = js.undefined
  /** The user's language variant setting. */
  var variant: js.UndefOr[String] = js.undefined
}

object AnonCountry {
  @scala.inline
  def apply(country: String = null, language: String = null, variant: String = null): AnonCountry = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCountry]
  }
}

