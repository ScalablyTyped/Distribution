package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.visualization.HeatmapLayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visualization {
  
  @JSGlobal("google.maps.visualization.HeatmapLayer")
  @js.native
  /**
    * A layer that provides a client-side rendered heatmap, depicting the
    * intensity of data at geographical points.
    *
    * Access by calling `const {HeatmapLayer} = await
    * google.maps.importLibrary("visualization")`. See
    * https://developers.google.com/maps/documentation/javascript/libraries.
    */
  open class HeatmapLayer ()
    extends StObject
       with typings.googleMaps.google.maps.visualization.HeatmapLayer {
    def this(opts: HeatmapLayerOptions) = this()
  }
}
