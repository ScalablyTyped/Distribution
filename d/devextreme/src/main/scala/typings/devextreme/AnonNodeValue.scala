package typings.devextreme

import typings.devextreme.mod.DevExpress.viz.dxTreeMapNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNodeValue extends js.Object {
  var node: js.UndefOr[dxTreeMapNode] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var valueText: js.UndefOr[String] = js.undefined
}

object AnonNodeValue {
  @scala.inline
  def apply(node: dxTreeMapNode = null, value: Int | Double = null, valueText: String = null): AnonNodeValue = {
    val __obj = js.Dynamic.literal()
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueText != null) __obj.updateDynamic("valueText")(valueText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNodeValue]
  }
}

