package typings.googleDotVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgChartOptions extends js.Object {
  var allowCollapse: js.UndefOr[Boolean] = js.undefined
  var allowHtml: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var nodeClass: js.UndefOr[String] = js.undefined
  var selectedNodeClass: js.UndefOr[String] = js.undefined
  var selectionColor: js.UndefOr[String] = js.undefined
  /**
    * Chart size
    * @type {('small'|'medium'|'large')}
    * @default 'medium'
    */
  var size: js.UndefOr[String] = js.undefined
}

object OrgChartOptions {
  @scala.inline
  def apply(
    allowCollapse: js.UndefOr[Boolean] = js.undefined,
    allowHtml: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    nodeClass: String = null,
    selectedNodeClass: String = null,
    selectionColor: String = null,
    size: String = null
  ): OrgChartOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCollapse)) __obj.updateDynamic("allowCollapse")(allowCollapse.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHtml)) __obj.updateDynamic("allowHtml")(allowHtml.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (nodeClass != null) __obj.updateDynamic("nodeClass")(nodeClass.asInstanceOf[js.Any])
    if (selectedNodeClass != null) __obj.updateDynamic("selectedNodeClass")(selectedNodeClass.asInstanceOf[js.Any])
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgChartOptions]
  }
}

