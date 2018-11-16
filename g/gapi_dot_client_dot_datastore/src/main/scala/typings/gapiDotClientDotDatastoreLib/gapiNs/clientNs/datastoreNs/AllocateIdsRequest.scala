package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AllocateIdsRequest extends js.Object {
  /**
               * A list of keys with incomplete key paths for which to allocate IDs.
               * No key may be reserved/read-only.
               */
  var keys: js.UndefOr[js.Array[Key]] = js.undefined
}

