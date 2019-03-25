package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventGadget extends js.Object {
  var display: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var iconLink: js.UndefOr[java.lang.String] = js.undefined
  var link: js.UndefOr[java.lang.String] = js.undefined
  var preferences: js.UndefOr[js.Object] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object EventGadget {
  @scala.inline
  def apply(
    display: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    iconLink: java.lang.String = null,
    link: java.lang.String = null,
    preferences: js.Object = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    width: scala.Int | scala.Double = null
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

