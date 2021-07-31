package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Media")
@js.native
class ResourceMedia protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudsearch.media.upload
    * @desc Uploads media for indexing.  The upload endpoint supports direct
    * and resumable upload protocols and is intended for large items that can
    * not be inlined during index requests. To index large content:  1. Call
    * upload to begin    a session and get the item reference. 1. Upload the
    * content using the item reference's resource name. 1. Call index with the
    * item    reference as the content.  For additional information, see
    * [Create a content connector using the REST
    * API](https://developers.google.com/cloud-search/docs/guides/content-connector#rest).
    * @alias cloudsearch.media.upload
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resourceName Name of the media that is being downloaded.  See ReadRequest.resource_name.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def upload(): GaxiosPromise[SchemaMedia] = js.native
  def upload(callback: BodyResponseCallback[SchemaMedia]): Unit = js.native
  def upload(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMedia] = js.native
  def upload(params: ParamsResourceMediaUpload): GaxiosPromise[SchemaMedia] = js.native
  def upload(params: ParamsResourceMediaUpload, callback: BodyResponseCallback[SchemaMedia]): Unit = js.native
  def upload(
    params: ParamsResourceMediaUpload,
    options: BodyResponseCallback[SchemaMedia],
    callback: BodyResponseCallback[SchemaMedia]
  ): Unit = js.native
  def upload(params: ParamsResourceMediaUpload, options: MethodOptions): GaxiosPromise[SchemaMedia] = js.native
  def upload(
    params: ParamsResourceMediaUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMedia]
  ): Unit = js.native
}
