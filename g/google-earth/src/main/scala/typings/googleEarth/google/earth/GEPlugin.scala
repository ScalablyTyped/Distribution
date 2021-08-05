package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GEPlugin extends StObject {
  
  /**
    * Specifies that altitudes are to be interpreted as meters above or below sea level, regardless of the actual elevation of the terrain beneath the object.
    * For example, if you set the altitude of an object to 10 meters with an absolute altitude mode, the object will appear to be at ground level if the terrain beneath is also 10 meters above sea level.
    * If the terrain is 3 meters above sea level, the object will appear elevated above the terrain by 7 meters.
    * If, on the other hand, the terrain is 15 meters above sea level, the object may be completely invisible.
    */
  var ALTITUDE_ABSOLUTE: KmlAltitudeModeEnum
  
  /**
    * A Specifies that altitudes are at ground level. For Ground overlays, this means that the image will be draped over the terrain.
    */
  var ALTITUDE_CLAMP_TO_GROUND: KmlAltitudeModeEnum
  
  /**
    * Specifies that altitudes are at sea floor level.
    */
  var ALTITUDE_CLAMP_TO_SEA_FLOOR: KmlAltitudeModeEnum
  
  /**
    * Specifies that altitudes are to be interpreted as meters above or below ground level (i.e. the elevation of the terrain at the location).
    */
  var ALTITUDE_RELATIVE_TO_GROUND: KmlAltitudeModeEnum
  
  /**
    * Specifies that altitudes are to be interpreted as meters above sea floor (i.e. the elevation of the sea floor at the location).
    */
  var ALTITUDE_RELATIVE_TO_SEA_FLOOR: KmlAltitudeModeEnum
  
  /**
    * Inherit the color mode from ancestor styles.
    */
  var COLOR_INHERIT: KmlColorModeEnum
  
  /**
    * Apply no color mode effect, i.e. use the base color as is.
    */
  var COLOR_NORMAL: KmlColorModeEnum
  
  /**
    * Apply a random linear scale to the base color. See the KML <colorMode> documentation for more details.
    */
  var COLOR_RANDOM: KmlColorModeEnum
  
  /**
    * When using the GEView.hitTest method, this mode samples 3D buildings.
    */
  var HIT_TEST_BUILDINGS: GEHitTestModeEnum
  
  /**
    * When using the GEView.hitTest method, this mode samples the globe (the earth's sphere at altitude 0, without terrain or buildings).
    */
  var HIT_TEST_GLOBE: GEHitTestModeEnum
  
  /**
    * When using the GEView.hitTest method, this mode samples the earth's terrain (the ground surface, including variations in altitude).
    */
  var HIT_TEST_TERRAIN: GEHitTestModeEnum
  
  /**
    * The Layer ID of the borders layer. Use as an argument to getLayerById() or enableLayerById().
    */
  var LAYER_BORDERS: String
  
  /**
    * The Layer ID of the photorealistic buildings layer. Use as an argument to getLayerById() or enableLayerById().
    */
  var LAYER_BUILDINGS: String
  
  /**
    * The Layer ID of the low resolution (gray) buildings layer.
    * Use as an argument to getLayerById() or enableLayerById().
    * Note that as photorealistic buildings continue to be created and added to the LAYER_BUILDINGS layer, the low-resolution version of those buildings will be removed from this layer.
    * This layer will therefore change over time.
    */
  var LAYER_BUILDINGS_LOW_RESOLUTION: String
  
  /**
    * The Layer ID of the roads layer. Use as an argument to getLayerById() or enableLayerById().
    */
  var LAYER_ROADS: String
  
  /**
    * The Layer ID of the terrain layer. Use as an argument to getLayerById() or enableLayerById().
    */
  var LAYER_TERRAIN: String
  
  /**
    * The Layer ID of the trees layer. Use as an argument to getLayerById() or enableLayerById().
    */
  var LAYER_TREES: String
  
  /**
    * The feature's visibility is tied to its list item's checkbox state.
    */
  var LIST_ITEM_CHECK: KmlListItemTypeEnum
  
  /**
    * Use a normal checkbox for visibility but do not display children in a list view.
    * The item's checkbox should allows the user to toggle visibility of the child objects in the viewport.
    */
  var LIST_ITEM_CHECK_HIDE_CHILDREN: KmlListItemTypeEnum
  
  /**
    * When specified for a folder, document or network link, prevents all items from being made visible at once—that is, the user can turn all children off but cannot turn them all on at the same time.
    * This setting is useful for containers or network links containing large amounts of data.
    */
  var LIST_ITEM_CHECK_OFF_ONLY: KmlListItemTypeEnum
  
  /**
    * When specified for a container (a folder or a document), only one of the container's items should be visible at a time.
    */
  var LIST_ITEM_RADIO_FOLDER: KmlListItemTypeEnum
  
  /**
    * The Earth map type, used with GEOptions' setMapType.
    */
  var MAP_TYPE_EARTH: GEMapTypeEnum
  
  /**
    * The Sky map type, used with GEOptions' setMapType.
    */
  var MAP_TYPE_SKY: GEMapTypeEnum
  
  /**
    * The large navigation control type, used with GENavigationControl.setControlType().
    */
  var NAVIGATION_CONTROL_LARGE: GENavigationControlEnum
  
  /**
    * The small navigation control type, used with GENavigationControl.setControlType().
    */
  var NAVIGATION_CONTROL_SMALL: GENavigationControlEnum
  
  /**
    * Passed to the KmlViewerOptions.setOption method, along with a GEViewerOptionsValueEnum, to specify whether historical imagery should be enabled.
    */
  var OPTION_HISTORICAL_IMAGERY: GEViewerOptionsTypeEnum
  
  /**
    * Sets the render state to its default value. Currently, sunlight, Street View, and historical imagery all default to a disabled state.
    */
  var OPTION_STATE_DEFAULT: GEViewerOptionsValueEnum
  
  /**
    * Set the render state to off. Passed to the KmlViewerOptions.setOption method.
    */
  var OPTION_STATE_DISABLED: GEViewerOptionsValueEnum
  
  /**
    * Set the render state to on. Passed to the KmlViewerOptions.setOption method.
    */
  var OPTION_STATE_ENABLED: GEViewerOptionsValueEnum
  
  /**
    * Passed to the KmlViewerOptions.setOption method, along with a GEViewerOptionsValueEnum, to specify whether Street View should be enabled when the view reaches ground level.
    * Note that this applies only to programmatic movement, such as fly-tos; to control whether the user can enter Street View using manual navigation controls, call ge.getPlugin().streetViewEnabled(true).
    */
  var OPTION_STREET_VIEW: GEViewerOptionsTypeEnum
  
  /**
    * Passed to the KmlViewerOptions.setOption method, along with a GEViewerOptionsValueEnum, to specify whether the Sun option should be visible.
    * Sun can also be enabled/disabled with GEPlugin.getSun.
    */
  var OPTION_SUNLIGHT: GEViewerOptionsTypeEnum
  
  /**
    * Refresh when the file is loaded and whenever the Link parameters change. This refresh mode is the default.
    */
  var REFRESH_ON_CHANGE: KmlRefreshModeEnum
  
  /**
    * Refresh when the expiration time is reached.
    * If a fetched file has a NetworkLinkControl, the expires time takes precedence over expiration times specified in HTTP headers.
    * If no expires time is specified, the HTTP max-age header is used (if present).
    * If max-age is not present, the Expires HTTP header is used (if present).
    */
  var REFRESH_ON_EXPIRE: KmlRefreshModeEnum
  
  /**
    * Refresh every n seconds (specified in refreshInterval).
    */
  var REFRESH_ON_INTERVAL: KmlRefreshModeEnum
  
  /**
    * Specifies that fly-to should happen immediately, without a smooth transition.
    */
  var SPEED_TELEPORT: Double
  
  /**
    * Screen coordinates are to be interpreted as a fraction of an item, like an image or Google Earth window.
    */
  var UNITS_FRACTION: KmlUnitsEnum
  
  /**
    * Screen coordinates are to be interpreted as pixels from the top or right edge.
    */
  var UNITS_INSET_PIXELS: KmlUnitsEnum
  
  /**
    * Screen coordinates are to be interpreted as pixels from the left or bottom edge.
    */
  var UNITS_PIXELS: KmlUnitsEnum
  
  /**
    * Ignore changes in the view. Also ignore viewFormat parameters, if any.
    * This view refresh mode is the default.
    */
  var VIEW_REFRESH_NEVER: KmlViewRefreshModeEnum
  
  /**
    * Refresh only when the feature's Region becomes active.
    */
  var VIEW_REFRESH_ON_REGION: KmlViewRefreshModeEnum
  
  /**
    * Refresh the file only when the user explicitly requests it.
    */
  var VIEW_REFRESH_ON_REQUEST: KmlViewRefreshModeEnum
  
  /**
    * Refresh n seconds after movement stops, where n is specified in viewRefreshTime.
    */
  var VIEW_REFRESH_ON_STOP: KmlViewRefreshModeEnum
  
  /**
    * Automatically show or hide the UI element depending on user interaction.
    */
  var VISIBILITY_AUTO: GEVisibilityEnum
  
  /**
    * Hide the UI element.
    */
  var VISIBILITY_HIDE: GEVisibilityEnum
  
  /**
    * Show the UI element always.
    */
  var VISIBILITY_SHOW: GEVisibilityEnum
  
  /**
    * Creates a new Camera.
    * This element positions the camera relative to the Earth's surface and defines the view direction.
    */
  def createCamera(id: String): KmlCamera
  
  /**
    * Creates a Document. A Document is a container for features and styles.
    */
  def createDocument(id: String): KmlDocument
  
  /**
    * Creates a Feature balloon.
    */
  def createFeatureBalloon(id: String): GEFeatureBalloon
  
  /**
    * Creates a folder. 
    * A KMLFolder is used to arrange other features hierarchically (Folders, Placemarks, NetworkLinks, or Overlays).
    * A feature is visible only if it and all its ancestors are visible.
    */
  def createFolder(id: String): KmlFolder
  
  /**
    * Creates a GroundOverlay.
    * A GroundOverlay draws an image overlay draped onto the terrain.
    */
  def createGroundOverlay(id: String): KmlGroundOverlay
  
  /**
    * Creates an Html Div Balloon.
    */
  def createHtmlDivBalloon(id: String): GEHtmlDivBalloon
  
  /**
    * Creates an HTML string balloon.
    */
  def createHtmlStringBalloon(id: String): GEHtmlStringBalloon
  
  /**
    * Creates an Icon. An icon defines an image associated with an Icon style or overlay.
    */
  def createIcon(id: String): KmlIcon
  
  /**
    * Creates a LatLonAltBox, a bounding box that describes an area of interest defined by geographic coordinates and altitudes.
    */
  def createLatLonAltBox(id: String): KmlLatLonAltBox
  
  /**
    * Creates a LatLonBox, a bounding box that describes an area of interest defined by geographic coordinates and altitudes.
    */
  def createLatLonBox(id: String): KmlLatLonBox
  
  /**
    * Creates a line string on Google Earth.
    */
  def createLineString(id: String): KmlLineString
  
  /**
    * Creates a LinearRing.
    * A LinearRing defines a closed line string, typically the outer boundary of a Polygon.
    * Optionally, a LinearRing can also be used as the inner boundary of a Polygon to create holes in the Polygon.
    */
  def createLinearRing(id: String): KmlLinearRing
  
  /**
    * Creates a Link.
    * A Link specifies the location of KML files fetched by network links, image files used in any overlay, or model files used with the Model object.
    */
  def createLink(id: String): KmlLink
  
  /**
    * Specifies the exact coordinates of the Model's origin in latitude, longitude, and altitude.
    * Latitude and longitude measurements are standard lat-lon projection with WGS84 datum.
    * Altitude is distance above the earth's surface, in meters, and is interpreted according to altitudeMode.
    */
  def createLocation(id: String): KmlLocation
  
  /**
    * Creates level of detail (LOD).
    * LOD describes the size of the projected region on the screen that is required in order for the region to be considered active.
    * Also specifies the size of the pixel ramp used for fading in (from transparent to opaque) and fading out (from opaque to transparent).
    */
  def createLod(id: String): KmlLod
  
  /**
    * Creates a new LookAt.
    * A LookAt element positions the camera view in relation to an object that is being viewed.
    */
  def createLookAt(id: String): KmlLookAt
  
  /**
    * Creates a model.
    * A model is a 3D object described in a COLLADA file.
    * COLLADA files have a .dae file extension.
    * Models are created in their own coordinate space and then located, positioned, and scaled in Google Earth.
    */
  def createModel(id: String): KmlModel
  
  /**
    * Creates a container for one or more geometry primitives associated with the same feature.
    */
  def createMultiGeometry(id: String): KmlMultiGeometry
  
  /**
    * Creates a NetworkLink.
    * A NetworkLink references a KML file or KMZ archive on a local or remote network.
    */
  def createNetworkLink(id: String): KmlNetworkLink
  
  /**
    * Sets the rotation of a 3D model's coordinate system to position the object in Google Earth.
    */
  def createOrientation(id: String): KmlOrientation
  
  /**
    * Creates a placemark on the globe.
    * A Placemark is a feature with associated Geometry.
    * A Placemark with a Point has an icon associated with it that marks a point on the Earth in the 3D viewer.
    * (In the Google Earth 3D viewer, a Point Placemark is the only object you can click or roll over.
    * Other Geometry objects do not have an icon in the 3D viewer.
    * To allow the user to click in the 3D viewer, you would need to create a MultiGeometry object that contains both a Point and the other Geometry object.)
    */
  def createPlacemark(id: String): KmlPlacemark
  
  /**
    * Creates a point on the globe. Specifies the geographic location defined by longitude, latitude, and (optional) altitude.
    */
  def createPoint(id: String): KmlPoint
  
  /**
    * Creates a Polygon. A Polygon is defined by an outer boundary and 0 or more inner boundaries.
    */
  def createPolygon(id: String): KmlPolygon
  
  /**
    * Creates a Region in Google Earth.
    * A Region contains a bounding box that describes an area of interest defined by geographic coordinates and altitudes.
    */
  def createRegion(id: String): KmlRegion
  
  /**
    * Sets the scale of a model along the x, y, and z axes in the model's coordinate space.
    */
  def createScale(id: String): KmlScale
  
  /**
    * Creates a ScreenOverlay.
    * A ScreenOverlay draws an image overlay fixed to the screen.
    */
  def createScreenOverlay(id: String): KmlScreenOverlay
  
  /**
    * A Style defines an addressable style group that can be referenced by StyleMaps and features.
    */
  def createStyle(id: String): KmlStyle
  
  /**
    * Creates a StyleMap.
    * A StyleMap maps between two different icon styles.
    * Typically, a StyleMap is used to provide separate normal and highlighted styles for a Placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  def createStyleMap(id: String): KmlStyleMap
  
  /**
    * Create a KmlTimeSpan object.
    * For more information, refer to the Time chapter of the Google Earth API developer's guide.
    */
  def createTimeSpan(id: String): KmlTimeSpan
  
  /**
    * Create a KmlTimeStamp object.
    * For more information, refer to the Time chapter of the Google Earth API developer's guide.
    */
  def createTimeStamp(id: String): KmlTimeStamp
  
  /**
    * Creates a new viewer options object.
    */
  def createViewerOptions(id: String): KmlViewerOptions
  
  /**
    * Returns the currently active balloon, or null.
    */
  def getBalloon(): GEAbstractBalloon
  
  /**
    * Used for debugging purposes; if this value is not equal to the value returned by getPluginVersion then there is a misconfiguration on the end user's system.
    * This check is automatically done during plugin instantiation.
    */
  def getEarthVersion(): String
  
  /**
    * Get an element by ID. This is functionally equivalent to getElementByUrl with an unspecified base URL.
    *
    * For example: getElementByUrl('#foo').
    *
    * Usage is when finding objects created with JavaScript, which have unspecified base URLs.
    * The object must be a descendant of the DOM before it can be found.
    */
  def getElementById(id: String): KmlObject
  
  /**
    * Get an element by URL. A URL consists of the base address and the ID, joined with the # character.
    * 
    * For example: http://www.google.com/bar.kml#here_be_monsters 
    *
    * This applies to objects that are fetched.
    * In the case of plugin created objects, the URL is simply #foo.
    * The object must be a descendant of the DOM before it can be found.
    */
  def getElementByUrl(url: String): KmlObject
  
  /**
    * Get a list of elements by type.
    */
  def getElementsByType(): KmlObjectList[KmlObject]
  
  /**
    * The top-level features currently in the Earth object.
    */
  def getFeatures(): GEFeatureContainer
  
  /**
    * Controls the globe behavior.
    */
  def getGlobe(): GEGlobe
  
  /**
    * Controls built-in layer behavior.
    */
  def getLayerRoot(): KmlLayerRoot
  
  /**
    * Controls the navigation controls on the globe.
    */
  def getNavigationControl(): GENavigationControl
  
  /**
    * The options used to manipulate the behavior of the Google Earth plugin.
    */
  def getOptions(): GEOptions
  
  /**
    * Exposes functionality for interacting with photo overlays.
    */
  def getPhotoOverlayViewer(): GEPhotoOverlayViewer
  
  /**
    * The version of the Google Earth Plug-in installed on the end user's machine.
    */
  def getPluginVersion(): String
  
  /**
    * Returns a number between 0 and 100 (inclusive) that indicates the progress of the streaming of imagery for the current view.
    *
    * A value of 100 means that the imagery is completely streamed in.
    */
  def getStreamingPercent(): Double
  
  /**
    * Displays the dawn to dusk views.
    */
  def getSun(): GESun
  
  /**
    * The time class used to manipulate the behavior of the Google Earth plugin time.
    */
  def getTime(): GETime
  
  /**
    * Exposes functionality for interacting with KML tours.
    */
  def getTourPlayer(): GETourPlayer
  
  /**
    * Controls the plugin viewport.
    */
  def getView(): GEView
  
  /**
    * Controls the window options.
    */
  def getWindow(): GEWindow
  
  /**
    * Parse a string of KML and return a handle to the root of the KML object structure that was created.
    */
  def parseKml(kml: String): KmlObject
  
  /**
    * Sets the given balloon as the active balloon, replacing any existing active balloon.
    * If the given feature is visible, then the balloon is displayed. Otherwise, the balloon is hidden.
    *
    * If the argument is null, then any existing active balloon will be hidden.
    */
  def setBalloon(newActiveBalloon: GEAbstractBalloon): Unit
}
object GEPlugin {
  
