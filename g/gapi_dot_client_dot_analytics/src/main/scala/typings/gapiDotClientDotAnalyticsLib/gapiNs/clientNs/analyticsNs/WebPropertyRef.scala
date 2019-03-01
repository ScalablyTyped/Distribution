package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPropertyRef extends js.Object {
  /** Account ID to which this web property belongs. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Link for this web property. */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /** Web property ID of the form UA-XXXXX-YY. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Internal ID for this web property. */
  var internalWebPropertyId: js.UndefOr[java.lang.String] = js.undefined
  /** Analytics web property reference. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this web property. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object WebPropertyRef {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    href: java.lang.String = null,
    id: java.lang.String = null,
    internalWebPropertyId: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null
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

