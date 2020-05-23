package typings.googleGax.mod

import typings.googleGax.apitypesMod.APICallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "OngoingCall")
@js.native
class OngoingCall protected ()
  extends typings.googleGax.callMod.OngoingCall {
  /**
    * OngoingCall manages callback, API calls, and cancellation
    * of the API calls.
    * @param {APICallback=} callback
    *   The callback to be called asynchronously when the API call
    *   finishes.
    * @constructor
    * @property {APICallback} callback
    *   The callback function to be called.
    * @private
    */
  def this(callback: APICallback) = this()
}

