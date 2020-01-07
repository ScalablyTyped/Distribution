package typings.googleapis.buildSrcApisFirebaserulesV1Mod.firebaserules_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/firebaserules/v1", "firebaserules_v1.Resource$Projects$Rulesets")
@js.native
class ResourceDollarProjectsDollarRulesets protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * firebaserules.projects.rulesets.create
    * @desc Create a `Ruleset` from `Source`.  The `Ruleset` is given a unique
    * generated name which is returned to the caller. `Source` containing
    * syntactic or semantics errors will result in an error response indicating
    * the first error encountered. For a detailed view of `Source` issues, use
    * TestRuleset.
    * @alias firebaserules.projects.rulesets.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name for Project which owns this `Ruleset`.  Format: `projects/{project_id}`
    * @param {().Ruleset} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Ruleset] = js.native
  def create(callback: BodyResponseCallback[Schema$Ruleset]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarRulesetsDollarCreate): GaxiosPromise[Schema$Ruleset] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarRulesetsDollarCreate,
    callback: BodyResponseCallback[Schema$Ruleset]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarRulesetsDollarCreate,
    options: BodyResponseCallback[Schema$Ruleset],
    callback: BodyResponseCallback[Schema$Ruleset]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarRulesetsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Ruleset] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarRulesetsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Ruleset]
  ): Unit = js.native
  /**
    * firebaserules.projects.rulesets.delete
    * @desc Delete a `Ruleset` by resource name.  If the `Ruleset` is
    * referenced by a `Release` the operation will fail.
    * @alias firebaserules.projects.rulesets.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name for the ruleset to delete.  Format: `projects/{project_id}/rulesets/{ruleset_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarRulesetsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarRulesetsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarRulesetsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarRulesetsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarRulesetsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * firebaserules.projects.rulesets.get
    * @desc Get a `Ruleset` by name including the full `Source` contents.
    * @alias firebaserules.projects.rulesets.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name for the ruleset to get.  Format: `projects/{project_id}/rulesets/{ruleset_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Ruleset] = js.native
  def get(callback: BodyResponseCallback[Schema$Ruleset]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarRulesetsDollarGet): GaxiosPromise[Schema$Ruleset] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarRulesetsDollarGet,
    callback: BodyResponseCallback[Schema$Ruleset]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarRulesetsDollarGet,
    options: BodyResponseCallback[Schema$Ruleset],
    callback: BodyResponseCallback[Schema$Ruleset]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarRulesetsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Ruleset] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarRulesetsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Ruleset]
  ): Unit = js.native
  /**
    * firebaserules.projects.rulesets.list
    * @desc List `Ruleset` metadata only and optionally filter the results by
    * `Ruleset` name.  The full `Source` contents of a `Ruleset` may be
    * retrieved with GetRuleset.
    * @alias firebaserules.projects.rulesets.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter `Ruleset` filter. The list method supports filters with restrictions on `Ruleset.name`.  Filters on `Ruleset.create_time` should use the `date` function which parses strings that conform to the RFC 3339 date/time specifications.  Example: `create_time > date("2017-01-01T00:00:00Z") AND name=UUID-*`
    * @param {string} params.name Resource name for the project.  Format: `projects/{project_id}`
    * @param {integer=} params.pageSize Page size to load. Maximum of 100. Defaults to 10. Note: `page_size` is just a hint and the service may choose to load less than `page_size` due to the size of the output. To traverse all of the releases, caller should iterate until the `page_token` is empty.
    * @param {string=} params.pageToken Next page token for loading the next batch of `Ruleset` instances.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListRulesetsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListRulesetsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarRulesetsDollarList): GaxiosPromise[Schema$ListRulesetsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarRulesetsDollarList,
    callback: BodyResponseCallback[Schema$ListRulesetsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarRulesetsDollarList,
    options: BodyResponseCallback[Schema$ListRulesetsResponse],
    callback: BodyResponseCallback[Schema$ListRulesetsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarRulesetsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListRulesetsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarRulesetsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListRulesetsResponse]
  ): Unit = js.native
}

