package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Enables you to customize controls available in the Toolbox of the Web Report Designer.
 */

trait ASPxDesignerControlsFactory extends js.Object {
  /**
       * Returns information about the specified toolbox control.
       * @param controlType A string that specifies the control type.
       */
  def getControlInfo(controlType: java.lang.String): ASPxDesignerToolboxItem
  /**
       * Returns a control type by the specified model.
       * @param model An object that specifies the control model.
       */
  def getControlType(model: js.Object): java.lang.String
  /**
       * Returns information about the specified property of the specified control.
       * @param controlType A string that specifies the control type.
       * @param propertyDisplayName A string that specifies the property display name.
       */
  def getPropertyInfo(controlType: java.lang.String, propertyDisplayName: java.lang.String): ASPxDesignerElementSerializationInfo
  /**
       * Registers the specified control in the Toolbox of the Web Report Designer.
       * @param typeName A string that specifies the name of a custom control.
       * @param metadata An ASPxDesignerToolboxItem object that provides information about a toolbox item.
       */
  def registerControl(typeName: java.lang.String, metadata: ASPxDesignerToolboxItem): scala.Unit
}

