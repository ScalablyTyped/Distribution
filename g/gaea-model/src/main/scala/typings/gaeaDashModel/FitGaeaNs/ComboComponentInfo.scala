package typings.gaeaDashModel.FitGaeaNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboComponentInfo extends ViewportComponentFullInfo {
  // 组合名
  var name: String
}

object ComboComponentInfo {
  @scala.inline
  def apply(
    childs: StringDictionary[ViewportComponentInfo],
    componentInfo: ViewportComponentInfo,
    mapUniqueKey: String,
    name: String
  ): ComboComponentInfo = {
    val __obj = js.Dynamic.literal(childs = childs, componentInfo = componentInfo, mapUniqueKey = mapUniqueKey, name = name)
  
    __obj.asInstanceOf[ComboComponentInfo]
  }
}