  inline def apply(
    ALTITUDE_ABSOLUTE: KmlAltitudeModeEnum,
    ALTITUDE_CLAMP_TO_GROUND: KmlAltitudeModeEnum,
    ALTITUDE_CLAMP_TO_SEA_FLOOR: KmlAltitudeModeEnum,
    ALTITUDE_RELATIVE_TO_GROUND: KmlAltitudeModeEnum,
    ALTITUDE_RELATIVE_TO_SEA_FLOOR: KmlAltitudeModeEnum,
    COLOR_INHERIT: KmlColorModeEnum,
    COLOR_NORMAL: KmlColorModeEnum,
    COLOR_RANDOM: KmlColorModeEnum,
    HIT_TEST_BUILDINGS: GEHitTestModeEnum,
    HIT_TEST_GLOBE: GEHitTestModeEnum,
    HIT_TEST_TERRAIN: GEHitTestModeEnum,
    LAYER_BORDERS: String,
    LAYER_BUILDINGS: String,
    LAYER_BUILDINGS_LOW_RESOLUTION: String,
    LAYER_ROADS: String,
    LAYER_TERRAIN: String,
    LAYER_TREES: String,
    LIST_ITEM_CHECK: KmlListItemTypeEnum,
    LIST_ITEM_CHECK_HIDE_CHILDREN: KmlListItemTypeEnum,
    LIST_ITEM_CHECK_OFF_ONLY: KmlListItemTypeEnum,
    LIST_ITEM_RADIO_FOLDER: KmlListItemTypeEnum,
    MAP_TYPE_EARTH: GEMapTypeEnum,
    MAP_TYPE_SKY: GEMapTypeEnum,
    NAVIGATION_CONTROL_LARGE: GENavigationControlEnum,
    NAVIGATION_CONTROL_SMALL: GENavigationControlEnum,
    OPTION_HISTORICAL_IMAGERY: GEViewerOptionsTypeEnum,
    OPTION_STATE_DEFAULT: GEViewerOptionsValueEnum,
    OPTION_STATE_DISABLED: GEViewerOptionsValueEnum,
    OPTION_STATE_ENABLED: GEViewerOptionsValueEnum,
    OPTION_STREET_VIEW: GEViewerOptionsTypeEnum,
    OPTION_SUNLIGHT: GEViewerOptionsTypeEnum,
    REFRESH_ON_CHANGE: KmlRefreshModeEnum,
    REFRESH_ON_EXPIRE: KmlRefreshModeEnum,
    REFRESH_ON_INTERVAL: KmlRefreshModeEnum,
    SPEED_TELEPORT: Double,
    UNITS_FRACTION: KmlUnitsEnum,
    UNITS_INSET_PIXELS: KmlUnitsEnum,
    UNITS_PIXELS: KmlUnitsEnum,
    VIEW_REFRESH_NEVER: KmlViewRefreshModeEnum,
    VIEW_REFRESH_ON_REGION: KmlViewRefreshModeEnum,
    VIEW_REFRESH_ON_REQUEST: KmlViewRefreshModeEnum,
    VIEW_REFRESH_ON_STOP: KmlViewRefreshModeEnum,
    VISIBILITY_AUTO: GEVisibilityEnum,
    VISIBILITY_HIDE: GEVisibilityEnum,
    VISIBILITY_SHOW: GEVisibilityEnum,
    createCamera: String => KmlCamera,
    createDocument: String => KmlDocument,
    createFeatureBalloon: String => GEFeatureBalloon,
    createFolder: String => KmlFolder,
    createGroundOverlay: String => KmlGroundOverlay,
    createHtmlDivBalloon: String => GEHtmlDivBalloon,
    createHtmlStringBalloon: String => GEHtmlStringBalloon,
    createIcon: String => KmlIcon,
    createLatLonAltBox: String => KmlLatLonAltBox,
    createLatLonBox: String => KmlLatLonBox,
    createLineString: String => KmlLineString,
    createLinearRing: String => KmlLinearRing,
    createLink: String => KmlLink,
    createLocation: String => KmlLocation,
    createLod: String => KmlLod,
    createLookAt: String => KmlLookAt,
    createModel: String => KmlModel,
    createMultiGeometry: String => KmlMultiGeometry,
    createNetworkLink: String => KmlNetworkLink,
    createOrientation: String => KmlOrientation,
    createPlacemark: String => KmlPlacemark,
    createPoint: String => KmlPoint,
    createPolygon: String => KmlPolygon,
    createRegion: String => KmlRegion,
    createScale: String => KmlScale,
    createScreenOverlay: String => KmlScreenOverlay,
    createStyle: String => KmlStyle,
    createStyleMap: String => KmlStyleMap,
    createTimeSpan: String => KmlTimeSpan,
    createTimeStamp: String => KmlTimeStamp,
    createViewerOptions: String => KmlViewerOptions,
    getBalloon: () => GEAbstractBalloon,
    getEarthVersion: () => String,
    getElementById: String => KmlObject,
    getElementByUrl: String => KmlObject,
    getElementsByType: () => KmlObjectList[KmlObject],
    getFeatures: () => GEFeatureContainer,
    getGlobe: () => GEGlobe,
    getLayerRoot: () => KmlLayerRoot,
    getNavigationControl: () => GENavigationControl,
    getOptions: () => GEOptions,
    getPhotoOverlayViewer: () => GEPhotoOverlayViewer,
    getPluginVersion: () => String,
    getStreamingPercent: () => Double,
    getSun: () => GESun,
    getTime: () => GETime,
    getTourPlayer: () => GETourPlayer,
    getView: () => GEView,
    getWindow: () => GEWindow,
    parseKml: String => KmlObject,
    setBalloon: GEAbstractBalloon => Unit
  ): GEPlugin = {
    val __obj = js.Dynamic.literal(ALTITUDE_ABSOLUTE = ALTITUDE_ABSOLUTE.asInstanceOf[js.Any], ALTITUDE_CLAMP_TO_GROUND = ALTITUDE_CLAMP_TO_GROUND.asInstanceOf[js.Any], ALTITUDE_CLAMP_TO_SEA_FLOOR = ALTITUDE_CLAMP_TO_SEA_FLOOR.asInstanceOf[js.Any], ALTITUDE_RELATIVE_TO_GROUND = ALTITUDE_RELATIVE_TO_GROUND.asInstanceOf[js.Any], ALTITUDE_RELATIVE_TO_SEA_FLOOR = ALTITUDE_RELATIVE_TO_SEA_FLOOR.asInstanceOf[js.Any], COLOR_INHERIT = COLOR_INHERIT.asInstanceOf[js.Any], COLOR_NORMAL = COLOR_NORMAL.asInstanceOf[js.Any], COLOR_RANDOM = COLOR_RANDOM.asInstanceOf[js.Any], HIT_TEST_BUILDINGS = HIT_TEST_BUILDINGS.asInstanceOf[js.Any], HIT_TEST_GLOBE = HIT_TEST_GLOBE.asInstanceOf[js.Any], HIT_TEST_TERRAIN = HIT_TEST_TERRAIN.asInstanceOf[js.Any], LAYER_BORDERS = LAYER_BORDERS.asInstanceOf[js.Any], LAYER_BUILDINGS = LAYER_BUILDINGS.asInstanceOf[js.Any], LAYER_BUILDINGS_LOW_RESOLUTION = LAYER_BUILDINGS_LOW_RESOLUTION.asInstanceOf[js.Any], LAYER_ROADS = LAYER_ROADS.asInstanceOf[js.Any], LAYER_TERRAIN = LAYER_TERRAIN.asInstanceOf[js.Any], LAYER_TREES = LAYER_TREES.asInstanceOf[js.Any], LIST_ITEM_CHECK = LIST_ITEM_CHECK.asInstanceOf[js.Any], LIST_ITEM_CHECK_HIDE_CHILDREN = LIST_ITEM_CHECK_HIDE_CHILDREN.asInstanceOf[js.Any], LIST_ITEM_CHECK_OFF_ONLY = LIST_ITEM_CHECK_OFF_ONLY.asInstanceOf[js.Any], LIST_ITEM_RADIO_FOLDER = LIST_ITEM_RADIO_FOLDER.asInstanceOf[js.Any], MAP_TYPE_EARTH = MAP_TYPE_EARTH.asInstanceOf[js.Any], MAP_TYPE_SKY = MAP_TYPE_SKY.asInstanceOf[js.Any], NAVIGATION_CONTROL_LARGE = NAVIGATION_CONTROL_LARGE.asInstanceOf[js.Any], NAVIGATION_CONTROL_SMALL = NAVIGATION_CONTROL_SMALL.asInstanceOf[js.Any], OPTION_HISTORICAL_IMAGERY = OPTION_HISTORICAL_IMAGERY.asInstanceOf[js.Any], OPTION_STATE_DEFAULT = OPTION_STATE_DEFAULT.asInstanceOf[js.Any], OPTION_STATE_DISABLED = OPTION_STATE_DISABLED.asInstanceOf[js.Any], OPTION_STATE_ENABLED = OPTION_STATE_ENABLED.asInstanceOf[js.Any], OPTION_STREET_VIEW = OPTION_STREET_VIEW.asInstanceOf[js.Any], OPTION_SUNLIGHT = OPTION_SUNLIGHT.asInstanceOf[js.Any], REFRESH_ON_CHANGE = REFRESH_ON_CHANGE.asInstanceOf[js.Any], REFRESH_ON_EXPIRE = REFRESH_ON_EXPIRE.asInstanceOf[js.Any], REFRESH_ON_INTERVAL = REFRESH_ON_INTERVAL.asInstanceOf[js.Any], SPEED_TELEPORT = SPEED_TELEPORT.asInstanceOf[js.Any], UNITS_FRACTION = UNITS_FRACTION.asInstanceOf[js.Any], UNITS_INSET_PIXELS = UNITS_INSET_PIXELS.asInstanceOf[js.Any], UNITS_PIXELS = UNITS_PIXELS.asInstanceOf[js.Any], VIEW_REFRESH_NEVER = VIEW_REFRESH_NEVER.asInstanceOf[js.Any], VIEW_REFRESH_ON_REGION = VIEW_REFRESH_ON_REGION.asInstanceOf[js.Any], VIEW_REFRESH_ON_REQUEST = VIEW_REFRESH_ON_REQUEST.asInstanceOf[js.Any], VIEW_REFRESH_ON_STOP = VIEW_REFRESH_ON_STOP.asInstanceOf[js.Any], VISIBILITY_AUTO = VISIBILITY_AUTO.asInstanceOf[js.Any], VISIBILITY_HIDE = VISIBILITY_HIDE.asInstanceOf[js.Any], VISIBILITY_SHOW = VISIBILITY_SHOW.asInstanceOf[js.Any], createCamera = js.Any.fromFunction1(createCamera), createDocument = js.Any.fromFunction1(createDocument), createFeatureBalloon = js.Any.fromFunction1(createFeatureBalloon), createFolder = js.Any.fromFunction1(createFolder), createGroundOverlay = js.Any.fromFunction1(createGroundOverlay), createHtmlDivBalloon = js.Any.fromFunction1(createHtmlDivBalloon), createHtmlStringBalloon = js.Any.fromFunction1(createHtmlStringBalloon), createIcon = js.Any.fromFunction1(createIcon), createLatLonAltBox = js.Any.fromFunction1(createLatLonAltBox), createLatLonBox = js.Any.fromFunction1(createLatLonBox), createLineString = js.Any.fromFunction1(createLineString), createLinearRing = js.Any.fromFunction1(createLinearRing), createLink = js.Any.fromFunction1(createLink), createLocation = js.Any.fromFunction1(createLocation), createLod = js.Any.fromFunction1(createLod), createLookAt = js.Any.fromFunction1(createLookAt), createModel = js.Any.fromFunction1(createModel), createMultiGeometry = js.Any.fromFunction1(createMultiGeometry), createNetworkLink = js.Any.fromFunction1(createNetworkLink), createOrientation = js.Any.fromFunction1(createOrientation), createPlacemark = js.Any.fromFunction1(createPlacemark), createPoint = js.Any.fromFunction1(createPoint), createPolygon = js.Any.fromFunction1(createPolygon), createRegion = js.Any.fromFunction1(createRegion), createScale = js.Any.fromFunction1(createScale), createScreenOverlay = js.Any.fromFunction1(createScreenOverlay), createStyle = js.Any.fromFunction1(createStyle), createStyleMap = js.Any.fromFunction1(createStyleMap), createTimeSpan = js.Any.fromFunction1(createTimeSpan), createTimeStamp = js.Any.fromFunction1(createTimeStamp), createViewerOptions = js.Any.fromFunction1(createViewerOptions), getBalloon = js.Any.fromFunction0(getBalloon), getEarthVersion = js.Any.fromFunction0(getEarthVersion), getElementById = js.Any.fromFunction1(getElementById), getElementByUrl = js.Any.fromFunction1(getElementByUrl), getElementsByType = js.Any.fromFunction0(getElementsByType), getFeatures = js.Any.fromFunction0(getFeatures), getGlobe = js.Any.fromFunction0(getGlobe), getLayerRoot = js.Any.fromFunction0(getLayerRoot), getNavigationControl = js.Any.fromFunction0(getNavigationControl), getOptions = js.Any.fromFunction0(getOptions), getPhotoOverlayViewer = js.Any.fromFunction0(getPhotoOverlayViewer), getPluginVersion = js.Any.fromFunction0(getPluginVersion), getStreamingPercent = js.Any.fromFunction0(getStreamingPercent), getSun = js.Any.fromFunction0(getSun), getTime = js.Any.fromFunction0(getTime), getTourPlayer = js.Any.fromFunction0(getTourPlayer), getView = js.Any.fromFunction0(getView), getWindow = js.Any.fromFunction0(getWindow), parseKml = js.Any.fromFunction1(parseKml), setBalloon = js.Any.fromFunction1(setBalloon))
    __obj.asInstanceOf[GEPlugin]
  }
  
