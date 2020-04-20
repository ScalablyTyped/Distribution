package typings.gaeaModel.FitGaea

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
    val __obj = js.Dynamic.literal(childs = childs.asInstanceOf[js.Any], componentInfo = componentInfo.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], mapUniqueKey = mapUniqueKey.asInstanceOf[js.Any], parentMapUniqueKey = parentMapUniqueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffRemove]
  }
}

