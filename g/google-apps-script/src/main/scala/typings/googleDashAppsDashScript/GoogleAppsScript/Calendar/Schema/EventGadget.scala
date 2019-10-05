package typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema

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
    height: Int | Double = null,
    iconLink: String = null,
    link: String = null,
    preferences: js.Object = null,
    title: String = null,
    `type`: String = null,
    width: Int | Double = null
  ): EventGadget = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (iconLink != null) __obj.updateDynamic("iconLink")(iconLink)
    if (link != null) __obj.updateDynamic("link")(link)
    if (preferences != null) __obj.updateDynamic("preferences")(preferences)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventGadget]
  }
}

