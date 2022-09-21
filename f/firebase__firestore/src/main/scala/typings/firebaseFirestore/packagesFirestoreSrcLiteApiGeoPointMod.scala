package typings.firebaseFirestore

import typings.firebaseFirestore.anon.Latitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packagesFirestoreSrcLiteApiGeoPointMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/lite-api/geo_point", "GeoPoint")
  @js.native
  open class GeoPoint protected () extends StObject {
    /**
      * Creates a new immutable `GeoPoint` object with the provided latitude and
      * longitude values.
      * @param latitude - The latitude as number between -90 and 90.
      * @param longitude - The longitude as number between -180 and 180.
      */
    def this(latitude: Double, longitude: Double) = this()
    
    /**
      * Actually private to JS consumers of our API, so this function is prefixed
      * with an underscore.
      */
    def _compareTo(other: GeoPoint): Double = js.native
    
    /* private */ var _lat: Any = js.native
    
    /* private */ var _long: Any = js.native
    
    /**
      * Returns true if this `GeoPoint` is equal to the provided one.
      *
      * @param other - The `GeoPoint` to compare against.
      * @returns true if this `GeoPoint` is equal to the provided one.
      */
    def isEqual(other: GeoPoint): Boolean = js.native
    
    /**
      * The latitude of this `GeoPoint` instance.
      */
    def latitude: Double = js.native
    
    /**
      * The longitude of this `GeoPoint` instance.
      */
    def longitude: Double = js.native
    
    /** Returns a JSON-serializable representation of this GeoPoint. */
    def toJSON(): Latitude = js.native
  }
}
