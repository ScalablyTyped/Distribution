package typings.gapiClientPagespeedonline.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  /** The locale of the formattedResults, e.g. "en_US". */
  var locale: js.UndefOr[String] = js.undefined
  /** Dictionary of formatted rule results, with one entry for each PageSpeed rule instantiated and run by the server. */
  var ruleResults: js.UndefOr[Record[String, Groups]] = js.undefined
}

object Locale {
  @scala.inline
  def apply(locale: String = null, ruleResults: Record[String, Groups] = null): Locale = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (ruleResults != null) __obj.updateDynamic("ruleResults")(ruleResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

