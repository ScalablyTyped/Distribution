package typings.gapiDotClientDotAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterRef extends js.Object {
  /** Account ID to which this filter belongs. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Link for this filter. */
  var href: js.UndefOr[String] = js.undefined
  /** Filter ID. */
  var id: js.UndefOr[String] = js.undefined
  /** Kind value for filter reference. */
  var kind: js.UndefOr[String] = js.undefined
  /** Name of this filter. */
  var name: js.UndefOr[String] = js.undefined
}

object FilterRef {
  @scala.inline
  def apply(
    accountId: String = null,
    href: String = null,
    id: String = null,
    kind: String = null,
    name: String = null
  ): FilterRef = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (href != null) __obj.updateDynamic("href")(href)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[FilterRef]
  }
}

