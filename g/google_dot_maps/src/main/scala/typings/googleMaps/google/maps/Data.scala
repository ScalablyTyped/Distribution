package typings.googleMaps.google.maps

import typings.googleMaps.google.maps.Data.FeatureOptions
import typings.googleMaps.google.maps.Data.GeoJsonOptions
import typings.googleMaps.google.maps.Data.StyleOptions
import typings.googleMaps.google.maps.Data.StylingFunction
import typings.std.Event
import typings.std.KeyboardEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A layer for displaying geospatial data. Points, line-strings and polygons
  * can be displayed. <p> Every <code>Map</code> has a <code>Data</code> object
  * by default, so most of the time there is no need to construct one. For
  * example: <pre> var myMap = new google.maps.Map(...);<br>
  * myMap.data.addGeoJson(...);<br> myMap.data.setStyle(...); </pre> The
  * <code>Data</code> object is a collection of <a
  * href="#Data.Feature"><code>Features</code></a>.
  */
@js.native
trait Data
  extends StObject
     with MVCObject {
  
  /**
    * Adds a feature to the collection, and returns the added feature. <p> If
    * the feature has an ID, it will replace any existing feature in the
    * collection with the same ID. If no feature is given, a new feature will
    * be created with null geometry and no properties. If
    * <code>FeatureOptions</code> are given, a new feature will be created with
    * the specified properties. <p> Note that the IDs <code>1234</code> and
    * <code>'1234'</code> are equivalent. Adding a feature with ID
    * <code>1234</code> will replace a feature with ID <code>'1234'</code>, and
    * vice versa.
    */
  def add(): typings.googleMaps.google.maps.Data.Feature = js.native
  def add(feature: typings.googleMaps.google.maps.Data.Feature): typings.googleMaps.google.maps.Data.Feature = js.native
  def add(feature: FeatureOptions): typings.googleMaps.google.maps.Data.Feature = js.native
  
  /**
    * Adds GeoJSON features to the collection. Give this method a parsed JSON.
    * The imported features are returned. Throws an exception if the GeoJSON
    * could not be imported.
    */
  def addGeoJson(geoJson: js.Object): js.Array[typings.googleMaps.google.maps.Data.Feature] = js.native
  def addGeoJson(geoJson: js.Object, options: GeoJsonOptions): js.Array[typings.googleMaps.google.maps.Data.Feature] = js.native
  
  /**
    * Checks whether the given feature is in the collection.
    */
  def contains(feature: typings.googleMaps.google.maps.Data.Feature): Boolean = js.native
  
  /**
    * Repeatedly invokes the given function, passing a feature in the
    * collection to the function on each invocation. The order of iteration
    * through the features is undefined.
    */
  def forEach(callback: js.Function1[/* a */ typings.googleMaps.google.maps.Data.Feature, Unit]): Unit = js.native
  
  /**
    * Returns the position of the drawing controls on the map.
    */
  def getControlPosition(): ControlPosition = js.native
  
  /**
    * Returns which drawing modes are available for the user to select, in the
    * order they are displayed. This does not include the <code>null</code>
    * drawing mode, which is added by default. Possible drawing modes are
    * <code>"Point"</code>, <code>"LineString"</code> or
    * <code>"Polygon"</code>.
    */
  def getControls(): js.Array[String] | Null = js.native
  
  /**
    * Returns the current drawing mode of the given Data layer. A drawing mode
    * of <code>null</code> means that the user can interact with the map as
    * normal, and clicks do not draw anything. Possible drawing modes are
    * <code>null</code>, <code>"Point"</code>, <code>"LineString"</code> or
    * <code>"Polygon"</code>.
    */
  def getDrawingMode(): String | Null = js.native
  
  def getFeatureById(id: String): js.UndefOr[typings.googleMaps.google.maps.Data.Feature] = js.native
  /**
    * Returns the feature with the given ID, if it exists in the collection.
    * Otherwise returns <code>undefined</code>. <p> Note that the IDs
    * <code>1234</code> and <code>'1234'</code> are equivalent. Either can be
    * used to look up the same feature.
    */
  def getFeatureById(id: Double): js.UndefOr[typings.googleMaps.google.maps.Data.Feature] = js.native
  
  /**
    * Returns the map on which the features are displayed.
    */
  def getMap(): Map | Null = js.native
  
  /**
    * Gets the style for all features in the collection.
    */
  def getStyle(): StylingFunction | StyleOptions | Null = js.native
  
  /**
    * Loads GeoJSON from a URL, and adds the features to the collection. <p>
    * NOTE: The GeoJSON is fetched using XHR, and may not work cross-domain. If
    * you have issues, we recommend you fetch the GeoJSON using your choice of
    * AJAX library, and then call <code>addGeoJson()</code>.
    */
  def loadGeoJson(url: String): Unit = js.native
  def loadGeoJson(
    url: String,
    options: Null,
    callback: js.Function1[/* a */ js.Array[typings.googleMaps.google.maps.Data.Feature], Unit]
  ): Unit = js.native
  def loadGeoJson(
    url: String,
    options: Unit,
    callback: js.Function1[/* a */ js.Array[typings.googleMaps.google.maps.Data.Feature], Unit]
  ): Unit = js.native
  def loadGeoJson(url: String, options: GeoJsonOptions): Unit = js.native
  def loadGeoJson(
    url: String,
    options: GeoJsonOptions,
    callback: js.Function1[/* a */ js.Array[typings.googleMaps.google.maps.Data.Feature], Unit]
  ): Unit = js.native
  
  /**
    * Changes the style of a feature. These changes are applied on top of the
    * style specified by <code>setStyle()</code>. Style properties set to
    * <code>null</code> revert to the value specified via
    * <code>setStyle()</code>.
    */
  def overrideStyle(feature: typings.googleMaps.google.maps.Data.Feature, style: StyleOptions): Unit = js.native
  
  /**
    * Removes a feature from the collection.
    */
  def remove(feature: typings.googleMaps.google.maps.Data.Feature): Unit = js.native
  
  /**
    * Removes the effect of previous <code>overrideStyle()</code> calls. The
    * style of the given feature reverts to the style specified by
    * <code>setStyle()</code>. <p>If no feature is given, all features have
    * their style reverted.</p>
    */
  def revertStyle(): Unit = js.native
  def revertStyle(feature: typings.googleMaps.google.maps.Data.Feature): Unit = js.native
  
  /**
    * Sets the position of the drawing controls on the map.
    */
  def setControlPosition(controlPosition: ControlPosition): Unit = js.native
  
  /**
    * Sets which drawing modes are available for the user to select, in the
    * order they are displayed. This should not include the <code>null</code>
    * drawing mode, which is added by default. If <code>null</code>, drawing
    * controls are disabled and not displayed. Possible drawing modes are
    * <code>"Point"</code>, <code>"LineString"</code> or
    * <code>"Polygon"</code>.
    */
  def setControls(): Unit = js.native
  def setControls(controls: js.Array[String]): Unit = js.native
  
  /**
    * Sets the current drawing mode of the given Data layer. A drawing mode of
    * <code>null</code> means that the user can interact with the map as
    * normal, and clicks do not draw anything. Possible drawing modes are
    * <code>null</code>, <code>"Point"</code>, <code>"LineString"</code> or
    * <code>"Polygon"</code>.
    */
  def setDrawingMode(): Unit = js.native
  def setDrawingMode(drawingMode: String): Unit = js.native
  
  /**
    * Renders the features on the specified map. If map is set to
    * <code>null</code>, the features will be removed from the map.
    */
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  /**
    * Sets the style for all features in the collection. Styles specified on a
    * per-feature basis via <code>overrideStyle()</code> continue to apply.
    * <p>Pass either an object with the desired style options, or a function
    * that computes the style for each feature. The function will be called
    * every time a feature&#39;s properties are updated.
    */
  def setStyle(): Unit = js.native
  def setStyle(style: StyleOptions): Unit = js.native
  def setStyle(style: StylingFunction): Unit = js.native
  
  /**
    * Exports the features in the collection to a GeoJSON object.
    */
  def toGeoJson(callback: js.Function1[/* a */ js.Object, Unit]): Unit = js.native
}
object Data {
  
