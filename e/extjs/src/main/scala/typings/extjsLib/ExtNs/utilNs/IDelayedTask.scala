package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDelayedTask extends js.Object {
  /** [Method] Cancel the last queued timeout */
  var cancel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] By default cancels any pending timeout and queues a new one
  		* @param newDelay Number The milliseconds to delay
  		* @param newFn Function Overrides function passed to constructor
  		* @param newScope Object Overrides scope passed to constructor. Remember that if no scope is specified, this will refer to the browser window.
  		* @param newArgs Array Overrides args passed to constructor
  		*/
  var delay: js.UndefOr[
    js.Function4[
      /* newDelay */ js.UndefOr[scala.Double], 
      /* newFn */ js.UndefOr[js.Any], 
      /* newScope */ js.UndefOr[js.Any], 
      /* newArgs */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Property] (Number) */
  var id: js.UndefOr[scala.Double] = js.undefined
}

