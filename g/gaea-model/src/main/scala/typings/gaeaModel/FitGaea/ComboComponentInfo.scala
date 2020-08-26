package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComboComponentInfo extends ViewportComponentFullInfo {
  // 组合名
  var name: String = js.native
}

object ComboComponentInfo {
  @scala.inline
  def apply(
    childs: StringDictionary[ViewportComponentInfo],
    componentInfo: ViewportComponentInfo,
    mapUniqueKey: String,
    name: String
  ): ComboComponentInfo = {
    val __obj = js.Dynamic.literal(childs = childs.asInstanceOf[js.Any], componentInfo = componentInfo.asInstanceOf[js.Any], mapUniqueKey = mapUniqueKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComboComponentInfo]
  }
  @scala.inline
  implicit class ComboComponentInfoOps[Self <: ComboComponentInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

