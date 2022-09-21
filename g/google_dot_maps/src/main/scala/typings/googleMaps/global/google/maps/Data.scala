package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.Data.DataOptions
import typings.googleMaps.google.maps.Data.FeatureOptions
import typings.googleMaps.google.maps.Data.Geometry
import typings.googleMaps.google.maps.LatLngLiteral
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
@JSGlobal("google.maps.Data")
@js.native
/**
  * A layer for displaying geospatial data. Points, line-strings and polygons
  * can be displayed. <p> Every <code>Map</code> has a <code>Data</code>
  * object by default, so most of the time there is no need to construct one.
  * For example: <pre> var myMap = new google.maps.Map(...);<br>
  * myMap.data.addGeoJson(...);<br> myMap.data.setStyle(...); </pre> The
  * <code>Data</code> object is a collection of <a
  * href="#Data.Feature"><code>Features</code></a>.
  */
open class Data ()
  extends StObject
     with typings.googleMaps.google.maps.Data {
  def this(options: DataOptions) = this()
}
object Data {
  
  /**
    * A feature has a geometry, an id, and a set of properties.
    */
  @JSGlobal("google.maps.Data.Feature")
  @js.native
  /**
    * A feature has a geometry, an id, and a set of properties.
    */
  open class Feature ()
    extends StObject
       with typings.googleMaps.google.maps.Data.Feature {
    def this(options: FeatureOptions) = this()
  }
  
