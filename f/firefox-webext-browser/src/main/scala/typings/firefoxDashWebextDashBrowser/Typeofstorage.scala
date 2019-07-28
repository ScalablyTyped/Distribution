package typings.firefoxDashWebextDashBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxDashWebextDashBrowser.browserNs.storageNs.StorageArea
import typings.firefoxDashWebextDashBrowser.browserNs.storageNs.StorageChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofstorage extends js.Object {
  /** Items in the `local` storage area are local to each machine. */
  val local: StorageArea
  /**
    * Items in the `managed` storage area are set by administrators or native applications, and are read-only for the
    * extension; trying to modify this namespace results in an error.
    */
  val managed: StorageArea
  /* storage events */
  /**
    * Fired when one or more items change.
    * @param changes Object mapping each key that changed to its corresponding `storage.StorageChange` for that item.
    * @param areaName The name of the storage area (`"sync"`, `"local"` or `"managed"`) the changes are for.
    */
  val onChanged: WebExtEvent[
    js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ String, Unit]
  ]
  /* storage properties */
  /** Items in the `sync` storage area are synced by the browser. */
  val sync: StorageArea
}

object Typeofstorage {
  @scala.inline
  def apply(
    local: StorageArea,
    managed: StorageArea,
    onChanged: WebExtEvent[
      js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ String, Unit]
    ],
    sync: StorageArea
  ): Typeofstorage = {
    val __obj = js.Dynamic.literal(local = local, managed = managed, onChanged = onChanged, sync = sync)
  
    __obj.asInstanceOf[Typeofstorage]
  }
}

