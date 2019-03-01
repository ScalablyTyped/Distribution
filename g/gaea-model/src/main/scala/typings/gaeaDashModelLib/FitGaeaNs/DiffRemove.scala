package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffRemove extends ViewportComponentFullInfo {
  // 删除的位置
  var index: scala.Double
  // 父级元素 mapKey
  var parentMapUniqueKey: java.lang.String
}

object DiffRemove {
  @scala.inline
  def apply(
    childs: org.scalablytyped.runtime.StringDictionary[ViewportComponentInfo],
    componentInfo: ViewportComponentInfo,
    index: scala.Double,
    mapUniqueKey: java.lang.String,
    parentMapUniqueKey: java.lang.String
  ): DiffRemove = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("childs")(childs)
    __obj.updateDynamic("componentInfo")(componentInfo)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("mapUniqueKey")(mapUniqueKey)
    __obj.updateDynamic("parentMapUniqueKey")(parentMapUniqueKey)
    __obj.asInstanceOf[DiffRemove]
  }
}

