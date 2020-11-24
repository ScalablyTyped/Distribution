package typings.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebExtensionManifestChromeSettingsOverridesSearchProvider extends js.Object {
  
  /** @deprecated Unsupported on Firefox at this time. */
  var alternate_urls: js.UndefOr[js.Array[String]] = js.native
  
  /** Encoding of the search term. */
  var encoding: js.UndefOr[String] = js.native
  
  var favicon_url: js.UndefOr[String] = js.native
  
  /** @deprecated Unsupported on Firefox at this time. */
  var image_url: js.UndefOr[String] = js.native
  
  /** @deprecated Unsupported on Firefox at this time. */
  var image_url_post_params: js.UndefOr[String] = js.native
  
  /** @deprecated Unsupported on Firefox at this time. */
  var instant_url: js.UndefOr[String] = js.native
  
  /** @deprecated Unsupported on Firefox at this time. */
  var instant_url_post_params: js.UndefOr[String] = js.native
  
  /** Sets the default engine to a built-in engine only. */
  var is_default: js.UndefOr[Boolean] = js.native
  
  var keyword: js.UndefOr[String | js.Array[String]] = js.native
  
  var name: String = js.native
  
  /**
    * A list of optional search url parameters. This allows the additon of search url parameters based on how the search is performed in Firefox.
    */
  var params: js.UndefOr[js.Array[WebExtensionManifestChromeSettingsOverridesSearchProviderParams]] = js.native
  
  /** @deprecated Unsupported on Firefox. */
  var prepopulated_id: js.UndefOr[Double] = js.native
  
  var search_form: js.UndefOr[String] = js.native
  
  var search_url: String = js.native
  
  /** GET parameters to the search_url as a query string. */
  var search_url_get_params: js.UndefOr[String] = js.native
  
  /** POST parameters to the search_url as a query string. */
  var search_url_post_params: js.UndefOr[String] = js.native
  
  var suggest_url: js.UndefOr[String] = js.native
  
  /** GET parameters to the suggest_url as a query string. */
  var suggest_url_get_params: js.UndefOr[String] = js.native
  
  /** POST parameters to the suggest_url as a query string. */
  var suggest_url_post_params: js.UndefOr[String] = js.native
}
object WebExtensionManifestChromeSettingsOverridesSearchProvider {
  
  @scala.inline
  def apply(name: String, search_url: String): WebExtensionManifestChromeSettingsOverridesSearchProvider = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], search_url = search_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestChromeSettingsOverridesSearchProvider]
  }
  
  @scala.inline
  implicit class WebExtensionManifestChromeSettingsOverridesSearchProviderOps[Self <: WebExtensionManifestChromeSettingsOverridesSearchProvider] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch_url(value: String): Self = this.set("search_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternate_urlsVarargs(value: String*): Self = this.set("alternate_urls", js.Array(value :_*))
    
    @scala.inline
    def setAlternate_urls(value: js.Array[String]): Self = this.set("alternate_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternate_urls: Self = this.set("alternate_urls", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setFavicon_url(value: String): Self = this.set("favicon_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFavicon_url: Self = this.set("favicon_url", js.undefined)
    
    @scala.inline
    def setImage_url(value: String): Self = this.set("image_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage_url: Self = this.set("image_url", js.undefined)
    
    @scala.inline
    def setImage_url_post_params(value: String): Self = this.set("image_url_post_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage_url_post_params: Self = this.set("image_url_post_params", js.undefined)
    
    @scala.inline
    def setInstant_url(value: String): Self = this.set("instant_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstant_url: Self = this.set("instant_url", js.undefined)
    
    @scala.inline
    def setInstant_url_post_params(value: String): Self = this.set("instant_url_post_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstant_url_post_params: Self = this.set("instant_url_post_params", js.undefined)
    
    @scala.inline
    def setIs_default(value: Boolean): Self = this.set("is_default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_default: Self = this.set("is_default", js.undefined)
    
    @scala.inline
    def setKeywordVarargs(value: String*): Self = this.set("keyword", js.Array(value :_*))
    
    @scala.inline
    def setKeyword(value: String | js.Array[String]): Self = this.set("keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyword: Self = this.set("keyword", js.undefined)
    
    @scala.inline
    def setParamsVarargs(value: WebExtensionManifestChromeSettingsOverridesSearchProviderParams*): Self = this.set("params", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: js.Array[WebExtensionManifestChromeSettingsOverridesSearchProviderParams]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setPrepopulated_id(value: Double): Self = this.set("prepopulated_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrepopulated_id: Self = this.set("prepopulated_id", js.undefined)
    
    @scala.inline
    def setSearch_form(value: String): Self = this.set("search_form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch_form: Self = this.set("search_form", js.undefined)
    
    @scala.inline
    def setSearch_url_get_params(value: String): Self = this.set("search_url_get_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch_url_get_params: Self = this.set("search_url_get_params", js.undefined)
    
    @scala.inline
    def setSearch_url_post_params(value: String): Self = this.set("search_url_post_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch_url_post_params: Self = this.set("search_url_post_params", js.undefined)
    
    @scala.inline
    def setSuggest_url(value: String): Self = this.set("suggest_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggest_url: Self = this.set("suggest_url", js.undefined)
    
    @scala.inline
    def setSuggest_url_get_params(value: String): Self = this.set("suggest_url_get_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggest_url_get_params: Self = this.set("suggest_url_get_params", js.undefined)
    
    @scala.inline
    def setSuggest_url_post_params(value: String): Self = this.set("suggest_url_post_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggest_url_post_params: Self = this.set("suggest_url_post_params", js.undefined)
  }
}
