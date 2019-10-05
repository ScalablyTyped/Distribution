package typings.gapiDotClientDotAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPropertyRef extends js.Object {
  /** Account ID to which this web property belongs. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Link for this web property. */
  var href: js.UndefOr[String] = js.undefined
  /** Web property ID of the form UA-XXXXX-YY. */
  var id: js.UndefOr[String] = js.undefined
  /** Internal ID for this web property. */
  var internalWebPropertyId: js.UndefOr[String] = js.undefined
  /** Analytics web property reference. */
  var kind: js.UndefOr[String] = js.undefined
  /** Name of this web property. */
  var name: js.UndefOr[String] = js.undefined
}

object WebPropertyRef {
  @scala.inline
  def apply(
    accountId: String = null,
    href: String = null,
    id: String = null,
    internalWebPropertyId: String = null,
    kind: String = null,
    name: String = null
  ): WebPropertyRef = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (href != null) __obj.updateDynamic("href")(href)
    if (id != null) __obj.updateDynamic("id")(id)
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[WebPropertyRef]
  }
}

