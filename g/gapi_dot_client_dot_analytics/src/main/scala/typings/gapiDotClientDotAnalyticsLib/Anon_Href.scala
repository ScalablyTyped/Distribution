package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Href extends js.Object {
  /** Link to the account for this web property. */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /** Type of the parent link. Its value is "analytics#account". */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Href {
  @scala.inline
  def apply(href: java.lang.String = null, `type`: java.lang.String = null): Anon_Href = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Href]
  }
}

