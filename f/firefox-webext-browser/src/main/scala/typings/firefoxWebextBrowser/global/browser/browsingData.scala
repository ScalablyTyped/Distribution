package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.browser.browsingData.DataTypeSet
import typings.firefoxWebextBrowser.browser.browsingData.RemovalOptions
import typings.firefoxWebextBrowser.browser.browsingData.SettingsReturnResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.browsingData` API to remove browsing data from a user's local profile.
  *
  * Permissions: `browsingData`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object browsingData {
  
  /**
    * Clears various types of browsing data stored in a user's profile.
    * @param dataToRemove The set of data types to remove.
    */
  @JSGlobal("browser.browsingData.remove")
  @js.native
  def remove(options: RemovalOptions, dataToRemove: DataTypeSet): js.Promise[Unit] = js.native
  
  /**
    * Clears websites' appcache data.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.browsingData.removeAppcache")
  @js.native
  def removeAppcache(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /** Clears the browser's cache. */
  @JSGlobal("browser.browsingData.removeCache")
  @js.native
  def removeCache(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /** Clears the browser's cookies and server-bound certificates modified within a particular timeframe. */
  @JSGlobal("browser.browsingData.removeCookies")
  @js.native
  def removeCookies(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /** Clears the browser's list of downloaded files (_not_ the downloaded files themselves). */
  @JSGlobal("browser.browsingData.removeDownloads")
  @js.native
  def removeDownloads(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /**
    * Clears websites' file system data.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.browsingData.removeFileSystems")
  @js.native
  def removeFileSystems(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /** Clears the browser's stored form data (autofill). */
  @JSGlobal("browser.browsingData.removeFormData")
  @js.native
  def removeFormData(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /** Clears the browser's history. */
  @JSGlobal("browser.browsingData.removeHistory")
  @js.native
  def removeHistory(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /**
    * Clears websites' IndexedDB data.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.browsingData.removeIndexedDB")
  @js.native
  def removeIndexedDB(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /** Clears websites' local storage data. */
  @JSGlobal("browser.browsingData.removeLocalStorage")
  @js.native
  def removeLocalStorage(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /** Clears the browser's stored passwords. */
  @JSGlobal("browser.browsingData.removePasswords")
  @js.native
  def removePasswords(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /** Clears plugins' data. */
  @JSGlobal("browser.browsingData.removePluginData")
  @js.native
  def removePluginData(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /**
    * Clears websites' WebSQL data.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.browsingData.removeWebSQL")
  @js.native
  def removeWebSQL(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /* browsingData functions */
  /**
    * Reports which types of data are currently selected in the 'Clear browsing data' settings UI. Note: some of the data types included in this API are not available in the settings UI, and some UI settings control more than one data type listed here.
    */
  @JSGlobal("browser.browsingData.settings")
  @js.native
  def settings(): js.Promise[SettingsReturnResult] = js.native
}
