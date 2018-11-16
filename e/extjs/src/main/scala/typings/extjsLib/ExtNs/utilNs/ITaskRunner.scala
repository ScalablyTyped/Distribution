package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITaskRunner
  extends extjsLib.ExtNs.IBase {
  /** [Method] Destroys this instance stopping all tasks that are currently running  */
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var fireIdleEvent: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Creates a new Task instance
  		* @param config Object The config object. For details on the supported properties, see start.
  		*/
  var newTask: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Starts a new task
  		* @param task Object A config object that supports the following properties:
  		* @returns Object The task
  		*/
  var start: js.UndefOr[js.Function1[/* task */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Stops an existing running task
  		* @param task Object The task to stop
  		* @returns Object The task
  		*/
  var stop: js.UndefOr[js.Function1[/* task */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Stops all tasks that are currently running  */
  var stopAll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

