package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransitMode extends StObject
@JSGlobal("google.maps.TransitMode")
@js.native
object TransitMode extends StObject {
  
  /**
    * Specifies bus as a preferred mode of transit.
    */
  @js.native
  sealed trait BUS
    extends StObject
       with TransitMode
  
  /**
    * Specifies rail as a preferred mode of transit.
    */
  @js.native
  sealed trait RAIL
    extends StObject
       with TransitMode
  
  /**
    * Specifies subway as a preferred mode of transit.
    */
  @js.native
  sealed trait SUBWAY
    extends StObject
       with TransitMode
  
  /**
    * Specifies train as a preferred mode of transit.
    */
  @js.native
  sealed trait TRAIN
    extends StObject
       with TransitMode
  
  /**
    * Specifies tram as a preferred mode of transit.
    */
  @js.native
  sealed trait TRAM
    extends StObject
       with TransitMode
}
