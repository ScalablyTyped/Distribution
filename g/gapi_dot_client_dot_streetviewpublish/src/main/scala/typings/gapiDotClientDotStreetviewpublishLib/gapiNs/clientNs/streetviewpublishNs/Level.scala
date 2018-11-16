package typings
package gapiDotClientDotStreetviewpublishLib.gapiNs.clientNs.streetviewpublishNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Level extends js.Object {
  /**
               * Required. A name assigned to this Level, restricted to 3 characters.
               * Consider how the elevator buttons would be labeled for this level if there
               * was an elevator.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Floor number, used for ordering. 0 indicates the ground level, 1 indicates
               * the first level above ground level, -1 indicates the first level under
               * ground level. Non-integer values are OK.
               */
  var number: js.UndefOr[scala.Double] = js.undefined
}

