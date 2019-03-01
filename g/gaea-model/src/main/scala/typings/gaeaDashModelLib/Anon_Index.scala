package typings
package gaeaDashModelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  // 插入的位置
  var index: scala.Double
  // 父级 mapKey
  var parentMapUniqueKey: java.lang.String
  // 新增组件的唯一标识 id
  var uniqueId: java.lang.String
}

object Anon_Index {
  @scala.inline
  def apply(index: scala.Double, parentMapUniqueKey: java.lang.String, uniqueId: java.lang.String): Anon_Index = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("parentMapUniqueKey")(parentMapUniqueKey)
    __obj.updateDynamic("uniqueId")(uniqueId)
    __obj.asInstanceOf[Anon_Index]
  }
}

