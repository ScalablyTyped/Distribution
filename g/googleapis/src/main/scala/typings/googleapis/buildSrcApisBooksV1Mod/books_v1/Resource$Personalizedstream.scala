package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Personalizedstream")
@js.native
class Resource$Personalizedstream protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * books.personalizedstream.get
    * @desc Returns a stream of personalized book clusters
    * @alias books.personalizedstream.get
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.locale ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'. Used for generating recommendations.
    * @param {string=} params.maxAllowedMaturityRating The maximum allowed maturity rating of returned recommendations. Books with a higher maturity rating are filtered out.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Discoveryclusters] = js.native
  def get(callback: BodyResponseCallback[Schema$Discoveryclusters]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPersonalizedstreamDollarGet): GaxiosPromise[Schema$Discoveryclusters] = js.native
  def get(
    params: ParamsDollarResourceDollarPersonalizedstreamDollarGet,
    callback: BodyResponseCallback[Schema$Discoveryclusters]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPersonalizedstreamDollarGet,
    options: BodyResponseCallback[Schema$Discoveryclusters],
    callback: BodyResponseCallback[Schema$Discoveryclusters]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPersonalizedstreamDollarGet, options: MethodOptions): GaxiosPromise[Schema$Discoveryclusters] = js.native
  def get(
    params: ParamsDollarResourceDollarPersonalizedstreamDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Discoveryclusters]
  ): Unit = js.native
}