  extension [Self <: GEPlugin](x: Self) {
    
    inline def setALTITUDE_ABSOLUTE(value: KmlAltitudeModeEnum): Self = StObject.set(x, "ALTITUDE_ABSOLUTE", value.asInstanceOf[js.Any])
    
    inline def setALTITUDE_CLAMP_TO_GROUND(value: KmlAltitudeModeEnum): Self = StObject.set(x, "ALTITUDE_CLAMP_TO_GROUND", value.asInstanceOf[js.Any])
    
    inline def setALTITUDE_CLAMP_TO_SEA_FLOOR(value: KmlAltitudeModeEnum): Self = StObject.set(x, "ALTITUDE_CLAMP_TO_SEA_FLOOR", value.asInstanceOf[js.Any])
    
    inline def setALTITUDE_RELATIVE_TO_GROUND(value: KmlAltitudeModeEnum): Self = StObject.set(x, "ALTITUDE_RELATIVE_TO_GROUND", value.asInstanceOf[js.Any])
    
    inline def setALTITUDE_RELATIVE_TO_SEA_FLOOR(value: KmlAltitudeModeEnum): Self = StObject.set(x, "ALTITUDE_RELATIVE_TO_SEA_FLOOR", value.asInstanceOf[js.Any])
    
    inline def setCOLOR_INHERIT(value: KmlColorModeEnum): Self = StObject.set(x, "COLOR_INHERIT", value.asInstanceOf[js.Any])
    
