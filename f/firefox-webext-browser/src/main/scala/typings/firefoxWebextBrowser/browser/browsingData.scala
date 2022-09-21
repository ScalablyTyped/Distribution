package typings.firefoxWebextBrowser.browser

import typings.firefoxWebextBrowser.browser.extensionTypes.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.browsingData` API to remove browsing data from a user's local profile.
  *
  * Permissions: `browsingData`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object browsingData {
  
  /** A set of data types. Missing data types are interpreted as `false`. */
  trait DataTypeSet extends StObject {
    
    /**
      * The browser's cache. Note: when removing data, this clears the _entire_ cache: it is not limited to the range you specify.
      */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /** The browser's cookies. */
    var cookies: js.UndefOr[Boolean] = js.undefined
    
    /** The browser's download list. */
    var downloads: js.UndefOr[Boolean] = js.undefined
    
    /** The browser's stored form data. */
    var formData: js.UndefOr[Boolean] = js.undefined
    
    /** The browser's history. */
    var history: js.UndefOr[Boolean] = js.undefined
    
    /** Websites' IndexedDB data. */
    var indexedDB: js.UndefOr[Boolean] = js.undefined
    
    /** Websites' local storage data. */
    var localStorage: js.UndefOr[Boolean] = js.undefined
    
    /** Stored passwords. */
    var passwords: js.UndefOr[Boolean] = js.undefined
    
    /** Plugins' data. */
    var pluginData: js.UndefOr[Boolean] = js.undefined
    
    /** Server-bound certificates. */
    var serverBoundCertificates: js.UndefOr[Boolean] = js.undefined
    
    /** Service Workers. */
    var serviceWorkers: js.UndefOr[Boolean] = js.undefined
  }
  object DataTypeSet {
    
    inline def apply(): DataTypeSet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataTypeSet]
    }
    
    extension [Self <: DataTypeSet](x: Self) {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCookies(value: Boolean): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setDownloads(value: Boolean): Self = StObject.set(x, "downloads", value.asInstanceOf[js.Any])
      
      inline def setDownloadsUndefined: Self = StObject.set(x, "downloads", js.undefined)
      
      inline def setFormData(value: Boolean): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
      
      inline def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setIndexedDB(value: Boolean): Self = StObject.set(x, "indexedDB", value.asInstanceOf[js.Any])
      
      inline def setIndexedDBUndefined: Self = StObject.set(x, "indexedDB", js.undefined)
      
      inline def setLocalStorage(value: Boolean): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
      
      inline def setLocalStorageUndefined: Self = StObject.set(x, "localStorage", js.undefined)
      
      inline def setPasswords(value: Boolean): Self = StObject.set(x, "passwords", value.asInstanceOf[js.Any])
      
      inline def setPasswordsUndefined: Self = StObject.set(x, "passwords", js.undefined)
      
      inline def setPluginData(value: Boolean): Self = StObject.set(x, "pluginData", value.asInstanceOf[js.Any])
      
      inline def setPluginDataUndefined: Self = StObject.set(x, "pluginData", js.undefined)
      
      inline def setServerBoundCertificates(value: Boolean): Self = StObject.set(x, "serverBoundCertificates", value.asInstanceOf[js.Any])
      
      inline def setServerBoundCertificatesUndefined: Self = StObject.set(x, "serverBoundCertificates", js.undefined)
      
      inline def setServiceWorkers(value: Boolean): Self = StObject.set(x, "serviceWorkers", value.asInstanceOf[js.Any])
      
      inline def setServiceWorkersUndefined: Self = StObject.set(x, "serviceWorkers", js.undefined)
    }
  }
  
  /* browsingData types */
  /** Options that determine exactly what data will be removed. */
  trait RemovalOptions extends StObject {
    
    /** Only remove data associated with this specific cookieStoreId. */
    var cookieStoreId: js.UndefOr[String] = js.undefined
    
    /** Only remove data associated with these hostnames (only applies to cookies and localStorage). */
    var hostnames: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * An object whose properties specify which origin types ought to be cleared. If this object isn't specified, it defaults to clearing only "unprotected" origins. Please ensure that you _really_ want to remove application data before adding 'protectedWeb' or 'extensions'.
      */
    var originTypes: js.UndefOr[RemovalOptionsOriginTypes] = js.undefined
    
    /**
      * Remove data accumulated on or after this date, represented in milliseconds since the epoch (accessible via the `getTime` method of the JavaScript `Date` object). If absent, defaults to 0 (which would remove all browsing data).
      */
    var since: js.UndefOr[Date] = js.undefined
  }
  object RemovalOptions {
    
    inline def apply(): RemovalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemovalOptions]
    }
    
    extension [Self <: RemovalOptions](x: Self) {
      
      inline def setCookieStoreId(value: String): Self = StObject.set(x, "cookieStoreId", value.asInstanceOf[js.Any])
      
      inline def setCookieStoreIdUndefined: Self = StObject.set(x, "cookieStoreId", js.undefined)
      
      inline def setHostnames(value: js.Array[String]): Self = StObject.set(x, "hostnames", value.asInstanceOf[js.Any])
      
      inline def setHostnamesUndefined: Self = StObject.set(x, "hostnames", js.undefined)
      
      inline def setHostnamesVarargs(value: String*): Self = StObject.set(x, "hostnames", js.Array(value*))
      
      inline def setOriginTypes(value: RemovalOptionsOriginTypes): Self = StObject.set(x, "originTypes", value.asInstanceOf[js.Any])
      
      inline def setOriginTypesUndefined: Self = StObject.set(x, "originTypes", js.undefined)
      
      inline def setSince(value: Date): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
      
      inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    }
  }
  
  /**
    * An object whose properties specify which origin types ought to be cleared. If this object isn't specified, it defaults to clearing only "unprotected" origins. Please ensure that you _really_ want to remove application data before adding 'protectedWeb' or 'extensions'.
    */
  trait RemovalOptionsOriginTypes extends StObject {
    
    /** Extensions and packaged applications a user has installed (be _really_ careful!). */
    var `extension`: js.UndefOr[Boolean] = js.undefined
    
    /** Websites that have been installed as hosted applications (be careful!). */
    var protectedWeb: js.UndefOr[Boolean] = js.undefined
    
    /** Normal websites. */
    var unprotectedWeb: js.UndefOr[Boolean] = js.undefined
  }
  object RemovalOptionsOriginTypes {
    
    inline def apply(): RemovalOptionsOriginTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemovalOptionsOriginTypes]
    }
    
    extension [Self <: RemovalOptionsOriginTypes](x: Self) {
      
      inline def setExtension(value: Boolean): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setProtectedWeb(value: Boolean): Self = StObject.set(x, "protectedWeb", value.asInstanceOf[js.Any])
      
      inline def setProtectedWebUndefined: Self = StObject.set(x, "protectedWeb", js.undefined)
      
      inline def setUnprotectedWeb(value: Boolean): Self = StObject.set(x, "unprotectedWeb", value.asInstanceOf[js.Any])
      
      inline def setUnprotectedWebUndefined: Self = StObject.set(x, "unprotectedWeb", js.undefined)
    }
  }
  
  trait SettingsReturnResult extends StObject {
    
    /**
      * All of the types will be present in the result, with values of `true` if they are permitted to be removed (e.g., by enterprise policy) and `false` if not.
      */
    var dataRemovalPermitted: DataTypeSet
    
    /**
      * All of the types will be present in the result, with values of `true` if they are both selected to be removed and permitted to be removed, otherwise `false`.
      */
    var dataToRemove: DataTypeSet
    
    var options: RemovalOptions
  }
  object SettingsReturnResult {
    
    inline def apply(dataRemovalPermitted: DataTypeSet, dataToRemove: DataTypeSet, options: RemovalOptions): SettingsReturnResult = {
      val __obj = js.Dynamic.literal(dataRemovalPermitted = dataRemovalPermitted.asInstanceOf[js.Any], dataToRemove = dataToRemove.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingsReturnResult]
    }
    
    extension [Self <: SettingsReturnResult](x: Self) {
      
      inline def setDataRemovalPermitted(value: DataTypeSet): Self = StObject.set(x, "dataRemovalPermitted", value.asInstanceOf[js.Any])
      
      inline def setDataToRemove(value: DataTypeSet): Self = StObject.set(x, "dataToRemove", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: RemovalOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
