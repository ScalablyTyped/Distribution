package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxDockZone object.
  */
@js.native
trait ASPxClientDockZone extends ASPxClientControl {
  
  /**
    * Fires on the client side after a panel is docked in a zone.
    */
  var AfterDock: ASPxClientEvent[ASPxClientDockZoneProcessingModeEventHandler[ASPxClientDockZone]] = js.native
  
  /**
    * Fires on the client side before a panel is docked in a zone and allows you to cancel the action.
    */
  var BeforeDock: ASPxClientEvent[ASPxClientDockZoneCancelEventHandler[ASPxClientDockZone]] = js.native
  
  /**
    * Gets a value that indicates whether the zone can enlarge its size.
    */
  def GetAllowGrowing(): Boolean = js.native
  
  /**
    * Returns a panel specified by its unique identifier (panelUID). An ASPxClientDockPanel object that is the panel with the specified unique identifier.
    * @param panelUID A string value specifying the unique identifier of the panel.
    */
  def GetPanelByUID(panelUID: String): ASPxClientDockPanel = js.native
  
  /**
    * Returns a panel specified by its visible index. An ASPxClientDockPanel object that is the panel with the specified visible index.
    * @param visibleIndex An integer value specifying the panel's position among the visible panels within the current zone.
    */
  def GetPanelByVisibleIndex(visibleIndex: Double): ASPxClientDockPanel = js.native
  
  /**
    * Gets the number of panels contained in the zone.
    */
  def GetPanelCount(): Double = js.native
  
  /**
    * Returns an array of panels that are docked in the current zone and meet a specified criteria. An array of ASPxClientDockPanel objects.
    * @param filterPredicate An ASPxClientDockingFilterPredicate delegate that defines a set of criteria and determines whether a panel meets those criteria.
    */
  def GetPanels(): js.Array[ASPxClientDockPanel] = js.native
  def GetPanels(filterPredicate: ASPxClientDockingFilterPredicate): js.Array[ASPxClientDockPanel] = js.native
  
  /**
    * Returns a value that indicates the orientation in which panels are stacked in the current zone.
    */
  def IsVertical(): Boolean = js.native
  
  /**
    * Gets or sets the unique identifier of a zone on a page.
    */
  var zoneUID: String = js.native
}
