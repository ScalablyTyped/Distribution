package typings.gaeaModel.anon

import typings.gaeaModel.FitGaea.ViewportComponentFullInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentInfo extends js.Object {
  
  // 组合的完整信息（不是 copy 的, 是真正对应的 mapUniqueKey）
  var componentInfo: ViewportComponentFullInfo = js.native
  
  // 父级的 index
  var index: Double = js.native
  
  // 父级 mapKey
  var parentMapUniqueKey: String = js.native
}
object ComponentInfo {
  
  @scala.inline
  def apply(componentInfo: ViewportComponentFullInfo, index: Double, parentMapUniqueKey: String): ComponentInfo = {
    val __obj = js.Dynamic.literal(componentInfo = componentInfo.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], parentMapUniqueKey = parentMapUniqueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentInfo]
  }
  
  @scala.inline
  implicit class ComponentInfoOps[Self <: ComponentInfo] (val x: Self) extends AnyVal {
    
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
    def setComponentInfo(value: ViewportComponentFullInfo): Self = this.set("componentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentMapUniqueKey(value: String): Self = this.set("parentMapUniqueKey", value.asInstanceOf[js.Any])
  }
}
