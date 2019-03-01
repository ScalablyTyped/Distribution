package typings
package gapiDotClientDotPagespeedonlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Locale extends js.Object {
  /** The locale of the formattedResults, e.g. "en_US". */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Dictionary of formatted rule results, with one entry for each PageSpeed rule instantiated and run by the server. */
  var ruleResults: js.UndefOr[stdLib.Record[java.lang.String, Anon_Groups]] = js.undefined
}

object Anon_Locale {
  @scala.inline
  def apply(locale: java.lang.String = null, ruleResults: stdLib.Record[java.lang.String, Anon_Groups] = null): Anon_Locale = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (ruleResults != null) __obj.updateDynamic("ruleResults")(ruleResults)
    __obj.asInstanceOf[Anon_Locale]
  }
}