    inline def setCOLOR_NORMAL(value: KmlColorModeEnum): Self = StObject.set(x, "COLOR_NORMAL", value.asInstanceOf[js.Any])
    
    inline def setCOLOR_RANDOM(value: KmlColorModeEnum): Self = StObject.set(x, "COLOR_RANDOM", value.asInstanceOf[js.Any])
    
    inline def setCreateCamera(value: String => KmlCamera): Self = StObject.set(x, "createCamera", js.Any.fromFunction1(value))
    
    inline def setCreateDocument(value: String => KmlDocument): Self = StObject.set(x, "createDocument", js.Any.fromFunction1(value))
    
    inline def setCreateFeatureBalloon(value: String => GEFeatureBalloon): Self = StObject.set(x, "createFeatureBalloon", js.Any.fromFunction1(value))
    
    inline def setCreateFolder(value: String => KmlFolder): Self = StObject.set(x, "createFolder", js.Any.fromFunction1(value))
    
    inline def setCreateGroundOverlay(value: String => KmlGroundOverlay): Self = StObject.set(x, "createGroundOverlay", js.Any.fromFunction1(value))
    
    inline def setCreateHtmlDivBalloon(value: String => GEHtmlDivBalloon): Self = StObject.set(x, "createHtmlDivBalloon", js.Any.fromFunction1(value))
    
