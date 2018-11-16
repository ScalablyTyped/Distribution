package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BatchUpdatePresentationRequest extends js.Object {
  /** A list of updates to apply to the presentation. */
  var requests: js.UndefOr[js.Array[Request]] = js.undefined
  /** Provides control over how write requests are executed. */
  var writeControl: js.UndefOr[WriteControl] = js.undefined
}

