package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventGadget extends js.Object {
  var display: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var iconLink: js.UndefOr[String] = js.undefined
  var link: js.UndefOr[String] = js.undefined
  var preferences: js.UndefOr[js.Object] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object EventGadget {
  @scala.inline
  def apply(
    display: String = null,
    height: js.UndefOr[Double] = js.undefined,
    iconLink: String = null,
    link: String = null,
    preferences: js.Object = null,
    title: String = null,
    `type`: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): EventGadget = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (iconLink != null) __obj.updateDynamic("iconLink")(iconLink.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (preferences != null) __obj.updateDynamic("preferences")(preferences.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventGadget]
  }
}

