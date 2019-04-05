package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdStyleColors extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object AdStyleColors {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    border: java.lang.String = null,
    text: java.lang.String = null,
    title: java.lang.String = null,
    url: java.lang.String = null
  ): AdStyleColors = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[AdStyleColors]
  }
}

