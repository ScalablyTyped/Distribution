package typings.firefoxWebextBrowser.browser

import typings.firefoxWebextBrowser.browser.manifest.ExtensionID
import typings.firefoxWebextBrowser.browser.manifest.HttpURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `browser.management` API provides ways to manage the list of extensions that are installed and running.
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object management {
  
  /** A reason the item is disabled. */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.permissions_increase
  */
  trait ExtensionDisabledReason extends StObject
  object ExtensionDisabledReason {
    
    inline def permissions_increase: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.permissions_increase = "permissions_increase".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.permissions_increase]
    
    inline def unknown: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = "unknown".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown]
  }
  
  /** Information about an installed extension. */
  trait ExtensionInfo extends StObject {
    
    /** The description of this extension. */
    var description: String
    
    /** A reason the item is disabled. */
    var disabledReason: js.UndefOr[ExtensionDisabledReason] = js.undefined
    
    /** Whether it is currently enabled or disabled. */
    var enabled: Boolean
    
    /** The URL of the homepage of this extension. */
    var homepageUrl: js.UndefOr[String] = js.undefined
    
    /** Returns a list of host based permissions. */
    var hostPermissions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A list of icon information. Note that this just reflects what was declared in the manifest, and the actual image at that url may be larger or smaller than what was declared, so you might consider using explicit width and height attributes on img tags referencing these images. See the manifest documentation on icons for more details.
      */
    var icons: js.UndefOr[js.Array[IconInfo]] = js.undefined
    
    /** The extension's unique identifier. */
    var id: String
    
    /** How the extension was installed. */
    var installType: ExtensionInstallType
    
    /** Whether this extension can be disabled or uninstalled by the user. */
    var mayDisable: Boolean
    
    /** The name of this extension. */
    var name: String
    
    /** The url for the item's options page, if it has one. */
    var optionsUrl: String
    
    /** Returns a list of API based permissions. */
    var permissions: js.UndefOr[js.Array[String]] = js.undefined
    
    /** A short version of the name of this extension. */
    var shortName: js.UndefOr[String] = js.undefined
    
    /** The type of this extension, 'extension' or 'theme'. */
    var `type`: ExtensionType
    
    /** The update URL of this extension. */
    var updateUrl: js.UndefOr[String] = js.undefined
    
    /** The version of this extension. */
    var version: String
    
    /** The version name of this extension if the manifest specified one. */
    var versionName: js.UndefOr[String] = js.undefined
  }
  object ExtensionInfo {
    
    inline def apply(
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
    
    extension [Self <: ExtensionInfo](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDisabledReason(value: ExtensionDisabledReason): Self = StObject.set(x, "disabledReason", value.asInstanceOf[js.Any])
      
      inline def setDisabledReasonUndefined: Self = StObject.set(x, "disabledReason", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setHomepageUrl(value: String): Self = StObject.set(x, "homepageUrl", value.asInstanceOf[js.Any])
      
      inline def setHomepageUrlUndefined: Self = StObject.set(x, "homepageUrl", js.undefined)
      
      inline def setHostPermissions(value: js.Array[String]): Self = StObject.set(x, "hostPermissions", value.asInstanceOf[js.Any])
      
      inline def setHostPermissionsUndefined: Self = StObject.set(x, "hostPermissions", js.undefined)
      
      inline def setHostPermissionsVarargs(value: String*): Self = StObject.set(x, "hostPermissions", js.Array(value*))
      
      inline def setIcons(value: js.Array[IconInfo]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setIconsVarargs(value: IconInfo*): Self = StObject.set(x, "icons", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInstallType(value: ExtensionInstallType): Self = StObject.set(x, "installType", value.asInstanceOf[js.Any])
      
      inline def setMayDisable(value: Boolean): Self = StObject.set(x, "mayDisable", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptionsUrl(value: String): Self = StObject.set(x, "optionsUrl", value.asInstanceOf[js.Any])
      
      inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
      
      inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
      
      inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
      
      inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
      
      inline def setType(value: ExtensionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUpdateUrl(value: String): Self = StObject.set(x, "updateUrl", value.asInstanceOf[js.Any])
      
      inline def setUpdateUrlUndefined: Self = StObject.set(x, "updateUrl", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionName(value: String): Self = StObject.set(x, "versionName", value.asInstanceOf[js.Any])
      
      inline def setVersionNameUndefined: Self = StObject.set(x, "versionName", js.undefined)
    }
  }
  
  /**
    * How the extension was installed. One of
    * `development`: The extension was loaded unpacked in developer mode,
    * `normal`: The extension was installed normally via an .xpi file,
    * `sideload`: The extension was installed by other software on the machine,
    * `other`: The extension was installed by other means.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.development
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.sideload
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.other
  */
  trait ExtensionInstallType extends StObject
  object ExtensionInstallType {
    
    inline def development: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.development = "development".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.development]
    
    inline def normal: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = "normal".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal]
    
    inline def other: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.other = "other".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.other]
    
    inline def sideload: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.sideload = "sideload".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.sideload]
  }
  
  /** The type of this extension, 'extension' or 'theme'. */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`extension`
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.theme
  */
  trait ExtensionType extends StObject
  object ExtensionType {
    
    inline def `extension`: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`extension` = "extension".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`extension`]
    
    inline def theme: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.theme = "theme".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.theme]
  }
  
  /* management types */
  /** Information about an icon belonging to an extension. */
  trait IconInfo extends StObject {
    
    /**
      * A number representing the width and height of the icon. Likely values include (but are not limited to) 128, 48, 24, and 16.
      */
    var size: Double
    
    /**
      * The URL for this icon image. To display a grayscale version of the icon (to indicate that an extension is disabled, for example), append `?grayscale=true` to the URL.
      */
    var url: String
  }
  object IconInfo {
    
    inline def apply(size: Double, url: String): IconInfo = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconInfo]
    }
    
    extension [Self <: IconInfo](x: Self) {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait InstallOptions extends StObject {
    
    /** A hash of the XPI file, using sha256 or stronger. */
    var hash: js.UndefOr[String] = js.undefined
    
    /** URL pointing to the XPI file on addons.mozilla.org or similar. */
    var url: HttpURL
  }
  object InstallOptions {
    
    inline def apply(url: HttpURL): InstallOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallOptions]
    }
    
    extension [Self <: InstallOptions](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setUrl(value: HttpURL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait InstallReturnResult extends StObject {
    
    var id: ExtensionID
  }
  object InstallReturnResult {
    
    inline def apply(id: ExtensionID): InstallReturnResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallReturnResult]
    }
    
    extension [Self <: InstallReturnResult](x: Self) {
      
      inline def setId(value: ExtensionID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait UninstallSelfOptions extends StObject {
    
    /** The message to display to a user when being asked to confirm removal of the extension. */
    var dialogMessage: js.UndefOr[String] = js.undefined
    
    /** Whether or not a confirm-uninstall dialog should prompt the user. Defaults to false. */
    var showConfirmDialog: js.UndefOr[Boolean] = js.undefined
  }
  object UninstallSelfOptions {
    
    inline def apply(): UninstallSelfOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UninstallSelfOptions]
    }
    
    extension [Self <: UninstallSelfOptions](x: Self) {
      
      inline def setDialogMessage(value: String): Self = StObject.set(x, "dialogMessage", value.asInstanceOf[js.Any])
      
      inline def setDialogMessageUndefined: Self = StObject.set(x, "dialogMessage", js.undefined)
      
      inline def setShowConfirmDialog(value: Boolean): Self = StObject.set(x, "showConfirmDialog", value.asInstanceOf[js.Any])
      
      inline def setShowConfirmDialogUndefined: Self = StObject.set(x, "showConfirmDialog", js.undefined)
    }
  }
}
