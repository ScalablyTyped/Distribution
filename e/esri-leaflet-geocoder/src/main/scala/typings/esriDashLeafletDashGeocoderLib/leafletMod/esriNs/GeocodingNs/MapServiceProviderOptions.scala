package typings
package esriDashLeafletDashGeocoderLib.leafletMod.esriNs.GeocodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapServiceProviderOptions extends BaseProviderOptions {
  var bufferRadius: scala.Double | js.Array[scala.Double]
  var layers: scala.Double | js.Array[scala.Double]
  var searchFields: java.lang.String | js.Array[java.lang.String]
  var url: java.lang.String
  def formatSuggestion(featureInformation: js.Any): java.lang.String
}

