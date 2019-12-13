package typings.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerParams extends js.Object {
  var classes: js.UndefOr[String | js.Array[String]] = js.undefined
}

object LayerParams {
  @scala.inline
  def apply(classes: String | js.Array[String] = null): LayerParams = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerParams]
  }
}

