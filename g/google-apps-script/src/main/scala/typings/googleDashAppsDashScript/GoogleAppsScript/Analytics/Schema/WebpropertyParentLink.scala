package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpropertyParentLink extends js.Object {
  var href: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object WebpropertyParentLink {
  @scala.inline
  def apply(href: String = null, `type`: String = null): WebpropertyParentLink = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WebpropertyParentLink]
  }
}

