package typings.gaeaDashModel.FitGaeaNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportComponentFullInfo extends js.Object {
  // 子元素列表 （包括非直接子集）
  var childs: StringDictionary[ViewportComponentInfo]
  // 组件信息
  var componentInfo: ViewportComponentInfo
  // 组件的 mapUniqueKey
  var mapUniqueKey: String
}

object ViewportComponentFullInfo {
  @scala.inline
  def apply(
    childs: StringDictionary[ViewportComponentInfo],
    componentInfo: ViewportComponentInfo,
    mapUniqueKey: String
  ): ViewportComponentFullInfo = {
    val __obj = js.Dynamic.literal(childs = childs, componentInfo = componentInfo, mapUniqueKey = mapUniqueKey)
  
    __obj.asInstanceOf[ViewportComponentFullInfo]
  }
}

