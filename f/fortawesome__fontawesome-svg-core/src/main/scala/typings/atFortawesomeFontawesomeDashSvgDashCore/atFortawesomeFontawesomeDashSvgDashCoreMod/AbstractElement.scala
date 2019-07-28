package typings.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractElement extends js.Object {
  var attributes: js.Any
  var children: js.UndefOr[js.Array[AbstractElement]] = js.undefined
  var tag: String
}

object AbstractElement {
  @scala.inline
  def apply(attributes: js.Any, tag: String, children: js.Array[AbstractElement] = null): AbstractElement = {
    val __obj = js.Dynamic.literal(attributes = attributes, tag = tag)
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[AbstractElement]
  }
}

