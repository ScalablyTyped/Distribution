package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as the base class for controls that implement panel functionality.
  */
@JSGlobal("ASPxClientPanelBase")
@js.native
class ASPxClientPanelBase () extends ASPxClientControl {
  /**
    * Returns the HTML code that is the content of the panel.
    */
  def GetContentHtml(): String = js.native
  /**
    * Returns a value specifying whether a panel is enabled.
    */
  def GetEnabled(): Boolean = js.native
  /**
    * Sets the HTML content for the panel.
    * @param html A string value that is the HTML code defining the content of the panel.
    */
  def SetContentHtml(html: String): Unit = js.native
  /**
    * Sets a value specifying whether the panel is enabled.
    * @param enabled true to enable the panel; false to disable it.
    */
  def SetEnabled(enabled: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientPanelBase")
@js.native
object ASPxClientPanelBase extends js.Object {
  /**
    * Converts the specified object to the current object's type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientPanelBase = js.native
}

