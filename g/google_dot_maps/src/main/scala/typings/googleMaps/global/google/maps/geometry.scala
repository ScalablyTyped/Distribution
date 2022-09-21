package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometry {
  
  object encoding {
    
    @JSGlobal("google.maps.geometry.encoding")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Decodes an encoded path string into a sequence of LatLngs.
      */
    inline def decodePath(encodedPath: String): js.Array[typings.googleMaps.google.maps.LatLng] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePath")(encodedPath.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.googleMaps.google.maps.LatLng]]
    
    /**
      * Encodes a sequence of LatLngs into an encoded path string.
      */
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
    /**
      * Computes whether the given point lies inside the specified polygon.
      */
    inline def containsLocation(point: typings.googleMaps.google.maps.LatLng, polygon: typings.googleMaps.google.maps.Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsLocation")(point.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isLocationOnEdge(point: LatLngLiteral, poly: typings.googleMaps.google.maps.Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLocationOnEdge")(point.asInstanceOf[js.Any], poly.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isLocationOnEdge(point: LatLngLiteral, poly: typings.googleMaps.google.maps.Polygon, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLocationOnEdge")(point.asInstanceOf[js.Any], poly.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isLocationOnEdge(point: LatLngLiteral, poly: typings.googleMaps.google.maps.Polyline): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLocationOnEdge")(point.asInstanceOf[js.Any], poly.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isLocationOnEdge(point: LatLngLiteral, poly: typings.googleMaps.google.maps.Polyline, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLocationOnEdge")(point.asInstanceOf[js.Any], poly.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    /**
      * Computes whether the given point lies on or near to a polyline, or the edge
      * of a polygon, within a specified tolerance. Returns <code>true</code> when
      * the difference between the latitude and longitude of the supplied point,
      * and the closest point on the edge, is less than the tolerance. The
      * tolerance defaults to 10<sup>-9</sup> degrees.
      */
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
    
    /**
      * Returns the unsigned area of a closed path, in the range [0,
      * -2×pi×radius²]. The computed area uses the same units as the radius. The
      * radius defaults to the Earth&#39;s radius in meters, in which case the area
      * is in square meters.
      */
    inline def computeArea(path: js.Array[typings.googleMaps.google.maps.LatLng | LatLngLiteral]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeArea")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def computeArea(path: js.Array[typings.googleMaps.google.maps.LatLng | LatLngLiteral], radius: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArea")(path.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeArea(
      path: typings.googleMaps.google.maps.MVCArray[typings.googleMaps.google.maps.LatLng | LatLngLiteral]
    ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeArea")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def computeArea(
      path: typings.googleMaps.google.maps.MVCArray[typings.googleMaps.google.maps.LatLng | LatLngLiteral],
      radius: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArea")(path.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def computeDistanceBetween(from: LatLngLiteral, to: typings.googleMaps.google.maps.LatLng): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDistanceBetween")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeDistanceBetween(from: LatLngLiteral, to: LatLngLiteral): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDistanceBetween")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeDistanceBetween(from: LatLngLiteral, to: LatLngLiteral, radius: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDistanceBetween")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeDistanceBetween(from: LatLngLiteral, to: typings.googleMaps.google.maps.LatLng, radius: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDistanceBetween")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Double]
    /**
      * Returns the distance, in meters, between two LatLngs. You can optionally
      * specify a custom radius. The radius defaults to the radius of the Earth.
      */
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
    /**
      * Returns the heading from one LatLng to another LatLng. Headings are
      * expressed in degrees clockwise from North within the range [-180,180).
      */
    inline def computeHeading(from: typings.googleMaps.google.maps.LatLng, to: typings.googleMaps.google.maps.LatLng): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeHeading")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def computeHeading(from: typings.googleMaps.google.maps.LatLng, to: LatLngLiteral): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeHeading")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns the length of the given path.
      */
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
    /**
      * Returns the LatLng resulting from moving a distance from an origin in the
      * specified heading (expressed in degrees clockwise from north).
      */
    inline def computeOffset(from: typings.googleMaps.google.maps.LatLng, distance: Double, heading: Double): typings.googleMaps.google.maps.LatLng = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOffset")(from.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], heading.asInstanceOf[js.Any])).asInstanceOf[typings.googleMaps.google.maps.LatLng]
    inline def computeOffset(from: typings.googleMaps.google.maps.LatLng, distance: Double, heading: Double, radius: Double): typings.googleMaps.google.maps.LatLng = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOffset")(from.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], heading.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[typings.googleMaps.google.maps.LatLng]
    
    inline def computeOffsetOrigin(to: LatLngLiteral, distance: Double, heading: Double): typings.googleMaps.google.maps.LatLng | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOffsetOrigin")(to.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], heading.asInstanceOf[js.Any])).asInstanceOf[typings.googleMaps.google.maps.LatLng | Null]
    inline def computeOffsetOrigin(to: LatLngLiteral, distance: Double, heading: Double, radius: Double): typings.googleMaps.google.maps.LatLng | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOffsetOrigin")(to.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], heading.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[typings.googleMaps.google.maps.LatLng | Null]
    /**
      * Returns the location of origin when provided with a LatLng destination,
      * meters travelled and original heading. Headings are expressed in degrees
      * clockwise from North. This function returns <code>null</code> when no
      * solution is available.
      */
    inline def computeOffsetOrigin(to: typings.googleMaps.google.maps.LatLng, distance: Double, heading: Double): typings.googleMaps.google.maps.LatLng | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOffsetOrigin")(to.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], heading.asInstanceOf[js.Any])).asInstanceOf[typings.googleMaps.google.maps.LatLng | Null]
    inline def computeOffsetOrigin(to: typings.googleMaps.google.maps.LatLng, distance: Double, heading: Double, radius: Double): typings.googleMaps.google.maps.LatLng | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOffsetOrigin")(to.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], heading.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[typings.googleMaps.google.maps.LatLng | Null]
    
    /**
      * Returns the signed area of a closed path, where counterclockwise is
      * positive, in the range [-2×pi×radius², 2×pi×radius²]. The computed area
      * uses the same units as the radius. The radius defaults to the Earth&#39;s
      * radius in meters, in which case the area is in square meters. <br><br> The
      * area is computed using the <a
      * href="https://wikipedia.org/wiki/Parallel_transport">parallel transport</a>
      * method; the parallel transport around a closed path on the unit sphere
      * twists by an angle that is equal to the area enclosed by the path. This is
      * simpler and more accurate and robust than triangulation using Girard,
      * l&#39;Huilier, or Eriksson on each triangle. In particular, since it
      * doesn&#39;t triangulate, it suffers no instability except in the
      * unavoidable case when an <em>edge</em> (not a diagonal) of the polygon
      * spans 180 degrees.
      */
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
    /**
      * Returns the LatLng which lies the given fraction of the way between the
      * origin LatLng and the destination LatLng.
      */
    inline def interpolate(
      from: typings.googleMaps.google.maps.LatLng,
      to: typings.googleMaps.google.maps.LatLng,
      fraction: Double
    ): typings.googleMaps.google.maps.LatLng = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], fraction.asInstanceOf[js.Any])).asInstanceOf[typings.googleMaps.google.maps.LatLng]
  }
}
