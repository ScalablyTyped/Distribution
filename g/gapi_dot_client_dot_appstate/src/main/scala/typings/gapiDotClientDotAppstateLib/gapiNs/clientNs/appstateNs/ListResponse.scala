package typings
package gapiDotClientDotAppstateLib.gapiNs.clientNs.appstateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListResponse extends js.Object {
  /** The app state data. */
  var items: js.UndefOr[js.Array[GetResponse]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string appstate#listResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum number of keys allowed for this user. */
  var maximumKeyCount: js.UndefOr[scala.Double] = js.undefined
}

