package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client ASPxGridView.
  */
trait ASPxClientGridBase extends ASPxClientControl {
  /**
    * Fires after a toolbar item has been clicked.
    */
  var ToolbarItemClick: ASPxClientEvent[ASPxClientGridToolbarItemClickEventHandler[ASPxClientGridBase]]
  /**
    * Returns a grid's toolbar specified by its index.
    * @param index An integer value specifying the zero-based index of the toolbar object to retrieve.
    */
  def GetToolbar(index: scala.Double): ASPxClientMenu
  /**
    * Returns a toolbar specified by its name.
    * @param name A string value specifying the toolbar name.
    */
  def GetToolbarByName(name: java.lang.String): ASPxClientMenu
}

