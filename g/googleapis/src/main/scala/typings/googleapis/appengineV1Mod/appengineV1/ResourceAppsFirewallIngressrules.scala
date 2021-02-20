package typings.googleapis.appengineV1Mod.appengineV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/appengine/v1", "appengine_v1.Resource$Apps$Firewall$Ingressrules")
@js.native
class ResourceAppsFirewallIngressrules protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
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
  def batchUpdate(): GaxiosPromise[SchemaBatchUpdateIngressRulesResponse] = js.native
  def batchUpdate(callback: BodyResponseCallback[SchemaBatchUpdateIngressRulesResponse]): Unit = js.native
  def batchUpdate(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBatchUpdateIngressRulesResponse] = js.native
  def batchUpdate(params: ParamsResourceAppsFirewallIngressrulesBatchupdate): GaxiosPromise[SchemaBatchUpdateIngressRulesResponse] = js.native
  def batchUpdate(
    params: ParamsResourceAppsFirewallIngressrulesBatchupdate,
    callback: BodyResponseCallback[SchemaBatchUpdateIngressRulesResponse]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsResourceAppsFirewallIngressrulesBatchupdate,
    options: BodyResponseCallback[SchemaBatchUpdateIngressRulesResponse],
    callback: BodyResponseCallback[SchemaBatchUpdateIngressRulesResponse]
  ): Unit = js.native
  def batchUpdate(params: ParamsResourceAppsFirewallIngressrulesBatchupdate, options: MethodOptions): GaxiosPromise[SchemaBatchUpdateIngressRulesResponse] = js.native
  def batchUpdate(
    params: ParamsResourceAppsFirewallIngressrulesBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchUpdateIngressRulesResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
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
  def create(): GaxiosPromise[SchemaFirewallRule] = js.native
  def create(callback: BodyResponseCallback[SchemaFirewallRule]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFirewallRule] = js.native
  def create(params: ParamsResourceAppsFirewallIngressrulesCreate): GaxiosPromise[SchemaFirewallRule] = js.native
  def create(
    params: ParamsResourceAppsFirewallIngressrulesCreate,
    callback: BodyResponseCallback[SchemaFirewallRule]
  ): Unit = js.native
  def create(
    params: ParamsResourceAppsFirewallIngressrulesCreate,
    options: BodyResponseCallback[SchemaFirewallRule],
    callback: BodyResponseCallback[SchemaFirewallRule]
  ): Unit = js.native
  def create(params: ParamsResourceAppsFirewallIngressrulesCreate, options: MethodOptions): GaxiosPromise[SchemaFirewallRule] = js.native
  def create(
    params: ParamsResourceAppsFirewallIngressrulesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFirewallRule]
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
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAppsFirewallIngressrulesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAppsFirewallIngressrulesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceAppsFirewallIngressrulesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAppsFirewallIngressrulesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAppsFirewallIngressrulesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
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
  def get(): GaxiosPromise[SchemaFirewallRule] = js.native
  def get(callback: BodyResponseCallback[SchemaFirewallRule]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFirewallRule] = js.native
  def get(params: ParamsResourceAppsFirewallIngressrulesGet): GaxiosPromise[SchemaFirewallRule] = js.native
  def get(
    params: ParamsResourceAppsFirewallIngressrulesGet,
    callback: BodyResponseCallback[SchemaFirewallRule]
  ): Unit = js.native
  def get(
    params: ParamsResourceAppsFirewallIngressrulesGet,
    options: BodyResponseCallback[SchemaFirewallRule],
    callback: BodyResponseCallback[SchemaFirewallRule]
  ): Unit = js.native
  def get(params: ParamsResourceAppsFirewallIngressrulesGet, options: MethodOptions): GaxiosPromise[SchemaFirewallRule] = js.native
  def get(
    params: ParamsResourceAppsFirewallIngressrulesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFirewallRule]
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
  def list(): GaxiosPromise[SchemaListIngressRulesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListIngressRulesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListIngressRulesResponse] = js.native
  def list(params: ParamsResourceAppsFirewallIngressrulesList): GaxiosPromise[SchemaListIngressRulesResponse] = js.native
  def list(
    params: ParamsResourceAppsFirewallIngressrulesList,
    callback: BodyResponseCallback[SchemaListIngressRulesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAppsFirewallIngressrulesList,
    options: BodyResponseCallback[SchemaListIngressRulesResponse],
    callback: BodyResponseCallback[SchemaListIngressRulesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAppsFirewallIngressrulesList, options: MethodOptions): GaxiosPromise[SchemaListIngressRulesResponse] = js.native
  def list(
    params: ParamsResourceAppsFirewallIngressrulesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListIngressRulesResponse]
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
  def patch(): GaxiosPromise[SchemaFirewallRule] = js.native
  def patch(callback: BodyResponseCallback[SchemaFirewallRule]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFirewallRule] = js.native
  def patch(params: ParamsResourceAppsFirewallIngressrulesPatch): GaxiosPromise[SchemaFirewallRule] = js.native
  def patch(
    params: ParamsResourceAppsFirewallIngressrulesPatch,
    callback: BodyResponseCallback[SchemaFirewallRule]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAppsFirewallIngressrulesPatch,
    options: BodyResponseCallback[SchemaFirewallRule],
    callback: BodyResponseCallback[SchemaFirewallRule]
  ): Unit = js.native
  def patch(params: ParamsResourceAppsFirewallIngressrulesPatch, options: MethodOptions): GaxiosPromise[SchemaFirewallRule] = js.native
  def patch(
    params: ParamsResourceAppsFirewallIngressrulesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFirewallRule]
  ): Unit = js.native
}
