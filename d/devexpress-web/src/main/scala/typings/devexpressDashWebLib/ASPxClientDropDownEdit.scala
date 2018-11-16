package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a base for client editor objects realizing the dropdown editor functionality.
 */

trait ASPxClientDropDownEdit extends ASPxClientDropDownEditBase {
  /**
       * Obtains the key value associated with the text displayed within the editor's edit box.
       */
  def GetKeyValue(): java.lang.String
  /**
       * Specifies the key value associated with the text displayed within the editor's edit box.
       * @param keyValue A string specifying the key value associated with the editor's value (displayed text).
       */
  def SetKeyValue(keyValue: java.lang.String): scala.Unit
}

