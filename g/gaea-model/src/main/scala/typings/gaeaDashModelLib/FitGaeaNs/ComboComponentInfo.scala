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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("childs")(childs)
    __obj.updateDynamic("componentInfo")(componentInfo)
    __obj.updateDynamic("mapUniqueKey")(mapUniqueKey)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ComboComponentInfo]
  }
}

