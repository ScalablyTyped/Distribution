package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountRef extends js.Object {
  /** Link for this account. */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /** Account ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Analytics account reference. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Account name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object AccountRef {
  @scala.inline
  def apply(
    href: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null
  ): AccountRef = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AccountRef]
  }
}

