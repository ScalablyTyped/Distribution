package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.browser.browsingData.DataTypeSet
import typings.firefoxWebextBrowser.browser.browsingData.RemovalOptions
import typings.firefoxWebextBrowser.browser.browsingData.SettingsReturnResult
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
  
  @JSGlobal("browser.browsingData")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Clears various types of browsing data stored in a user's profile.
    * @param dataToRemove The set of data types to remove.
    */
  @scala.inline
  def remove(options: RemovalOptions, dataToRemove: DataTypeSet): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(options.asInstanceOf[js.Any], dataToRemove.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Clears websites' appcache data.
    * @deprecated Unsupported on Firefox at this time.
    */
  @scala.inline
  def removeAppcache(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAppcache")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /** Clears the browser's cache. */
  @scala.inline
  def removeCache(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCache")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /** Clears the browser's cookies and server-bound certificates modified within a particular timeframe. */
  @scala.inline
  def removeCookies(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCookies")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /** Clears the browser's list of downloaded files (_not_ the downloaded files themselves). */
  @scala.inline
  def removeDownloads(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeDownloads")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Clears websites' file system data.
    * @deprecated Unsupported on Firefox at this time.
    */
  @scala.inline
  def removeFileSystems(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFileSystems")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /** Clears the browser's stored form data (autofill). */
  @scala.inline
  def removeFormData(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFormData")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /** Clears the browser's history. */
  @scala.inline
  def removeHistory(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeHistory")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Clears websites' IndexedDB data.
    * @deprecated Unsupported on Firefox at this time.
    */
  @scala.inline
  def removeIndexedDB(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeIndexedDB")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /** Clears websites' local storage data. */
  @scala.inline
  def removeLocalStorage(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLocalStorage")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /** Clears the browser's stored passwords. */
  @scala.inline
  def removePasswords(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removePasswords")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /** Clears plugins' data. */
  @scala.inline
  def removePluginData(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removePluginData")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Clears websites' WebSQL data.
    * @deprecated Unsupported on Firefox at this time.
    */
  @scala.inline
  def removeWebSQL(options: RemovalOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeWebSQL")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /* browsingData functions */
  /**
    * Reports which types of data are currently selected in the 'Clear browsing data' settings UI. Note: some of the data types included in this API are not available in the settings UI, and some UI settings control more than one data type listed here.
    */
  @scala.inline
  def settings(): js.Promise[SettingsReturnResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("settings")().asInstanceOf[js.Promise[SettingsReturnResult]]
}
