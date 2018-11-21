package typings
package devexpressDashWebLib

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
  def GetActionContext(): java.lang.String = js.native
  /**
       * 
       * @param contextName 
       */
  def SetActionContext(contextName: java.lang.String): scala.Unit = js.native
  /**
       * 
       * @param contextName 
       * @param expand 
       */
  def SetActionContext(contextName: java.lang.String, expand: scala.Boolean): scala.Unit = js.native
  /**
       * 
       * @param element 
       */
  def SetContainerElement(element: js.Object): scala.Unit = js.native
  /**
       * 
       * @param id 
       */
  def SetContainerElementID(id: java.lang.String): scala.Unit = js.native
  /**
       * 
       * @param value 
       */
  def SetHorizontalMargin(value: scala.Double): scala.Unit = js.native
  /**
       * 
       * @param horizontalPosition 
       */
  def SetHorizontalPosition(horizontalPosition: ASPxClientFloatingActionButtonHorizontalPosition): scala.Unit = js.native
  /**
       * 
       * @param mode 
       */
  def SetTextVisibilityMode(mode: ASPxClientFloatingActionButtonTextVisibilityMode): scala.Unit = js.native
  /**
       * 
       * @param value 
       */
  def SetVerticalMargin(value: scala.Double): scala.Unit = js.native
  /**
       * 
       * @param verticalPosition 
       */
  def SetVerticalPosition(verticalPosition: ASPxClientFloatingActionButtonVerticalPosition): scala.Unit = js.native
}

