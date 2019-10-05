package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPropertyRef extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var internalWebPropertyId: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
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

