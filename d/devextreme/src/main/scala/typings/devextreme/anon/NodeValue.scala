package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.dxTreeMapNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeValue extends js.Object {
  var node: js.UndefOr[dxTreeMapNode] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var valueText: js.UndefOr[String] = js.undefined
}

object NodeValue {
  @scala.inline
  def apply(node: dxTreeMapNode = null, value: js.UndefOr[Double] = js.undefined, valueText: String = null): NodeValue = {
    val __obj = js.Dynamic.literal()
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (valueText != null) __obj.updateDynamic("valueText")(valueText.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeValue]
  }
}

