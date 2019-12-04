package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcApiGeoUnderscorePointMod.GeoPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/geo_point", JSImport.Namespace)
@js.native
object distSrcApiGeoUnderscorePointMod extends js.Object {
  @js.native
  class GeoPoint protected () extends js.Object {
    def this(latitude: Double, longitude: Double) = this()
    var _lat: js.Any = js.native
    var _long: js.Any = js.native
    /**
      * Actually private to JS consumers of our API, so this function is prefixed
      * with an underscore.
      */
    def _compareTo(other: GeoPoint): Double = js.native
    def isEqual(other: GeoPoint): Boolean = js.native
    /**
      * Returns the latitude of this geo point, a number between -90 and 90.
      */
    def latitude(): Double = js.native
    /**
      * Returns the longitude of this geo point, a number between -180 and 180.
      */
    def longitude(): Double = js.native
  }
  
}

