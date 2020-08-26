package typings.firefoxWebextBrowser.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.storage.StorageArea
import typings.firefoxWebextBrowser.browser.storage.StorageAreaSync
import typings.firefoxWebextBrowser.browser.storage.StorageChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofstorage extends js.Object {
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
  val onChanged: WebExtEvent[
    js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ String, Unit]
  ] = js.native
  /* storage properties */
  /** Items in the `sync` storage area are synced by the browser. */
  val sync: StorageAreaSync = js.native
}

object Typeofstorage {
  @scala.inline
  def apply(
    local: StorageArea,
    managed: StorageArea,
    onChanged: WebExtEvent[
      js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ String, Unit]
    ],
    sync: StorageAreaSync
  ): Typeofstorage = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], managed = managed.asInstanceOf[js.Any], onChanged = onChanged.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofstorage]
  }
  @scala.inline
  implicit class TypeofstorageOps[Self <: Typeofstorage] (val x: Self) extends AnyVal {
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
    def setLocal(value: StorageArea): Self = this.set("local", value.asInstanceOf[js.Any])
    @scala.inline
    def setManaged(value: StorageArea): Self = this.set("managed", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChanged(
      value: WebExtEvent[
          js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ String, Unit]
        ]
    ): Self = this.set("onChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSync(value: StorageAreaSync): Self = this.set("sync", value.asInstanceOf[js.Any])
  }
  
}

