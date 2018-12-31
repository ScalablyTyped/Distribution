package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevertTriggerResponse extends js.Object {
  /**
    * Trigger as it appears in the latest container version since the last workspace synchronization operation. If no trigger is present, that means the
    * trigger was deleted in the latest container version.
    */
  var trigger: js.UndefOr[Trigger] = js.undefined
}

