package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxDockPanel object.
  */
@js.native
trait ASPxClientDockPanel
  extends StObject
     with ASPxClientPopupControlBase {
  
  /**
    * Fires on the client side after a panel is docked in a zone.
    */
  var AfterDock: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDockPanel]] = js.native
  
  /**
    * Fires on the client side after a panel is undocked from a zone.
    */
  var AfterFloat: ASPxClientEvent[ASPxClientDockPanelProcessingModeEventHandler[ASPxClientDockPanel]] = js.native
  
  /**
    * Fires on the client side before a panel is docked in a zone and allows you to cancel the action.
    */
  var BeforeDock: ASPxClientEvent[ASPxClientDockPanelProcessingModeCancelEventHandler[ASPxClientDockPanel]] = js.native
  
  /**
    * Fires on the client side before a panel is made floating (undocked from a zone) and allows you to cancel the action.
    */
  var BeforeFloat: ASPxClientEvent[ASPxClientDockPanelProcessingModeCancelEventHandler[ASPxClientDockPanel]] = js.native
  
  /**
    * Docks the current panel in a zone at the specified position.
    * @param zone An ASPxClientDockZone object specifying the zone, where the panel is docked
    * @param visibleIndex An integer value specifying the visible index position.
    */
  def Dock(zone: ASPxClientDockZone): Unit = js.native
  def Dock(zone: ASPxClientDockZone, visibleIndex: Double): Unit = js.native
  
  /**
    * Occurs after a panel dragging operation is complete.
    */
  var EndDragging: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDockPanel]] = js.native
  
  /**
    * Retrieves a zone that owns the current panel.
    */
  def GetOwnerZone(): ASPxClientDockZone = js.native
  
  /**
    * Gets a value specifying the position of the current panel, amongst the visible panels within a zone.
    */
  def GetVisibleIndex(): Double = js.native
  
  /**
    * Returns a value indicating whether the panel is docked.
    */
  def IsDocked(): Boolean = js.native
  
  /**
    * Undocks the current panel and place it at the specified position.
    * @param x An integer value that specifies the X-coordinate of the panel's display position.
    * @param y An integer value that specifies the Y-coordinate of the panel's display position.
    */
  def MakeFloat(): Unit = js.native
  def MakeFloat(x: Double): Unit = js.native
  def MakeFloat(x: Double, y: Double): Unit = js.native
  def MakeFloat(x: Unit, y: Double): Unit = js.native
  
  /**
    * Sets a value specifying the position of the current panel, amongst the visible panels in a zone.
    * @param visibleIndex An integer value specifying the zero-based index of the panel amongst visible panels in the zone.
    */
  def SetVisibleIndex(visibleIndex: Double): Unit = js.native
  
  /**
    * Occurs when a panel dragging operation is started.
    */
  var StartDragging: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDockPanel]] = js.native
  
  /**
    * Gets or sets the unique identifier of a panel on a page.
    */
  var panelUID: String = js.native
}
