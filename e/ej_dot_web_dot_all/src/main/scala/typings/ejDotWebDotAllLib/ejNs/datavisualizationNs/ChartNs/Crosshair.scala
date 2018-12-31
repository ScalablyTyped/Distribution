package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Crosshair extends js.Object {
  /** Options for customizing the crosshair line.
    */
  var line: js.UndefOr[CrosshairLine] = js.undefined
  /** Options for customizing the marker in crosshair.
    */
  var marker: js.UndefOr[CrosshairMarker] = js.undefined
  /** Options for customizing the trackball tooltip.
    */
  var trackballTooltipSettings: js.UndefOr[CrosshairTrackballTooltipSettings] = js.undefined
  /** Specifies the type of the crosshair. It can be trackball or crosshair
    * @Default {crosshair. See CrosshairType}
    */
  var `type`: js.UndefOr[CrosshairType | java.lang.String] = js.undefined
  /** Show/hides the crosshair/trackball visibility.
    * @Default {false}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

