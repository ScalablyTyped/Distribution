package typings
package ejDotWebDotAllLib.ejNs.SunburstChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomSettings extends js.Object {
  /** Enables or disables zooming.
    * @Default {false}
    */
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  /** Toolbar horizontal alignment
    * @Default {right. See Alignment}
    */
  var toolbarHorizontalAlignment: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstHorizontalAlignment | java.lang.String
  ] = js.undefined
  /** Toolbar vertical alignment
    * @Default {top. See Alignment}
    */
  var toolbarVerticalAlignment: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstVerticalAlignment | java.lang.String
  ] = js.undefined
}

object ZoomSettings {
  @scala.inline
  def apply(
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    toolbarHorizontalAlignment: ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstHorizontalAlignment | java.lang.String = null,
    toolbarVerticalAlignment: ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstVerticalAlignment | java.lang.String = null
  ): ZoomSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (toolbarHorizontalAlignment != null) __obj.updateDynamic("toolbarHorizontalAlignment")(toolbarHorizontalAlignment.asInstanceOf[js.Any])
    if (toolbarVerticalAlignment != null) __obj.updateDynamic("toolbarVerticalAlignment")(toolbarVerticalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomSettings]
  }
}

