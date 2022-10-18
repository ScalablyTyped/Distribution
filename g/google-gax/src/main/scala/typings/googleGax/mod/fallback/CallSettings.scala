package typings.googleGax.mod.fallback

import typings.googleGax.buildSrcGaxMod.CallOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "fallback.CallSettings")
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
  *
  * @constructor
  */
open class CallSettings ()
  extends typings.googleGax.buildSrcFallbackMod.CallSettings {
  def this(settings: CallOptions) = this()
}
