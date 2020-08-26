package typings.gaeaModel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapUniqueKey extends js.Object {
  // 当前拖拽组件的 mapUniqueKey
  var mapUniqueKey: String = js.native
  // 拖拽目标的 index
  var targetIndex: js.UndefOr[Double] = js.native
  // 拖拽目标的 mapUniqueKey
  var targetMapUniqueKey: js.UndefOr[String] = js.native
}

object MapUniqueKey {
  @scala.inline
  def apply(mapUniqueKey: String): MapUniqueKey = {
    val __obj = js.Dynamic.literal(mapUniqueKey = mapUniqueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapUniqueKey]
  }
  @scala.inline
  implicit class MapUniqueKeyOps[Self <: MapUniqueKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMapUniqueKey(value: String): Self = this.set("mapUniqueKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetIndex(value: Double): Self = this.set("targetIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetIndex: Self = this.set("targetIndex", js.undefined)
    @scala.inline
    def setTargetMapUniqueKey(value: String): Self = this.set("targetMapUniqueKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetMapUniqueKey: Self = this.set("targetMapUniqueKey", js.undefined)
  }
  
}

