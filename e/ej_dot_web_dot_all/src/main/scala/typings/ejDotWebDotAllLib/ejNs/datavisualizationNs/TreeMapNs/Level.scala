package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  /** specifies the group background
    * @Default {null}
    */
  var groupBackground: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the group border color for tree map level.
    * @Default {null}
    */
  var groupBorderColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the group border thickness for tree map level.
    * @Default {1}
    */
  var groupBorderThickness: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the group gap for tree map level.
    * @Default {1}
    */
  var groupGap: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the group padding for tree map level.
    * @Default {4}
    */
  var groupPadding: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the group path for tree map level.
    */
  var groupPath: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the header height for tree map level.
    * @Default {0}
    */
  var headerHeight: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the header template for tree map level.
    * @Default {null}
    */
  var headerTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mode of header visibility
    * @Default {visible}
    */
  var headerVisibilityMode: js.UndefOr[VisibilityMode | java.lang.String] = js.undefined
  /** Specifies the position of the labels.
    * @Default {center}
    */
  var labelPosition: js.UndefOr[Position | java.lang.String] = js.undefined
  /** Specifies the label template for tree map level.
    * @Default {null}
    */
  var labelTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mode of label visibility
    * @Default {visible}
    */
  var labelVisibilityMode: js.UndefOr[VisibilityMode | java.lang.String] = js.undefined
  /** Shows or hides the header for tree map level.
    * @Default {false}
    */
  var showHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** Shows or hides the labels for tree map level.
    * @Default {false}
    */
  var showLabels: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the overflow options for leaf labels.
    * @Default {none}
    */
  var textOverflow: js.UndefOr[TextOverflow | java.lang.String] = js.undefined
}

