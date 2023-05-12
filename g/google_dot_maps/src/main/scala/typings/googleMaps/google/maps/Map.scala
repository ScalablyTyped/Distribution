package typings.googleMaps.google.maps

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map
  extends StObject
     with MVCObject {
  
  /**
    * Additional controls to attach to the map. To add a control to the map,
    * add the control&#39;s <code>&lt;div&gt;</code> to the
    * <code>MVCArray</code> corresponding to the <code>ControlPosition</code>
    * where it should be rendered.
    */
  var controls: js.Array[MVCArray[HTMLElement]] = js.native
  
  /**
    * An instance of <code>Data</code>, bound to the map. Add features to this
    * <code>Data</code> object to conveniently display them on this map.
    */
  var data: Data = js.native
  
  /**
    * Sets the viewport to contain the given bounds.</br>
    * <strong>Note:</strong> When the map is set to <code>display: none</code>,
    * the <code>fitBounds</code> function reads the map&#39;s size as 0x0, and
    * therefore does not do anything. To change the viewport while the map is
    * hidden, set the map to <code>visibility: hidden</code>, thereby ensuring
    * the map div has an actual size. For vector maps, this method sets the
    * map&#39;s tilt and heading to their default zero values. Calling this
    * method may cause a smooth animation as the map pans and zooms to fit the
    * bounds. Whether or not this method animates depends on an internal
    * heuristic.
    * @param bounds Bounds to show.
    * @param padding Padding in pixels. The bounds will be fit in the part of
    *     the map that remains after padding is removed. A number value will
    *     yield the same padding on all 4 sides. Supply 0 here to make a
    *     fitBounds idempotent on the result of getBounds.
    */
  def fitBounds(bounds: LatLngBounds): Unit = js.native
  def fitBounds(bounds: LatLngBoundsLiteral): Unit = js.native
  def fitBounds(bounds: LatLngBoundsLiteral, padding: Double): Unit = js.native
  def fitBounds(bounds: LatLngBoundsLiteral, padding: Padding): Unit = js.native
  def fitBounds(bounds: LatLngBounds, padding: Double): Unit = js.native
  def fitBounds(bounds: LatLngBounds, padding: Padding): Unit = js.native
  
  /**
    * Returns the lat/lng bounds of the current viewport. If more than one copy
    * of the world is visible, the bounds range in longitude from -180 to 180
    * degrees inclusive. If the map is not yet initialized or center and zoom
    * have not been set then the result is <code>undefined</code>. For vector
    * maps with non-zero tilt or heading, the returned lat/lng bounds
    * represents the smallest bounding box that includes the visible region of
    * the map&#39;s viewport. See {@link
    * google.maps.MapCanvasProjection.getVisibleRegion} for getting the exact
    * visible region of the map&#39;s viewport.
    */
  def getBounds(): js.UndefOr[LatLngBounds] = js.native
  
  /**
    * Returns the position displayed at the center of the map. Note that
    * this {@link google.maps.LatLng} object is <em>not</em> wrapped. See
    * <code><a href="#LatLng">LatLng</a></code> for more information. If the
    * center or bounds have not been set then the result is
    * <code>undefined</code>.
    */
  def getCenter(): js.UndefOr[LatLng] = js.native
  
  /**
    * Returns the clickability of the map icons. A map icon represents a point
    * of interest, also known as a POI. If the returned value is
    * <code>true</code>, then the icons are clickable on the map.
    */
  def getClickableIcons(): js.UndefOr[Boolean] = js.native
  
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    * Returns the <code>FeatureLayer</code> for the specified
    * <code>datasetId</code>. Dataset IDs must be configured in the Google
    * Cloud Console. If the dataset ID is not associated with the map&#39;s map
    * style, or if Data-driven styling is not available (no map ID, no vector
    * tiles, no Data-Driven Styling feature layers or Datasets configured in
    * the Map Style), this logs an error, and the resulting
    * <code>FeatureLayer.isAvailable</code> will be false.
    */
  def getDatasetFeatureLayer(datasetId: String): FeatureLayer = js.native
  
  def getDiv(): HTMLElement = js.native
  
  /**
    * Returns the <code>FeatureLayer</code> of the specific
    * <code>FeatureType</code>. A <code>FeatureLayer</code> must be enabled in
    * the Google Cloud Console. If a <code>FeatureLayer</code> of the specified
    * <code>FeatureType</code> does not exist on this map, or if Data-driven
    * styling is not available (no map ID, no vector tiles, and no
    * <code>FeatureLayer</code> enabled in the map style), this logs an error,
    * and the resulting <code>FeatureLayer.isAvailable</code> will be false.
    */
  def getFeatureLayer(featureType: FeatureType): FeatureLayer = js.native
  
  /**
    * Returns the compass heading of the map. The heading value is measured in
    * degrees (clockwise) from cardinal direction North. If the map is not yet
    * initialized then the result is <code>undefined</code>.
    */
  def getHeading(): js.UndefOr[Double] = js.native
  
  /**
    * Informs the caller of the current capabilities available to the map based
    * on the Map ID that was provided.
    */
  def getMapCapabilities(): MapCapabilities = js.native
  
  def getMapTypeId(): js.UndefOr[String] = js.native
  
  /**
    * Returns the current <code>Projection</code>. If the map is not yet
    * initialized then the result is <code>undefined</code>. Listen to the
    * <code>projection_changed</code> event and check its value to ensure it is
    * not <code>undefined</code>.
    */
  def getProjection(): js.UndefOr[Projection] = js.native
  
  /**
    * Returns the current RenderingType of the map.
    */
  def getRenderingType(): RenderingType = js.native
  
  /**
    * Returns the default <code>StreetViewPanorama</code> bound to the map,
    * which may be a default panorama embedded within the map, or the panorama
    * set using <code>setStreetView()</code>. Changes to the map&#39;s
    * <code>streetViewControl</code> will be reflected in the display of such a
    * bound panorama.
    */
  def getStreetView(): StreetViewPanorama = js.native
  
  /**
    * Returns the current angle of incidence of the map, in degrees from the
    * viewport plane to the map plane. For raster maps, the result will be
    * <code>0</code> for imagery taken directly overhead or <code>45</code> for
    * 45&deg; imagery. This method does not return the value set by
    * <code>setTilt</code>. See <code>setTilt</code> for details.
    */
  def getTilt(): js.UndefOr[Double] = js.native
  
  /**
    * Returns the zoom of the map. If the zoom has not been set then the result
    * is <code>undefined</code>.
    */
  def getZoom(): js.UndefOr[Double] = js.native
  
  /**
    * A registry of <code>MapType</code> instances by string ID.
    */
  var mapTypes: MapTypeRegistry = js.native
  
  /**
    * Immediately sets the map&#39;s camera to the target camera options,
    * without animation.
    */
  def moveCamera(cameraOptions: CameraOptions): Unit = js.native
  
  /**
    * Additional map types to overlay. Overlay map types will display on top of
    * the base map they are attached to, in the order in which they appear in
    * the <code>overlayMapTypes</code> array (overlays with higher index values
    * are displayed in front of overlays with lower index values).
    */
  var overlayMapTypes: MVCArray[MapType | Null] = js.native
  
  /**
    * Changes the center of the map by the given distance in pixels. If the
    * distance is less than both the width and height of the map, the
    * transition will be smoothly animated. Note that the map coordinate system
    * increases from west to east (for x values) and north to south (for y
    * values).
    * @param x Number of pixels to move the map in the x direction.
    * @param y Number of pixels to move the map in the y direction.
    */
  def panBy(x: Double, y: Double): Unit = js.native
  
  /**
    * Changes the center of the map to the given <code>LatLng</code>. If the
    * change is less than both the width and height of the map, the transition
    * will be smoothly animated.
    * @param latLng The new center latitude/longitude of the map.
    */
  def panTo(latLng: LatLng): Unit = js.native
  def panTo(latLng: LatLngLiteral): Unit = js.native
  
  /**
    * Pans the map by the minimum amount necessary to contain the given
    * <code>LatLngBounds</code>. It makes no guarantee where on the map the
    * bounds will be, except that the map will be panned to show as much of the
    * bounds as possible inside <code>{currentMapSizeInPx} - {padding}</code>.
    * For both raster and vector maps, the map&#39;s zoom, tilt, and heading
    * will not be changed.
    * @param latLngBounds The bounds to pan the map to.
    * @param padding Padding in pixels. A number value will yield the same
    *     padding on all 4 sides. The default value is 0.
    */
  def panToBounds(latLngBounds: LatLngBounds): Unit = js.native
  def panToBounds(latLngBounds: LatLngBoundsLiteral): Unit = js.native
  def panToBounds(latLngBounds: LatLngBoundsLiteral, padding: Double): Unit = js.native
  def panToBounds(latLngBounds: LatLngBoundsLiteral, padding: Padding): Unit = js.native
  def panToBounds(latLngBounds: LatLngBounds, padding: Double): Unit = js.native
  def panToBounds(latLngBounds: LatLngBounds, padding: Padding): Unit = js.native
  
  def setCenter(latlng: LatLng): Unit = js.native
  def setCenter(latlng: LatLngLiteral): Unit = js.native
  
  /**
    * Controls whether the map icons are clickable or not. A map icon
    * represents a point of interest, also known as a POI. To disable the
    * clickability of map icons, pass a value of <code>false</code> to this
    * method.
    */
  def setClickableIcons(value: Boolean): Unit = js.native
  
  /**
    * Sets the compass heading for map measured in degrees from cardinal
    * direction North. For raster maps, this method only applies to aerial
    * imagery.
    */
  def setHeading(heading: Double): Unit = js.native
  
  def setMapTypeId(mapTypeId: String): Unit = js.native
  
  def setOptions(): Unit = js.native
  def setOptions(options: MapOptions): Unit = js.native
  
  /**
    * Binds a <code>StreetViewPanorama</code> to the map. This panorama
    * overrides the default <code>StreetViewPanorama</code>, allowing the map
    * to bind to an external panorama outside of the map. Setting the panorama
    * to <code>null</code> binds the default embedded panorama back to the map.
    * @param panorama The panorama to bind to the map.
    */
  def setStreetView(): Unit = js.native
  def setStreetView(panorama: StreetViewPanorama): Unit = js.native
  
  /**
    * For vector maps, sets the angle of incidence of the map. The allowed
    * values are restricted depending on the zoom level of the map. For raster
    * maps, controls the automatic switching behavior for the angle of
    * incidence of the map. The only allowed values are <code>0</code> and
    * <code>45</code>. <code>setTilt(0)</code> causes the map to always use a
    * 0&deg; overhead view regardless of the zoom level and viewport.
    * <code>setTilt(45)</code> causes the tilt angle to automatically switch to
    * 45 whenever 45&deg; imagery is available for the current zoom level and
    * viewport, and switch back to 0 whenever 45&deg; imagery is not available
    * (this is the default behavior). 45&deg; imagery is only available for
    * <code>satellite</code> and <code>hybrid</code> map types, within some
    * locations, and at some zoom levels. <b>Note:</b> <code>getTilt</code>
    * returns the current tilt angle, not the value set by
    * <code>setTilt</code>. Because <code>getTilt</code> and
    * <code>setTilt</code> refer to different things, do not
    * <code>bind()</code> the <code>tilt</code> property; doing so may yield
    * unpredictable effects.
    */
  def setTilt(tilt: Double): Unit = js.native
  
  /**
    * Sets the zoom of the map.
    * @param zoom Larger zoom values correspond to a higher resolution.
    */
  def setZoom(zoom: Double): Unit = js.native
}
