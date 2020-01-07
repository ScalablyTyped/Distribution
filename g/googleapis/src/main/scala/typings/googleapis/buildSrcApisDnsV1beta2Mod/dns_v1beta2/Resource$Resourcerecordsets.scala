package typings.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dns/v1beta2", "dns_v1beta2.Resource$Resourcerecordsets")
@js.native
class Resource$Resourcerecordsets protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dns.resourceRecordSets.list
    * @alias dns.resourceRecordSets.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.managedZone
    * @param {integer=} params.maxResults
    * @param {string=} params.name
    * @param {string=} params.pageToken
    * @param {string} params.project
    * @param {string=} params.type
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ResourceRecordSetsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ResourceRecordSetsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarResourcerecordsetsDollarList): GaxiosPromise[Schema$ResourceRecordSetsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarResourcerecordsetsDollarList,
    callback: BodyResponseCallback[Schema$ResourceRecordSetsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarResourcerecordsetsDollarList,
    options: BodyResponseCallback[Schema$ResourceRecordSetsListResponse],
    callback: BodyResponseCallback[Schema$ResourceRecordSetsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarResourcerecordsetsDollarList, options: MethodOptions): GaxiosPromise[Schema$ResourceRecordSetsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarResourcerecordsetsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ResourceRecordSetsListResponse]
  ): Unit = js.native
}

