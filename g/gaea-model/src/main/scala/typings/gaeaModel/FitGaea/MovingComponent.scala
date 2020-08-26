package typings.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MovingComponent extends js.Object {
  // 是否是新拖拽的
  var isNew: Boolean = js.native
  // 在编辑区域的组件信息
  var mapUniqueKey: String = js.native
  // 直接给 source 就直接用
  var source: String = js.native
  // 组件的唯一标识, 新建的时候采用
  var uniqueKey: String = js.native
}

object MovingComponent {
  @scala.inline
  def apply(isNew: Boolean, mapUniqueKey: String, source: String, uniqueKey: String): MovingComponent = {
    val __obj = js.Dynamic.literal(isNew = isNew.asInstanceOf[js.Any], mapUniqueKey = mapUniqueKey.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], uniqueKey = uniqueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MovingComponent]
  }
  @scala.inline
  implicit class MovingComponentOps[Self <: MovingComponent] (val x: Self) extends AnyVal {
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
    def setIsNew(value: Boolean): Self = this.set("isNew", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapUniqueKey(value: String): Self = this.set("mapUniqueKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniqueKey(value: String): Self = this.set("uniqueKey", value.asInstanceOf[js.Any])
  }
  
}

