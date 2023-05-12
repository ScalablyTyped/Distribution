package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.KmlLayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.KmlLayer")
@js.native
/**
  * A <code>KmlLayer</code> adds geographic markup to the map from a KML, KMZ
  * or GeoRSS file that is hosted on a publicly accessible web server. A
  * <code>KmlFeatureData</code> object is provided for each feature when
  * clicked.
  *
  * Access by calling `const {KmlLayer} = await
  * google.maps.importLibrary("maps")`. See
  * https://developers.google.com/maps/documentation/javascript/libraries.
  * @param opts Options for this layer.
  */
open class KmlLayer ()
  extends StObject
     with typings.googleMaps.google.maps.KmlLayer {
  def this(opts: KmlLayerOptions) = this()
}
