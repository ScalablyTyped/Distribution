package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClearStorageDataOptions extends js.Object {
  /**
       * Should follow window.location.origin’s representation scheme://host:port.
       */
  var origin: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The types of quotas to clear, can contain: temporary, persistent, syncable.
       */
  var quotas: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * The types of storages to clear, can contain: appcache, cookies, filesystem,
       * indexdb, localstorage, shadercache, websql, serviceworkers, cachestorage.
       */
  var storages: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

