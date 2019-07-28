package typings.gapiDotClientDotBlogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Country extends js.Object {
  /** The user's country setting. */
  var country: js.UndefOr[String] = js.undefined
  /** The user's language setting. */
  var language: js.UndefOr[String] = js.undefined
  /** The user's language variant setting. */
  var variant: js.UndefOr[String] = js.undefined
}

object Anon_Country {
  @scala.inline
  def apply(country: String = null, language: String = null, variant: String = null): Anon_Country = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (language != null) __obj.updateDynamic("language")(language)
    if (variant != null) __obj.updateDynamic("variant")(variant)
    __obj.asInstanceOf[Anon_Country]
  }
}

