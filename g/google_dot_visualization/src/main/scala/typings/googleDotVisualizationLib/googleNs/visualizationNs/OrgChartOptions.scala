package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgChartOptions extends js.Object {
  var allowCollapse: js.UndefOr[scala.Boolean] = js.undefined
  var allowHtml: js.UndefOr[scala.Boolean] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var nodeClass: js.UndefOr[java.lang.String] = js.undefined
  var selectedNodeClass: js.UndefOr[java.lang.String] = js.undefined
  var selectionColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Chart size
    * @type {('small'|'medium'|'large')}
    * @default 'medium'
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object OrgChartOptions {
  @scala.inline
  def apply(
    allowCollapse: js.UndefOr[scala.Boolean] = js.undefined,
    allowHtml: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    nodeClass: java.lang.String = null,
    selectedNodeClass: java.lang.String = null,
    selectionColor: java.lang.String = null,
    size: java.lang.String = null
  ): OrgChartOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCollapse)) __obj.updateDynamic("allowCollapse")(allowCollapse)
    if (!js.isUndefined(allowHtml)) __obj.updateDynamic("allowHtml")(allowHtml)
    if (color != null) __obj.updateDynamic("color")(color)
    if (nodeClass != null) __obj.updateDynamic("nodeClass")(nodeClass)
    if (selectedNodeClass != null) __obj.updateDynamic("selectedNodeClass")(selectedNodeClass)
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[OrgChartOptions]
  }
}

