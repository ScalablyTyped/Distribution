package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.GEOptions")
@js.native
class GEOptions () extends js.Object {
  /**
    * Show or hide the blue atmosphere that appears around the perimeter of the Earth.
    * On by default.
    */
  def getAtmosphereVisibility(): scala.Boolean = js.native
  /**
    * Whether automatic ground level view is enabled.
    */
  def getAutoGroundLevelViewEnabled(): scala.Boolean = js.native
  /**
    * Returns true if building highlighting is enabled.
    */
  def getBuildingHighlightingEnabled(): scala.Boolean = js.native
  /**
    * Whether or not building selection is enabled.
    */
  def getBuildingSelectionEnabled(): scala.Boolean = js.native
  /**
    * Returns true if the animation of features as they are added or removed from the globe has been enabled.
    */
  def getFadeInOutEnabled(): scala.Boolean = js.native
  /**
    * Specifies the speed at which the camera moves (0 to 5.0).
    * Set to SPEED_TELEPORT to immediately appear at selected destination.
    *
    * See also:
    *
    * * GEPlugin.SPEED_TELEPORT
    */
  def getFlyToSpeed(): scala.Double = js.native
  /**
    * Show or hide the grid. Disabled by default.
    */
  def getGridVisibility(): scala.Boolean = js.native
  /**
    * Enable or disable user panning and zooming of the map. Enabled by default.
    *
    * Note: This also enables and disables keyboard navigation (arrow keys, page-up/page-down, etc).
    */
  def getMouseNavigationEnabled(): scala.Boolean = js.native
  /**
    * Show or hide the overview map. Disabled by default.
    */
  def getOverviewMapVisibility(): scala.Boolean = js.native
  /**
    * Show or hide the scale legend. Disabled by default.
    */
  def getScaleLegendVisibility(): scala.Boolean = js.native
  /**
    * Speed of zoom when user rolls the mouse wheel. Default is 1.
    * Set to a negative number to reverse the zoom direction.
    */
  def getScrollWheelZoomSpeed(): scala.Double = js.native
  /**
    * Show or hide the status bar. Disabled by default.
    */
  def getStatusBarVisibility(): scala.Boolean = js.native
  /**
    * Returns the terrain exaggeration value. Valid values are in the range of 1.0 through 3.0.
    */
  def getTerrainExaggeration(): scala.Double = js.native
  /**
    * Returns true if display units are set to imperial units (feet and miles).
    * False denotes metric units (meters and kilometers).
    */
  def getUnitsFeetMiles(): scala.Boolean = js.native
  /**
    * Show or hide the blue atmosphere that appears around the perimeter of the Earth.
    * On by default.
    */
  def setAtmosphereVisibility(atmosphereVisibility: scala.Boolean): scala.Unit = js.native
  /**
    * When enabled, the view will change to 'ground level view' when the camera reaches ground level.
    * This view provides pan and lookAt controls, but no zoom slider.
    * The tilt will be set to 90, or parallel with level ground.
    */
  def setAutoGroundLevelViewEnabled(autoGroundLevelViewEnabled: scala.Boolean): scala.Unit = js.native
  /**
    * Enables or disables building highlighting.
    * When enabled, buildings will be highlighted when they are moused over.
    */
  def setBuildingHighlightingEnabled(buildingHighlightingEnabled: scala.Boolean): scala.Unit = js.native
  /**
    * Enables or disables building selection.
    * If enabled, clicking a building will pop a feature balloon containing information from the Google 3D Warehouse database.
    */
  def setBuildingSelectionEnabled(buildingSelectionEnabled: scala.Boolean): scala.Unit = js.native
  /**
    * Enable or disable the animation of a feature when it is added or removed from the Google Earth plugin.
    * The animation consists of a slight change of scale. Default is true.
    */
  def setFadeInOutEnabled(fadeInOutEnabled: scala.Boolean): scala.Unit = js.native
  /**
    * Specifies the speed at which the camera moves (0 to 5.0).
    * Set to SPEED_TELEPORT to immediately appear at selected destination.
    *
    * See also:
    *
    * * GEPlugin.SPEED_TELEPORT
    */
  def setFlyToSpeed(flyToSpeed: scala.Double): scala.Unit = js.native
  /**
    * Show or hide the grid. Disabled by default.
    */
  def setGridVisibility(gridVisibility: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the map type to Earth or sky mode.
    */
  def setMapType(`type`: GEMapTypeEnum): scala.Unit = js.native
  /**
    * Enable or disable user panning and zooming of the map. Enabled by default.
    *
    * Note: This also enables and disables keyboard navigation (arrow keys, page-up/page-down, etc).
    */
  def setMouseNavigationEnabled(mouseNavigationEnabled: scala.Boolean): scala.Unit = js.native
  /**
    * Show or hide the overview map. Disabled by default.
    */
  def setOverviewMapVisibility(overviewMapVisibility: scala.Boolean): scala.Unit = js.native
  /**
    * Show or hide the scale legend. Disabled by default.
    */
  def setScaleLegendVisibility(scaleLegendVisibility: scala.Boolean): scala.Unit = js.native
  /**
    * Speed of zoom when user rolls the mouse wheel. Default is 1.
    * Set to a negative number to reverse the zoom direction.
    */
  def setScrollWheelZoomSpeed(scrollWheelZoomSpeed: scala.Double): scala.Unit = js.native
  /**
    * Show or hide the status bar. Disabled by default.
    */
  def setStatusBarVisibility(statusBarVisibility: scala.Boolean): scala.Unit = js.native
  /**
    * Set the terrain exaggeration value. Valid values are in the range of 1.0 through 3.0.
    * Attempting to set outside of this range will result in the value being clamped.
    */
  def setTerrainExaggeration(terrainExaggeration: scala.Double): scala.Unit = js.native
  /**
    * Set display units to imperial (feet and miles) or metric (meters and kilometers).
    * This setting affects only the values displayed in the status bar and the scale bar.
    * The values passed and returned with an object's getters and setters are always metric.
    */
  def setUnitsFeetMiles(unitsFeetMiles: scala.Boolean): scala.Unit = js.native
}

