package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any]
     with /**
  * 渲染编辑回调
  */
// renderEditer?:(React.ComponentClass<FitGaea.ComponentProps>,{})=>void
/* x */ StringDictionary[js.Any] {
  
  /**
    * 是否可以拖入子元素
    */
  var canDragIn: js.UndefOr[Boolean] = js.native
  
  /**
    * 父组件传递的数据
    */
  var gaeaData: js.UndefOr[js.Any] = js.native
  
  /**
    * 编辑信息
    */
  var gaeaEdit: js.UndefOr[js.Array[ComponentPropsGaeaEdit]] = js.native
  
  /**
    * 事件定义
    */
  var gaeaEvent: js.UndefOr[GaeaEvent] = js.native
  
  /**
    * 存储事件设置
    */
  var gaeaEventData: js.UndefOr[js.Array[EventData]] = js.native
  
  /**
    * 组件图标,为 fontAwesome
    */
  var gaeaIcon: js.UndefOr[String] = js.native
  
  /**
    * 组件的中文名
    */
  var gaeaName: String = js.native
  
  /**
    * 存储native事件设置
    */
  var gaeaNativeEventData: js.UndefOr[js.Array[EventData]] = js.native
  
  /**
    * 是否在预览模式，preivew 会传入 true
    */
  var gaeaPreview: js.UndefOr[Boolean] = js.native
  
  /**
    * 唯一的 key,用来唯一标识这个组件,所有盖亚内部组件都以 gaea- 为前缀
    */
  var gaeaUniqueKey: String = js.native
  
  /**
    * 存储变量信息
    */
  var gaeaVariables: js.UndefOr[StringDictionary[VariableData]] = js.native
}
object ComponentProps {
  
  @scala.inline
  def apply(gaeaName: String, gaeaUniqueKey: String): ComponentProps = {
    val __obj = js.Dynamic.literal(gaeaName = gaeaName.asInstanceOf[js.Any], gaeaUniqueKey = gaeaUniqueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentProps]
  }
  
  @scala.inline
  implicit class ComponentPropsOps[Self <: ComponentProps] (val x: Self) extends AnyVal {
    
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
    def setGaeaName(value: String): Self = this.set("gaeaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGaeaUniqueKey(value: String): Self = this.set("gaeaUniqueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanDragIn(value: Boolean): Self = this.set("canDragIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanDragIn: Self = this.set("canDragIn", js.undefined)
    
    @scala.inline
    def setGaeaData(value: js.Any): Self = this.set("gaeaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGaeaData: Self = this.set("gaeaData", js.undefined)
    
    @scala.inline
    def setGaeaEditVarargs(value: ComponentPropsGaeaEdit*): Self = this.set("gaeaEdit", js.Array(value :_*))
    
    @scala.inline
    def setGaeaEdit(value: js.Array[ComponentPropsGaeaEdit]): Self = this.set("gaeaEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGaeaEdit: Self = this.set("gaeaEdit", js.undefined)
    
    @scala.inline
    def setGaeaEvent(value: GaeaEvent): Self = this.set("gaeaEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGaeaEvent: Self = this.set("gaeaEvent", js.undefined)
    
    @scala.inline
    def setGaeaEventDataVarargs(value: EventData*): Self = this.set("gaeaEventData", js.Array(value :_*))
    
    @scala.inline
    def setGaeaEventData(value: js.Array[EventData]): Self = this.set("gaeaEventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGaeaEventData: Self = this.set("gaeaEventData", js.undefined)
    
    @scala.inline
    def setGaeaIcon(value: String): Self = this.set("gaeaIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGaeaIcon: Self = this.set("gaeaIcon", js.undefined)
    
    @scala.inline
    def setGaeaNativeEventDataVarargs(value: EventData*): Self = this.set("gaeaNativeEventData", js.Array(value :_*))
    
    @scala.inline
    def setGaeaNativeEventData(value: js.Array[EventData]): Self = this.set("gaeaNativeEventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGaeaNativeEventData: Self = this.set("gaeaNativeEventData", js.undefined)
    
    @scala.inline
    def setGaeaPreview(value: Boolean): Self = this.set("gaeaPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGaeaPreview: Self = this.set("gaeaPreview", js.undefined)
    
    @scala.inline
    def setGaeaVariables(value: StringDictionary[VariableData]): Self = this.set("gaeaVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGaeaVariables: Self = this.set("gaeaVariables", js.undefined)
  }
}
