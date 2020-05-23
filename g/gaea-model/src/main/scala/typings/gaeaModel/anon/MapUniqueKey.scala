package typings.gaeaModel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapUniqueKey extends js.Object {
  // 当前拖拽组件的 mapUniqueKey
  var mapUniqueKey: String
  // 拖拽目标的 index
  var targetIndex: js.UndefOr[Double] = js.undefined
  // 拖拽目标的 mapUniqueKey
  var targetMapUniqueKey: js.UndefOr[String] = js.undefined
}

object MapUniqueKey {
  @scala.inline
  def apply(
    mapUniqueKey: String,
    targetIndex: js.UndefOr[Double] = js.undefined,
    targetMapUniqueKey: String = null
  ): MapUniqueKey = {
    val __obj = js.Dynamic.literal(mapUniqueKey = mapUniqueKey.asInstanceOf[js.Any])
    if (!js.isUndefined(targetIndex)) __obj.updateDynamic("targetIndex")(targetIndex.get.asInstanceOf[js.Any])
    if (targetMapUniqueKey != null) __obj.updateDynamic("targetMapUniqueKey")(targetMapUniqueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapUniqueKey]
  }
}

