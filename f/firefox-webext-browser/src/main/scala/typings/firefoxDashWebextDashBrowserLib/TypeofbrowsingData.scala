package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofbrowsingData extends js.Object {
  /**
    * Clears various types of browsing data stored in a user's profile.
    * @param dataToRemove The set of data types to remove.
    */
  def remove(
    options: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions,
    dataToRemove: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.DataTypeSet
  ): js.Promise[scala.Unit]
  /**
    * Clears websites' appcache data.
    * @deprecated Unsupported on Firefox at this time.
    */
  def removeAppcache(options: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions): js.Promise[scala.Unit]
  /** Clears the browser's cache. */
  def removeCache(options: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions): js.Promise[scala.Unit]
  /** Clears the browser's cookies and server-bound certificates modified within a particular timeframe. */
  def removeCookies(options: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions): js.Promise[scala.Unit]
  /** Clears the browser's list of downloaded files (_not_ the downloaded files themselves). */
  def removeDownloads(options: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions): js.Promise[scala.Unit]
  /**
    * Clears websites' file system data.
    * @deprecated Unsupported on Firefox at this time.
    */
  def removeFileSystems(options: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions): js.Promise[scala.Unit]
  /** Clears the browser's stored form data (autofill). */
  def removeFormData(options: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions): js.Promise[scala.Unit]
  /** Clears the browser's history. */
  def removeHistory(options: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions): js.Promise[scala.Unit]
  /**
    * Clears websites' IndexedDB data.
    * @deprecated Unsupported on Firefox at this time.
    */
  def removeIndexedDB(options: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions): js.Promise[scala.Unit]
  /** Clears websites' local storage data. */
  def removeLocalStorage(options: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions): js.Promise[scala.Unit]
  /** Clears the browser's stored passwords. */
  def removePasswords(options: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions): js.Promise[scala.Unit]
  /** Clears plugins' data. */
  def removePluginData(options: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions): js.Promise[scala.Unit]
  /**
    * Clears websites' WebSQL data.
    * @deprecated Unsupported on Firefox at this time.
    */
  def removeWebSQL(options: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions): js.Promise[scala.Unit]
  /* browsingData functions */
  /**
    * Reports which types of data are currently selected in the 'Clear browsing data' settings UI. Note: some of the
    * data types included in this API are not available in the settings UI, and some UI settings control more than one
    * data type listed here.
    */
  def settings(): js.Promise[Anon_DataRemovalPermitted]
}

object TypeofbrowsingData {
  @scala.inline
  def apply(
    remove: (firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions, firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.DataTypeSet) => js.Promise[scala.Unit],
    removeAppcache: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions => js.Promise[scala.Unit],
    removeCache: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions => js.Promise[scala.Unit],
    removeCookies: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions => js.Promise[scala.Unit],
    removeDownloads: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions => js.Promise[scala.Unit],
    removeFileSystems: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions => js.Promise[scala.Unit],
    removeFormData: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions => js.Promise[scala.Unit],
    removeHistory: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions => js.Promise[scala.Unit],
    removeIndexedDB: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions => js.Promise[scala.Unit],
    removeLocalStorage: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions => js.Promise[scala.Unit],
    removePasswords: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions => js.Promise[scala.Unit],
    removePluginData: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions => js.Promise[scala.Unit],
    removeWebSQL: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions => js.Promise[scala.Unit],
    settings: () => js.Promise[Anon_DataRemovalPermitted]
  ): TypeofbrowsingData = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction2(remove), removeAppcache = js.Any.fromFunction1(removeAppcache), removeCache = js.Any.fromFunction1(removeCache), removeCookies = js.Any.fromFunction1(removeCookies), removeDownloads = js.Any.fromFunction1(removeDownloads), removeFileSystems = js.Any.fromFunction1(removeFileSystems), removeFormData = js.Any.fromFunction1(removeFormData), removeHistory = js.Any.fromFunction1(removeHistory), removeIndexedDB = js.Any.fromFunction1(removeIndexedDB), removeLocalStorage = js.Any.fromFunction1(removeLocalStorage), removePasswords = js.Any.fromFunction1(removePasswords), removePluginData = js.Any.fromFunction1(removePluginData), removeWebSQL = js.Any.fromFunction1(removeWebSQL), settings = js.Any.fromFunction0(settings))
  
    __obj.asInstanceOf[TypeofbrowsingData]
  }
}

