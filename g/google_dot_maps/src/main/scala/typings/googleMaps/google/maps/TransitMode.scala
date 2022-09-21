package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransitMode extends StObject
/**
  * The valid transit mode e.g. bus that can be specified in a <i><code><a
  * href="#TransitOptions">TransitOptions</a></code></i>. Specify these by
  * value, or by using the constant&#39;s name. For example, <code>'BUS'</code>
  * or <code>google.maps.TransitMode.BUS</code>.
  */
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
