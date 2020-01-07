package typings.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dns/v1beta2", "dns_v1beta2.Resource$Dnskeys")
@js.native
class Resource$Dnskeys protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dns.dnsKeys.get
    * @alias dns.dnsKeys.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string=} params.digestType
    * @param {string} params.dnsKeyId
    * @param {string} params.managedZone
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$DnsKey] = js.native
  def get(callback: BodyResponseCallback[Schema$DnsKey]): Unit = js.native
  def get(params: ParamsDollarResourceDollarDnskeysDollarGet): GaxiosPromise[Schema$DnsKey] = js.native
  def get(params: ParamsDollarResourceDollarDnskeysDollarGet, callback: BodyResponseCallback[Schema$DnsKey]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarDnskeysDollarGet,
    options: BodyResponseCallback[Schema$DnsKey],
    callback: BodyResponseCallback[Schema$DnsKey]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarDnskeysDollarGet, options: MethodOptions): GaxiosPromise[Schema$DnsKey] = js.native
  def get(
    params: ParamsDollarResourceDollarDnskeysDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DnsKey]
  ): Unit = js.native
  /**
    * dns.dnsKeys.list
    * @alias dns.dnsKeys.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.digestType
    * @param {string} params.managedZone
    * @param {integer=} params.maxResults
    * @param {string=} params.pageToken
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$DnsKeysListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$DnsKeysListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarDnskeysDollarList): GaxiosPromise[Schema$DnsKeysListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDnskeysDollarList,
    callback: BodyResponseCallback[Schema$DnsKeysListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarDnskeysDollarList,
    options: BodyResponseCallback[Schema$DnsKeysListResponse],
    callback: BodyResponseCallback[Schema$DnsKeysListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarDnskeysDollarList, options: MethodOptions): GaxiosPromise[Schema$DnsKeysListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDnskeysDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DnsKeysListResponse]
  ): Unit = js.native
}

