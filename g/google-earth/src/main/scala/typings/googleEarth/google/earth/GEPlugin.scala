package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.GEPlugin")
@js.native
class GEPlugin () extends js.Object {
  /**
    * Specifies that altitudes are to be interpreted as meters above or below sea level, regardless of the actual elevation of the terrain beneath the object.
    * For example, if you set the altitude of an object to 10 meters with an absolute altitude mode, the object will appear to be at ground level if the terrain beneath is also 10 meters above sea level.
    * If the terrain is 3 meters above sea level, the object will appear elevated above the terrain by 7 meters.
    * If, on the other hand, the terrain is 15 meters above sea level, the object may be completely invisible.
    */
  var ALTITUDE_ABSOLUTE: KmlAltitudeModeEnum = js.native
  /**
    * A Specifies that altitudes are at ground level. For Ground overlays, this means that the image will be draped over the terrain.
    */
  var ALTITUDE_CLAMP_TO_GROUND: KmlAltitudeModeEnum = js.native
  /**
    * Specifies that altitudes are at sea floor level.
    */
  var ALTITUDE_CLAMP_TO_SEA_FLOOR: KmlAltitudeModeEnum = js.native
  /**
    * Specifies that altitudes are to be interpreted as meters above or below ground level (i.e. the elevation of the terrain at the location).
    */
  var ALTITUDE_RELATIVE_TO_GROUND: KmlAltitudeModeEnum = js.native
  /**
    * Specifies that altitudes are to be interpreted as meters above sea floor (i.e. the elevation of the sea floor at the location).
    */
  var ALTITUDE_RELATIVE_TO_SEA_FLOOR: KmlAltitudeModeEnum = js.native
  /**
    * Inherit the color mode from ancestor styles.
    */
  var COLOR_INHERIT: KmlColorModeEnum = js.native
  /**
    * Apply no color mode effect, i.e. use the base color as is.
    */
  var COLOR_NORMAL: KmlColorModeEnum = js.native
  /**
    * Apply a random linear scale to the base color. See the KML <colorMode> documentation for more details.
    */
  var COLOR_RANDOM: KmlColorModeEnum = js.native
  /**
    * When using the GEView.hitTest method, this mode samples 3D buildings.
    */
  var HIT_TEST_BUILDINGS: GEHitTestModeEnum = js.native
  /**
    * When using the GEView.hitTest method, this mode samples the globe (the earth's sphere at altitude 0, without terrain or buildings).
    */
  var HIT_TEST_GLOBE: GEHitTestModeEnum = js.native
  /**
    * When using the GEView.hitTest method, this mode samples the earth's terrain (the ground surface, including variations in altitude).
    */
  var HIT_TEST_TERRAIN: GEHitTestModeEnum = js.native
  /**
    * The Layer ID of the borders layer. Use as an argument to getLayerById() or enableLayerById().
    */
  var LAYER_BORDERS: String = js.native
  /**
    * The Layer ID of the photorealistic buildings layer. Use as an argument to getLayerById() or enableLayerById().
    */
  var LAYER_BUILDINGS: String = js.native
  /**
    * The Layer ID of the low resolution (gray) buildings layer.
    * Use as an argument to getLayerById() or enableLayerById().
    * Note that as photorealistic buildings continue to be created and added to the LAYER_BUILDINGS layer, the low-resolution version of those buildings will be removed from this layer.
    * This layer will therefore change over time.
    */
  var LAYER_BUILDINGS_LOW_RESOLUTION: String = js.native
  /**
    * The Layer ID of the roads layer. Use as an argument to getLayerById() or enableLayerById().
    */
  var LAYER_ROADS: String = js.native
  /**
    * The Layer ID of the terrain layer. Use as an argument to getLayerById() or enableLayerById().
    */
  var LAYER_TERRAIN: String = js.native
  /**
    * The Layer ID of the trees layer. Use as an argument to getLayerById() or enableLayerById().
    */
  var LAYER_TREES: String = js.native
  /**
    * The feature's visibility is tied to its list item's checkbox state.
    */
  var LIST_ITEM_CHECK: KmlListItemTypeEnum = js.native
  /**
    * Use a normal checkbox for visibility but do not display children in a list view.
    * The item's checkbox should allows the user to toggle visibility of the child objects in the viewport.
    */
  var LIST_ITEM_CHECK_HIDE_CHILDREN: KmlListItemTypeEnum = js.native
  /**
    * When specified for a folder, document or network link, prevents all items from being made visible at once—that is, the user can turn all children off but cannot turn them all on at the same time.
    * This setting is useful for containers or network links containing large amounts of data.
    */
  var LIST_ITEM_CHECK_OFF_ONLY: KmlListItemTypeEnum = js.native
  /**
    * When specified for a container (a folder or a document), only one of the container's items should be visible at a time.
    */
  var LIST_ITEM_RADIO_FOLDER: KmlListItemTypeEnum = js.native
  /**
    * The Earth map type, used with GEOptions' setMapType.
    */
  var MAP_TYPE_EARTH: GEMapTypeEnum = js.native
  /**
    * The Sky map type, used with GEOptions' setMapType.
    */
  var MAP_TYPE_SKY: GEMapTypeEnum = js.native
  /**
    * The large navigation control type, used with GENavigationControl.setControlType().
    */
  var NAVIGATION_CONTROL_LARGE: GENavigationControlEnum = js.native
  /**
    * The small navigation control type, used with GENavigationControl.setControlType().
    */
  var NAVIGATION_CONTROL_SMALL: GENavigationControlEnum = js.native
  /**
    * Passed to the KmlViewerOptions.setOption method, along with a GEViewerOptionsValueEnum, to specify whether historical imagery should be enabled.
    */
  var OPTION_HISTORICAL_IMAGERY: GEViewerOptionsTypeEnum = js.native
  /**
    * Sets the render state to its default value. Currently, sunlight, Street View, and historical imagery all default to a disabled state.
    */
  var OPTION_STATE_DEFAULT: GEViewerOptionsValueEnum = js.native
  /**
    * Set the render state to off. Passed to the KmlViewerOptions.setOption method.
    */
  var OPTION_STATE_DISABLED: GEViewerOptionsValueEnum = js.native
  /**
    * Set the render state to on. Passed to the KmlViewerOptions.setOption method.
    */
  var OPTION_STATE_ENABLED: GEViewerOptionsValueEnum = js.native
  /**
    * Passed to the KmlViewerOptions.setOption method, along with a GEViewerOptionsValueEnum, to specify whether Street View should be enabled when the view reaches ground level.
    * Note that this applies only to programmatic movement, such as fly-tos; to control whether the user can enter Street View using manual navigation controls, call ge.getPlugin().streetViewEnabled(true).
    */
  var OPTION_STREET_VIEW: GEViewerOptionsTypeEnum = js.native
  /**
    * Passed to the KmlViewerOptions.setOption method, along with a GEViewerOptionsValueEnum, to specify whether the Sun option should be visible.
    * Sun can also be enabled/disabled with GEPlugin.getSun.
    */
  var OPTION_SUNLIGHT: GEViewerOptionsTypeEnum = js.native
  /**
    * Refresh when the file is loaded and whenever the Link parameters change. This refresh mode is the default.
    */
  var REFRESH_ON_CHANGE: KmlRefreshModeEnum = js.native
  /**
    * Refresh when the expiration time is reached.
    * If a fetched file has a NetworkLinkControl, the expires time takes precedence over expiration times specified in HTTP headers.
    * If no expires time is specified, the HTTP max-age header is used (if present).
    * If max-age is not present, the Expires HTTP header is used (if present).
    */
  var REFRESH_ON_EXPIRE: KmlRefreshModeEnum = js.native
  /**
    * Refresh every n seconds (specified in refreshInterval).
    */
  var REFRESH_ON_INTERVAL: KmlRefreshModeEnum = js.native
  /**
    * Specifies that fly-to should happen immediately, without a smooth transition.
    */
  var SPEED_TELEPORT: Double = js.native
  /**
    * Screen coordinates are to be interpreted as a fraction of an item, like an image or Google Earth window.
    */
  var UNITS_FRACTION: KmlUnitsEnum = js.native
  /**
    * Screen coordinates are to be interpreted as pixels from the top or right edge.
    */
  var UNITS_INSET_PIXELS: KmlUnitsEnum = js.native
  /**
    * Screen coordinates are to be interpreted as pixels from the left or bottom edge.
    */
  var UNITS_PIXELS: KmlUnitsEnum = js.native
  /**
    * Ignore changes in the view. Also ignore viewFormat parameters, if any.
    * This view refresh mode is the default.
    */
  var VIEW_REFRESH_NEVER: KmlViewRefreshModeEnum = js.native
  /**
    * Refresh only when the feature's Region becomes active.
    */
  var VIEW_REFRESH_ON_REGION: KmlViewRefreshModeEnum = js.native
  /**
    * Refresh the file only when the user explicitly requests it.
    */
  var VIEW_REFRESH_ON_REQUEST: KmlViewRefreshModeEnum = js.native
  /**
    * Refresh n seconds after movement stops, where n is specified in viewRefreshTime.
    */
  var VIEW_REFRESH_ON_STOP: KmlViewRefreshModeEnum = js.native
  /**
    * Automatically show or hide the UI element depending on user interaction.
    */
  var VISIBILITY_AUTO: GEVisibilityEnum = js.native
  /**
    * Hide the UI element.
    */
  var VISIBILITY_HIDE: GEVisibilityEnum = js.native
  /**
    * Show the UI element always.
    */
  var VISIBILITY_SHOW: GEVisibilityEnum = js.native
  /**
    * Creates a new Camera.
    * This element positions the camera relative to the Earth's surface and defines the view direction.
    */
  def createCamera(id: String): KmlCamera = js.native
  /**
    * Creates a Document. A Document is a container for features and styles.
    */
  def createDocument(id: String): KmlDocument = js.native
  /**
    * Creates a Feature balloon.
    */
  def createFeatureBalloon(id: String): GEFeatureBalloon = js.native
  /**
    * Creates a folder. 
    * A KMLFolder is used to arrange other features hierarchically (Folders, Placemarks, NetworkLinks, or Overlays).
    * A feature is visible only if it and all its ancestors are visible.
    */
  def createFolder(id: String): KmlFolder = js.native
  /**
    * Creates a GroundOverlay.
    * A GroundOverlay draws an image overlay draped onto the terrain.
    */
  def createGroundOverlay(id: String): KmlGroundOverlay = js.native
  /**
    * Creates an Html Div Balloon.
    */
  def createHtmlDivBalloon(id: String): GEHtmlDivBalloon = js.native
  /**
    * Creates an HTML string balloon.
    */
  def createHtmlStringBalloon(id: String): GEHtmlStringBalloon = js.native
  /**
    * Creates an Icon. An icon defines an image associated with an Icon style or overlay.
    */
  def createIcon(id: String): KmlIcon = js.native
  /**
    * Creates a LatLonAltBox, a bounding box that describes an area of interest defined by geographic coordinates and altitudes.
    */
  def createLatLonAltBox(id: String): KmlLatLonAltBox = js.native
  /**
    * Creates a LatLonBox, a bounding box that describes an area of interest defined by geographic coordinates and altitudes.
    */
  def createLatLonBox(id: String): KmlLatLonBox = js.native
  /**
    * Creates a line string on Google Earth.
    */
  def createLineString(id: String): KmlLineString = js.native
  /**
    * Creates a LinearRing.
    * A LinearRing defines a closed line string, typically the outer boundary of a Polygon.
    * Optionally, a LinearRing can also be used as the inner boundary of a Polygon to create holes in the Polygon.
    */
  def createLinearRing(id: String): KmlLinearRing = js.native
  /**
    * Creates a Link.
    * A Link specifies the location of KML files fetched by network links, image files used in any overlay, or model files used with the Model object.
    */
  def createLink(id: String): KmlLink = js.native
  /**
    * Specifies the exact coordinates of the Model's origin in latitude, longitude, and altitude.
    * Latitude and longitude measurements are standard lat-lon projection with WGS84 datum.
    * Altitude is distance above the earth's surface, in meters, and is interpreted according to altitudeMode.
    */
  def createLocation(id: String): KmlLocation = js.native
  /**
    * Creates level of detail (LOD).
    * LOD describes the size of the projected region on the screen that is required in order for the region to be considered active.
    * Also specifies the size of the pixel ramp used for fading in (from transparent to opaque) and fading out (from opaque to transparent).
    */
  def createLod(id: String): KmlLod = js.native
  /**
    * Creates a new LookAt.
    * A LookAt element positions the camera view in relation to an object that is being viewed.
    */
  def createLookAt(id: String): KmlLookAt = js.native
  /**
    * Creates a model.
    * A model is a 3D object described in a COLLADA file.
    * COLLADA files have a .dae file extension.
    * Models are created in their own coordinate space and then located, positioned, and scaled in Google Earth.
    */
  def createModel(id: String): KmlModel = js.native
  /**
    * Creates a container for one or more geometry primitives associated with the same feature.
    */
  def createMultiGeometry(id: String): KmlMultiGeometry = js.native
  /**
    * Creates a NetworkLink.
    * A NetworkLink references a KML file or KMZ archive on a local or remote network.
    */
  def createNetworkLink(id: String): KmlNetworkLink = js.native
  /**
    * Sets the rotation of a 3D model's coordinate system to position the object in Google Earth.
    */
  def createOrientation(id: String): KmlOrientation = js.native
  /**
    * Creates a placemark on the globe.
    * A Placemark is a feature with associated Geometry.
    * A Placemark with a Point has an icon associated with it that marks a point on the Earth in the 3D viewer.
    * (In the Google Earth 3D viewer, a Point Placemark is the only object you can click or roll over.
    * Other Geometry objects do not have an icon in the 3D viewer.
    * To allow the user to click in the 3D viewer, you would need to create a MultiGeometry object that contains both a Point and the other Geometry object.)
    */
  def createPlacemark(id: String): KmlPlacemark = js.native
  /**
    * Creates a point on the globe. Specifies the geographic location defined by longitude, latitude, and (optional) altitude.
    */
  def createPoint(id: String): KmlPoint = js.native
  /**
    * Creates a Polygon. A Polygon is defined by an outer boundary and 0 or more inner boundaries.
    */
  def createPolygon(id: String): KmlPolygon = js.native
  /**
    * Creates a Region in Google Earth.
    * A Region contains a bounding box that describes an area of interest defined by geographic coordinates and altitudes.
    */
  def createRegion(id: String): KmlRegion = js.native
  /**
    * Sets the scale of a model along the x, y, and z axes in the model's coordinate space.
    */
  def createScale(id: String): KmlScale = js.native
  /**
    * Creates a ScreenOverlay.
    * A ScreenOverlay draws an image overlay fixed to the screen.
    */
  def createScreenOverlay(id: String): KmlScreenOverlay = js.native
  /**
    * A Style defines an addressable style group that can be referenced by StyleMaps and features.
    */
  def createStyle(id: String): KmlStyle = js.native
  /**
    * Creates a StyleMap.
    * A StyleMap maps between two different icon styles.
    * Typically, a StyleMap is used to provide separate normal and highlighted styles for a Placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  def createStyleMap(id: String): KmlStyleMap = js.native
  /**
    * Create a KmlTimeSpan object.
    * For more information, refer to the Time chapter of the Google Earth API developer's guide.
    */
  def createTimeSpan(id: String): KmlTimeSpan = js.native
  /**
    * Create a KmlTimeStamp object.
    * For more information, refer to the Time chapter of the Google Earth API developer's guide.
    */
  def createTimeStamp(id: String): KmlTimeStamp = js.native
  /**
    * Creates a new viewer options object.
    */
  def createViewerOptions(id: String): KmlViewerOptions = js.native
  /**
    * Returns the currently active balloon, or null.
    */
  def getBalloon(): GEAbstractBalloon = js.native
  /**
    * Used for debugging purposes; if this value is not equal to the value returned by getPluginVersion then there is a misconfiguration on the end user's system.
    * This check is automatically done during plugin instantiation.
    */
  def getEarthVersion(): String = js.native
  /**
    * Get an element by ID. This is functionally equivalent to getElementByUrl with an unspecified base URL.
    *
    * For example: getElementByUrl('#foo').
    *
    * Usage is when finding objects created with JavaScript, which have unspecified base URLs.
    * The object must be a descendant of the DOM before it can be found.
    */
  def getElementById(id: String): KmlObject = js.native
  /**
    * Get an element by URL. A URL consists of the base address and the ID, joined with the # character.
    * 
    * For example: http://www.google.com/bar.kml#here_be_monsters 
    *
    * This applies to objects that are fetched.
    * In the case of plugin created objects, the URL is simply #foo.
    * The object must be a descendant of the DOM before it can be found.
    */
  def getElementByUrl(url: String): KmlObject = js.native
  /**
    * Get a list of elements by type.
    */
  def getElementsByType(): KmlObjectList[KmlObject] = js.native
  /**
    * The top-level features currently in the Earth object.
    */
  def getFeatures(): GEFeatureContainer = js.native
  /**
    * Controls the globe behavior.
    */
  def getGlobe(): GEGlobe = js.native
  /**
    * Controls built-in layer behavior.
    */
  def getLayerRoot(): KmlLayerRoot = js.native
  /**
    * Controls the navigation controls on the globe.
    */
  def getNavigationControl(): GENavigationControl = js.native
  /**
    * The options used to manipulate the behavior of the Google Earth plugin.
    */
  def getOptions(): GEOptions = js.native
  /**
    * Exposes functionality for interacting with photo overlays.
    */
  def getPhotoOverlayViewer(): GEPhotoOverlayViewer = js.native
  /**
    * The version of the Google Earth Plug-in installed on the end user's machine.
    */
  def getPluginVersion(): String = js.native
  /**
    * Returns a number between 0 and 100 (inclusive) that indicates the progress of the streaming of imagery for the current view.
    *
    * A value of 100 means that the imagery is completely streamed in.
    */
  def getStreamingPercent(): Double = js.native
  /**
    * Displays the dawn to dusk views.
    */
  def getSun(): GESun = js.native
  /**
    * The time class used to manipulate the behavior of the Google Earth plugin time.
    */
  def getTime(): GETime = js.native
  /**
    * Exposes functionality for interacting with KML tours.
    */
  def getTourPlayer(): GETourPlayer = js.native
  /**
    * Controls the plugin viewport.
    */
  def getView(): GEView = js.native
  /**
    * Controls the window options.
    */
  def getWindow(): GEWindow = js.native
  /**
    * Parse a string of KML and return a handle to the root of the KML object structure that was created.
    */
  def parseKml(kml: String): KmlObject = js.native
  /**
    * Sets the given balloon as the active balloon, replacing any existing active balloon.
    * If the given feature is visible, then the balloon is displayed. Otherwise, the balloon is hidden.
    *
    * If the argument is null, then any existing active balloon will be hidden.
    */
  def setBalloon(newActiveBalloon: GEAbstractBalloon): Unit = js.native
}

