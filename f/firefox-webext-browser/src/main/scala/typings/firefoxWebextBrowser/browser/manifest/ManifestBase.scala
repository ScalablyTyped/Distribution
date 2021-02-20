package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Common properties for all manifest.json files */
@js.native
trait ManifestBase extends StObject {
  
  var applications: js.UndefOr[ManifestBaseApplications] = js.native
  
  var author: js.UndefOr[String] = js.native
  
  var browser_specific_settings: js.UndefOr[ManifestBaseBrowserSpecificSettings] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var homepage_url: js.UndefOr[String] = js.native
  
  var manifest_version: Double = js.native
  
  var name: String = js.native
  
  var short_name: js.UndefOr[String] = js.native
  
  var version: String = js.native
}
object ManifestBase {
  
  @scala.inline
  def apply(manifest_version: Double, name: String, version: String): ManifestBase = {
    val __obj = js.Dynamic.literal(manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestBase]
  }
  
  @scala.inline
  implicit class ManifestBaseMutableBuilder[Self <: ManifestBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplications(value: ManifestBaseApplications): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setBrowser_specific_settings(value: ManifestBaseBrowserSpecificSettings): Self = StObject.set(x, "browser_specific_settings", value.asInstanceOf[js.Any])
    
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
