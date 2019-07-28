package typings.gapiDotClientDotAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Href extends js.Object {
  /** Link to the account for this web property. */
  var href: js.UndefOr[String] = js.undefined
  /** Type of the parent link. Its value is "analytics#account". */
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_Href {
  @scala.inline
  def apply(href: String = null, `type`: String = null): Anon_Href = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Href]
  }
}

