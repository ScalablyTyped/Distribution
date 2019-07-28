package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enables you to customize controls available in the Toolbox of the Web Report Designer.
  */
@js.native
trait ASPxDesignerControlsFactory extends js.Object {
  /**
    * 
    * @param options 
    * @param isExpression 
    */
  def createPopularBindingInfo(options: ASPxDesignerElementSerializationInfoWithBindings): ASPxDesignerElementSerializationInfoWithBindings = js.native
  def createPopularBindingInfo(options: ASPxDesignerElementSerializationInfoWithBindings, isExpression: Boolean): ASPxDesignerElementSerializationInfoWithBindings = js.native
  /**
    * Returns information about the specified toolbox control.
    * @param controlType A string that specifies the control type.
    */
  def getControlInfo(controlType: String): ASPxDesignerToolboxItem = js.native
  /**
    * Returns a control type by the specified model.
    * @param model An object that specifies the control model.
    */
  def getControlType(model: js.Object): String = js.native
  /**
    * Returns information about the specified property of the specified control.
    * @param controlType A string that specifies the control type.
    * @param propertyDisplayName A string that specifies the property display name.
    */
  def getPropertyInfo(controlType: String, propertyDisplayName: String): ASPxDesignerElementSerializationInfo = js.native
  /**
    * 
    * @param controlType 
    * @param propertyNames 
    */
  def hideExpressionBindings(controlType: String, propertyNames: js.Array[String]): Unit = js.native
  /**
    * 
    * @param parentType 
    * @param extendedOptions 
    */
  def inheritControl(parentType: String, extendedOptions: ASPxDesignerToolboxItem): ASPxDesignerToolboxItem = js.native
  /**
    * Registers the specified control in the Toolbox of the Web Report Designer.
    * @param typeName A string that specifies the name of a custom control.
    * @param metadata An ASPxDesignerToolboxItem object that provides information about a toolbox item.
    */
  def registerControl(typeName: String, metadata: ASPxDesignerToolboxItem): Unit = js.native
  /**
    * 
    * @param controlType 
    * @param propertyName 
    * @param events 
    * @param group 
    * @param objectProperties 
    */
  def setExpressionBinding(
    controlType: String,
    propertyName: String,
    events: js.Array[String],
    group: String,
    objectProperties: js.Array[String]
  ): Unit = js.native
}

