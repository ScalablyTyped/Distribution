package typings.firefoxWebextBrowser.browser.storage

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* storage events */
/**
  * Fired when one or more items change.
  * @param changes Object mapping each key that changed to its corresponding `storage.StorageChange` for that item.
  * @param areaName The name of the storage area (`"sync"`, `"local"` or `"managed"`) the changes are for.
  */
@JSGlobal("browser.storage.onChanged")
@js.native
object onChanged
  extends TopLevel[
      WebExtEvent[
        js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ String, Unit]
      ]
    ]