    inline def setCreateHtmlStringBalloon(value: String => GEHtmlStringBalloon): Self = StObject.set(x, "createHtmlStringBalloon", js.Any.fromFunction1(value))
    
    inline def setCreateIcon(value: String => KmlIcon): Self = StObject.set(x, "createIcon", js.Any.fromFunction1(value))
    
    inline def setCreateLatLonAltBox(value: String => KmlLatLonAltBox): Self = StObject.set(x, "createLatLonAltBox", js.Any.fromFunction1(value))
    
    inline def setCreateLatLonBox(value: String => KmlLatLonBox): Self = StObject.set(x, "createLatLonBox", js.Any.fromFunction1(value))
    
    inline def setCreateLineString(value: String => KmlLineString): Self = StObject.set(x, "createLineString", js.Any.fromFunction1(value))
    
    inline def setCreateLinearRing(value: String => KmlLinearRing): Self = StObject.set(x, "createLinearRing", js.Any.fromFunction1(value))
    
    inline def setCreateLink(value: String => KmlLink): Self = StObject.set(x, "createLink", js.Any.fromFunction1(value))
    
    inline def setCreateLocation(value: String => KmlLocation): Self = StObject.set(x, "createLocation", js.Any.fromFunction1(value))
    
    inline def setCreateLod(value: String => KmlLod): Self = StObject.set(x, "createLod", js.Any.fromFunction1(value))
    
