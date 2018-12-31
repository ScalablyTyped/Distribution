package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxPanel control.
  */
trait ASPxClientPanel extends ASPxClientPanelBase {
  /**
    * Occurs when the expanded panel is closed.
    */
  var Collapsed: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]]
  /**
    * Occurs when an end-user opens the expand panel.
    */
  var Expanded: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]]
  /**
    * Collapses the expanded panel.
    */
  def Collapse(): scala.Unit
  /**
    * Expands the collapsed panel.
    */
  def Expand(): scala.Unit
  /**
    * Returns a value specifying whether the panel can be expanded.
    */
  def IsExpandable(): scala.Boolean
  /**
    * Returns a value specifying whether the panel is expanded.
    */
  def IsExpanded(): scala.Boolean
  /**
    * Expands or collapses the client panel.
    */
  def Toggle(): scala.Unit
}

