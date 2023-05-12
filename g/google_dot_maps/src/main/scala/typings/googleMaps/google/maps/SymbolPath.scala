package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SymbolPath extends StObject
@JSGlobal("google.maps.SymbolPath")
@js.native
object SymbolPath extends StObject {
  
  /**
    * A backward-pointing closed arrow.
    */
  @js.native
  sealed trait BACKWARD_CLOSED_ARROW
    extends StObject
       with SymbolPath
  
  /**
    * A backward-pointing open arrow.
    */
  @js.native
  sealed trait BACKWARD_OPEN_ARROW
    extends StObject
       with SymbolPath
  
  /**
    * A circle.
    */
  @js.native
  sealed trait CIRCLE
    extends StObject
       with SymbolPath
  
  /**
    * A forward-pointing closed arrow.
    */
  @js.native
  sealed trait FORWARD_CLOSED_ARROW
    extends StObject
       with SymbolPath
  
  /**
    * A forward-pointing open arrow.
    */
  @js.native
  sealed trait FORWARD_OPEN_ARROW
    extends StObject
       with SymbolPath
}
