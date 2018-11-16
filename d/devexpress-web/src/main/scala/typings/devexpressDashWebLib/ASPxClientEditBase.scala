package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Serves as the base object for all the editors included in the client-side object model.
 */

trait ASPxClientEditBase extends ASPxClientControl {
  /**
       * Returns the text displayed in the editor caption.
       */
  def GetCaption(): java.lang.String
  /**
       * Returns a value indicating whether an editor is enabled.
       */
  def GetEnabled(): scala.Boolean
  /**
       * Returns the editor's value.
       */
  def GetValue(): js.Object
  /**
       * Specifies the text displayed in the editor caption.
       * @param caption A string value specifying the editor caption.
       */
  def SetCaption(caption: java.lang.String): scala.Unit
  /**
       * Specifies whether an editor is enabled.
       * @param value true to enable the editor; otherwise, false.
       */
  def SetEnabled(value: scala.Boolean): scala.Unit
  /**
       * Changes the editor's value.
       * @param value An object representing the data to be assigned to the editor's edit value.
       */
  def SetValue(value: js.Object): scala.Unit
}

