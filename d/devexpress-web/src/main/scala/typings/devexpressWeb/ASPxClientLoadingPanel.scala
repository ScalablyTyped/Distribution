package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxLoadingPanel control.
  */
@JSGlobal("ASPxClientLoadingPanel")
@js.native
class ASPxClientLoadingPanel () extends ASPxClientControl {
  /**
    * Gets the text displayed within the ASPxLoadingPanel.
    */
  def GetText(): String = js.native
  /**
    * Hides the loading panel.
    */
  def Hide(): Unit = js.native
  /**
    * Sets the text to be displayed within the ASPxLoadingPanel.
    * @param text A string value specifying the text to be displayed within the ASPxLoadingPanel.
    */
  def SetText(text: String): Unit = js.native
  /**
    * Invokes the loading panel.
    */
  def Show(): Unit = js.native
  /**
    * Invokes the loading panel at the specified position.
    * @param x An integer value specifying the x-coordinate of the loading panel's display position.
    * @param y An integer value specifying the y-coordinate of the loaidng panel's display position.
    */
  def ShowAtPos(x: Double, y: Double): Unit = js.native
  /**
    * Invokes the loading panel, displaying it over the specified HTML element.
    * @param htmlElement An object that specifies the required HTML element.
    */
  def ShowInElement(htmlElement: js.Any): Unit = js.native
  /**
    * Invokes the loading panel, displaying it over the specified element.
    * @param id A string that specifies the required element's identifier.
    */
  def ShowInElementByID(id: String): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientLoadingPanel")
@js.native
object ASPxClientLoadingPanel extends js.Object {
  /**
    * Converts the specified object to the ASPxClientLoadingPanel type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientLoadingPanel = js.native
}

