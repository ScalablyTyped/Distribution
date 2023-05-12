package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PriceLevel extends StObject
@JSGlobal("google.maps.places.PriceLevel")
@js.native
object PriceLevel extends StObject {
  
  @js.native
  sealed trait EXPENSIVE
    extends StObject
       with PriceLevel
  
  @js.native
  sealed trait FREE
    extends StObject
       with PriceLevel
  
  @js.native
  sealed trait INEXPENSIVE
    extends StObject
       with PriceLevel
  
  @js.native
  sealed trait MODERATE
    extends StObject
       with PriceLevel
  
  @js.native
  sealed trait VERY_EXPENSIVE
    extends StObject
       with PriceLevel
}
