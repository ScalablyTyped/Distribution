package typings.esriLeafletGeocoder.mod.esri.Geocoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureLayerProviderOptions extends BaseProviderOptions {
  
  var bufferRadius: js.UndefOr[Double] = js.native
  
  var formatSuggestion: js.UndefOr[js.Function1[/* featureInformation */ js.Any, String]] = js.native
  
  var searchFields: js.UndefOr[String | js.Array[String]] = js.native
  
  var url: String = js.native
}
object FeatureLayerProviderOptions {
  
  @scala.inline
  def apply(url: String): FeatureLayerProviderOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerProviderOptions]
  }
  
  @scala.inline
  implicit class FeatureLayerProviderOptionsOps[Self <: FeatureLayerProviderOptions] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferRadius(value: Double): Self = this.set("bufferRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferRadius: Self = this.set("bufferRadius", js.undefined)
    
    @scala.inline
    def setFormatSuggestion(value: /* featureInformation */ js.Any => String): Self = this.set("formatSuggestion", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatSuggestion: Self = this.set("formatSuggestion", js.undefined)
    
    @scala.inline
    def setSearchFieldsVarargs(value: String*): Self = this.set("searchFields", js.Array(value :_*))
    
    @scala.inline
    def setSearchFields(value: String | js.Array[String]): Self = this.set("searchFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchFields: Self = this.set("searchFields", js.undefined)
  }
}
