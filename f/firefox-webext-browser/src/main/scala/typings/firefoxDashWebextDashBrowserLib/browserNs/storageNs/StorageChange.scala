package typings
package firefoxDashWebextDashBrowserLib.browserNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* storage types */

trait StorageChange extends js.Object {
  /** The new value of the item, if there is a new value. */
  var newValue: js.UndefOr[js.Any] = js.undefined
  /** The old value of the item, if there was an old value. */
  var oldValue: js.UndefOr[js.Any] = js.undefined
}

