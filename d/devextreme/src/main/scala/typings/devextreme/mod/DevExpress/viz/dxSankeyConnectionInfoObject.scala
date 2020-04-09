package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSankeyConnectionInfoObject extends js.Object {
  /** @name dxSankeyConnectionInfoObject.source */
  var source: js.UndefOr[String] = js.undefined
  /** @name dxSankeyConnectionInfoObject.target */
  var target: js.UndefOr[String] = js.undefined
  /** @name dxSankeyConnectionInfoObject.weight */
  var weight: js.UndefOr[Double] = js.undefined
}

object dxSankeyConnectionInfoObject {
  @scala.inline
  def apply(source: String = null, target: String = null, weight: Int | Double = null): dxSankeyConnectionInfoObject = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSankeyConnectionInfoObject]
  }
}

