package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IBatch
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Method] Adds a new operation to this batch at the end of the operations array
  		* @param operation Object The Operation object
  		* @returns Ext.data.Batch this
  		*/
  var add: js.UndefOr[js.Function1[/* operation */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var autoStart: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Number) */
  var current: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Ext.data.Operation[]) */
  var exceptions: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Property] (Boolean) */
  var hasException: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isComplete: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isRunning: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Ext.data.Operation[]) */
  var operations: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Method] Pauses execution of the batch but does not cancel the current operation
  		* @returns Ext.data.Batch this
  		*/
  var pause: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var pauseOnException: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Kicks off execution of the batch continuing from the current operation
  		* @returns Ext.data.Batch this
  		*/
  var retry: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Executes an operation by its numeric index in the operations array
  		* @param index Number The operation index to run
  		* @returns Ext.data.Batch this
  		*/
  var runOperation: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], this.type]] = js.undefined
  /** [Method] Kicks off execution of the batch continuing from the next operation if the previous operation encountered an excepti
  		* @param index Object
  		* @returns Ext.data.Batch this
  		*/
  var start: js.UndefOr[js.Function1[/* index */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Property] (Number) */
  var total: js.UndefOr[scala.Double] = js.undefined
}

