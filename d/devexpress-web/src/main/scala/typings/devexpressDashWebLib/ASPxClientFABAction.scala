package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientFABAction extends ASPxClientFABActionItemBase {
  /**
    * 
    * @param name 
    */
  def GetActionItemByName(name: java.lang.String): ASPxClientFABActionItem
  def GetContextName(): java.lang.String
  /**
    * 
    * @param index 
    */
  def GetItem(index: scala.Double): ASPxClientFABActionItem
  def GetItemCount(): scala.Double
}

