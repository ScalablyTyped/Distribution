package typings.googleDashGax.buildSrcFallbackMod

import typings.googleDashGax.buildSrcGaxMod.CallOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/fallback", "CallSettings")
@js.native
/**
  * @param {Object} settings - An object containing parameters of this settings.
  * @param {number} settings.timeout - The client-side timeout for API calls.
  *   This parameter is ignored for retrying calls.
  * @param {RetryOptions} settings.retry - The configuration for retrying upon
  *   transient error. If set to null, this call will not retry.
  * @param {boolean} settings.autoPaginate - If there is no `pageDescriptor`,
  *   this attrbute has no meaning. Otherwise, determines whether a page
  * streamed response should make the page structure transparent to the user by
  *   flattening the repeated field in the returned generator.
  * @param {number} settings.pageToken - If there is no `pageDescriptor`,
  *   this attribute has no meaning. Otherwise, determines the page token used
  * in the page streaming request.
  * @param {Object} settings.otherArgs - Additional arguments to be passed to
  *   the API calls.
  * @param {Function=} settings.promise - A constructor for a promise that
  * implements the ES6 specification of promise. If not provided, native
  * promises will be used.
  *
  * @constructor
  */
class CallSettings ()
  extends typings.googleDashGax.buildSrcGaxMod.CallSettings {
  def this(settings: CallOptions) = this()
}