  /**
    * The properties of a <code>addfeature</code> event.
    */
  trait AddFeatureEvent extends StObject {
    
    /**
      * The feature that was added to the <code>FeatureCollection</code>.
      */
    var feature: typings.googleMaps.google.maps.Data.Feature
  }
  object AddFeatureEvent {
    
    inline def apply(feature: typings.googleMaps.google.maps.Data.Feature): AddFeatureEvent = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddFeatureEvent]
    }
    
    extension [Self <: AddFeatureEvent](x: Self) {
      
      inline def setFeature(value: typings.googleMaps.google.maps.Data.Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * DataOptions object used to define the properties that a developer can set
    * on a <code>Data</code> object.
    */
  trait DataOptions extends StObject {
    
    /**
      * The position of the drawing controls on the map.
      * @defaultValue {@link google.maps.ControlPosition.TOP_LEFT}
      */
    var controlPosition: js.UndefOr[ControlPosition] = js.undefined
    
    /**
      * Describes which drawing modes are available for the user to select, in
      * the order they are displayed. This should not include the
      * <code>null</code> drawing mode, which is added by default. If
      * <code>null</code>, drawing controls are disabled and not displayed.
      * Possible drawing modes are <code>"Point"</code>,
      * <code>"LineString"</code> or <code>"Polygon"</code>.
      * @defaultValue <code>null</code>
      */
    var controls: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /**
      * The current drawing mode of the given Data layer. A drawing mode of
      * <code>null</code> means that the user can interact with the map as
      * normal, and clicks do not draw anything. Possible drawing modes are
      * <code>null</code>, <code>"Point"</code>, <code>"LineString"</code> or
      * <code>"Polygon"</code>.
      * @defaultValue <code>null</code>
      */
    var drawingMode: js.UndefOr[String | Null] = js.undefined
    
    /**
      * When drawing is enabled and a user draws a Geometry (a Point, Line String
      * or Polygon), this function is called with that Geometry and should return
      * a Feature that is to be added to the Data layer. If a featureFactory is
      * not supplied, a Feature with no id and no properties will be created from
      * that Geometry instead. Defaults to <code>null</code>.
      */
    var featureFactory: js.UndefOr[
        (js.Function1[/* a */ Geometry, typings.googleMaps.google.maps.Data.Feature]) | Null
      ] = js.undefined
    
    /**
      * Map on which to display the features in the collection.
      */
    var map: Map
    
    /**
      * Style for all features in the collection. For more details, see the
      * <code><a href='#Data'>setStyle()</a></code> method above.
      */
    var style: js.UndefOr[StylingFunction | StyleOptions] = js.undefined
  }
  object DataOptions {
    
    inline def apply(map: Map): DataOptions = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataOptions]
    }
    
    extension [Self <: DataOptions](x: Self) {
      
      inline def setControlPosition(value: ControlPosition): Self = StObject.set(x, "controlPosition", value.asInstanceOf[js.Any])
      
      inline def setControlPositionUndefined: Self = StObject.set(x, "controlPosition", js.undefined)
      
      inline def setControls(value: js.Array[String]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsNull: Self = StObject.set(x, "controls", null)
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setControlsVarargs(value: String*): Self = StObject.set(x, "controls", js.Array(value*))
      
      inline def setDrawingMode(value: String): Self = StObject.set(x, "drawingMode", value.asInstanceOf[js.Any])
      
      inline def setDrawingModeNull: Self = StObject.set(x, "drawingMode", null)
      
      inline def setDrawingModeUndefined: Self = StObject.set(x, "drawingMode", js.undefined)
      
      inline def setFeatureFactory(value: /* a */ Geometry => typings.googleMaps.google.maps.Data.Feature): Self = StObject.set(x, "featureFactory", js.Any.fromFunction1(value))
      
      inline def setFeatureFactoryNull: Self = StObject.set(x, "featureFactory", null)
      
      inline def setFeatureFactoryUndefined: Self = StObject.set(x, "featureFactory", js.undefined)
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: StylingFunction | StyleOptions): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleFunction1(value: /* a */ typings.googleMaps.google.maps.Data.Feature => StyleOptions): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /**
    * A feature has a geometry, an id, and a set of properties.
    */
  @js.native
  trait Feature extends StObject {
    
    /**
      * Repeatedly invokes the given function, passing a property value and name
      * on each invocation. The order of iteration through the properties is
      * undefined.
      */
    def forEachProperty(callback: js.Function2[/* a */ Any, /* b */ String, Unit]): Unit = js.native
    
    /**
      * Returns the feature&#39;s geometry.
      */
    def getGeometry(): Geometry | Null = js.native
    
    /**
      * Returns the feature ID.
      */
    def getId(): js.UndefOr[Double | String] = js.native
    
    /**
      * Returns the value of the requested property, or <code>undefined</code> if
      * the property does not exist.
      */
    def getProperty(name: String): Any = js.native
    
    /**
      * Removes the property with the given name.
      */
    def removeProperty(name: String): Unit = js.native
    
    /**
      * Sets the feature&#39;s geometry.
      */
    def setGeometry(): Unit = js.native
    def setGeometry(newGeometry: Geometry): Unit = js.native
    def setGeometry(newGeometry: LatLng): Unit = js.native
    def setGeometry(newGeometry: LatLngLiteral): Unit = js.native
    
    /**
      * Sets the value of the specified property. If <code>newValue</code> is
      * <code>undefined</code> this is equivalent to calling
      * <code>removeProperty</code>.
      */
    def setProperty(name: String, newValue: Any): Unit = js.native
    
    /**
      * Exports the feature to a GeoJSON object.
      */
    def toGeoJson(callback: js.Function1[/* a */ js.Object, Unit]): Unit = js.native
  }
  
  /**
    * Optional parameters for creating <code>Data.Feature</code> objects.
    */
  trait FeatureOptions extends StObject {
    
    /**
      * The feature geometry. If none is specified when a feature is constructed,
      * the feature&#39;s geometry will be <code>null</code>. If a
      * <code>LatLng</code> object or <code>LatLngLiteral</code> is given, this
      * will be converted to a <code>Data.Point</code> geometry.
      */
    var geometry: js.UndefOr[Geometry | Null | LatLng | LatLngLiteral] = js.undefined
    
    /**
      * Feature ID is optional. If provided, it can be used to look up the
      * feature in a <code>Data</code> object using the
      * <code>getFeatureById()</code> method. Note that a feature&#39;s ID cannot
      * be subsequently changed.
      */
    var id: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The feature properties. This is an arbitrary mapping of property names to
      * values.
      */
    var properties: js.UndefOr[js.Object | Null] = js.undefined
  }
  object FeatureOptions {
    
    inline def apply(): FeatureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeatureOptions]
    }
    
    extension [Self <: FeatureOptions](x: Self) {
      
      inline def setGeometry(value: Geometry | LatLng | LatLngLiteral): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setGeometryNull: Self = StObject.set(x, "geometry", null)
      
      inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    }
  }
  
  /**
    * Optional parameters for importing GeoJSON.
    */
  trait GeoJsonOptions extends StObject {
    
    /**
      * The name of the Feature property to use as the feature ID. If not
      * specified, the GeoJSON Feature id will be used.
      */
    var idPropertyName: js.UndefOr[String | Null] = js.undefined
  }
  object GeoJsonOptions {
    
    inline def apply(): GeoJsonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeoJsonOptions]
    }
    
    extension [Self <: GeoJsonOptions](x: Self) {
      
      inline def setIdPropertyName(value: String): Self = StObject.set(x, "idPropertyName", value.asInstanceOf[js.Any])
      
      inline def setIdPropertyNameNull: Self = StObject.set(x, "idPropertyName", null)
      
      inline def setIdPropertyNameUndefined: Self = StObject.set(x, "idPropertyName", js.undefined)
    }
  }
  
  /**
    * A superclass for the various geometry objects.
    */
  trait Geometry extends StObject {
    
    /**
      * Repeatedly invokes the given function, passing a point from the geometry
      * to the function on each invocation.
      */
    def forEachLatLng(callback: js.Function1[/* a */ LatLng, Unit]): Unit
    
    /**
      * Returns the type of the geometry object. Possibilities are
      * <code>"Point"</code>, <code>"MultiPoint"</code>,
      * <code>"LineString"</code>, <code>"MultiLineString"</code>,
      * <code>"LinearRing"</code>, <code>"Polygon"</code>,
      * <code>"MultiPolygon"</code>, or <code>"GeometryCollection"</code>.
      */
    def getType(): String
  }
  object Geometry {
    
    inline def apply(forEachLatLng: js.Function1[/* a */ LatLng, Unit] => Unit, getType: () => String): Geometry = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[Geometry]
    }
    
    extension [Self <: Geometry](x: Self) {
      
      inline def setForEachLatLng(value: js.Function1[/* a */ LatLng, Unit] => Unit): Self = StObject.set(x, "forEachLatLng", js.Any.fromFunction1(value))
      
      inline def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A GeometryCollection contains a number of geometry objects. Any
    * <code>LatLng</code> or <code>LatLngLiteral</code> objects are automatically
    * converted to <code>Data.Point</code> geometry objects.
    */
  trait GeometryCollection
    extends StObject
       with Geometry {
    
    /**
      * Returns an array of the contained geometry objects. A new array is
      * returned each time <code>getArray()</code> is called.
      */
    def getArray(): js.Array[Geometry]
    
    /**
      * Returns the <code>n</code>-th contained geometry object.
      */
    def getAt(n: Double): Geometry
    
    /**
      * Returns the number of contained geometry objects.
      */
    def getLength(): Double
  }
  object GeometryCollection {
    
    inline def apply(
      forEachLatLng: js.Function1[/* a */ LatLng, Unit] => Unit,
      getArray: () => js.Array[Geometry],
      getAt: Double => Geometry,
      getLength: () => Double,
      getType: () => String
    ): GeometryCollection = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[GeometryCollection]
    }
    
    extension [Self <: GeometryCollection](x: Self) {
      
      inline def setGetArray(value: () => js.Array[Geometry]): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      inline def setGetAt(value: Double => Geometry): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A LineString geometry contains a number of <code>LatLng</code>s.
    */
  trait LineString
    extends StObject
       with Geometry {
    
    /**
      * Returns an array of the contained <code>LatLngs</code>. A new array is
      * returned each time <code>getArray()</code> is called.
      */
    def getArray(): js.Array[LatLng]
    
    /**
      * Returns the <code>n</code>-th contained <code>LatLng</code>.
      */
    def getAt(n: Double): LatLng
    
    /**
      * Returns the number of contained <code>LatLng</code>s.
      */
    def getLength(): Double
  }
  object LineString {
    
    inline def apply(
      forEachLatLng: js.Function1[/* a */ LatLng, Unit] => Unit,
      getArray: () => js.Array[LatLng],
      getAt: Double => LatLng,
      getLength: () => Double,
      getType: () => String
    ): LineString = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[LineString]
    }
    
    extension [Self <: LineString](x: Self) {
      
      inline def setGetArray(value: () => js.Array[LatLng]): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      inline def setGetAt(value: Double => LatLng): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A LinearRing geometry contains a number of <code>LatLng</code>s,
    * representing a closed LineString. There is no need to make the first
    * <code>LatLng</code> equal to the last <code>LatLng</code>. The LinearRing
    * is closed implicitly.
    */
  trait LinearRing
    extends StObject
       with Geometry {
    
    /**
      * Returns an array of the contained <code>LatLng</code>s. A new array is
      * returned each time <code>getArray()</code> is called.
      */
    def getArray(): js.Array[LatLng]
    
    /**
      * Returns the <code>n</code>-th contained <code>LatLng</code>.
      */
    def getAt(n: Double): LatLng
    
    /**
      * Returns the number of contained <code>LatLng</code>s.
      */
    def getLength(): Double
  }
  object LinearRing {
    
    inline def apply(
      forEachLatLng: js.Function1[/* a */ LatLng, Unit] => Unit,
      getArray: () => js.Array[LatLng],
      getAt: Double => LatLng,
      getLength: () => Double,
      getType: () => String
    ): LinearRing = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[LinearRing]
    }
    
    extension [Self <: LinearRing](x: Self) {
      
      inline def setGetArray(value: () => js.Array[LatLng]): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      inline def setGetAt(value: Double => LatLng): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * This object is passed to mouse event handlers on a <code>Data</code>
    * object.
    */
  trait MouseEvent
    extends StObject
       with MapMouseEvent {
    
    /**
      * The feature which generated the mouse event.
      */
    var feature: typings.googleMaps.google.maps.Data.Feature
  }
  object MouseEvent {
    
    inline def apply(
      domEvent: typings.std.MouseEvent | TouchEvent | PointerEvent | KeyboardEvent | Event,
      feature: typings.googleMaps.google.maps.Data.Feature,
      stop: () => Unit
    ): MouseEvent = {
      val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), latLng = null)
      __obj.asInstanceOf[MouseEvent]
    }
    
    extension [Self <: MouseEvent](x: Self) {
      
      inline def setFeature(value: typings.googleMaps.google.maps.Data.Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A MultiLineString geometry contains a number of <code>LineString</code>s.
    */
  trait MultiLineString
    extends StObject
       with Geometry {
    
    /**
      * Returns an array of the contained <code>Data.LineString</code>s. A new
      * array is returned each time <code>getArray()</code> is called.
      */
    def getArray(): js.Array[LineString]
    
    /**
      * Returns the <code>n</code>-th contained <code>Data.LineString</code>.
      */
    def getAt(n: Double): LineString
    
    /**
      * Returns the number of contained <code>Data.LineString</code>s.
      */
    def getLength(): Double
  }
  object MultiLineString {
    
    inline def apply(
      forEachLatLng: js.Function1[/* a */ LatLng, Unit] => Unit,
      getArray: () => js.Array[LineString],
      getAt: Double => LineString,
      getLength: () => Double,
      getType: () => String
    ): MultiLineString = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[MultiLineString]
    }
    
    extension [Self <: MultiLineString](x: Self) {
      
      inline def setGetArray(value: () => js.Array[LineString]): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      inline def setGetAt(value: Double => LineString): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A MultiPoint geometry contains a number of <code>LatLng</code>s.
    */
  trait MultiPoint
    extends StObject
       with Geometry {
    
    /**
      * Returns an array of the contained <code>LatLng</code>s. A new array is
      * returned each time <code>getArray()</code> is called.
      */
    def getArray(): js.Array[LatLng]
    
    /**
      * Returns the <code>n</code>-th contained <code>LatLng</code>.
      */
    def getAt(n: Double): LatLng
    
    /**
      * Returns the number of contained <code>LatLng</code>s.
      */
    def getLength(): Double
  }
  object MultiPoint {
    
    inline def apply(
      forEachLatLng: js.Function1[/* a */ LatLng, Unit] => Unit,
      getArray: () => js.Array[LatLng],
      getAt: Double => LatLng,
      getLength: () => Double,
      getType: () => String
    ): MultiPoint = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[MultiPoint]
    }
    
    extension [Self <: MultiPoint](x: Self) {
      
      inline def setGetArray(value: () => js.Array[LatLng]): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      inline def setGetAt(value: Double => LatLng): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A MultiPolygon geometry contains a number of <code>Data.Polygon</code>s.
    */
  trait MultiPolygon
    extends StObject
       with Geometry {
    
    /**
      * Returns an array of the contained <code>Data.Polygon</code>s. A new array
      * is returned each time <code>getArray()</code> is called.
      */
    def getArray(): js.Array[typings.googleMaps.google.maps.Data.Polygon]
    
    /**
      * Returns the <code>n</code>-th contained <code>Data.Polygon</code>.
      */
    def getAt(n: Double): typings.googleMaps.google.maps.Data.Polygon
    
    /**
      * Returns the number of contained <code>Data.Polygon</code>s.
      */
    def getLength(): Double
  }
  object MultiPolygon {
    
    inline def apply(
      forEachLatLng: js.Function1[/* a */ LatLng, Unit] => Unit,
      getArray: () => js.Array[typings.googleMaps.google.maps.Data.Polygon],
      getAt: Double => typings.googleMaps.google.maps.Data.Polygon,
      getLength: () => Double,
      getType: () => String
    ): MultiPolygon = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[MultiPolygon]
    }
    
    extension [Self <: MultiPolygon](x: Self) {
      
      inline def setGetArray(value: () => js.Array[typings.googleMaps.google.maps.Data.Polygon]): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      inline def setGetAt(value: Double => typings.googleMaps.google.maps.Data.Polygon): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A Point geometry contains a single <code>LatLng</code>.
    */
  trait Point
    extends StObject
       with Geometry {
    
    /**
      * Returns the contained <code>LatLng</code>.
      */
    def get(): LatLng
  }
  object Point {
    
    inline def apply(
      forEachLatLng: js.Function1[/* a */ LatLng, Unit] => Unit,
      get: () => LatLng,
      getType: () => String
    ): typings.googleMaps.google.maps.Data.Point = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), get = js.Any.fromFunction0(get), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[typings.googleMaps.google.maps.Data.Point]
    }
    
    extension [Self <: typings.googleMaps.google.maps.Data.Point](x: Self) {
      
      inline def setGet(value: () => LatLng): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A Polygon geometry contains a number of <code>Data.LinearRing</code>s. The
    * first linear-ring must be the polygon exterior boundary and subsequent
    * linear-rings must be interior boundaries, also known as holes. See the <a
    * href="https://developers.google.com/maps/documentation/javascript/examples/layer-data-polygon">sample
    * polygon with a hole</a>.
    */
  trait Polygon
    extends StObject
       with Geometry {
    
    /**
      * Returns an array of the contained <code>Data.LinearRing</code>s. A new
      * array is returned each time <code>getArray()</code> is called.
      */
    def getArray(): js.Array[LinearRing]
    
    /**
      * Returns the <code>n</code>-th contained <code>Data.LinearRing</code>.
      */
    def getAt(n: Double): LinearRing
    
    /**
      * Returns the number of contained <code>Data.LinearRing</code>s.
      */
    def getLength(): Double
  }
  object Polygon {
    
    inline def apply(
      forEachLatLng: js.Function1[/* a */ LatLng, Unit] => Unit,
      getArray: () => js.Array[LinearRing],
      getAt: Double => LinearRing,
      getLength: () => Double,
      getType: () => String
    ): typings.googleMaps.google.maps.Data.Polygon = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[typings.googleMaps.google.maps.Data.Polygon]
    }
    
    extension [Self <: typings.googleMaps.google.maps.Data.Polygon](x: Self) {
      
      inline def setGetArray(value: () => js.Array[LinearRing]): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      inline def setGetAt(value: Double => LinearRing): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * The properties of a <code>removefeature</code> event.
    */
  trait RemoveFeatureEvent extends StObject {
    
    /**
      * The feature that was removed from the <code>FeatureCollection</code>.
      */
    var feature: typings.googleMaps.google.maps.Data.Feature
  }
  object RemoveFeatureEvent {
    
    inline def apply(feature: typings.googleMaps.google.maps.Data.Feature): RemoveFeatureEvent = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveFeatureEvent]
    }
    
    extension [Self <: RemoveFeatureEvent](x: Self) {
      
      inline def setFeature(value: typings.googleMaps.google.maps.Data.Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The properties of a <code>removeproperty</code> event.
    */
  trait RemovePropertyEvent extends StObject {
    
    /**
      * The feature whose property was removed.
      */
    var feature: typings.googleMaps.google.maps.Data.Feature
    
    /**
      * The property name.
      */
    var name: String
    
    /**
      * The previous value.
      */
    var oldValue: Any
  }
  object RemovePropertyEvent {
    
    inline def apply(feature: typings.googleMaps.google.maps.Data.Feature, name: String, oldValue: Any): RemovePropertyEvent = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemovePropertyEvent]
    }
    
    extension [Self <: RemovePropertyEvent](x: Self) {
      
      inline def setFeature(value: typings.googleMaps.google.maps.Data.Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The properties of a <code>setgeometry</code> event.
    */
  trait SetGeometryEvent extends StObject {
    
    /**
      * The feature whose geometry was set.
      */
    var feature: typings.googleMaps.google.maps.Data.Feature
    
    /**
      * The new feature geometry.
      */
    var newGeometry: js.UndefOr[Geometry] = js.undefined
    
    /**
      * The previous feature geometry.
      */
    var oldGeometry: js.UndefOr[Geometry] = js.undefined
  }
  object SetGeometryEvent {
    
    inline def apply(feature: typings.googleMaps.google.maps.Data.Feature): SetGeometryEvent = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetGeometryEvent]
    }
    
    extension [Self <: SetGeometryEvent](x: Self) {
      
      inline def setFeature(value: typings.googleMaps.google.maps.Data.Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setNewGeometry(value: Geometry): Self = StObject.set(x, "newGeometry", value.asInstanceOf[js.Any])
      
      inline def setNewGeometryUndefined: Self = StObject.set(x, "newGeometry", js.undefined)
      
      inline def setOldGeometry(value: Geometry): Self = StObject.set(x, "oldGeometry", value.asInstanceOf[js.Any])
      
      inline def setOldGeometryUndefined: Self = StObject.set(x, "oldGeometry", js.undefined)
    }
  }
  
  /**
    * The properties of a <code>setproperty</code> event.
    */
  trait SetPropertyEvent extends StObject {
    
    /**
      * The feature whose property was set.
      */
    var feature: typings.googleMaps.google.maps.Data.Feature
    
    /**
      * The property name.
      */
    var name: String
    
    /**
      * The new value.
      */
    var newValue: Any
    
    /**
      * The previous value. Will be <code>undefined</code> if the property was
      * added.
      */
    var oldValue: Any
  }
  object SetPropertyEvent {
    
    inline def apply(feature: typings.googleMaps.google.maps.Data.Feature, name: String, newValue: Any, oldValue: Any): SetPropertyEvent = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetPropertyEvent]
    }
    
    extension [Self <: SetPropertyEvent](x: Self) {
      
      inline def setFeature(value: typings.googleMaps.google.maps.Data.Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * These options specify the way a Feature should appear when displayed on a
    * map.
    */
  trait StyleOptions extends StObject {
    
    /**
      * The animation to play when marker is added to a map. Only applies to
      * point geometries.
      */
    var animation: js.UndefOr[Animation] = js.undefined
    
    /**
      * If <code>true</code>, the marker receives mouse and touch events.
      * @defaultValue <code>true</code>
      */
    var clickable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Mouse cursor to show on hover. Only applies to point geometries.
      */
    var cursor: js.UndefOr[String] = js.undefined
    
    /**
      * If <code>true</code>, the object can be dragged across the map and the
      * underlying feature will have its geometry updated.
      * @defaultValue <code>false</code>
      */
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If <code>true</code>, the object can be edited by dragging control points
      * and the underlying feature will have its geometry updated. Only applies
      * to LineString and Polygon geometries.
      * @defaultValue <code>false</code>
      */
    var editable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The fill color. All CSS3 colors are supported except for extended named
      * colors. Only applies to polygon geometries.
      */
    var fillColor: js.UndefOr[String] = js.undefined
    
    /**
      * The fill opacity between 0.0 and 1.0. Only applies to polygon geometries.
      */
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    /**
      * Icon for the foreground. If a string is provided, it is treated as though
      * it were an <code>Icon</code> with the string as <code>url</code>. Only
      * applies to point geometries.
      */
    var icon: js.UndefOr[String | Icon | Symbol] = js.undefined
    
    /**
      * The icons to be rendered along a polyline. Only applies to line
      * geometries.
      */
    var icons: js.UndefOr[js.Array[IconSequence]] = js.undefined
    
    /**
      * Adds a label to the marker. The label can either be a string, or a
      * <code>MarkerLabel</code> object. Only applies to point geometries.
      */
    var label: js.UndefOr[String | MarkerLabel] = js.undefined
    
    /**
      * The marker&#39;s opacity between 0.0 and 1.0. Only applies to point
      * geometries.
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines the image map used for hit detection. Only applies to point
      * geometries.
      */
    var shape: js.UndefOr[MarkerShape] = js.undefined
    
    /**
      * The stroke color. All CSS3 colors are supported except for extended named
      * colors. Only applies to line and polygon geometries.
      */
    var strokeColor: js.UndefOr[String] = js.undefined
    
    /**
      * The stroke opacity between 0.0 and 1.0. Only applies to line and polygon
      * geometries.
      */
    var strokeOpacity: js.UndefOr[Double] = js.undefined
    
    /**
      * The stroke width in pixels. Only applies to line and polygon geometries.
      */
    var strokeWeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Rollover text. Only applies to point geometries.
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the feature is visible.
      * @defaultValue <code>true</code>
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * All features are displayed on the map in order of their zIndex, with
      * higher values displaying in front of features with lower values. Markers
      * are always displayed in front of line-strings and polygons.
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object StyleOptions {
    
    inline def apply(): StyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleOptions]
    }
    
    extension [Self <: StyleOptions](x: Self) {
      
      inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setIcon(value: String | Icon | Symbol): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIcons(value: js.Array[IconSequence]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setIconsVarargs(value: IconSequence*): Self = StObject.set(x, "icons", js.Array(value*))
      
      inline def setLabel(value: String | MarkerLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setShape(value: MarkerShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
      
      inline def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type StylingFunction = js.Function1[/* a */ typings.googleMaps.google.maps.Data.Feature, StyleOptions]
}
