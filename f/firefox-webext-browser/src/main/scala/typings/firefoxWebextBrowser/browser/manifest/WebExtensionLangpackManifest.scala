package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a WebExtension language pack manifest.json file */
@js.native
trait WebExtensionLangpackManifest extends StObject {
  
  var applications: js.UndefOr[WebExtensionLangpackManifestApplications] = js.native
  
  var author: js.UndefOr[String] = js.native
  
  var browser_specific_settings: js.UndefOr[WebExtensionLangpackManifestBrowserSpecificSettings] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var homepage_url: js.UndefOr[String] = js.native
  
  var langpack_id: String = js.native
  
  var languages: WebExtensionLangpackManifestLanguages = js.native
  
  var manifest_version: Double = js.native
  
  var name: String = js.native
  
  var short_name: js.UndefOr[String] = js.native
  
  var sources: js.UndefOr[WebExtensionLangpackManifestSources] = js.native
  
  var version: String = js.native
}
object WebExtensionLangpackManifest {
  
  @scala.inline
  def apply(
    langpack_id: String,
    languages: WebExtensionLangpackManifestLanguages,
    manifest_version: Double,
    name: String,
    version: String
  ): WebExtensionLangpackManifest = {
    val __obj = js.Dynamic.literal(langpack_id = langpack_id.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionLangpackManifest]
  }
  
  @scala.inline
  implicit class WebExtensionLangpackManifestMutableBuilder[Self <: WebExtensionLangpackManifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplications(value: WebExtensionLangpackManifestApplications): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setBrowser_specific_settings(value: WebExtensionLangpackManifestBrowserSpecificSettings): Self = StObject.set(x, "browser_specific_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowser_specific_settingsUndefined: Self = StObject.set(x, "browser_specific_settings", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setHomepage_url(value: String): Self = StObject.set(x, "homepage_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomepage_urlUndefined: Self = StObject.set(x, "homepage_url", js.undefined)
    
    @scala.inline
    def setLangpack_id(value: String): Self = StObject.set(x, "langpack_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguages(value: WebExtensionLangpackManifestLanguages): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifest_version(value: Double): Self = StObject.set(x, "manifest_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort_nameUndefined: Self = StObject.set(x, "short_name", js.undefined)
    
    @scala.inline
    def setSources(value: WebExtensionLangpackManifestSources): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
