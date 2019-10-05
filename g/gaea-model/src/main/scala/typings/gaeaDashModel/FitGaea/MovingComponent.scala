package typings.gaeaDashModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MovingComponent extends js.Object {
  // 是否是新拖拽的
  var isNew: Boolean
  // 在编辑区域的组件信息
  var mapUniqueKey: String
  // 直接给 source 就直接用
  var source: String
  // 组件的唯一标识, 新建的时候采用
  var uniqueKey: String
}

object MovingComponent {
  @scala.inline
  def apply(isNew: Boolean, mapUniqueKey: String, source: String, uniqueKey: String): MovingComponent = {
    val __obj = js.Dynamic.literal(isNew = isNew, mapUniqueKey = mapUniqueKey, source = source, uniqueKey = uniqueKey)
  
    __obj.asInstanceOf[MovingComponent]
  }
}