    inline def setCreateLookAt(value: String => KmlLookAt): Self = StObject.set(x, "createLookAt", js.Any.fromFunction1(value))
    
    inline def setCreateModel(value: String => KmlModel): Self = StObject.set(x, "createModel", js.Any.fromFunction1(value))
    
    inline def setCreateMultiGeometry(value: String => KmlMultiGeometry): Self = StObject.set(x, "createMultiGeometry", js.Any.fromFunction1(value))
    
    inline def setCreateNetworkLink(value: String => KmlNetworkLink): Self = StObject.set(x, "createNetworkLink", js.Any.fromFunction1(value))
    
    inline def setCreateOrientation(value: String => KmlOrientation): Self = StObject.set(x, "createOrientation", js.Any.fromFunction1(value))
    
    inline def setCreatePlacemark(value: String => KmlPlacemark): Self = StObject.set(x, "createPlacemark", js.Any.fromFunction1(value))
    
    inline def setCreatePoint(value: String => KmlPoint): Self = StObject.set(x, "createPoint", js.Any.fromFunction1(value))
    
    inline def setCreatePolygon(value: String => KmlPolygon): Self = StObject.set(x, "createPolygon", js.Any.fromFunction1(value))
    
    inline def setCreateRegion(value: String => KmlRegion): Self = StObject.set(x, "createRegion", js.Any.fromFunction1(value))
    
