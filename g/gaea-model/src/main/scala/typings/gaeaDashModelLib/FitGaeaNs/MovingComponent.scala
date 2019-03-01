package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MovingComponent extends js.Object {
  // 是否是新拖拽的
  var isNew: scala.Boolean
  // 在编辑区域的组件信息
  var mapUniqueKey: java.lang.String
  // 直接给 source 就直接用
  var source: java.lang.String
  // 组件的唯一标识, 新建的时候采用
  var uniqueKey: java.lang.String
}

object MovingComponent {
  @scala.inline
  def apply(
    isNew: scala.Boolean,
    mapUniqueKey: java.lang.String,
    source: java.lang.String,
    uniqueKey: java.lang.String
  ): MovingComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isNew")(isNew)
    __obj.updateDynamic("mapUniqueKey")(mapUniqueKey)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("uniqueKey")(uniqueKey)
    __obj.asInstanceOf[MovingComponent]
  }
}

