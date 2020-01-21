package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxPanel control.
  */
@JSGlobal("ASPxClientPanel")
@js.native
class ASPxClientPanel () extends ASPxClientPanelBase {
  /**
    * Occurs when the expanded panel is closed.
    */
  var Collapsed: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]] = js.native
  /**
    * Occurs when an end-user opens the expand panel.
    */
  var Expanded: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]] = js.native
  /**
    * Collapses the expanded panel.
    */
  def Collapse(): Unit = js.native
  /**
    * Expands the collapsed panel.
    */
  def Expand(): Unit = js.native
  /**
    * Returns a value specifying whether the panel can be expanded.
    */
  def IsExpandable(): Boolean = js.native
  /**
    * Returns a value specifying whether the panel is expanded.
    */
  def IsExpanded(): Boolean = js.native
  /**
    * Expands or collapses the client panel.
    */
  def Toggle(): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientPanel")
@js.native
object ASPxClientPanel extends js.Object {
  /**
    * Converts the specified object to the ASPxClientPanel type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientPanel = js.native
}

