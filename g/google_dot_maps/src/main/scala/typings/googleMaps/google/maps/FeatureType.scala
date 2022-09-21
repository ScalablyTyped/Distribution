package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FeatureType extends StObject
/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Identifiers for feature types.
  */
@JSGlobal("google.maps.FeatureType")
@js.native
object FeatureType extends StObject {
  
  /**
    * Indicates a first-order civil entity below the country level.
    */
  @js.native
  sealed trait ADMINISTRATIVE_AREA_LEVEL_1
    extends StObject
       with FeatureType
  
  /**
    * Indicates a second-order civil entity below the country level.
    */
  @js.native
  sealed trait ADMINISTRATIVE_AREA_LEVEL_2
    extends StObject
       with FeatureType
  
  /**
    * Indicates a third-order civil entity below the country level.
    */
  @js.native
  sealed trait ADMINISTRATIVE_AREA_LEVEL_3
    extends StObject
       with FeatureType
  
  /**
    * Indicates a fourth-order civil entity below the country level.
    */
  @js.native
  sealed trait ADMINISTRATIVE_AREA_LEVEL_4
    extends StObject
       with FeatureType
  
  /**
    * Indicates the national political entity.
    */
  @js.native
  sealed trait COUNTRY
    extends StObject
       with FeatureType
  
  /**
    * Indicates an incorporated city or town political entity.
    */
  @js.native
  sealed trait LOCALITY
    extends StObject
       with FeatureType
  
  /**
    * Indicates a named neighborhood.
    */
  @js.native
  sealed trait NEIGHBORHOOD
    extends StObject
       with FeatureType
  
  /**
    * Indicates a postal code as used to address postal mail within the
    * country.
    */
  @js.native
  sealed trait POSTAL_CODE
    extends StObject
       with FeatureType
  
  /**
    * Indicates a first-order civil entity below a locality.
    */
  @js.native
  sealed trait SUBLOCALITY_LEVEL_1
    extends StObject
       with FeatureType
}
