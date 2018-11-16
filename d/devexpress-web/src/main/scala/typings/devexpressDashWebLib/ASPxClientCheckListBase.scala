package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Serves as the base type for the ASPxClientRadioButtonList objects.
 */

trait ASPxClientCheckListBase extends ASPxClientListEdit {
  /**
       * Returns the editor's item specified by its index.
       * @param index An integer value specifying the zero-based index of the item to be retrieved.
       */
  def GetItem(index: scala.Double): ASPxClientListEditItem
  /**
       * Gets the number of items contained in the editor's item collection.
       */
  def GetItemCount(): scala.Double
}

