package typings.googleDashGax.googleDashGaxMod

import typings.googleDashGax.buildSrcApitypesMod.APICallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "OngoingCall")
@js.native
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
class OngoingCall ()
  extends typings.googleDashGax.buildSrcCallMod.OngoingCall {
  def this(callback: APICallback) = this()
}

