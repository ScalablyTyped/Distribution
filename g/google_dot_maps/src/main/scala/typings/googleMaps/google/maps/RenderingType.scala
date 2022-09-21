package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RenderingType extends StObject
@JSGlobal("google.maps.RenderingType")
@js.native
object RenderingType extends StObject {
  
  /**
    * Indicates that the map is a raster map.
    */
  @js.native
  sealed trait RASTER
    extends StObject
       with RenderingType
  
  /**
    * Indicates that it is unknown yet whether the map is vector or raster,
    * because the map has not finished initializing yet.
    */
  @js.native
  sealed trait UNINITIALIZED
    extends StObject
       with RenderingType
  
  /**
    * Indicates that the map is a vector map.
    */
  @js.native
  sealed trait VECTOR
    extends StObject
       with RenderingType
}
