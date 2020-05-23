package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxDesignerControlsFactory extends js.Object {
  def createPopularBindingInfo(options: ASPxDesignerElementSerializationInfoWithBindings, isExpression: Boolean): ASPxDesignerElementSerializationInfoWithBindings
  def getControlInfo(controlType: String): ASPxDesignerToolboxItem
  def getControlType(model: js.Any): String
  def getPropertyInfo(controlType: String, propertyDisplayName: String): ASPxDesignerElementSerializationInfo
  def hideExpressionBindings(controlType: String, propertyNames: String*): Unit
  def inheritControl(parentType: String, extendedOptions: ASPxDesignerToolboxItem): ASPxDesignerToolboxItem
  def registerControl(typeName: String, metadata: ASPxDesignerToolboxItem): Unit
  def setExpressionBinding(
    controlType: String,
    propertyName: String,
    events: js.Array[String],
    group: String,
    objectProperties: js.Array[String]
  ): Unit
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
}

