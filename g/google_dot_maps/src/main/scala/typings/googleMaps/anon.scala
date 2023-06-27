package typings.googleMaps

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.googleMaps.google.maps.Circle
import typings.googleMaps.google.maps.CircleLiteral
import typings.googleMaps.google.maps.Data.Feature
import typings.googleMaps.google.maps.Data.FeatureOptions
import typings.googleMaps.google.maps.Data.Geometry
import typings.googleMaps.google.maps.Data.GeometryCollection
import typings.googleMaps.google.maps.Data.LineString
import typings.googleMaps.google.maps.Data.LinearRing
import typings.googleMaps.google.maps.Data.MultiLineString
import typings.googleMaps.google.maps.Data.MultiPoint
import typings.googleMaps.google.maps.Data.MultiPolygon
import typings.googleMaps.google.maps.Data.Point
import typings.googleMaps.google.maps.Data.Polygon
import typings.googleMaps.google.maps.LatLng
import typings.googleMaps.google.maps.LatLngBounds
import typings.googleMaps.google.maps.LatLngBoundsLiteral
import typings.googleMaps.google.maps.LatLngLiteral
import typings.googleMaps.google.maps.MVCArray
import typings.googleMaps.google.maps.Map
import typings.googleMaps.google.maps.MapOptions
import typings.googleMaps.google.maps.MapsEventListener
import typings.googleMaps.google.maps.MarkerOptions
import typings.googleMaps.google.maps.Marker_
import typings.googleMaps.google.maps.OverlayView
import typings.googleMaps.google.maps.Polyline
import typings.googleMaps.google.maps.Settings
import typings.googleMaps.google.maps.event
import typings.googleMaps.google.maps.localContext.PlaceChooserLayoutMode
import typings.googleMaps.google.maps.localContext.PlaceChooserPosition
import typings.googleMaps.google.maps.localContext.PlaceDetailsLayoutMode
import typings.googleMaps.google.maps.localContext.PlaceDetailsPosition
import typings.googleMaps.google.maps.places.FindPlaceFromPhoneNumberRequest
import typings.googleMaps.google.maps.places.FindPlaceFromQueryRequest
import typings.googleMaps.google.maps.places.PlaceOptions
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DefaultLayoutMode extends StObject {
    
    var defaultLayoutMode: PlaceChooserLayoutMode
    
    var defaultPosition: PlaceChooserPosition | Null
  }
  object DefaultLayoutMode {
    
    inline def apply(defaultLayoutMode: PlaceChooserLayoutMode): DefaultLayoutMode = {
      val __obj = js.Dynamic.literal(defaultLayoutMode = defaultLayoutMode.asInstanceOf[js.Any], defaultPosition = null)
      __obj.asInstanceOf[DefaultLayoutMode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultLayoutMode] (val x: Self) extends AnyVal {
      
      inline def setDefaultLayoutMode(value: PlaceChooserLayoutMode): Self = StObject.set(x, "defaultLayoutMode", value.asInstanceOf[js.Any])
      
      inline def setDefaultPosition(value: PlaceChooserPosition): Self = StObject.set(x, "defaultPosition", value.asInstanceOf[js.Any])
      
      inline def setDefaultPositionNull: Self = StObject.set(x, "defaultPosition", null)
    }
  }
  
  trait DefaultPosition extends StObject {
    
    var defaultLayoutMode: PlaceDetailsLayoutMode
    
    var defaultPosition: PlaceDetailsPosition | Null
  }
  object DefaultPosition {
    
    inline def apply(defaultLayoutMode: PlaceDetailsLayoutMode): DefaultPosition = {
      val __obj = js.Dynamic.literal(defaultLayoutMode = defaultLayoutMode.asInstanceOf[js.Any], defaultPosition = null)
      __obj.asInstanceOf[DefaultPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultPosition] (val x: Self) extends AnyVal {
      
      inline def setDefaultLayoutMode(value: PlaceDetailsLayoutMode): Self = StObject.set(x, "defaultLayoutMode", value.asInstanceOf[js.Any])
      
      inline def setDefaultPosition(value: PlaceDetailsPosition): Self = StObject.set(x, "defaultPosition", value.asInstanceOf[js.Any])
      
      inline def setDefaultPositionNull: Self = StObject.set(x, "defaultPosition", null)
    }
  }
  
  trait IsHighlighted extends StObject {
    
    var isHighlighted: Boolean
    
    var isSelected: Boolean
  }
  object IsHighlighted {
    
    inline def apply(isHighlighted: Boolean, isSelected: Boolean): IsHighlighted = {
      val __obj = js.Dynamic.literal(isHighlighted = isHighlighted.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsHighlighted]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsHighlighted] (val x: Self) extends AnyVal {
      
      inline def setIsHighlighted(value: Boolean): Self = StObject.set(x, "isHighlighted", value.asInstanceOf[js.Any])
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    }
  }
  
  trait Place extends StObject {
    
    var place: typings.googleMaps.google.maps.places.Place
  }
  object Place {
    
    inline def apply(place: typings.googleMaps.google.maps.places.Place): Place = {
      val __obj = js.Dynamic.literal(place = place.asInstanceOf[js.Any])
      __obj.asInstanceOf[Place]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Place] (val x: Self) extends AnyVal {
      
      inline def setPlace(value: typings.googleMaps.google.maps.places.Place): Self = StObject.set(x, "place", value.asInstanceOf[js.Any])
    }
  }
  
  trait Places extends StObject {
    
    var places: js.Array[typings.googleMaps.google.maps.places.Place]
  }
  object Places {
    
    inline def apply(places: js.Array[typings.googleMaps.google.maps.places.Place]): Places = {
      val __obj = js.Dynamic.literal(places = places.asInstanceOf[js.Any])
      __obj.asInstanceOf[Places]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Places] (val x: Self) extends AnyVal {
      
      inline def setPlaces(value: js.Array[typings.googleMaps.google.maps.places.Place]): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
      
      inline def setPlacesVarargs(value: typings.googleMaps.google.maps.places.Place*): Self = StObject.set(x, "places", js.Array(value*))
    }
  }
  
  trait TypeofData extends StObject {
    
    var Feature: Instantiable1[
        /* options */ js.UndefOr[FeatureOptions | Null], 
        typings.googleMaps.google.maps.Data.Feature
      ]
    
    var GeometryCollection: Instantiable1[
        /* elements */ js.Array[Geometry | LatLng | LatLngLiteral], 
        typings.googleMaps.google.maps.Data.GeometryCollection
      ]
    
    var LineString: Instantiable1[
        /* elements */ js.Array[LatLng | LatLngLiteral], 
        typings.googleMaps.google.maps.Data.LineString
      ]
    
    var LinearRing: Instantiable1[
        /* elements */ js.Array[LatLng | LatLngLiteral], 
        typings.googleMaps.google.maps.Data.LinearRing
      ]
    
    var MultiLineString: Instantiable1[
        /* elements */ js.Array[LineString | (js.Array[LatLng | LatLngLiteral])], 
        typings.googleMaps.google.maps.Data.MultiLineString
      ]
    
    var MultiPoint: Instantiable1[
        /* elements */ js.Array[LatLng | LatLngLiteral], 
        typings.googleMaps.google.maps.Data.MultiPoint
      ]
    
    var MultiPolygon: Instantiable1[
        /* elements */ js.Array[Polygon | (js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])])], 
        typings.googleMaps.google.maps.Data.MultiPolygon
      ]
    
    var Point: Instantiable1[/* latLng */ LatLng | LatLngLiteral, typings.googleMaps.google.maps.Data.Point]
    
    var Polygon: Instantiable1[
        /* elements */ js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])], 
        typings.googleMaps.google.maps.Data.Polygon
      ]
  }
  object TypeofData {
    
    inline def apply(
      Feature: Instantiable1[/* options */ js.UndefOr[FeatureOptions | Null], Feature],
      GeometryCollection: Instantiable1[/* elements */ js.Array[Geometry | LatLng | LatLngLiteral], GeometryCollection],
      LineString: Instantiable1[/* elements */ js.Array[LatLng | LatLngLiteral], LineString],
      LinearRing: Instantiable1[/* elements */ js.Array[LatLng | LatLngLiteral], LinearRing],
      MultiLineString: Instantiable1[
          /* elements */ js.Array[LineString | (js.Array[LatLng | LatLngLiteral])], 
          MultiLineString
        ],
      MultiPoint: Instantiable1[/* elements */ js.Array[LatLng | LatLngLiteral], MultiPoint],
      MultiPolygon: Instantiable1[
          /* elements */ js.Array[Polygon | (js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])])], 
          MultiPolygon
        ],
      Point: Instantiable1[/* latLng */ LatLng | LatLngLiteral, Point],
      Polygon: Instantiable1[/* elements */ js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])], Polygon]
    ): TypeofData = {
      val __obj = js.Dynamic.literal(Feature = Feature.asInstanceOf[js.Any], GeometryCollection = GeometryCollection.asInstanceOf[js.Any], LineString = LineString.asInstanceOf[js.Any], LinearRing = LinearRing.asInstanceOf[js.Any], MultiLineString = MultiLineString.asInstanceOf[js.Any], MultiPoint = MultiPoint.asInstanceOf[js.Any], MultiPolygon = MultiPolygon.asInstanceOf[js.Any], Point = Point.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofData] (val x: Self) extends AnyVal {
      
      inline def setFeature(value: Instantiable1[/* options */ js.UndefOr[FeatureOptions | Null], Feature]): Self = StObject.set(x, "Feature", value.asInstanceOf[js.Any])
      
      inline def setGeometryCollection(
        value: Instantiable1[/* elements */ js.Array[Geometry | LatLng | LatLngLiteral], GeometryCollection]
      ): Self = StObject.set(x, "GeometryCollection", value.asInstanceOf[js.Any])
      
      inline def setLineString(value: Instantiable1[/* elements */ js.Array[LatLng | LatLngLiteral], LineString]): Self = StObject.set(x, "LineString", value.asInstanceOf[js.Any])
      
      inline def setLinearRing(value: Instantiable1[/* elements */ js.Array[LatLng | LatLngLiteral], LinearRing]): Self = StObject.set(x, "LinearRing", value.asInstanceOf[js.Any])
      
      inline def setMultiLineString(
        value: Instantiable1[
              /* elements */ js.Array[LineString | (js.Array[LatLng | LatLngLiteral])], 
              MultiLineString
            ]
      ): Self = StObject.set(x, "MultiLineString", value.asInstanceOf[js.Any])
      
      inline def setMultiPoint(value: Instantiable1[/* elements */ js.Array[LatLng | LatLngLiteral], MultiPoint]): Self = StObject.set(x, "MultiPoint", value.asInstanceOf[js.Any])
      
      inline def setMultiPolygon(
        value: Instantiable1[
              /* elements */ js.Array[Polygon | (js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])])], 
              MultiPolygon
            ]
      ): Self = StObject.set(x, "MultiPolygon", value.asInstanceOf[js.Any])
      
      inline def setPoint(value: Instantiable1[/* latLng */ LatLng | LatLngLiteral, Point]): Self = StObject.set(x, "Point", value.asInstanceOf[js.Any])
      
      inline def setPolygon(
        value: Instantiable1[/* elements */ js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])], Polygon]
      ): Self = StObject.set(x, "Polygon", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofLatLngBounds
    extends StObject
       with Instantiable0[LatLngBounds]
       with Instantiable1[
          (/* swOrLatLngBounds */ LatLng) | (/* swOrLatLngBounds */ LatLngBounds) | (/* swOrLatLngBounds */ LatLngBoundsLiteral) | (/* swOrLatLngBounds */ LatLngLiteral), 
          LatLngBounds
        ]
       with Instantiable2[
          (/* swOrLatLngBounds */ LatLng) | (/* swOrLatLngBounds */ LatLngBounds) | (/* swOrLatLngBounds */ LatLngBoundsLiteral) | (/* swOrLatLngBounds */ LatLngLiteral) | (/* swOrLatLngBounds */ Null) | (/* swOrLatLngBounds */ Unit), 
          (/* ne */ LatLng) | (/* ne */ LatLngLiteral), 
          LatLngBounds
        ] {
    
    /**
      * LatLngBounds for the max bounds of the Earth. These bounds will encompass
      * the entire globe.
      */
    val MAX_BOUNDS: LatLngBounds = js.native
  }
  
  @js.native
  trait TypeofMap
    extends StObject
       with Instantiable1[/* mapDiv */ HTMLElement, Map]
       with Instantiable2[/* mapDiv */ HTMLElement, /* opts */ MapOptions, Map] {
    
    /**
      * Map ID which can be used for code samples which require a Map ID. This
      * Map ID is not intended for use in production applications and cannot be
      * used for features which require cloud configuration (such as Cloud
      * Styling).
      */
    val DEMO_MAP_ID: String = js.native
  }
  
  @js.native
  trait TypeofMarker
    extends StObject
       with Instantiable0[Marker_]
       with Instantiable1[/* opts */ MarkerOptions, Marker_] {
    
    /**
      * The maximum default z-index that the API will assign to a marker. You may
      * set a higher z-index to bring a marker to the front.
      */
    val MAX_ZINDEX: Double = js.native
  }
  
  @js.native
  trait TypeofOverlayView
    extends StObject
       with Instantiable0[OverlayView] {
    
    /**
      * Stops click, tap, drag, and wheel events on the element from bubbling up
      * to the map. Use this to prevent map dragging and zooming, as well as map
      * &quot;click&quot; events.
      */
    def preventMapHitsAndGesturesFrom(element: Element): Unit = js.native
    
    /**
      * Stops click or tap on the element from bubbling up to the map. Use this
      * to prevent the map from triggering &quot;click&quot; events.
      */
    def preventMapHitsFrom(element: Element): Unit = js.native
  }
  
  @js.native
  trait TypeofPlace
    extends StObject
       with Instantiable1[/* options */ PlaceOptions, typings.googleMaps.google.maps.places.Place] {
    
    /**
      * Available only in the v=beta channel: https://goo.gle/3oAthT3.
      * Searches for a place based on the given phone number. Returns an array
      * due to rare cases where multiple places may share a phone number.
      * @param request The request containing the phone number and requested
      *     fields.
      */
    def findPlaceFromPhoneNumber(request: FindPlaceFromPhoneNumberRequest): js.Promise[Places] = js.native
    
    /**
      * Available only in the v=beta channel: https://goo.gle/3oAthT3.
      * Searches for a place based on the given text query. Returns an array due
      * to cases where the query is mildly ambiguous, and more than one place
      * gets returned. This method is <em>not</em> intended for searches where
      * multiple results are expected.
      * @param request The request containing the text query and requested
      *     fields.
      */
    def findPlaceFromQuery(request: FindPlaceFromQueryRequest): js.Promise[Places] = js.native
  }
  
  @js.native
  trait TypeofSettings
    extends StObject
       with Instantiable0[Settings] {
    
    /**
      * Available only in the v=beta channel: https://goo.gle/3oAthT3.
      * Returns the singleton instance of <code>google.maps.Settings</code>.
      */
    def getInstance(): Settings = js.native
  }
  
  @js.native
  trait Typeofencoding extends StObject {
    
    def decodePath(encodedPath: String): js.Array[LatLng] = js.native
    
    def encodePath(path: js.Array[LatLng | LatLngLiteral]): String = js.native
    def encodePath(path: MVCArray[LatLng | LatLngLiteral]): String = js.native
  }
  
  @js.native
  trait Typeofevent
    extends StObject
       with Instantiable0[event] {
    
    /**
      * Cross browser event handler registration. This listener is removed by
      * calling removeListener(handle) for the handle that is returned by this
      * function.
      * @deprecated <code>google.maps.event.addDomListener()</code> is
      *     deprecated, use the standard <a
      *     href="https://developer.mozilla.org/docs/Web/API/EventTarget/addEventListener">addEventListener()</a>
      *     method instead. The feature will continue to work and there is no
      *     plan to decommission it.
      */
    def addDomListener(instance: js.Object, eventName: String, handler: js.Function): MapsEventListener = js.native
    def addDomListener(instance: js.Object, eventName: String, handler: js.Function, capture: Boolean): MapsEventListener = js.native
    
    /**
      * Wrapper around addDomListener that removes the listener after the first
      * event.
      * @deprecated <code>google.maps.event.addDomListenerOnce()</code> is
      *     deprecated, use the standard <a
      *     href="https://developer.mozilla.org/docs/Web/API/EventTarget/addEventListener">addEventListener()</a>
      *     method instead. The feature will continue to work and there is no
      *     plan to decommission it.
      */
    def addDomListenerOnce(instance: js.Object, eventName: String, handler: js.Function): MapsEventListener = js.native
    def addDomListenerOnce(instance: js.Object, eventName: String, handler: js.Function, capture: Boolean): MapsEventListener = js.native
    
    /**
      * Adds the given listener function to the given event name for the given
      * object instance. Returns an identifier for this listener that can be used
      * with removeListener().
      */
    def addListener(instance: js.Object, eventName: String, handler: js.Function): MapsEventListener = js.native
    
    /**
      * Like addListener, but the handler removes itself after handling the first
      * event.
      */
    def addListenerOnce(instance: js.Object, eventName: String, handler: js.Function): MapsEventListener = js.native
    
    /**
      * Removes all listeners for all events for the given instance.
      */
    def clearInstanceListeners(instance: js.Object): Unit = js.native
    
    /**
      * Removes all listeners for the given event for the given instance.
      */
    def clearListeners(instance: js.Object, eventName: String): Unit = js.native
    
    /**
      * Returns if there are listeners for the given event on the given instance.
      * Can be used to to save the computation of expensive event details.
      */
    def hasListeners(instance: js.Object, eventName: String): Boolean = js.native
    
    /**
      * Removes the given listener, which should have been returned by
      * addListener above. Equivalent to calling <code>listener.remove()</code>.
      */
    def removeListener(listener: MapsEventListener): Unit = js.native
    
    /**
      * Triggers the given event. All arguments after eventName are passed as
      * arguments to the listeners.
      */
    def trigger(instance: js.Object, eventName: String, eventArgs: Any*): Unit = js.native
  }
  
  @js.native
  trait Typeofpoly extends StObject {
    
    def containsLocation(point: LatLngLiteral, polygon: typings.googleMaps.google.maps.Polygon): Boolean = js.native
    def containsLocation(point: LatLng, polygon: typings.googleMaps.google.maps.Polygon): Boolean = js.native
    
    def isLocationOnEdge(point: LatLngLiteral, poly: typings.googleMaps.google.maps.Polygon): Boolean = js.native
    def isLocationOnEdge(point: LatLngLiteral, poly: typings.googleMaps.google.maps.Polygon, tolerance: Double): Boolean = js.native
    def isLocationOnEdge(point: LatLngLiteral, poly: Polyline): Boolean = js.native
    def isLocationOnEdge(point: LatLngLiteral, poly: Polyline, tolerance: Double): Boolean = js.native
    def isLocationOnEdge(point: LatLng, poly: typings.googleMaps.google.maps.Polygon): Boolean = js.native
    def isLocationOnEdge(point: LatLng, poly: typings.googleMaps.google.maps.Polygon, tolerance: Double): Boolean = js.native
    def isLocationOnEdge(point: LatLng, poly: Polyline): Boolean = js.native
    def isLocationOnEdge(point: LatLng, poly: Polyline, tolerance: Double): Boolean = js.native
  }
  
  @js.native
  trait Typeofspherical extends StObject {
    
    def computeArea(path: js.Array[LatLng | LatLngLiteral]): Double = js.native
    def computeArea(path: js.Array[LatLng | LatLngLiteral], radiusOfSphere: Double): Double = js.native
    def computeArea(path: Circle): Double = js.native
    def computeArea(path: CircleLiteral): Double = js.native
    def computeArea(path: CircleLiteral, radiusOfSphere: Double): Double = js.native
    def computeArea(path: Circle, radiusOfSphere: Double): Double = js.native
    def computeArea(path: LatLngBounds): Double = js.native
    def computeArea(path: LatLngBoundsLiteral): Double = js.native
    def computeArea(path: LatLngBoundsLiteral, radiusOfSphere: Double): Double = js.native
    def computeArea(path: LatLngBounds, radiusOfSphere: Double): Double = js.native
    def computeArea(path: MVCArray[LatLng | LatLngLiteral]): Double = js.native
    def computeArea(path: MVCArray[LatLng | LatLngLiteral], radiusOfSphere: Double): Double = js.native
    
    def computeDistanceBetween(from: LatLngLiteral, to: LatLng): Double = js.native
    def computeDistanceBetween(from: LatLngLiteral, to: LatLngLiteral): Double = js.native
    def computeDistanceBetween(from: LatLngLiteral, to: LatLngLiteral, radius: Double): Double = js.native
    def computeDistanceBetween(from: LatLngLiteral, to: LatLng, radius: Double): Double = js.native
    def computeDistanceBetween(from: LatLng, to: LatLng): Double = js.native
    def computeDistanceBetween(from: LatLng, to: LatLngLiteral): Double = js.native
    def computeDistanceBetween(from: LatLng, to: LatLngLiteral, radius: Double): Double = js.native
    def computeDistanceBetween(from: LatLng, to: LatLng, radius: Double): Double = js.native
    
    def computeHeading(from: LatLngLiteral, to: LatLng): Double = js.native
    def computeHeading(from: LatLngLiteral, to: LatLngLiteral): Double = js.native
    def computeHeading(from: LatLng, to: LatLng): Double = js.native
    def computeHeading(from: LatLng, to: LatLngLiteral): Double = js.native
    
    def computeLength(path: js.Array[LatLng | LatLngLiteral]): Double = js.native
    def computeLength(path: js.Array[LatLng | LatLngLiteral], radius: Double): Double = js.native
    def computeLength(path: MVCArray[LatLng | LatLngLiteral]): Double = js.native
    def computeLength(path: MVCArray[LatLng | LatLngLiteral], radius: Double): Double = js.native
    
    def computeOffset(from: LatLngLiteral, distance: Double, heading: Double): LatLng = js.native
    def computeOffset(from: LatLngLiteral, distance: Double, heading: Double, radius: Double): LatLng = js.native
    def computeOffset(from: LatLng, distance: Double, heading: Double): LatLng = js.native
    def computeOffset(from: LatLng, distance: Double, heading: Double, radius: Double): LatLng = js.native
    
    def computeOffsetOrigin(to: LatLngLiteral, distance: Double, heading: Double): LatLng | Null = js.native
    def computeOffsetOrigin(to: LatLngLiteral, distance: Double, heading: Double, radius: Double): LatLng | Null = js.native
    def computeOffsetOrigin(to: LatLng, distance: Double, heading: Double): LatLng | Null = js.native
    def computeOffsetOrigin(to: LatLng, distance: Double, heading: Double, radius: Double): LatLng | Null = js.native
    
    def computeSignedArea(loop: js.Array[LatLng | LatLngLiteral]): Double = js.native
    def computeSignedArea(loop: js.Array[LatLng | LatLngLiteral], radius: Double): Double = js.native
    def computeSignedArea(loop: MVCArray[LatLng | LatLngLiteral]): Double = js.native
    def computeSignedArea(loop: MVCArray[LatLng | LatLngLiteral], radius: Double): Double = js.native
    
    def interpolate(from: LatLngLiteral, to: LatLngLiteral, fraction: Double): LatLng = js.native
    def interpolate(from: LatLngLiteral, to: LatLng, fraction: Double): LatLng = js.native
    def interpolate(from: LatLng, to: LatLngLiteral, fraction: Double): LatLng = js.native
    def interpolate(from: LatLng, to: LatLng, fraction: Double): LatLng = js.native
  }
}
