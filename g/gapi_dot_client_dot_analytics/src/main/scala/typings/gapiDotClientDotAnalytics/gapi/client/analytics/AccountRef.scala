package typings.gapiDotClientDotAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountRef extends js.Object {
  /** Link for this account. */
  var href: js.UndefOr[String] = js.undefined
  /** Account ID. */
  var id: js.UndefOr[String] = js.undefined
  /** Analytics account reference. */
  var kind: js.UndefOr[String] = js.undefined
  /** Account name. */
  var name: js.UndefOr[String] = js.undefined
}

object AccountRef {
  @scala.inline
  def apply(href: String = null, id: String = null, kind: String = null, name: String = null): AccountRef = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRef]
  }
}

