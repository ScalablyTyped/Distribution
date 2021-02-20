package typings.firefoxWebextBrowser.global.browser

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.storage.StorageArea
import typings.firefoxWebextBrowser.browser.storage.StorageAreaSync
import typings.firefoxWebextBrowser.browser.storage.StorageChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.storage` API to store, retrieve, and track changes to user data.
  *
  * Permissions: `storage`
  */
object storage {
  
  /** Items in the `local` storage area are local to each machine. */
  @JSGlobal("browser.storage.local")
  @js.native
  val local: StorageArea = js.native
  
  /**
    * Items in the `managed` storage area are set by administrators or native applications, and are read-only for the extension; trying to modify this namespace results in an error.
    */
  @JSGlobal("browser.storage.managed")
  @js.native
  val managed: StorageArea = js.native
  
  /* storage events */
  /**
    * Fired when one or more items change.
    * @param changes Object mapping each key that changed to its corresponding `storage.StorageChange` for that item.
    * @param areaName The name of the storage area (`"sync"`, `"local"` or `"managed"`) the changes are for.
    */
  @JSGlobal("browser.storage.onChanged")
  @js.native
  val onChanged: WebExtEvent[
    js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ String, Unit]
  ] = js.native
  
  /* storage properties */
  /** Items in the `sync` storage area are synced by the browser. */
  @JSGlobal("browser.storage.sync")
  @js.native
  val sync: StorageAreaSync = js.native
}
