package typings
package devexpressDashWebLib

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
  def createPopularBindingInfo(options: ASPxDesignerElementSerializationInfoWithBindings, isExpression: scala.Boolean): ASPxDesignerElementSerializationInfoWithBindings = js.native
  /**
    * Returns information about the specified toolbox control.
    * @param controlType A string that specifies the control type.
    */
  def getControlInfo(controlType: java.lang.String): ASPxDesignerToolboxItem = js.native
  /**
    * Returns a control type by the specified model.
    * @param model An object that specifies the control model.
    */
  def getControlType(model: js.Object): java.lang.String = js.native
  /**
    * Returns information about the specified property of the specified control.
    * @param controlType A string that specifies the control type.
    * @param propertyDisplayName A string that specifies the property display name.
    */
  def getPropertyInfo(controlType: java.lang.String, propertyDisplayName: java.lang.String): ASPxDesignerElementSerializationInfo = js.native
  /**
    * 
    * @param controlType 
    * @param propertyNames 
    */
  def hideExpressionBindings(controlType: java.lang.String, propertyNames: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * 
    * @param parentType 
    * @param extendedOptions 
    */
  def inheritControl(parentType: java.lang.String, extendedOptions: ASPxDesignerToolboxItem): ASPxDesignerToolboxItem = js.native
  /**
    * Registers the specified control in the Toolbox of the Web Report Designer.
    * @param typeName A string that specifies the name of a custom control.
    * @param metadata An ASPxDesignerToolboxItem object that provides information about a toolbox item.
    */
  def registerControl(typeName: java.lang.String, metadata: ASPxDesignerToolboxItem): scala.Unit = js.native
  /**
    * 
    * @param controlType 
    * @param propertyName 
    * @param events 
    * @param group 
    * @param objectProperties 
    */
  def setExpressionBinding(
    controlType: java.lang.String,
    propertyName: java.lang.String,
    events: js.Array[java.lang.String],
    group: java.lang.String,
    objectProperties: js.Array[java.lang.String]
  ): scala.Unit = js.native
}

