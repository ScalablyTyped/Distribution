package typings.firefoxWebextBrowser.browser.management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about an installed extension. */
@js.native
trait ExtensionInfo extends js.Object {
  
  /** The description of this extension. */
  var description: String = js.native
  
  /** A reason the item is disabled. */
  var disabledReason: js.UndefOr[ExtensionDisabledReason] = js.native
  
  /** Whether it is currently enabled or disabled. */
  var enabled: Boolean = js.native
  
  /** The URL of the homepage of this extension. */
  var homepageUrl: js.UndefOr[String] = js.native
  
  /** Returns a list of host based permissions. */
  var hostPermissions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of icon information. Note that this just reflects what was declared in the manifest, and the actual image at that url may be larger or smaller than what was declared, so you might consider using explicit width and height attributes on img tags referencing these images. See the manifest documentation on icons for more details.
    */
  var icons: js.UndefOr[js.Array[IconInfo]] = js.native
  
  /** The extension's unique identifier. */
  var id: String = js.native
  
  /** How the extension was installed. */
  var installType: ExtensionInstallType = js.native
  
  /** Whether this extension can be disabled or uninstalled by the user. */
  var mayDisable: Boolean = js.native
  
  /** The name of this extension. */
  var name: String = js.native
  
  /** The url for the item's options page, if it has one. */
  var optionsUrl: String = js.native
  
  /** Returns a list of API based permissions. */
  var permissions: js.UndefOr[js.Array[String]] = js.native
  
  /** A short version of the name of this extension. */
  var shortName: js.UndefOr[String] = js.native
  
  /** The type of this extension, 'extension' or 'theme'. */
  var `type`: ExtensionType = js.native
  
  /** The update URL of this extension. */
  var updateUrl: js.UndefOr[String] = js.native
  
  /** The version of this extension. */
  var version: String = js.native
  
  /** The version name of this extension if the manifest specified one. */
  var versionName: js.UndefOr[String] = js.native
}
object ExtensionInfo {
  
  @scala.inline
  def apply(
    description: String,
    enabled: Boolean,
    id: String,
    installType: ExtensionInstallType,
    mayDisable: Boolean,
    name: String,
    optionsUrl: String,
    `type`: ExtensionType,
    version: String
  ): ExtensionInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], installType = installType.asInstanceOf[js.Any], mayDisable = mayDisable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionsUrl = optionsUrl.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionInfo]
  }
  
  @scala.inline
  implicit class ExtensionInfoOps[Self <: ExtensionInfo] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallType(value: ExtensionInstallType): Self = this.set("installType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMayDisable(value: Boolean): Self = this.set("mayDisable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUrl(value: String): Self = this.set("optionsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ExtensionType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledReason(value: ExtensionDisabledReason): Self = this.set("disabledReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledReason: Self = this.set("disabledReason", js.undefined)
    
    @scala.inline
    def setHomepageUrl(value: String): Self = this.set("homepageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomepageUrl: Self = this.set("homepageUrl", js.undefined)
    
    @scala.inline
    def setHostPermissionsVarargs(value: String*): Self = this.set("hostPermissions", js.Array(value :_*))
    
    @scala.inline
    def setHostPermissions(value: js.Array[String]): Self = this.set("hostPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostPermissions: Self = this.set("hostPermissions", js.undefined)
    
    @scala.inline
    def setIconsVarargs(value: IconInfo*): Self = this.set("icons", js.Array(value :_*))
    
    @scala.inline
    def setIcons(value: js.Array[IconInfo]): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setShortName(value: String): Self = this.set("shortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortName: Self = this.set("shortName", js.undefined)
    
    @scala.inline
    def setUpdateUrl(value: String): Self = this.set("updateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateUrl: Self = this.set("updateUrl", js.undefined)
    
    @scala.inline
    def setVersionName(value: String): Self = this.set("versionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionName: Self = this.set("versionName", js.undefined)
  }
}