    inline def setCreateScale(value: String => KmlScale): Self = StObject.set(x, "createScale", js.Any.fromFunction1(value))
    
    inline def setCreateScreenOverlay(value: String => KmlScreenOverlay): Self = StObject.set(x, "createScreenOverlay", js.Any.fromFunction1(value))
    
    inline def setCreateStyle(value: String => KmlStyle): Self = StObject.set(x, "createStyle", js.Any.fromFunction1(value))
    
    inline def setCreateStyleMap(value: String => KmlStyleMap): Self = StObject.set(x, "createStyleMap", js.Any.fromFunction1(value))
    
    inline def setCreateTimeSpan(value: String => KmlTimeSpan): Self = StObject.set(x, "createTimeSpan", js.Any.fromFunction1(value))
    
    inline def setCreateTimeStamp(value: String => KmlTimeStamp): Self = StObject.set(x, "createTimeStamp", js.Any.fromFunction1(value))
    
    inline def setCreateViewerOptions(value: String => KmlViewerOptions): Self = StObject.set(x, "createViewerOptions", js.Any.fromFunction1(value))
    
    inline def setGetBalloon(value: () => GEAbstractBalloon): Self = StObject.set(x, "getBalloon", js.Any.fromFunction0(value))
    
    inline def setGetEarthVersion(value: () => String): Self = StObject.set(x, "getEarthVersion", js.Any.fromFunction0(value))
    
    inline def setGetElementById(value: String => KmlObject): Self = StObject.set(x, "getElementById", js.Any.fromFunction1(value))
    
    inline def setGetElementByUrl(value: String => KmlObject): Self = StObject.set(x, "getElementByUrl", js.Any.fromFunction1(value))
    
    inline def setGetElementsByType(value: () => KmlObjectList[KmlObject]): Self = StObject.set(x, "getElementsByType", js.Any.fromFunction0(value))
    
    inline def setGetFeatures(value: () => GEFeatureContainer): Self = StObject.set(x, "getFeatures", js.Any.fromFunction0(value))
    
    inline def setGetGlobe(value: () => GEGlobe): Self = StObject.set(x, "getGlobe", js.Any.fromFunction0(value))
    
    inline def setGetLayerRoot(value: () => KmlLayerRoot): Self = StObject.set(x, "getLayerRoot", js.Any.fromFunction0(value))
    
    inline def setGetNavigationControl(value: () => GENavigationControl): Self = StObject.set(x, "getNavigationControl", js.Any.fromFunction0(value))
    
    inline def setGetOptions(value: () => GEOptions): Self = StObject.set(x, "getOptions", js.Any.fromFunction0(value))
    
    inline def setGetPhotoOverlayViewer(value: () => GEPhotoOverlayViewer): Self = StObject.set(x, "getPhotoOverlayViewer", js.Any.fromFunction0(value))
    
    inline def setGetPluginVersion(value: () => String): Self = StObject.set(x, "getPluginVersion", js.Any.fromFunction0(value))
    
    inline def setGetStreamingPercent(value: () => Double): Self = StObject.set(x, "getStreamingPercent", js.Any.fromFunction0(value))
    
    inline def setGetSun(value: () => GESun): Self = StObject.set(x, "getSun", js.Any.fromFunction0(value))
    
    inline def setGetTime(value: () => GETime): Self = StObject.set(x, "getTime", js.Any.fromFunction0(value))
    
    inline def setGetTourPlayer(value: () => GETourPlayer): Self = StObject.set(x, "getTourPlayer", js.Any.fromFunction0(value))
    
    inline def setGetView(value: () => GEView): Self = StObject.set(x, "getView", js.Any.fromFunction0(value))
    
    inline def setGetWindow(value: () => GEWindow): Self = StObject.set(x, "getWindow", js.Any.fromFunction0(value))
    
    inline def setHIT_TEST_BUILDINGS(value: GEHitTestModeEnum): Self = StObject.set(x, "HIT_TEST_BUILDINGS", value.asInstanceOf[js.Any])
    
    inline def setHIT_TEST_GLOBE(value: GEHitTestModeEnum): Self = StObject.set(x, "HIT_TEST_GLOBE", value.asInstanceOf[js.Any])
    
    inline def setHIT_TEST_TERRAIN(value: GEHitTestModeEnum): Self = StObject.set(x, "HIT_TEST_TERRAIN", value.asInstanceOf[js.Any])
    
    inline def setLAYER_BORDERS(value: String): Self = StObject.set(x, "LAYER_BORDERS", value.asInstanceOf[js.Any])
    
    inline def setLAYER_BUILDINGS(value: String): Self = StObject.set(x, "LAYER_BUILDINGS", value.asInstanceOf[js.Any])
    
    inline def setLAYER_BUILDINGS_LOW_RESOLUTION(value: String): Self = StObject.set(x, "LAYER_BUILDINGS_LOW_RESOLUTION", value.asInstanceOf[js.Any])
    
    inline def setLAYER_ROADS(value: String): Self = StObject.set(x, "LAYER_ROADS", value.asInstanceOf[js.Any])
    
