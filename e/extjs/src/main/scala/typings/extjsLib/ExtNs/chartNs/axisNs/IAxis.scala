package typings
package extjsLib.ExtNs.chartNs.axisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAxis extends IAbstract {
  /** [Config Option] (Boolean) */
  var adjustEnd: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var dashSize: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Renders the axis into the screen and updates its position
  		* @param init Object
  		*/
  var drawAxis: js.UndefOr[js.Function1[/* init */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Renders an horizontal and or vertical grid into the Surface  */
  var drawGrid: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Renders the labels in the axes  */
  var drawLabel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var grid: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var length: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var majorTickSteps: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minorTickSteps: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Updates the title of this axis
  		* @param title String
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var width: js.UndefOr[scala.Double] = js.undefined
}

