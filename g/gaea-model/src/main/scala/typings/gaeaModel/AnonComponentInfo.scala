package typings.gaeaModel

import typings.gaeaModel.FitGaea.ViewportComponentFullInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponentInfo extends js.Object {
  // 组合的完整信息（不是 copy 的, 是真正对应的 mapUniqueKey）
  var componentInfo: ViewportComponentFullInfo
  // 父级的 index
  var index: Double
  // 父级 mapKey
  var parentMapUniqueKey: String
}

object AnonComponentInfo {
  @scala.inline
  def apply(componentInfo: ViewportComponentFullInfo, index: Double, parentMapUniqueKey: String): AnonComponentInfo = {
    val __obj = js.Dynamic.literal(componentInfo = componentInfo.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], parentMapUniqueKey = parentMapUniqueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponentInfo]
  }
}

