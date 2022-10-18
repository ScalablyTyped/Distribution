package typings.googleGax.mod

import typings.googleGax.buildSrcApitypesMod.APICallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "OngoingCall")
@js.native
open class OngoingCall protected ()
  extends typings.googleGax.buildSrcCallMod.OngoingCall {
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
