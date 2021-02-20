package typings.esriLeaflet.mod

import typings.leaflet.mod.ImageOverlayOptions
import typings.leaflet.mod.LatLngBoundsExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A generic class representing an image layer. This class can be extended to provide support for making export requests from ArcGIS REST services.
  */
@JSImport("esri-leaflet", "RasterLayer")
@js.native
abstract class RasterLayer protected ()
  extends typings.esriLeaflet.mod.leafletAugmentingMod.esri.RasterLayer {
  def this(imageUrl: String, bounds: LatLngBoundsExpression) = this()
  def this(imageUrl: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions) = this()
}
