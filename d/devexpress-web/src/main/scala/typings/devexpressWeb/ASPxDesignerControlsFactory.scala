package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxDesignerControlsFactory extends js.Object {
  
  def createPopularBindingInfo(options: ASPxDesignerElementSerializationInfoWithBindings, isExpression: Boolean): ASPxDesignerElementSerializationInfoWithBindings = js.native
  
  def getControlInfo(controlType: String): ASPxDesignerToolboxItem = js.native
  
  def getControlType(model: js.Any): String = js.native
  
  def getPropertyInfo(controlType: String, propertyDisplayName: String): ASPxDesignerElementSerializationInfo = js.native
  
  def hideExpressionBindings(controlType: String, propertyNames: String*): Unit = js.native
  
  def inheritControl(parentType: String, extendedOptions: ASPxDesignerToolboxItem): ASPxDesignerToolboxItem = js.native
  
  def registerControl(typeName: String, metadata: ASPxDesignerToolboxItem): Unit = js.native
  
  def setExpressionBinding(
    controlType: String,
    propertyName: String,
    events: js.Array[String],
    group: String,
    objectProperties: js.Array[String]
  ): Unit = js.native
}
object ASPxDesignerControlsFactory {
  
  @scala.inline
  def apply(
    createPopularBindingInfo: (ASPxDesignerElementSerializationInfoWithBindings, Boolean) => ASPxDesignerElementSerializationInfoWithBindings,
    getControlInfo: String => ASPxDesignerToolboxItem,
    getControlType: js.Any => String,
    getPropertyInfo: (String, String) => ASPxDesignerElementSerializationInfo,
    hideExpressionBindings: (String, /* repeated */ String) => Unit,
    inheritControl: (String, ASPxDesignerToolboxItem) => ASPxDesignerToolboxItem,
    registerControl: (String, ASPxDesignerToolboxItem) => Unit,
    setExpressionBinding: (String, String, js.Array[String], String, js.Array[String]) => Unit
  ): ASPxDesignerControlsFactory = {
    val __obj = js.Dynamic.literal(createPopularBindingInfo = js.Any.fromFunction2(createPopularBindingInfo), getControlInfo = js.Any.fromFunction1(getControlInfo), getControlType = js.Any.fromFunction1(getControlType), getPropertyInfo = js.Any.fromFunction2(getPropertyInfo), hideExpressionBindings = js.Any.fromFunction2(hideExpressionBindings), inheritControl = js.Any.fromFunction2(inheritControl), registerControl = js.Any.fromFunction2(registerControl), setExpressionBinding = js.Any.fromFunction5(setExpressionBinding))
    __obj.asInstanceOf[ASPxDesignerControlsFactory]
  }
  
  @scala.inline
  implicit class ASPxDesignerControlsFactoryOps[Self <: ASPxDesignerControlsFactory] (val x: Self) extends AnyVal {
    
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
    def setCreatePopularBindingInfo(
      value: (ASPxDesignerElementSerializationInfoWithBindings, Boolean) => ASPxDesignerElementSerializationInfoWithBindings
    ): Self = this.set("createPopularBindingInfo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetControlInfo(value: String => ASPxDesignerToolboxItem): Self = this.set("getControlInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetControlType(value: js.Any => String): Self = this.set("getControlType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPropertyInfo(value: (String, String) => ASPxDesignerElementSerializationInfo): Self = this.set("getPropertyInfo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHideExpressionBindings(value: (String, /* repeated */ String) => Unit): Self = this.set("hideExpressionBindings", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInheritControl(value: (String, ASPxDesignerToolboxItem) => ASPxDesignerToolboxItem): Self = this.set("inheritControl", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterControl(value: (String, ASPxDesignerToolboxItem) => Unit): Self = this.set("registerControl", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetExpressionBinding(value: (String, String, js.Array[String], String, js.Array[String]) => Unit): Self = this.set("setExpressionBinding", js.Any.fromFunction5(value))
  }
}
