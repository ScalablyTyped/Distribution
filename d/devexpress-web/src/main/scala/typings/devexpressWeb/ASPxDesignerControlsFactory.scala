package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ASPxDesignerControlsFactory")
@js.native
class ASPxDesignerControlsFactory () extends js.Object {
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

