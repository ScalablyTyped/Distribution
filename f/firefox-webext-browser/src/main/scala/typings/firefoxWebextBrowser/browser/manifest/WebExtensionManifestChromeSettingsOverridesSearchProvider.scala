package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestChromeSettingsOverridesSearchProvider extends StObject {
  
  /** @deprecated Unsupported on Firefox at this time. */
  var alternate_urls: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Encoding of the search term. */
  var encoding: js.UndefOr[String] = js.undefined
  
  var favicon_url: js.UndefOr[String] = js.undefined
  
  /** @deprecated Unsupported on Firefox at this time. */
  var image_url: js.UndefOr[String] = js.undefined
  
  /** @deprecated Unsupported on Firefox at this time. */
  var image_url_post_params: js.UndefOr[String] = js.undefined
  
  /** @deprecated Unsupported on Firefox at this time. */
  var instant_url: js.UndefOr[String] = js.undefined
  
  /** @deprecated Unsupported on Firefox at this time. */
  var instant_url_post_params: js.UndefOr[String] = js.undefined
  
  /** Sets the default engine to a built-in engine only. */
  var is_default: js.UndefOr[Boolean] = js.undefined
  
  var keyword: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var name: String
  
  /**
    * A list of optional search url parameters. This allows the additon of search url parameters based on how the search is performed in Firefox.
    */
  var params: js.UndefOr[js.Array[WebExtensionManifestChromeSettingsOverridesSearchProviderParams]] = js.undefined
  
  /** @deprecated Unsupported on Firefox. */
  var prepopulated_id: js.UndefOr[Double] = js.undefined
  
  var search_form: js.UndefOr[String] = js.undefined
  
  var search_url: String
  
  /** GET parameters to the search_url as a query string. */
  var search_url_get_params: js.UndefOr[String] = js.undefined
  
  /** POST parameters to the search_url as a query string. */
  var search_url_post_params: js.UndefOr[String] = js.undefined
  
  var suggest_url: js.UndefOr[String] = js.undefined
  
  /** GET parameters to the suggest_url as a query string. */
  var suggest_url_get_params: js.UndefOr[String] = js.undefined
  
  /** POST parameters to the suggest_url as a query string. */
  var suggest_url_post_params: js.UndefOr[String] = js.undefined
}
object WebExtensionManifestChromeSettingsOverridesSearchProvider {
  
  @scala.inline
  def apply(name: String, search_url: String): WebExtensionManifestChromeSettingsOverridesSearchProvider = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], search_url = search_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestChromeSettingsOverridesSearchProvider]
  }
  
  @scala.inline
  implicit class WebExtensionManifestChromeSettingsOverridesSearchProviderMutableBuilder[Self <: WebExtensionManifestChromeSettingsOverridesSearchProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternate_urls(value: js.Array[String]): Self = StObject.set(x, "alternate_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternate_urlsUndefined: Self = StObject.set(x, "alternate_urls", js.undefined)
    
    @scala.inline
    def setAlternate_urlsVarargs(value: String*): Self = StObject.set(x, "alternate_urls", js.Array(value :_*))
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFavicon_url(value: String): Self = StObject.set(x, "favicon_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFavicon_urlUndefined: Self = StObject.set(x, "favicon_url", js.undefined)
    
    @scala.inline
    def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_urlUndefined: Self = StObject.set(x, "image_url", js.undefined)
    
    @scala.inline
    def setImage_url_post_params(value: String): Self = StObject.set(x, "image_url_post_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_url_post_paramsUndefined: Self = StObject.set(x, "image_url_post_params", js.undefined)
    
    @scala.inline
    def setInstant_url(value: String): Self = StObject.set(x, "instant_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstant_urlUndefined: Self = StObject.set(x, "instant_url", js.undefined)
    
    @scala.inline
    def setInstant_url_post_params(value: String): Self = StObject.set(x, "instant_url_post_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstant_url_post_paramsUndefined: Self = StObject.set(x, "instant_url_post_params", js.undefined)
    
    @scala.inline
    def setIs_default(value: Boolean): Self = StObject.set(x, "is_default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_defaultUndefined: Self = StObject.set(x, "is_default", js.undefined)
    
    @scala.inline
    def setKeyword(value: String | js.Array[String]): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
    
    @scala.inline
    def setKeywordVarargs(value: String*): Self = StObject.set(x, "keyword", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Array[WebExtensionManifestChromeSettingsOverridesSearchProviderParams]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setParamsVarargs(value: WebExtensionManifestChromeSettingsOverridesSearchProviderParams*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setPrepopulated_id(value: Double): Self = StObject.set(x, "prepopulated_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepopulated_idUndefined: Self = StObject.set(x, "prepopulated_id", js.undefined)
    
    @scala.inline
    def setSearch_form(value: String): Self = StObject.set(x, "search_form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch_formUndefined: Self = StObject.set(x, "search_form", js.undefined)
    
    @scala.inline
    def setSearch_url(value: String): Self = StObject.set(x, "search_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch_url_get_params(value: String): Self = StObject.set(x, "search_url_get_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch_url_get_paramsUndefined: Self = StObject.set(x, "search_url_get_params", js.undefined)
    
    @scala.inline
    def setSearch_url_post_params(value: String): Self = StObject.set(x, "search_url_post_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch_url_post_paramsUndefined: Self = StObject.set(x, "search_url_post_params", js.undefined)
    
    @scala.inline
    def setSuggest_url(value: String): Self = StObject.set(x, "suggest_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggest_urlUndefined: Self = StObject.set(x, "suggest_url", js.undefined)
    
    @scala.inline
    def setSuggest_url_get_params(value: String): Self = StObject.set(x, "suggest_url_get_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggest_url_get_paramsUndefined: Self = StObject.set(x, "suggest_url_get_params", js.undefined)
    
    @scala.inline
    def setSuggest_url_post_params(value: String): Self = StObject.set(x, "suggest_url_post_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggest_url_post_paramsUndefined: Self = StObject.set(x, "suggest_url_post_params", js.undefined)
  }
}
