package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsCommand extends js.Object {
  var left: js.UndefOr[scala.Double] = js.undefined
  var positionOption: js.UndefOr[java.lang.String] = js.undefined
  var top: js.UndefOr[scala.Double] = js.undefined
  var windowHeight: js.UndefOr[scala.Double] = js.undefined
  var windowWidth: js.UndefOr[scala.Double] = js.undefined
}

object FsCommand {
  @scala.inline
  def apply(
    left: scala.Int | scala.Double = null,
    positionOption: java.lang.String = null,
    top: scala.Int | scala.Double = null,
    windowHeight: scala.Int | scala.Double = null,
    windowWidth: scala.Int | scala.Double = null
  ): FsCommand = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (positionOption != null) __obj.updateDynamic("positionOption")(positionOption)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (windowHeight != null) __obj.updateDynamic("windowHeight")(windowHeight.asInstanceOf[js.Any])
    if (windowWidth != null) __obj.updateDynamic("windowWidth")(windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsCommand]
  }
}

