package typings
package gapiDotClientDotProximitybeaconLib.gapiNs.clientNs.proximitybeaconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AttachmentInfo extends js.Object {
  /** An opaque data container for client-provided data. */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Specifies what kind of attachment this is. Tells a client how to
               * interpret the `data` field. Format is <var>namespace/type</var>, for
               * example <code>scrupulous-wombat-12345/welcome-message</code>
               */
  var namespacedType: js.UndefOr[java.lang.String] = js.undefined
}

