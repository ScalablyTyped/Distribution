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
    val __obj = js.Dynamic.literal(childs = childs, componentInfo = componentInfo, index = index, mapUniqueKey = mapUniqueKey, parentMapUniqueKey = parentMapUniqueKey)
  
    __obj.asInstanceOf[DiffRemove]
  }
}

