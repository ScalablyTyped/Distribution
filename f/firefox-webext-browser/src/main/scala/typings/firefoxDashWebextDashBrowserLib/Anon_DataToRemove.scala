package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataToRemove extends js.Object {
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

object Anon_DataToRemove {
  @scala.inline
  def apply(
    remove: js.Function2[
      firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions, 
      firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.DataTypeSet, 
      js.Promise[scala.Unit]
    ],
    removeAppcache: js.Function1[
      firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions, 
      js.Promise[scala.Unit]
    ],
    removeCache: js.Function1[
      firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions, 
      js.Promise[scala.Unit]
    ],
    removeCookies: js.Function1[
      firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions, 
      js.Promise[scala.Unit]
    ],
    removeDownloads: js.Function1[
      firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions, 
      js.Promise[scala.Unit]
    ],
    removeFileSystems: js.Function1[
      firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions, 
      js.Promise[scala.Unit]
    ],
    removeFormData: js.Function1[
      firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions, 
      js.Promise[scala.Unit]
    ],
    removeHistory: js.Function1[
      firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions, 
      js.Promise[scala.Unit]
    ],
    removeIndexedDB: js.Function1[
      firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions, 
      js.Promise[scala.Unit]
    ],
    removeLocalStorage: js.Function1[
      firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions, 
      js.Promise[scala.Unit]
    ],
    removePasswords: js.Function1[
      firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions, 
      js.Promise[scala.Unit]
    ],
    removePluginData: js.Function1[
      firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions, 
      js.Promise[scala.Unit]
    ],
    removeWebSQL: js.Function1[
      firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions, 
      js.Promise[scala.Unit]
    ],
    settings: js.Function0[js.Promise[Anon_DataRemovalPermitted]]
  ): Anon_DataToRemove = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("removeAppcache")(removeAppcache)
    __obj.updateDynamic("removeCache")(removeCache)
    __obj.updateDynamic("removeCookies")(removeCookies)
    __obj.updateDynamic("removeDownloads")(removeDownloads)
    __obj.updateDynamic("removeFileSystems")(removeFileSystems)
    __obj.updateDynamic("removeFormData")(removeFormData)
    __obj.updateDynamic("removeHistory")(removeHistory)
    __obj.updateDynamic("removeIndexedDB")(removeIndexedDB)
    __obj.updateDynamic("removeLocalStorage")(removeLocalStorage)
    __obj.updateDynamic("removePasswords")(removePasswords)
    __obj.updateDynamic("removePluginData")(removePluginData)
    __obj.updateDynamic("removeWebSQL")(removeWebSQL)
    __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[Anon_DataToRemove]
  }
}

