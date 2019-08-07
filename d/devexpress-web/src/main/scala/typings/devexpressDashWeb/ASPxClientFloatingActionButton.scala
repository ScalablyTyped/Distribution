package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxFloatingActionButton object.
  */
@JSGlobal("ASPxClientFloatingActionButton")
@js.native
class ASPxClientFloatingActionButton () extends ASPxClientControl {
  /**
    * Occurs when the end user collapses the action group.
    */
  var ActionCollapsing: ASPxClientEvent[
    ASPxClientFloatingActionButtonActionCollapsingEventHandler[ASPxClientFloatingActionButton]
  ] = js.native
  /**
    * Occurs on the client side when an end user expands an action group.
    */
  var ActionExpanding: ASPxClientEvent[
    ASPxClientFloatingActionButtonActionExpandingEventHandler[ASPxClientFloatingActionButton]
  ] = js.native
  /**
    * Occurs when an end user clicks the action item.
    */
  var ActionItemClick: ASPxClientEvent[
    ASPxClientFloatingActionButtonActionItemClickEventHandler[ASPxClientFloatingActionButton]
  ] = js.native
  /**
    * Occurs on the client side when the context is changed.
    */
  var ContextChanging: ASPxClientEvent[
    ASPxClientFloatingActionButtonContextChangingEventHandler[ASPxClientFloatingActionButton]
  ] = js.native
  /**
    * Collapses an action group's items.
    */
  def CollapseActionGroupItems(): Unit = js.native
  /**
    * Expands an action group's items.
    */
  def ExpandActionGroupItems(): Unit = js.native
  /**
    * Gets the action or action group by its context name. An action (action group).
    * @param contextName An action's (action group's) context name.
    */
  def GetAction(contextName: String): ASPxClientFABAction = js.native
  /**
    * Gets the action or action group's context name.
    */
  def GetActionContext(): String = js.native
  /**
    * Specifies the action by the context name.
    * @param contextName A string value that specifies the context name.
    * @param expand true, to expand the action group; otherwise, false.
    */
  def SetActionContext(contextName: String): Unit = js.native
  def SetActionContext(contextName: String, expand: Boolean): Unit = js.native
  /**
    * Specifies the floating action button's container element.
    * @param element An object that specifies the HTML element or a web control on the page that is the container element for the floating action button.
    */
  def SetContainerElement(element: js.Any): Unit = js.native
  /**
    * Specifies the ID of the HTML element or web control on the page.
    * @param id A string value that specifies the container element ID.
    */
  def SetContainerElementID(id: String): Unit = js.native
  /**
    * Specifies the floating action button's horizontal margin.
    * @param value An integer value that specifies the margin.
    */
  def SetHorizontalMargin(value: Double): Unit = js.native
  /**
    * Specifies the floating action button's horizontal position.
    * @param horizontalPosition An integer value that specifies the horizontal position.
    */
  def SetHorizontalPosition(horizontalPosition: ASPxClientFloatingActionButtonHorizontalPosition): Unit = js.native
  /**
    * Specifies the floating action button's text visibility mode.
    * @param mode One of the  enumeration values.
    */
  def SetTextVisibilityMode(mode: ASPxClientFloatingActionButtonTextVisibilityMode): Unit = js.native
  /**
    * Specifies the floating action button's vertical margin.
    * @param value An integer value that specifies the margin.
    */
  def SetVerticalMargin(value: Double): Unit = js.native
  /**
    * Specifies the floating action button's vertical position.
    * @param verticalPosition An integer value that specifies the vertical position.
    */
  def SetVerticalPosition(verticalPosition: ASPxClientFloatingActionButtonVerticalPosition): Unit = js.native
}

