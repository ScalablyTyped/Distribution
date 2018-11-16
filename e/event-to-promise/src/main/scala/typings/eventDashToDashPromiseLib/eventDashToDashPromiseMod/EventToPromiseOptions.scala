package typings
package eventDashToDashPromiseLib.eventDashToDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EventToPromiseOptions extends js.Object {
  /**  If true, all parameters of the emitted events are put in an array which is used to resolve/reject the promise. (default: `false`) */
  var array: js.UndefOr[scala.Boolean] = js.undefined
  /** The name of the event which rejects the promise. (default: `'error'`) */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the error event should be ignored and not reject the promise. (default: `false`) */
  var ignoreErrors: js.UndefOr[scala.Boolean] = js.undefined
}

