package typings.dojo.dojox.geo.charting

import typings.dojo.dojo.data.ItemFileReadStore
import typings.std.HTMLElement
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/charting/Map.html
  *
  * Map widget interacted with charting.
  * Support rendering Americas, AsiaPacific, ContinentalEurope, EuropeMiddleEastAfrica,
  * USStates, WorldCountries, and WorldCountriesMercator by default.
  *
  * @param container map container html node/id.
  * @param shapeData map shape data json object, or url to json file.
  */
@JSGlobal("dojox.geo.charting.Map")
@js.native
class Map protected () extends js.Object {
  def this(container: HTMLElement, shapeData: String) = this()
  /**
    *
    */
  var colorAnimationDuration: Double = js.native
  /**
    *
    */
  var dataBindingAttribute: js.Object = js.native
  /**
    *
    */
  var dataBindingValueFunction: js.Object = js.native
  /**
    *
    */
  var dataStore: js.Object = js.native
  /**
    * Default map feature color, e.g: "#B7B7B7"
    *
    */
  var defaultColor: String = js.native
  /**
    *
    */
  var enableFeatureZoom: Boolean = js.native
  /**
    * Map feature color when mouse over it, e.g: "#"
    *
    */
  var highlightColor: String = js.native
  /**
    * stack to data range, e.g: [{name:'label 1', min:20, max:70, color:'#DDDDDD'},{...},...]
    *
    */
  var series: js.Array[_] = js.native
  /**
    *
    */
  var showTooltips: Boolean = js.native
  /**
    * sets ranges of data values (associated with label, color) to style map data values
    *
    * @param series Either an url or an array of range objects such as : [{name:'label 1', min:20, max:70, color:'#DDDDDD'},{...},...]
    */
  def addSeries(series: js.Array[js.Object]): Unit = js.native
  /**
    * sets ranges of data values (associated with label, color) to style map data values
    *
    * @param series Either an url or an array of range objects such as : [{name:'label 1', min:20, max:70, color:'#DDDDDD'},{...},...]
    */
  def addSeries(series: URL): Unit = js.native
  /**
    * deselect all features of map
    *
    */
  def deselectAll(): Unit = js.native
  /**
    * set this component's transformation so that the specified area fits in the component (centered)
    *
    * @param mapArea the map area that needs to fill the component expressed as {x,y,w,h}
    * @param pixelMargin a margin (in pixels) from the borders of the Map component.
    * @param animate true if the transform change should be animated
    * @param onAnimationEnd a callback function to be executed when the animation completes (if animate set to true).
    */
  def fitToMapArea(mapArea: js.Object, pixelMargin: Double, animate: Boolean, onAnimationEnd: js.Function): Unit = js.native
  /**
    * set this component's transformation so that the whole map data fits in the component (centered)
    *
    * @param pixelMargin a margin (in pixels) from the borders of the Map component.
    * @param animate true if the transform change should be animated
    * @param onAnimationEnd a callback function to be executed when the animation completes (if animate set to true).
    */
  def fitToMapContents(pixelMargin: Double, animate: Boolean, onAnimationEnd: js.Function): Unit = js.native
  /**
    * returns the map coordinates of the center of this Map component.
    *
    */
  def getMapCenter(): js.Any = js.native
  /**
    * returns the scale of this Map component.
    *
    */
  def getMapScale(): js.Any = js.native
  /**
    * converts map coordinates to screen coordinates given the current transform of this Map component
    *
    * @param mapX the x coordinate of the point to convert.
    * @param mapY the y coordinate of the point to convert.
    */
  def mapCoordsToScreenCoords(mapX: Double, mapY: Double): js.Any = js.native
  /**
    * Invoked when the specified feature is clicked.
    *
    * @param feature A Feature.
    */
  def onFeatureClick(feature: Feature): Unit = js.native
  /**
    * Invoked when the specified feature is hovered.
    *
    * @param feature A Feature.
    */
  def onFeatureOver(feature: Feature): Unit = js.native
  /**
    * Invoked when the specified feature has been zoomed.
    *
    * @param feature A Feature.
    */
  def onZoomEnd(feature: Feature): Unit = js.native
  /**
    * resize the underlying GFX surface to accommodate to parent DOM Node size change
    *
    * @param adjustMapCenter keeps the center of the map when resizing the surface
    * @param adjustMapScale adjusts the map scale to keep the visible portion of the map as much as possible
    * @param animate
    */
  def resize(adjustMapCenter: Boolean, adjustMapScale: Boolean, animate: Boolean): Unit = js.native
  /**
    * converts screen coordinates to map coordinates given the current transform of this Map component
    *
    * @param screenX the x coordinate of the point to convert.
    * @param screenY the y coordinate of the point to convert.
    */
  def screenCoordsToMapCoords(screenX: Double, screenY: Double): js.Any = js.native
  /**
    * sets the property name of the dataStore items to use as value (see Feature.setValue function)
    *
    * @param prop the property
    */
  def setDataBindingAttribute(prop: String): Unit = js.native
  /**
    * sets the function that extracts values from dataStore items,to use as Feature values (see Feature.setValue function)
    *
    * @param valueFunction the function
    */
  def setDataBindingValueFunction(valueFunction: js.Function): Unit = js.native
  /**
    * populate data for each map feature from fetched data store
    *
    * @param dataStore the dataStore to fetch the information from
    * @param dataBindingProp sets the property name of the dataStore items to use as value
    */
  def setDataStore(dataStore: ItemFileReadStore, dataBindingProp: String): Unit = js.native
  /**
    * set this component's transformation so that the map is centered on the specified map coordinates
    *
    * @param centerX the X coordinate (in map coordinates) of the new center
    * @param centerY the Y coordinate (in map coordinates) of the new center
    * @param animate true if the transform change should be animated
    * @param onAnimationEnd a callback function to be executed when the animation completes (if animate set to true).
    */
  def setMapCenter(centerX: Double, centerY: Double, animate: Boolean, onAnimationEnd: js.Function): Unit = js.native
  /**
    * set this component's transformation so that the map is centered on the specified map coordinates
    * and scaled to the specified scale.
    *
    * @param centerX the X coordinate (in map coordinates) of the new center
    * @param centerY the Y coordinate (in map coordinates) of the new center
    * @param scale the scale of the map
    * @param animate true if the transform change should be animated
    * @param onAnimationEnd a callback function to be executed when the animation completes (if animate set to true).
    */
  def setMapCenterAndScale(centerX: Double, centerY: Double, scale: Double, animate: Boolean, onAnimationEnd: js.Function): Unit = js.native
  /**
    * set this component's transformation so that the map is scaled to the specified scale.
    *
    * @param scale the scale ratio.
    * @param animate true if the transform change should be animated
    * @param onAnimationEnd a callback function to be executed when the animation completes (if animate set to true).
    */
  def setMapScale(scale: Double, animate: Boolean, onAnimationEnd: js.Function): Unit = js.native
  /**
    * set this component's transformation so that the map is scaled to the specified scale, and the specified
    * point (in map coordinates) stays fixed on this Map component
    *
    * @param scale the scale ratio.
    * @param fixedMapX the X coordinate (in map coordinates) of the fixed screen point
    * @param fixedMapY the Y coordinate (in map coordinates) of the fixed screen point
    * @param animate true if the transform change should be animated
    * @param onAnimationEnd a callback function to be executed when the animation completes (if animate set to true).
    */
  def setMapScaleAt(scale: Double, fixedMapX: Double, fixedMapY: Double, animate: Boolean, onAnimationEnd: js.Function): Unit = js.native
  /**
    * import markers from outside file, associate with map feature by feature id
    * which identified in map shape file, e.g: "NY":"New York"
    *
    * @param markerFile outside marker data url, handled as json style.data format: {"NY":"New York",.....}
    */
  def setMarkerData(markerFile: String): Unit = js.native
}

