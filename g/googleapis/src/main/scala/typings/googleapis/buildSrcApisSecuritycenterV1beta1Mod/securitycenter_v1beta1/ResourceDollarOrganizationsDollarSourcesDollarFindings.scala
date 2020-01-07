package typings.googleapis.buildSrcApisSecuritycenterV1beta1Mod.securitycenter_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/securitycenter/v1beta1", "securitycenter_v1beta1.Resource$Organizations$Sources$Findings")
@js.native
class ResourceDollarOrganizationsDollarSourcesDollarFindings protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * securitycenter.organizations.sources.findings.create
    * @desc Creates a finding. The corresponding source must exist for finding
    * creation to succeed.
    * @alias securitycenter.organizations.sources.findings.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.findingId Unique identifier provided by the client within the parent scope. It must be alphanumeric and less than or equal to 32 characters and greater than 0 characters in length.
    * @param {string} params.parent Resource name of the new finding's parent. Its format should be "organizations/[organization_id]/sources/[source_id]".
    * @param {().Finding} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Finding] = js.native
  def create(callback: BodyResponseCallback[Schema$Finding]): Unit = js.native
  def create(params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarCreate): GaxiosPromise[Schema$Finding] = js.native
  def create(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarCreate,
    callback: BodyResponseCallback[Schema$Finding]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarCreate,
    options: BodyResponseCallback[Schema$Finding],
    callback: BodyResponseCallback[Schema$Finding]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Finding] = js.native
  def create(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Finding]
  ): Unit = js.native
  /**
    * securitycenter.organizations.sources.findings.group
    * @desc Filters an organization or source's findings and  groups them by
    * their specified properties.  To group across all sources provide a `-` as
    * the source id. Example: /v1beta1/organizations/123/sources/-/findings
    * @alias securitycenter.organizations.sources.findings.group
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Name of the source to groupBy. Its format is "organizations/[organization_id]/sources/[source_id]". To groupBy across all sources provide a source_id of `-`. For example: organizations/123/sources/-
    * @param {().GroupFindingsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def group(): GaxiosPromise[Schema$GroupFindingsResponse] = js.native
  def group(callback: BodyResponseCallback[Schema$GroupFindingsResponse]): Unit = js.native
  def group(params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarGroup): GaxiosPromise[Schema$GroupFindingsResponse] = js.native
  def group(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarGroup,
    callback: BodyResponseCallback[Schema$GroupFindingsResponse]
  ): Unit = js.native
  def group(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarGroup,
    options: BodyResponseCallback[Schema$GroupFindingsResponse],
    callback: BodyResponseCallback[Schema$GroupFindingsResponse]
  ): Unit = js.native
  def group(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarGroup,
    options: MethodOptions
  ): GaxiosPromise[Schema$GroupFindingsResponse] = js.native
  def group(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarGroup,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GroupFindingsResponse]
  ): Unit = js.native
  /**
    * securitycenter.organizations.sources.findings.list
    * @desc Lists an organization or source's findings.  To list across all
    * sources provide a `-` as the source id. Example:
    * /v1beta1/organizations/123/sources/-/findings
    * @alias securitycenter.organizations.sources.findings.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fieldMask Optional.  A field mask to specify the Finding fields to be listed in the response. An empty field mask will list all fields.
    * @param {string=} params.filter Expression that defines the filter to apply across findings. The expression is a list of one or more restrictions combined via logical operators `AND` and `OR`. Parentheses are not supported, and `OR` has higher precedence than `AND`.  Restrictions have the form `<field> <operator> <value>` and may have a `-` character in front of them to indicate negation. Examples include:   * name  * source_properties.a_property  * security_marks.marks.marka  The supported operators are:  * `=` for all value types. * `>`, `<`, `>=`, `<=` for integer values. * `:`, meaning substring matching, for strings.  The supported value types are:  * string literals in quotes. * integer literals without quotes. * boolean literals `true` and `false` without quotes.  For example, `source_properties.size = 100` is a valid filter string.
    * @param {string=} params.orderBy Expression that defines what fields and order to use for sorting. The string value should follow SQL syntax: comma separated list of fields. For example: "name,resource_properties.a_property". The default sorting order is ascending. To specify descending order for a field, a suffix " desc" should be appended to the field name. For example: "name desc,source_properties.a_property". Redundant space characters in the syntax are insignificant. "name desc,source_properties.a_property" and " name     desc  ,   source_properties.a_property  " are equivalent.
    * @param {integer=} params.pageSize The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000.
    * @param {string=} params.pageToken The value returned by the last `ListFindingsResponse`; indicates that this is a continuation of a prior `ListFindings` call, and that the system should return the next page of data.
    * @param {string} params.parent Name of the source the findings belong to. Its format is "organizations/[organization_id]/sources/[source_id]". To list across all sources provide a source_id of `-`. For example: organizations/123/sources/-
    * @param {string=} params.readTime Time used as a reference point when filtering findings. The filter is limited to findings existing at the supplied time and their values are those at that specific time. Absence of this field will default to the API's version of NOW.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListFindingsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListFindingsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarList): GaxiosPromise[Schema$ListFindingsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarList,
    callback: BodyResponseCallback[Schema$ListFindingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarList,
    options: BodyResponseCallback[Schema$ListFindingsResponse],
    callback: BodyResponseCallback[Schema$ListFindingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListFindingsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListFindingsResponse]
  ): Unit = js.native
  /**
    * securitycenter.organizations.sources.findings.patch
    * @desc Creates or updates a finding. The corresponding source must exist
    * for a finding creation to succeed.
    * @alias securitycenter.organizations.sources.findings.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The relative resource name of this finding. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: "organizations/123/sources/456/findings/789"
    * @param {string=} params.updateMask The FieldMask to use when updating the finding resource. This field should not be specified when creating a finding.
    * @param {().Finding} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Finding] = js.native
  def patch(callback: BodyResponseCallback[Schema$Finding]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarPatch): GaxiosPromise[Schema$Finding] = js.native
  def patch(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarPatch,
    callback: BodyResponseCallback[Schema$Finding]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarPatch,
    options: BodyResponseCallback[Schema$Finding],
    callback: BodyResponseCallback[Schema$Finding]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$Finding] = js.native
  def patch(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Finding]
  ): Unit = js.native
  /**
    * securitycenter.organizations.sources.findings.setState
    * @desc Updates the state of a finding.
    * @alias securitycenter.organizations.sources.findings.setState
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The relative resource name of the finding. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: "organizations/123/sources/456/finding/789".
    * @param {().SetFindingStateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setState(): GaxiosPromise[Schema$Finding] = js.native
  def setState(callback: BodyResponseCallback[Schema$Finding]): Unit = js.native
  def setState(params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarSetstate): GaxiosPromise[Schema$Finding] = js.native
  def setState(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarSetstate,
    callback: BodyResponseCallback[Schema$Finding]
  ): Unit = js.native
  def setState(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarSetstate,
    options: BodyResponseCallback[Schema$Finding],
    callback: BodyResponseCallback[Schema$Finding]
  ): Unit = js.native
  def setState(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarSetstate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Finding] = js.native
  def setState(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarSetstate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Finding]
  ): Unit = js.native
  /**
    * securitycenter.organizations.sources.findings.updateSecurityMarks
    * @desc Updates security marks.
    * @alias securitycenter.organizations.sources.findings.updateSecurityMarks
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The relative resource name of the SecurityMarks. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Examples: "organizations/123/assets/456/securityMarks" "organizations/123/sources/456/findings/789/securityMarks".
    * @param {string=} params.startTime The time at which the updated SecurityMarks take effect.
    * @param {string=} params.updateMask The FieldMask to use when updating the security marks resource.
    * @param {().SecurityMarks} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateSecurityMarks(): GaxiosPromise[Schema$SecurityMarks] = js.native
  def updateSecurityMarks(callback: BodyResponseCallback[Schema$SecurityMarks]): Unit = js.native
  def updateSecurityMarks(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarUpdatesecuritymarks
  ): GaxiosPromise[Schema$SecurityMarks] = js.native
  def updateSecurityMarks(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarUpdatesecuritymarks,
    callback: BodyResponseCallback[Schema$SecurityMarks]
  ): Unit = js.native
  def updateSecurityMarks(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarUpdatesecuritymarks,
    options: BodyResponseCallback[Schema$SecurityMarks],
    callback: BodyResponseCallback[Schema$SecurityMarks]
  ): Unit = js.native
  def updateSecurityMarks(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarUpdatesecuritymarks,
    options: MethodOptions
  ): GaxiosPromise[Schema$SecurityMarks] = js.native
  def updateSecurityMarks(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarUpdatesecuritymarks,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SecurityMarks]
  ): Unit = js.native
}

