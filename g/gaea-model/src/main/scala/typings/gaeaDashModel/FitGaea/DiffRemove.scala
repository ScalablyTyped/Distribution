package typings.gaeaDashModel.FitGaea

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffRemove extends ViewportComponentFullInfo {
  // 删除的位置
  var index: Double
  // 父级元素 mapKey
  var parentMapUniqueKey: String
}

object DiffRemove {
  @scala.inline
  def apply(
    childs: StringDictionary[ViewportComponentInfo],
    componentInfo: ViewportComponentInfo,
    index: Double,
    mapUniqueKey: String,
    parentMapUniqueKey: String
  ): DiffRemove = {
    val __obj = js.Dynamic.literal(childs = childs, componentInfo = componentInfo, index = index, mapUniqueKey = mapUniqueKey, parentMapUniqueKey = parentMapUniqueKey)
  
    __obj.asInstanceOf[DiffRemove]
  }
}

