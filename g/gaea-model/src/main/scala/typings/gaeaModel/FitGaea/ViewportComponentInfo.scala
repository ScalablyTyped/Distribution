package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewportComponentInfo extends StObject {
  
  /**
    * 子元素（canDragIn才有）
    * 只存子元素在 map 中的 key
    */
  var layoutChilds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * 父级 mapUniqueKey, 这样不但方便寻找父级,还能根据是否为 null 判断是否为根元素
    */
  var parentMapUniqueKey: String
  
  /**
    * props
    */
  var props: ComponentProps
}
object ViewportComponentInfo {
  
  @scala.inline
  def apply(parentMapUniqueKey: String, props: ComponentProps): ViewportComponentInfo = {
    val __obj = js.Dynamic.literal(parentMapUniqueKey = parentMapUniqueKey.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportComponentInfo]
  }
  
  @scala.inline
  implicit class ViewportComponentInfoMutableBuilder[Self <: ViewportComponentInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayoutChilds(value: js.Array[String]): Self = StObject.set(x, "layoutChilds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutChildsUndefined: Self = StObject.set(x, "layoutChilds", js.undefined)
    
    @scala.inline
    def setLayoutChildsVarargs(value: String*): Self = StObject.set(x, "layoutChilds", js.Array(value :_*))
    
    @scala.inline
    def setParentMapUniqueKey(value: String): Self = StObject.set(x, "parentMapUniqueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: ComponentProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