  /**
    * A GeometryCollection contains a number of geometry objects. Any
    * <code>LatLng</code> or <code>LatLngLiteral</code> objects are automatically
    * converted to <code>Data.Point</code> geometry objects.
    */
  @JSGlobal("google.maps.Data.GeometryCollection")
  @js.native
  open class GeometryCollection protected ()
    extends StObject
       with typings.googleMaps.google.maps.Data.GeometryCollection {
    /**
      * A GeometryCollection contains a number of geometry objects. Any
      * <code>LatLng</code> or <code>LatLngLiteral</code> objects are
      * automatically converted to <code>Data.Point</code> geometry objects.
      */
    def this(elements: js.Array[Geometry | typings.googleMaps.google.maps.LatLng | LatLngLiteral]) = this()
    
    /**
      * Repeatedly invokes the given function, passing a point from the geometry
      * to the function on each invocation.
      */
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* a */ typings.googleMaps.google.maps.LatLng, Unit]): Unit = js.native
    
    /**
      * Returns an array of the contained geometry objects. A new array is
      * returned each time <code>getArray()</code> is called.
      */
    /* CompleteClass */
    override def getArray(): js.Array[Geometry] = js.native
    
    /**
      * Returns the <code>n</code>-th contained geometry object.
      */
    /* CompleteClass */
    override def getAt(n: Double): Geometry = js.native
    
    /**
      * Returns the number of contained geometry objects.
      */
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /**
      * Returns the type of the geometry object. Possibilities are
      * <code>"Point"</code>, <code>"MultiPoint"</code>,
      * <code>"LineString"</code>, <code>"MultiLineString"</code>,
      * <code>"LinearRing"</code>, <code>"Polygon"</code>,
      * <code>"MultiPolygon"</code>, or <code>"GeometryCollection"</code>.
      */
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  /**
    * A LineString geometry contains a number of <code>LatLng</code>s.
    */
  @JSGlobal("google.maps.Data.LineString")
  @js.native
  open class LineString protected ()
    extends StObject
       with typings.googleMaps.google.maps.Data.LineString {
    /**
      * A LineString geometry contains a number of <code>LatLng</code>s.
      */
    def this(elements: js.Array[typings.googleMaps.google.maps.LatLng | LatLngLiteral]) = this()
    
    /**
      * Repeatedly invokes the given function, passing a point from the geometry
      * to the function on each invocation.
      */
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* a */ typings.googleMaps.google.maps.LatLng, Unit]): Unit = js.native
    
    /**
      * Returns an array of the contained <code>LatLngs</code>. A new array is
      * returned each time <code>getArray()</code> is called.
      */
    /* CompleteClass */
    override def getArray(): js.Array[typings.googleMaps.google.maps.LatLng] = js.native
    
    /**
      * Returns the <code>n</code>-th contained <code>LatLng</code>.
      */
    /* CompleteClass */
    override def getAt(n: Double): typings.googleMaps.google.maps.LatLng = js.native
    
    /**
      * Returns the number of contained <code>LatLng</code>s.
      */
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /**
      * Returns the type of the geometry object. Possibilities are
      * <code>"Point"</code>, <code>"MultiPoint"</code>,
      * <code>"LineString"</code>, <code>"MultiLineString"</code>,
      * <code>"LinearRing"</code>, <code>"Polygon"</code>,
      * <code>"MultiPolygon"</code>, or <code>"GeometryCollection"</code>.
      */
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  /**
    * A LinearRing geometry contains a number of <code>LatLng</code>s,
    * representing a closed LineString. There is no need to make the first
    * <code>LatLng</code> equal to the last <code>LatLng</code>. The LinearRing
    * is closed implicitly.
    */
  @JSGlobal("google.maps.Data.LinearRing")
  @js.native
  open class LinearRing protected ()
    extends StObject
       with typings.googleMaps.google.maps.Data.LinearRing {
    /**
      * A LinearRing geometry contains a number of <code>LatLng</code>s,
      * representing a closed LineString. There is no need to make the first
      * <code>LatLng</code> equal to the last <code>LatLng</code>. The LinearRing
      * is closed implicitly.
      */
    def this(elements: js.Array[typings.googleMaps.google.maps.LatLng | LatLngLiteral]) = this()
    
    /**
      * Repeatedly invokes the given function, passing a point from the geometry
      * to the function on each invocation.
      */
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* a */ typings.googleMaps.google.maps.LatLng, Unit]): Unit = js.native
    
    /**
      * Returns an array of the contained <code>LatLng</code>s. A new array is
      * returned each time <code>getArray()</code> is called.
      */
    /* CompleteClass */
    override def getArray(): js.Array[typings.googleMaps.google.maps.LatLng] = js.native
    
    /**
      * Returns the <code>n</code>-th contained <code>LatLng</code>.
      */
    /* CompleteClass */
    override def getAt(n: Double): typings.googleMaps.google.maps.LatLng = js.native
    
    /**
      * Returns the number of contained <code>LatLng</code>s.
      */
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /**
      * Returns the type of the geometry object. Possibilities are
      * <code>"Point"</code>, <code>"MultiPoint"</code>,
      * <code>"LineString"</code>, <code>"MultiLineString"</code>,
      * <code>"LinearRing"</code>, <code>"Polygon"</code>,
      * <code>"MultiPolygon"</code>, or <code>"GeometryCollection"</code>.
      */
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  /**
    * A MultiLineString geometry contains a number of <code>LineString</code>s.
    */
  @JSGlobal("google.maps.Data.MultiLineString")
  @js.native
  open class MultiLineString protected ()
    extends StObject
       with typings.googleMaps.google.maps.Data.MultiLineString {
    /**
      * A MultiLineString geometry contains a number of <code>LineString</code>s.
      */
    def this(elements: js.Array[
            typings.googleMaps.google.maps.Data.LineString | (js.Array[typings.googleMaps.google.maps.LatLng | LatLngLiteral])
          ]) = this()
    
    /**
      * Repeatedly invokes the given function, passing a point from the geometry
      * to the function on each invocation.
      */
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* a */ typings.googleMaps.google.maps.LatLng, Unit]): Unit = js.native
    
    /**
      * Returns an array of the contained <code>Data.LineString</code>s. A new
      * array is returned each time <code>getArray()</code> is called.
      */
    /* CompleteClass */
    override def getArray(): js.Array[typings.googleMaps.google.maps.Data.LineString] = js.native
    
    /**
      * Returns the <code>n</code>-th contained <code>Data.LineString</code>.
      */
    /* CompleteClass */
    override def getAt(n: Double): typings.googleMaps.google.maps.Data.LineString = js.native
    
    /**
      * Returns the number of contained <code>Data.LineString</code>s.
      */
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /**
      * Returns the type of the geometry object. Possibilities are
      * <code>"Point"</code>, <code>"MultiPoint"</code>,
      * <code>"LineString"</code>, <code>"MultiLineString"</code>,
      * <code>"LinearRing"</code>, <code>"Polygon"</code>,
      * <code>"MultiPolygon"</code>, or <code>"GeometryCollection"</code>.
      */
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  /**
    * A MultiPoint geometry contains a number of <code>LatLng</code>s.
    */
  @JSGlobal("google.maps.Data.MultiPoint")
  @js.native
  open class MultiPoint protected ()
    extends StObject
       with typings.googleMaps.google.maps.Data.MultiPoint {
    /**
      * A MultiPoint geometry contains a number of <code>LatLng</code>s.
      */
    def this(elements: js.Array[typings.googleMaps.google.maps.LatLng | LatLngLiteral]) = this()
    
    /**
      * Repeatedly invokes the given function, passing a point from the geometry
      * to the function on each invocation.
      */
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* a */ typings.googleMaps.google.maps.LatLng, Unit]): Unit = js.native
    
    /**
      * Returns an array of the contained <code>LatLng</code>s. A new array is
      * returned each time <code>getArray()</code> is called.
      */
    /* CompleteClass */
    override def getArray(): js.Array[typings.googleMaps.google.maps.LatLng] = js.native
    
    /**
      * Returns the <code>n</code>-th contained <code>LatLng</code>.
      */
    /* CompleteClass */
    override def getAt(n: Double): typings.googleMaps.google.maps.LatLng = js.native
    
    /**
      * Returns the number of contained <code>LatLng</code>s.
      */
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /**
      * Returns the type of the geometry object. Possibilities are
      * <code>"Point"</code>, <code>"MultiPoint"</code>,
      * <code>"LineString"</code>, <code>"MultiLineString"</code>,
      * <code>"LinearRing"</code>, <code>"Polygon"</code>,
      * <code>"MultiPolygon"</code>, or <code>"GeometryCollection"</code>.
      */
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  /**
    * A MultiPolygon geometry contains a number of <code>Data.Polygon</code>s.
    */
  @JSGlobal("google.maps.Data.MultiPolygon")
  @js.native
  open class MultiPolygon protected ()
    extends StObject
       with typings.googleMaps.google.maps.Data.MultiPolygon {
    /**
      * A MultiPolygon geometry contains a number of <code>Data.Polygon</code>s.
      */
    def this(elements: js.Array[
            typings.googleMaps.google.maps.Data.Polygon | (js.Array[
              typings.googleMaps.google.maps.Data.LinearRing | (js.Array[typings.googleMaps.google.maps.LatLng | LatLngLiteral])
            ])
          ]) = this()
    
    /**
      * Repeatedly invokes the given function, passing a point from the geometry
      * to the function on each invocation.
      */
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* a */ typings.googleMaps.google.maps.LatLng, Unit]): Unit = js.native
    
    /**
      * Returns an array of the contained <code>Data.Polygon</code>s. A new array
      * is returned each time <code>getArray()</code> is called.
      */
    /* CompleteClass */
    override def getArray(): js.Array[typings.googleMaps.google.maps.Data.Polygon] = js.native
    
    /**
      * Returns the <code>n</code>-th contained <code>Data.Polygon</code>.
      */
    /* CompleteClass */
    override def getAt(n: Double): typings.googleMaps.google.maps.Data.Polygon = js.native
    
    /**
      * Returns the number of contained <code>Data.Polygon</code>s.
      */
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /**
      * Returns the type of the geometry object. Possibilities are
      * <code>"Point"</code>, <code>"MultiPoint"</code>,
      * <code>"LineString"</code>, <code>"MultiLineString"</code>,
      * <code>"LinearRing"</code>, <code>"Polygon"</code>,
      * <code>"MultiPolygon"</code>, or <code>"GeometryCollection"</code>.
      */
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  /**
    * A Point geometry contains a single <code>LatLng</code>.
    */
  @JSGlobal("google.maps.Data.Point")
  @js.native
  open class Point protected ()
    extends StObject
       with typings.googleMaps.google.maps.Data.Point {
    /**
      * A Point geometry contains a single <code>LatLng</code>.
      */
    def this(latLng: typings.googleMaps.google.maps.LatLng) = this()
    def this(latLng: LatLngLiteral) = this()
    
    /**
      * Repeatedly invokes the given function, passing a point from the geometry
      * to the function on each invocation.
      */
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* a */ typings.googleMaps.google.maps.LatLng, Unit]): Unit = js.native
    
    /**
      * Returns the contained <code>LatLng</code>.
      */
    /* CompleteClass */
    override def get(): typings.googleMaps.google.maps.LatLng = js.native
    
    /**
      * Returns the type of the geometry object. Possibilities are
      * <code>"Point"</code>, <code>"MultiPoint"</code>,
      * <code>"LineString"</code>, <code>"MultiLineString"</code>,
      * <code>"LinearRing"</code>, <code>"Polygon"</code>,
      * <code>"MultiPolygon"</code>, or <code>"GeometryCollection"</code>.
      */
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  /**
    * A Polygon geometry contains a number of <code>Data.LinearRing</code>s. The
    * first linear-ring must be the polygon exterior boundary and subsequent
    * linear-rings must be interior boundaries, also known as holes. See the <a
    * href="https://developers.google.com/maps/documentation/javascript/examples/layer-data-polygon">sample
    * polygon with a hole</a>.
    */
  @JSGlobal("google.maps.Data.Polygon")
  @js.native
  open class Polygon protected ()
    extends StObject
       with typings.googleMaps.google.maps.Data.Polygon {
    /**
      * A Polygon geometry contains a number of <code>Data.LinearRing</code>s.
      * The first linear-ring must be the polygon exterior boundary and
      * subsequent linear-rings must be interior boundaries, also known as holes.
      * See the <a
      * href="https://developers.google.com/maps/documentation/javascript/examples/layer-data-polygon">sample
      * polygon with a hole</a>.
      */
    def this(elements: js.Array[
            typings.googleMaps.google.maps.Data.LinearRing | (js.Array[typings.googleMaps.google.maps.LatLng | LatLngLiteral])
          ]) = this()
    
    /**
      * Repeatedly invokes the given function, passing a point from the geometry
      * to the function on each invocation.
      */
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* a */ typings.googleMaps.google.maps.LatLng, Unit]): Unit = js.native
    
    /**
      * Returns an array of the contained <code>Data.LinearRing</code>s. A new
      * array is returned each time <code>getArray()</code> is called.
      */
    /* CompleteClass */
    override def getArray(): js.Array[typings.googleMaps.google.maps.Data.LinearRing] = js.native
    
    /**
      * Returns the <code>n</code>-th contained <code>Data.LinearRing</code>.
      */
    /* CompleteClass */
    override def getAt(n: Double): typings.googleMaps.google.maps.Data.LinearRing = js.native
    
    /**
      * Returns the number of contained <code>Data.LinearRing</code>s.
      */
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /**
      * Returns the type of the geometry object. Possibilities are
      * <code>"Point"</code>, <code>"MultiPoint"</code>,
      * <code>"LineString"</code>, <code>"MultiLineString"</code>,
      * <code>"LinearRing"</code>, <code>"Polygon"</code>,
      * <code>"MultiPolygon"</code>, or <code>"GeometryCollection"</code>.
      */
    /* CompleteClass */
    override def getType(): String = js.native
  }
}
