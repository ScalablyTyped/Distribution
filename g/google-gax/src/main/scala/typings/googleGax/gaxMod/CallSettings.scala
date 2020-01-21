package typings.googleGax.gaxMod

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.bundleExecutorMod.BundleOptions
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/gax", "CallSettings")
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
class CallSettings () extends js.Object {
  def this(settings: CallOptions) = this()
  var autoPaginate: js.UndefOr[Boolean] = js.native
  var bundleOptions: js.UndefOr[BundleOptions | Null] = js.native
  var isBundling: Boolean = js.native
  var longrunning: js.UndefOr[BackoffSettings] = js.native
  var maxResults: js.UndefOr[Double] = js.native
  var otherArgs: StringDictionary[js.Any] = js.native
  var pageSize: js.UndefOr[Double] = js.native
  var pageToken: js.UndefOr[String] = js.native
  var promise: PromiseConstructor = js.native
  var retry: js.UndefOr[RetryOptions | Null] = js.native
  var timeout: Double = js.native
  /**
    * Returns a new CallSettings merged from this and a CallOptions object.
    *
    * @param {CallOptions} options - an instance whose values override
    *   those in this object. If null, ``merge`` returns a copy of this
    *   object
    * @return {CallSettings} The merged CallSettings instance.
    */
  def merge(): CallSettings = js.native
  def merge(options: CallOptions): CallSettings = js.native
}

