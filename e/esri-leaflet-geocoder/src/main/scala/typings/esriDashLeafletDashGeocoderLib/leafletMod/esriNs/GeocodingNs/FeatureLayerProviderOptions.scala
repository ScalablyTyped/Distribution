package typings
package esriDashLeafletDashGeocoderLib.leafletMod.esriNs.GeocodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerProviderOptions extends BaseProviderOptions {
  var bufferRadius: js.UndefOr[scala.Double] = js.undefined
  var formatSuggestion: js.UndefOr[js.Function1[/* featureInformation */ js.Any, java.lang.String]] = js.undefined
  var searchFields: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var url: java.lang.String
}

