package typings.esriLeafletGeocoder.mod.esri.Geocoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapServiceProviderOptions extends BaseProviderOptions {
  var bufferRadius: Double | js.Array[Double] = js.native
  var layers: Double | js.Array[Double] = js.native
  var searchFields: String | js.Array[String] = js.native
  var url: String = js.native
  def formatSuggestion(featureInformation: js.Any): String = js.native
}

object MapServiceProviderOptions {
  @scala.inline
  def apply(
    bufferRadius: Double | js.Array[Double],
    formatSuggestion: js.Any => String,
    layers: Double | js.Array[Double],
    searchFields: String | js.Array[String],
    url: String
  ): MapServiceProviderOptions = {
    val __obj = js.Dynamic.literal(bufferRadius = bufferRadius.asInstanceOf[js.Any], formatSuggestion = js.Any.fromFunction1(formatSuggestion), layers = layers.asInstanceOf[js.Any], searchFields = searchFields.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapServiceProviderOptions]
  }
  @scala.inline
  implicit class MapServiceProviderOptionsOps[Self <: MapServiceProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBufferRadiusVarargs(value: Double*): Self = this.set("bufferRadius", js.Array(value :_*))
    @scala.inline
    def setBufferRadius(value: Double | js.Array[Double]): Self = this.set("bufferRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatSuggestion(value: js.Any => String): Self = this.set("formatSuggestion", js.Any.fromFunction1(value))
    @scala.inline
    def setLayersVarargs(value: Double*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: Double | js.Array[Double]): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchFieldsVarargs(value: String*): Self = this.set("searchFields", js.Array(value :_*))
    @scala.inline
    def setSearchFields(value: String | js.Array[String]): Self = this.set("searchFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

