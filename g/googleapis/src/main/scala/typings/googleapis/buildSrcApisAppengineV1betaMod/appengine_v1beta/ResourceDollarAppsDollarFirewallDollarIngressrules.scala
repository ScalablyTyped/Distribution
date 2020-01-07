package typings.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/appengine/v1beta", "appengine_v1beta.Resource$Apps$Firewall$Ingressrules")
@js.native
class ResourceDollarAppsDollarFirewallDollarIngressrules protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * appengine.apps.firewall.ingressRules.batchUpdate
    * @desc Replaces the entire firewall ruleset in one bulk operation. This
    * overrides and replaces the rules of an existing firewall with the new
    * rules.If the final rule does not match traffic with the '*' wildcard IP
    * range, then an "allow all" rule is explicitly added to the end of the
    * list.
    * @alias appengine.apps.firewall.ingressRules.batchUpdate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the Firewall collection to set. Example: apps/myapp/firewall/ingressRules.
    * @param {().BatchUpdateIngressRulesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchUpdate(): GaxiosPromise[Schema$BatchUpdateIngressRulesResponse] = js.native
  def batchUpdate(callback: BodyResponseCallback[Schema$BatchUpdateIngressRulesResponse]): Unit = js.native
  def batchUpdate(params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarBatchupdate): GaxiosPromise[Schema$BatchUpdateIngressRulesResponse] = js.native
  def batchUpdate(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarBatchupdate,
    callback: BodyResponseCallback[Schema$BatchUpdateIngressRulesResponse]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarBatchupdate,
    options: BodyResponseCallback[Schema$BatchUpdateIngressRulesResponse],
    callback: BodyResponseCallback[Schema$BatchUpdateIngressRulesResponse]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarBatchupdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$BatchUpdateIngressRulesResponse] = js.native
  def batchUpdate(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BatchUpdateIngressRulesResponse]
  ): Unit = js.native
  /**
    * appengine.apps.firewall.ingressRules.create
    * @desc Creates a firewall rule for the application.
    * @alias appengine.apps.firewall.ingressRules.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `parent`. Name of the parent Firewall collection in which to create a new rule. Example: apps/myapp/firewall/ingressRules.
    * @param {().FirewallRule} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$FirewallRule] = js.native
  def create(callback: BodyResponseCallback[Schema$FirewallRule]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarCreate): GaxiosPromise[Schema$FirewallRule] = js.native
  def create(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarCreate,
    callback: BodyResponseCallback[Schema$FirewallRule]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarCreate,
    options: BodyResponseCallback[Schema$FirewallRule],
    callback: BodyResponseCallback[Schema$FirewallRule]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$FirewallRule] = js.native
  def create(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FirewallRule]
  ): Unit = js.native
  /**
    * appengine.apps.firewall.ingressRules.delete
    * @desc Deletes the specified firewall rule.
    * @alias appengine.apps.firewall.ingressRules.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the Firewall resource to delete. Example: apps/myapp/firewall/ingressRules/100.
    * @param {string} params.ingressRulesId Part of `name`. See documentation of `appsId`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * appengine.apps.firewall.ingressRules.get
    * @desc Gets the specified firewall rule.
    * @alias appengine.apps.firewall.ingressRules.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the Firewall resource to retrieve. Example: apps/myapp/firewall/ingressRules/100.
    * @param {string} params.ingressRulesId Part of `name`. See documentation of `appsId`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$FirewallRule] = js.native
  def get(callback: BodyResponseCallback[Schema$FirewallRule]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarGet): GaxiosPromise[Schema$FirewallRule] = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarGet,
    callback: BodyResponseCallback[Schema$FirewallRule]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarGet,
    options: BodyResponseCallback[Schema$FirewallRule],
    callback: BodyResponseCallback[Schema$FirewallRule]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$FirewallRule] = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FirewallRule]
  ): Unit = js.native
  /**
    * appengine.apps.firewall.ingressRules.list
    * @desc Lists the firewall rules of an application.
    * @alias appengine.apps.firewall.ingressRules.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `parent`. Name of the Firewall collection to retrieve. Example: apps/myapp/firewall/ingressRules.
    * @param {string=} params.matchingAddress A valid IP Address. If set, only rules matching this address will be returned. The first returned rule will be the rule that fires on requests from this IP.
    * @param {integer=} params.pageSize Maximum results to return per page.
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListIngressRulesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListIngressRulesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarList): GaxiosPromise[Schema$ListIngressRulesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarList,
    callback: BodyResponseCallback[Schema$ListIngressRulesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarList,
    options: BodyResponseCallback[Schema$ListIngressRulesResponse],
    callback: BodyResponseCallback[Schema$ListIngressRulesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListIngressRulesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListIngressRulesResponse]
  ): Unit = js.native
  /**
    * appengine.apps.firewall.ingressRules.patch
    * @desc Updates the specified firewall rule.
    * @alias appengine.apps.firewall.ingressRules.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the Firewall resource to update. Example: apps/myapp/firewall/ingressRules/100.
    * @param {string} params.ingressRulesId Part of `name`. See documentation of `appsId`.
    * @param {string=} params.updateMask Standard field mask for the set of fields to be updated.
    * @param {().FirewallRule} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$FirewallRule] = js.native
  def patch(callback: BodyResponseCallback[Schema$FirewallRule]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarPatch): GaxiosPromise[Schema$FirewallRule] = js.native
  def patch(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarPatch,
    callback: BodyResponseCallback[Schema$FirewallRule]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarPatch,
    options: BodyResponseCallback[Schema$FirewallRule],
    callback: BodyResponseCallback[Schema$FirewallRule]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$FirewallRule] = js.native
  def patch(
    params: ParamsDollarResourceDollarAppsDollarFirewallDollarIngressrulesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FirewallRule]
  ): Unit = js.native
}

