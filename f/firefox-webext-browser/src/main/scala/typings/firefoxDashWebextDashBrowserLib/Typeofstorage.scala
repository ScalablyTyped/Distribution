package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofstorage extends js.Object {
  /** Items in the `local` storage area are local to each machine. */
  val local: firefoxDashWebextDashBrowserLib.browserNs.storageNs.StorageArea
  /**
    * Items in the `managed` storage area are set by administrators or native applications, and are read-only for the
    * extension; trying to modify this namespace results in an error.
    */
  val managed: firefoxDashWebextDashBrowserLib.browserNs.storageNs.StorageArea
  /* storage events */
  /**
    * Fired when one or more items change.
    * @param changes Object mapping each key that changed to its corresponding `storage.StorageChange` for that item.
    * @param areaName The name of the storage area (`"sync"`, `"local"` or `"managed"`) the changes are for.
    */
  val onChanged: WebExtEvent[
    js.Function2[
      /* changes */ firefoxDashWebextDashBrowserLib.browserNs.storageNs.StorageChange, 
      /* areaName */ java.lang.String, 
      scala.Unit
    ]
  ]
  /* storage properties */
  /** Items in the `sync` storage area are synced by the browser. */
  val sync: firefoxDashWebextDashBrowserLib.browserNs.storageNs.StorageArea
}

object Typeofstorage {
  @scala.inline
  def apply(
    local: firefoxDashWebextDashBrowserLib.browserNs.storageNs.StorageArea,
    managed: firefoxDashWebextDashBrowserLib.browserNs.storageNs.StorageArea,
    onChanged: WebExtEvent[
      js.Function2[
        /* changes */ firefoxDashWebextDashBrowserLib.browserNs.storageNs.StorageChange, 
        /* areaName */ java.lang.String, 
        scala.Unit
      ]
    ],
    sync: firefoxDashWebextDashBrowserLib.browserNs.storageNs.StorageArea
  ): Typeofstorage = {
    val __obj = js.Dynamic.literal(local = local, managed = managed, onChanged = onChanged, sync = sync)
  
    __obj.asInstanceOf[Typeofstorage]
  }
}

