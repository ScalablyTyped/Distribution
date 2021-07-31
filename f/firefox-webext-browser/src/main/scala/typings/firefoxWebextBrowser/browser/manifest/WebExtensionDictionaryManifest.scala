package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a WebExtension dictionary manifest.json file */
trait WebExtensionDictionaryManifest extends StObject {
  
  var applications: js.UndefOr[WebExtensionDictionaryManifestApplications] = js.undefined
  
  var author: js.UndefOr[String] = js.undefined
  
  var browser_specific_settings: js.UndefOr[WebExtensionDictionaryManifestBrowserSpecificSettings] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var dictionaries: WebExtensionDictionaryManifestDictionaries
  
  var homepage_url: js.UndefOr[String] = js.undefined
  
  var manifest_version: Double
  
  var name: String
  
  var short_name: js.UndefOr[String] = js.undefined
  
  var version: String
}
object WebExtensionDictionaryManifest {
  
  @scala.inline
  def apply(
    dictionaries: WebExtensionDictionaryManifestDictionaries,
    manifest_version: Double,
    name: String,
    version: String
  ): WebExtensionDictionaryManifest = {
    val __obj = js.Dynamic.literal(dictionaries = dictionaries.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionDictionaryManifest]
  }
  
  @scala.inline
  implicit class WebExtensionDictionaryManifestMutableBuilder[Self <: WebExtensionDictionaryManifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplications(value: WebExtensionDictionaryManifestApplications): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setBrowser_specific_settings(value: WebExtensionDictionaryManifestBrowserSpecificSettings): Self = StObject.set(x, "browser_specific_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowser_specific_settingsUndefined: Self = StObject.set(x, "browser_specific_settings", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDictionaries(value: WebExtensionDictionaryManifestDictionaries): Self = StObject.set(x, "dictionaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomepage_url(value: String): Self = StObject.set(x, "homepage_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomepage_urlUndefined: Self = StObject.set(x, "homepage_url", js.undefined)
    
    @scala.inline
    def setManifest_version(value: Double): Self = StObject.set(x, "manifest_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort_nameUndefined: Self = StObject.set(x, "short_name", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
