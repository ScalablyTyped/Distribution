package typings.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewportComponentInfo extends js.Object {
  
  /**
    * 子元素（canDragIn才有）
    * 只存子元素在 map 中的 key
    */
  var layoutChilds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * 父级 mapUniqueKey, 这样不但方便寻找父级,还能根据是否为 null 判断是否为根元素
    */
  var parentMapUniqueKey: String = js.native
  
  /**
    * props
    */
  var props: ComponentProps = js.native
}
object ViewportComponentInfo {
  
  @scala.inline
  def apply(parentMapUniqueKey: String, props: ComponentProps): ViewportComponentInfo = {
    val __obj = js.Dynamic.literal(parentMapUniqueKey = parentMapUniqueKey.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportComponentInfo]
  }
  
  @scala.inline
  implicit class ViewportComponentInfoOps[Self <: ViewportComponentInfo] (val x: Self) extends AnyVal {
    
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
    def setParentMapUniqueKey(value: String): Self = this.set("parentMapUniqueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: ComponentProps): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutChildsVarargs(value: String*): Self = this.set("layoutChilds", js.Array(value :_*))
    
    @scala.inline
    def setLayoutChilds(value: js.Array[String]): Self = this.set("layoutChilds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayoutChilds: Self = this.set("layoutChilds", js.undefined)
  }
}