    inline def setLAYER_TERRAIN(value: String): Self = StObject.set(x, "LAYER_TERRAIN", value.asInstanceOf[js.Any])
    
    inline def setLAYER_TREES(value: String): Self = StObject.set(x, "LAYER_TREES", value.asInstanceOf[js.Any])
    
    inline def setLIST_ITEM_CHECK(value: KmlListItemTypeEnum): Self = StObject.set(x, "LIST_ITEM_CHECK", value.asInstanceOf[js.Any])
    
    inline def setLIST_ITEM_CHECK_HIDE_CHILDREN(value: KmlListItemTypeEnum): Self = StObject.set(x, "LIST_ITEM_CHECK_HIDE_CHILDREN", value.asInstanceOf[js.Any])
    
    inline def setLIST_ITEM_CHECK_OFF_ONLY(value: KmlListItemTypeEnum): Self = StObject.set(x, "LIST_ITEM_CHECK_OFF_ONLY", value.asInstanceOf[js.Any])
    
    inline def setLIST_ITEM_RADIO_FOLDER(value: KmlListItemTypeEnum): Self = StObject.set(x, "LIST_ITEM_RADIO_FOLDER", value.asInstanceOf[js.Any])
    
    inline def setMAP_TYPE_EARTH(value: GEMapTypeEnum): Self = StObject.set(x, "MAP_TYPE_EARTH", value.asInstanceOf[js.Any])
    
    inline def setMAP_TYPE_SKY(value: GEMapTypeEnum): Self = StObject.set(x, "MAP_TYPE_SKY", value.asInstanceOf[js.Any])
    
    inline def setNAVIGATION_CONTROL_LARGE(value: GENavigationControlEnum): Self = StObject.set(x, "NAVIGATION_CONTROL_LARGE", value.asInstanceOf[js.Any])
    
    inline def setNAVIGATION_CONTROL_SMALL(value: GENavigationControlEnum): Self = StObject.set(x, "NAVIGATION_CONTROL_SMALL", value.asInstanceOf[js.Any])
    
    inline def setOPTION_HISTORICAL_IMAGERY(value: GEViewerOptionsTypeEnum): Self = StObject.set(x, "OPTION_HISTORICAL_IMAGERY", value.asInstanceOf[js.Any])
    
    inline def setOPTION_STATE_DEFAULT(value: GEViewerOptionsValueEnum): Self = StObject.set(x, "OPTION_STATE_DEFAULT", value.asInstanceOf[js.Any])
    
    inline def setOPTION_STATE_DISABLED(value: GEViewerOptionsValueEnum): Self = StObject.set(x, "OPTION_STATE_DISABLED", value.asInstanceOf[js.Any])
    
    inline def setOPTION_STATE_ENABLED(value: GEViewerOptionsValueEnum): Self = StObject.set(x, "OPTION_STATE_ENABLED", value.asInstanceOf[js.Any])
    
    inline def setOPTION_STREET_VIEW(value: GEViewerOptionsTypeEnum): Self = StObject.set(x, "OPTION_STREET_VIEW", value.asInstanceOf[js.Any])
    
    inline def setOPTION_SUNLIGHT(value: GEViewerOptionsTypeEnum): Self = StObject.set(x, "OPTION_SUNLIGHT", value.asInstanceOf[js.Any])
    
    inline def setParseKml(value: String => KmlObject): Self = StObject.set(x, "parseKml", js.Any.fromFunction1(value))
    
    inline def setREFRESH_ON_CHANGE(value: KmlRefreshModeEnum): Self = StObject.set(x, "REFRESH_ON_CHANGE", value.asInstanceOf[js.Any])
    
    inline def setREFRESH_ON_EXPIRE(value: KmlRefreshModeEnum): Self = StObject.set(x, "REFRESH_ON_EXPIRE", value.asInstanceOf[js.Any])
    
    inline def setREFRESH_ON_INTERVAL(value: KmlRefreshModeEnum): Self = StObject.set(x, "REFRESH_ON_INTERVAL", value.asInstanceOf[js.Any])
    
    inline def setSPEED_TELEPORT(value: Double): Self = StObject.set(x, "SPEED_TELEPORT", value.asInstanceOf[js.Any])
    
    inline def setSetBalloon(value: GEAbstractBalloon => Unit): Self = StObject.set(x, "setBalloon", js.Any.fromFunction1(value))
    
    inline def setUNITS_FRACTION(value: KmlUnitsEnum): Self = StObject.set(x, "UNITS_FRACTION", value.asInstanceOf[js.Any])
    
    inline def setUNITS_INSET_PIXELS(value: KmlUnitsEnum): Self = StObject.set(x, "UNITS_INSET_PIXELS", value.asInstanceOf[js.Any])
    
    inline def setUNITS_PIXELS(value: KmlUnitsEnum): Self = StObject.set(x, "UNITS_PIXELS", value.asInstanceOf[js.Any])
    
    inline def setVIEW_REFRESH_NEVER(value: KmlViewRefreshModeEnum): Self = StObject.set(x, "VIEW_REFRESH_NEVER", value.asInstanceOf[js.Any])
    
    inline def setVIEW_REFRESH_ON_REGION(value: KmlViewRefreshModeEnum): Self = StObject.set(x, "VIEW_REFRESH_ON_REGION", value.asInstanceOf[js.Any])
    
    inline def setVIEW_REFRESH_ON_REQUEST(value: KmlViewRefreshModeEnum): Self = StObject.set(x, "VIEW_REFRESH_ON_REQUEST", value.asInstanceOf[js.Any])
    
    inline def setVIEW_REFRESH_ON_STOP(value: KmlViewRefreshModeEnum): Self = StObject.set(x, "VIEW_REFRESH_ON_STOP", value.asInstanceOf[js.Any])
    
    inline def setVISIBILITY_AUTO(value: GEVisibilityEnum): Self = StObject.set(x, "VISIBILITY_AUTO", value.asInstanceOf[js.Any])
    
    inline def setVISIBILITY_HIDE(value: GEVisibilityEnum): Self = StObject.set(x, "VISIBILITY_HIDE", value.asInstanceOf[js.Any])
    
    inline def setVISIBILITY_SHOW(value: GEVisibilityEnum): Self = StObject.set(x, "VISIBILITY_SHOW", value.asInstanceOf[js.Any])
  }
}
