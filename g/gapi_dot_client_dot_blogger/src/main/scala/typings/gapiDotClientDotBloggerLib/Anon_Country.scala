package typings
package gapiDotClientDotBloggerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Country extends js.Object {
  /** The user's country setting. */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /** The user's language setting. */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /** The user's language variant setting. */
  var variant: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Country {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    language: java.lang.String = null,
    variant: java.lang.String = null
  ): Anon_Country = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (language != null) __obj.updateDynamic("language")(language)
    if (variant != null) __obj.updateDynamic("variant")(variant)
    __obj.asInstanceOf[Anon_Country]
  }
}

