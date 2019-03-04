package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboComponentInfo extends ViewportComponentFullInfo {
  // 组合名
  var name: java.lang.String
}

object ComboComponentInfo {
  @scala.inline
  def apply(
    childs: org.scalablytyped.runtime.StringDictionary[ViewportComponentInfo],
    componentInfo: ViewportComponentInfo,
    mapUniqueKey: java.lang.String,
    name: java.lang.String
  ): ComboComponentInfo = {
    val __obj = js.Dynamic.literal(childs = childs, componentInfo = componentInfo, mapUniqueKey = mapUniqueKey, name = name)
  
    __obj.asInstanceOf[ComboComponentInfo]
  }
}

