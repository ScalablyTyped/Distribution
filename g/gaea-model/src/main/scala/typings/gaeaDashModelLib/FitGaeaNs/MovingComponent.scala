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

