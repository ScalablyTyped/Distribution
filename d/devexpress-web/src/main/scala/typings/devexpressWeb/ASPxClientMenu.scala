package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxMenu object.
  */
@JSGlobal("ASPxClientMenu")
@js.native
class ASPxClientMenu () extends ASPxClientMenuBase {
  /**
    * Gets a value specifying the menu orientation.
    */
  def GetOrientation(): String = js.native
  /**
    * Sets the menu orientation.
    * @param orientation 'Vertical' to orient the menu vertically; 'Horizontal' to orient the menu horizontally.
    */
  def SetOrientation(orientation: String): Unit = js.native
  /**
    * Expands or collapses the side menu.
    */
  def ToggleSideMenu(): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientMenu")
@js.native
object ASPxClientMenu extends js.Object {
  /**
    * Converts the specified object to the ASPxClientMenu type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientMenu = js.native
}

