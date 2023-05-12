package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.CircleLiteral
import typings.googleMaps.google.maps.LatLngBoundsLiteral
import typings.googleMaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometry {
  
  object encoding {
    
    @JSGlobal("google.maps.geometry.encoding")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decodePath(encodedPath: String): js.Array[typings.googleMaps.google.maps.LatLng] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePath")(encodedPath.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.googleMaps.google.maps.LatLng]]
    
    inline def encodePath(path: js.Array[typings.googleMaps.google.maps.LatLng | LatLngLiteral]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def encodePath(
      path: typings.googleMaps.google.maps.MVCArray[typings.googleMaps.google.maps.LatLng | LatLngLiteral]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object poly {
    
    @JSGlobal("google.maps.geometry.poly")
    @js.native
    val ^ : js.Any = js.native
    
    inline def containsLocation(point: LatLngLiteral, polygon: typings.googleMaps.google.maps.Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsLocation")(point.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def containsLocation(point: typings.googleMaps.google.maps.LatLng, polygon: typings.googleMaps.google.maps.Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsLocation")(point.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isLocationOnEdge(point: LatLngLiteral, poly: typings.googleMaps.google.maps.Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLocationOnEdge")(point.asInstanceOf[js.Any], poly.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isLocationOnEdge(point: LatLngLiteral, poly: typings.googleMaps.google.maps.Polygon, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLocationOnEdge")(point.asInstanceOf[js.Any], poly.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isLocationOnEdge(point: LatLngLiteral, poly: typings.googleMaps.google.maps.Polyline): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLocationOnEdge")(point.asInstanceOf[js.Any], poly.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isLocationOnEdge(point: LatLngLiteral, poly: typings.googleMaps.google.maps.Polyline, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLocationOnEdge")(point.asInstanceOf[js.Any], poly.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isLocationOnEdge(point: typings.googleMaps.google.maps.LatLng, poly: typings.googleMaps.google.maps.Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLocationOnEdge")(point.asInstanceOf[js.Any], poly.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isLocationOnEdge(
      point: typings.googleMaps.google.maps.LatLng,
      poly: typings.googleMaps.google.maps.Polygon,
      tolerance: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLocationOnEdge")(point.asInstanceOf[js.Any], poly.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isLocationOnEdge(point: typings.googleMaps.google.maps.LatLng, poly: typings.googleMaps.google.maps.Polyline): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLocationOnEdge")(point.asInstanceOf[js.Any], poly.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isLocationOnEdge(
      point: typings.googleMaps.google.maps.LatLng,
      poly: typings.googleMaps.google.maps.Polyline,
      tolerance: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLocationOnEdge")(point.asInstanceOf[js.Any], poly.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  object spherical {
    
    @JSGlobal("google.maps.geometry.spherical")
    @js.native
    val ^ : js.Any = js.native
    
    inline def computeArea(path: js.Array[typings.googleMaps.google.maps.LatLng | LatLngLiteral]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeArea")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def computeArea(path: js.Array[typings.googleMaps.google.maps.LatLng | LatLngLiteral], radiusOfSphere: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArea")(path.asInstanceOf[js.Any], radiusOfSphere.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeArea(path: typings.googleMaps.google.maps.Circle): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeArea")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def computeArea(path: CircleLiteral): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeArea")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def computeArea(path: CircleLiteral, radiusOfSphere: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArea")(path.asInstanceOf[js.Any], radiusOfSphere.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeArea(path: typings.googleMaps.google.maps.Circle, radiusOfSphere: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArea")(path.asInstanceOf[js.Any], radiusOfSphere.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeArea(path: typings.googleMaps.google.maps.LatLngBounds): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeArea")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def computeArea(path: LatLngBoundsLiteral): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeArea")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def computeArea(path: LatLngBoundsLiteral, radiusOfSphere: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArea")(path.asInstanceOf[js.Any], radiusOfSphere.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeArea(path: typings.googleMaps.google.maps.LatLngBounds, radiusOfSphere: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArea")(path.asInstanceOf[js.Any], radiusOfSphere.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeArea(
      path: typings.googleMaps.google.maps.MVCArray[typings.googleMaps.google.maps.LatLng | LatLngLiteral]
    ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeArea")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def computeArea(
      path: typings.googleMaps.google.maps.MVCArray[typings.googleMaps.google.maps.LatLng | LatLngLiteral],
      radiusOfSphere: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArea")(path.asInstanceOf[js.Any], radiusOfSphere.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def computeDistanceBetween(from: LatLngLiteral, to: typings.googleMaps.google.maps.LatLng): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDistanceBetween")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeDistanceBetween(from: LatLngLiteral, to: LatLngLiteral): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDistanceBetween")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeDistanceBetween(from: LatLngLiteral, to: LatLngLiteral, radius: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDistanceBetween")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeDistanceBetween(from: LatLngLiteral, to: typings.googleMaps.google.maps.LatLng, radius: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDistanceBetween")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeDistanceBetween(from: typings.googleMaps.google.maps.LatLng, to: typings.googleMaps.google.maps.LatLng): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDistanceBetween")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeDistanceBetween(from: typings.googleMaps.google.maps.LatLng, to: LatLngLiteral): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDistanceBetween")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeDistanceBetween(from: typings.googleMaps.google.maps.LatLng, to: LatLngLiteral, radius: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDistanceBetween")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeDistanceBetween(
      from: typings.googleMaps.google.maps.LatLng,
      to: typings.googleMaps.google.maps.LatLng,
      radius: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDistanceBetween")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def computeHeading(from: LatLngLiteral, to: typings.googleMaps.google.maps.LatLng): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeHeading")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeHeading(from: LatLngLiteral, to: LatLngLiteral): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeHeading")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeHeading(from: typings.googleMaps.google.maps.LatLng, to: typings.googleMaps.google.maps.LatLng): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeHeading")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeHeading(from: typings.googleMaps.google.maps.LatLng, to: LatLngLiteral): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeHeading")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def computeLength(path: js.Array[typings.googleMaps.google.maps.LatLng | LatLngLiteral]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeLength")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def computeLength(path: js.Array[typings.googleMaps.google.maps.LatLng | LatLngLiteral], radius: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeLength")(path.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeLength(
      path: typings.googleMaps.google.maps.MVCArray[typings.googleMaps.google.maps.LatLng | LatLngLiteral]
    ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeLength")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def computeLength(
      path: typings.googleMaps.google.maps.MVCArray[typings.googleMaps.google.maps.LatLng | LatLngLiteral],
      radius: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeLength")(path.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def computeOffset(from: LatLngLiteral, distance: Double, heading: Double): typings.googleMaps.google.maps.LatLng = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOffset")(from.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], heading.asInstanceOf[js.Any])).asInstanceOf[typings.googleMaps.google.maps.LatLng]
    inline def computeOffset(from: LatLngLiteral, distance: Double, heading: Double, radius: Double): typings.googleMaps.google.maps.LatLng = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOffset")(from.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], heading.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[typings.googleMaps.google.maps.LatLng]
    inline def computeOffset(from: typings.googleMaps.google.maps.LatLng, distance: Double, heading: Double): typings.googleMaps.google.maps.LatLng = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOffset")(from.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], heading.asInstanceOf[js.Any])).asInstanceOf[typings.googleMaps.google.maps.LatLng]
    inline def computeOffset(from: typings.googleMaps.google.maps.LatLng, distance: Double, heading: Double, radius: Double): typings.googleMaps.google.maps.LatLng = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOffset")(from.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], heading.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[typings.googleMaps.google.maps.LatLng]
    
    inline def computeOffsetOrigin(to: LatLngLiteral, distance: Double, heading: Double): typings.googleMaps.google.maps.LatLng | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOffsetOrigin")(to.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], heading.asInstanceOf[js.Any])).asInstanceOf[typings.googleMaps.google.maps.LatLng | Null]
    inline def computeOffsetOrigin(to: LatLngLiteral, distance: Double, heading: Double, radius: Double): typings.googleMaps.google.maps.LatLng | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOffsetOrigin")(to.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], heading.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[typings.googleMaps.google.maps.LatLng | Null]
    inline def computeOffsetOrigin(to: typings.googleMaps.google.maps.LatLng, distance: Double, heading: Double): typings.googleMaps.google.maps.LatLng | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOffsetOrigin")(to.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], heading.asInstanceOf[js.Any])).asInstanceOf[typings.googleMaps.google.maps.LatLng | Null]
    inline def computeOffsetOrigin(to: typings.googleMaps.google.maps.LatLng, distance: Double, heading: Double, radius: Double): typings.googleMaps.google.maps.LatLng | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOffsetOrigin")(to.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], heading.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[typings.googleMaps.google.maps.LatLng | Null]
    
    inline def computeSignedArea(loop: js.Array[typings.googleMaps.google.maps.LatLng | LatLngLiteral]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeSignedArea")(loop.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def computeSignedArea(loop: js.Array[typings.googleMaps.google.maps.LatLng | LatLngLiteral], radius: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSignedArea")(loop.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeSignedArea(
      loop: typings.googleMaps.google.maps.MVCArray[typings.googleMaps.google.maps.LatLng | LatLngLiteral]
    ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeSignedArea")(loop.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def computeSignedArea(
      loop: typings.googleMaps.google.maps.MVCArray[typings.googleMaps.google.maps.LatLng | LatLngLiteral],
      radius: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSignedArea")(loop.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def interpolate(from: LatLngLiteral, to: LatLngLiteral, fraction: Double): typings.googleMaps.google.maps.LatLng = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], fraction.asInstanceOf[js.Any])).asInstanceOf[typings.googleMaps.google.maps.LatLng]
    inline def interpolate(from: LatLngLiteral, to: typings.googleMaps.google.maps.LatLng, fraction: Double): typings.googleMaps.google.maps.LatLng = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], fraction.asInstanceOf[js.Any])).asInstanceOf[typings.googleMaps.google.maps.LatLng]
    inline def interpolate(from: typings.googleMaps.google.maps.LatLng, to: LatLngLiteral, fraction: Double): typings.googleMaps.google.maps.LatLng = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], fraction.asInstanceOf[js.Any])).asInstanceOf[typings.googleMaps.google.maps.LatLng]
    inline def interpolate(
      from: typings.googleMaps.google.maps.LatLng,
      to: typings.googleMaps.google.maps.LatLng,
      fraction: Double
    ): typings.googleMaps.google.maps.LatLng = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], fraction.asInstanceOf[js.Any])).asInstanceOf[typings.googleMaps.google.maps.LatLng]
  }
}
