package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxClientFloatingActionButton extends ASPxClientControl {
  var ActionCollapsing: ASPxClientEvent[
    ASPxClientFloatingActionButtonActionCollapsingEventHandler[ASPxClientFloatingActionButton]
  ] = js.native
  var ActionExpanding: ASPxClientEvent[
    ASPxClientFloatingActionButtonActionExpandingEventHandler[ASPxClientFloatingActionButton]
  ] = js.native
  var ActionItemClick: ASPxClientEvent[
    ASPxClientFloatingActionButtonActionItemClickEventHandler[ASPxClientFloatingActionButton]
  ] = js.native
  var ContextChanging: ASPxClientEvent[
    ASPxClientFloatingActionButtonContextChangingEventHandler[ASPxClientFloatingActionButton]
  ] = js.native
  def GetActionContext(): String = js.native
  /**
    * 
    * @param contextName 
    */
  def SetActionContext(contextName: String): Unit = js.native
  /**
    * 
    * @param contextName 
    * @param expand 
    */
  def SetActionContext(contextName: String, expand: Boolean): Unit = js.native
  /**
    * 
    * @param element 
    */
  def SetContainerElement(element: js.Object): Unit = js.native
  /**
    * 
    * @param id 
    */
  def SetContainerElementID(id: String): Unit = js.native
  /**
    * 
    * @param value 
    */
  def SetHorizontalMargin(value: Double): Unit = js.native
  /**
    * 
    * @param horizontalPosition 
    */
  def SetHorizontalPosition(horizontalPosition: ASPxClientFloatingActionButtonHorizontalPosition): Unit = js.native
  /**
    * 
    * @param mode 
    */
  def SetTextVisibilityMode(mode: ASPxClientFloatingActionButtonTextVisibilityMode): Unit = js.native
  /**
    * 
    * @param value 
    */
  def SetVerticalMargin(value: Double): Unit = js.native
  /**
    * 
    * @param verticalPosition 
    */
  def SetVerticalPosition(verticalPosition: ASPxClientFloatingActionButtonVerticalPosition): Unit = js.native
}

