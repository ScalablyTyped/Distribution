package typings
package gaeaDashModelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MapUniqueKey extends js.Object {
  // 当前拖拽组件的 mapUniqueKey
  var mapUniqueKey: java.lang.String
  // 拖拽目标的 index
  var targetIndex: js.UndefOr[scala.Double] = js.undefined
  // 拖拽目标的 mapUniqueKey
  var targetMapUniqueKey: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_MapUniqueKey {
  @scala.inline
  def apply(
    mapUniqueKey: java.lang.String,
    targetIndex: scala.Int | scala.Double = null,
    targetMapUniqueKey: java.lang.String = null
  ): Anon_MapUniqueKey = {
    val __obj = js.Dynamic.literal(mapUniqueKey = mapUniqueKey)
    if (targetIndex != null) __obj.updateDynamic("targetIndex")(targetIndex.asInstanceOf[js.Any])
    if (targetMapUniqueKey != null) __obj.updateDynamic("targetMapUniqueKey")(targetMapUniqueKey)
    __obj.asInstanceOf[Anon_MapUniqueKey]
  }
}

