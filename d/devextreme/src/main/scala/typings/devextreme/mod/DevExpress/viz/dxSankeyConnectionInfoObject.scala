package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSankeyConnectionInfoObject extends js.Object {
  /** The title of the link's source node. */
  var source: js.UndefOr[String] = js.undefined
  /** The title of the link's target node. */
  var target: js.UndefOr[String] = js.undefined
  /** The link's weight. */
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

