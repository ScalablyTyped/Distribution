package typings
package googleDashGaxLib.googleDashGaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "Canceller")
@js.native
/**
  * Canceller manages callback, API calls, and cancellation
  * of the API calls.
  * @param {APICallback=} callback
  *   The callback to be called asynchronously when the API call
  *   finishes.
  * @constructor
  * @property {APICallback} callback
  *   The callback function to be called.
  * @private
  */
class Canceller ()
  extends googleDashGaxLib.buildSrcApiCallableMod.Canceller {
  def this(callback: googleDashGaxLib.buildSrcApiCallableMod.APICallback) = this()
}

