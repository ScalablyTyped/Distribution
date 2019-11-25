package typings.gaeaDashModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MapUniqueKey extends js.Object {
  // 当前拖拽组件的 mapUniqueKey
  var mapUniqueKey: String
  // 拖拽目标的 index
  var targetIndex: js.UndefOr[Double] = js.undefined
  // 拖拽目标的 mapUniqueKey
  var targetMapUniqueKey: js.UndefOr[String] = js.undefined
}

object Anon_MapUniqueKey {
  @scala.inline
  def apply(mapUniqueKey: String, targetIndex: Int | Double = null, targetMapUniqueKey: String = null): Anon_MapUniqueKey = {
    val __obj = js.Dynamic.literal(mapUniqueKey = mapUniqueKey.asInstanceOf[js.Any])
    if (targetIndex != null) __obj.updateDynamic("targetIndex")(targetIndex.asInstanceOf[js.Any])
    if (targetMapUniqueKey != null) __obj.updateDynamic("targetMapUniqueKey")(targetMapUniqueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MapUniqueKey]
  }
}

