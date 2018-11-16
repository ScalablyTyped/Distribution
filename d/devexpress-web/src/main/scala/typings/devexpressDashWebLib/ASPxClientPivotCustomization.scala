package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A client-side equivalent of the ASPxPivotCustomizationControl control.
 */

trait ASPxClientPivotCustomization extends ASPxClientControl {
  /**
       * Returns an HTML element that represents the root of the control's hierarchy.
       */
  def GetMainContainer(): js.Object
  /**
       * Returns a client-side equivalent of the owner Pivot Grid Control.
       */
  def GetPivotGrid(): ASPxClientPivotGrid
  /**
       * Specifies the Customization Control's layout.
       * @param layout A string that specifies the Customization Control's layout.
       */
  def SetLayout(layout: java.lang.String): scala.Unit
  /**
       * Recalculates the Customization Control height.
       */
  def UpdateHeight(): scala.Unit
}

