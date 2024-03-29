package typings.googleEarth.global.google.earth

import typings.googleEarth.google.earth.GEMapTypeEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.GEOptions")
@js.native
open class GEOptions ()
  extends StObject
     with typings.googleEarth.google.earth.GEOptions {
  
  /**
    * Show or hide the blue atmosphere that appears around the perimeter of the Earth.
    * On by default.
    */
  /* CompleteClass */
  override def getAtmosphereVisibility(): Boolean = js.native
  
  /**
    * Whether automatic ground level view is enabled.
    */
  /* CompleteClass */
  override def getAutoGroundLevelViewEnabled(): Boolean = js.native
  
  /**
    * Returns true if building highlighting is enabled.
    */
  /* CompleteClass */
  override def getBuildingHighlightingEnabled(): Boolean = js.native
  
  /**
    * Whether or not building selection is enabled.
    */
  /* CompleteClass */
  override def getBuildingSelectionEnabled(): Boolean = js.native
  
  /**
    * Returns true if the animation of features as they are added or removed from the globe has been enabled.
    */
  /* CompleteClass */
  override def getFadeInOutEnabled(): Boolean = js.native
  
  /**
    * Specifies the speed at which the camera moves (0 to 5.0).
    * Set to SPEED_TELEPORT to immediately appear at selected destination.
    *
    * See also:
    *
    * * GEPlugin.SPEED_TELEPORT
    */
  /* CompleteClass */
  override def getFlyToSpeed(): Double = js.native
  
  /**
    * Show or hide the grid. Disabled by default.
    */
  /* CompleteClass */
  override def getGridVisibility(): Boolean = js.native
  
  /**
    * Enable or disable user panning and zooming of the map. Enabled by default.
    *
    * Note: This also enables and disables keyboard navigation (arrow keys, page-up/page-down, etc).
    */
  /* CompleteClass */
  override def getMouseNavigationEnabled(): Boolean = js.native
  
  /**
    * Show or hide the overview map. Disabled by default.
    */
  /* CompleteClass */
  override def getOverviewMapVisibility(): Boolean = js.native
  
  /**
    * Show or hide the scale legend. Disabled by default.
    */
  /* CompleteClass */
  override def getScaleLegendVisibility(): Boolean = js.native
  
  /**
    * Speed of zoom when user rolls the mouse wheel. Default is 1.
    * Set to a negative number to reverse the zoom direction.
    */
  /* CompleteClass */
  override def getScrollWheelZoomSpeed(): Double = js.native
  
  /**
    * Show or hide the status bar. Disabled by default.
    */
  /* CompleteClass */
  override def getStatusBarVisibility(): Boolean = js.native
  
  /**
    * Returns the terrain exaggeration value. Valid values are in the range of 1.0 through 3.0.
    */
  /* CompleteClass */
  override def getTerrainExaggeration(): Double = js.native
  
  /**
    * Returns true if display units are set to imperial units (feet and miles).
    * False denotes metric units (meters and kilometers).
    */
  /* CompleteClass */
  override def getUnitsFeetMiles(): Boolean = js.native
  
  /**
    * Show or hide the blue atmosphere that appears around the perimeter of the Earth.
    * On by default.
    */
  /* CompleteClass */
  override def setAtmosphereVisibility(atmosphereVisibility: Boolean): Unit = js.native
  
  /**
    * When enabled, the view will change to 'ground level view' when the camera reaches ground level.
    * This view provides pan and lookAt controls, but no zoom slider.
    * The tilt will be set to 90, or parallel with level ground.
    */
  /* CompleteClass */
  override def setAutoGroundLevelViewEnabled(autoGroundLevelViewEnabled: Boolean): Unit = js.native
  
  /**
    * Enables or disables building highlighting.
    * When enabled, buildings will be highlighted when they are moused over.
    */
  /* CompleteClass */
  override def setBuildingHighlightingEnabled(buildingHighlightingEnabled: Boolean): Unit = js.native
  
  /**
    * Enables or disables building selection.
    * If enabled, clicking a building will pop a feature balloon containing information from the Google 3D Warehouse database.
    */
  /* CompleteClass */
  override def setBuildingSelectionEnabled(buildingSelectionEnabled: Boolean): Unit = js.native
  
  /**
    * Enable or disable the animation of a feature when it is added or removed from the Google Earth plugin.
    * The animation consists of a slight change of scale. Default is true.
    */
  /* CompleteClass */
  override def setFadeInOutEnabled(fadeInOutEnabled: Boolean): Unit = js.native
  
  /**
    * Specifies the speed at which the camera moves (0 to 5.0).
    * Set to SPEED_TELEPORT to immediately appear at selected destination.
    *
    * See also:
    *
    * * GEPlugin.SPEED_TELEPORT
    */
  /* CompleteClass */
  override def setFlyToSpeed(flyToSpeed: Double): Unit = js.native
  
  /**
    * Show or hide the grid. Disabled by default.
    */
  /* CompleteClass */
  override def setGridVisibility(gridVisibility: Boolean): Unit = js.native
  
  /**
    * Sets the map type to Earth or sky mode.
    */
  /* CompleteClass */
  override def setMapType(`type`: GEMapTypeEnum): Unit = js.native
  
  /**
    * Enable or disable user panning and zooming of the map. Enabled by default.
    *
    * Note: This also enables and disables keyboard navigation (arrow keys, page-up/page-down, etc).
    */
  /* CompleteClass */
  override def setMouseNavigationEnabled(mouseNavigationEnabled: Boolean): Unit = js.native
  
  /**
    * Show or hide the overview map. Disabled by default.
    */
  /* CompleteClass */
  override def setOverviewMapVisibility(overviewMapVisibility: Boolean): Unit = js.native
  
  /**
    * Show or hide the scale legend. Disabled by default.
    */
  /* CompleteClass */
  override def setScaleLegendVisibility(scaleLegendVisibility: Boolean): Unit = js.native
  
  /**
    * Speed of zoom when user rolls the mouse wheel. Default is 1.
    * Set to a negative number to reverse the zoom direction.
    */
  /* CompleteClass */
  override def setScrollWheelZoomSpeed(scrollWheelZoomSpeed: Double): Unit = js.native
  
  /**
    * Show or hide the status bar. Disabled by default.
    */
  /* CompleteClass */
  override def setStatusBarVisibility(statusBarVisibility: Boolean): Unit = js.native
  
  /**
    * Set the terrain exaggeration value. Valid values are in the range of 1.0 through 3.0.
    * Attempting to set outside of this range will result in the value being clamped.
    */
  /* CompleteClass */
  override def setTerrainExaggeration(terrainExaggeration: Double): Unit = js.native
  
  /**
    * Set display units to imperial (feet and miles) or metric (meters and kilometers).
    * This setting affects only the values displayed in the status bar and the scale bar.
    * The values passed and returned with an object's getters and setters are always metric.
    */
  /* CompleteClass */
  override def setUnitsFeetMiles(unitsFeetMiles: Boolean): Unit = js.native
}
