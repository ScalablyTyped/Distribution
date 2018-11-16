package typings
package firefoxDashWebextDashBrowserLib.browserNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.storage")
@js.native
object storageNsMembers extends js.Object {
  /** Items in the `local` storage area are local to each machine. */
  val local: StorageArea = js.native
  /**
       * Items in the `managed` storage area are set by administrators or native applications, and are read-only for the
       * extension; trying to modify this namespace results in an error.
       */
  val managed: StorageArea = js.native
  /* storage events */
  /**
       * Fired when one or more items change.
       * @param changes Object mapping each key that changed to its corresponding `storage.StorageChange` for that item.
       * @param areaName The name of the storage area (`"sync"`, `"local"` or `"managed"`) the changes are for.
       */
  val onChanged: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function2[/* changes */ StorageChange, /* areaName */ java.lang.String, scala.Unit]
  ] = js.native
  /* storage properties */
  /** Items in the `sync` storage area are synced by the browser. */
  val sync: StorageArea = js.native
}

