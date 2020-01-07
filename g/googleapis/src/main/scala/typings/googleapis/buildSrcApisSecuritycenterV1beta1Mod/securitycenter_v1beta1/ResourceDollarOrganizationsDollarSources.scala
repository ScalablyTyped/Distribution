package typings.googleapis.buildSrcApisSecuritycenterV1beta1Mod.securitycenter_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/securitycenter/v1beta1", "securitycenter_v1beta1.Resource$Organizations$Sources")
@js.native
class ResourceDollarOrganizationsDollarSources protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var findings: ResourceDollarOrganizationsDollarSourcesDollarFindings = js.native
  /**
    * securitycenter.organizations.sources.create
    * @desc Creates a source.
    * @alias securitycenter.organizations.sources.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Resource name of the new source's parent. Its format should be "organizations/[organization_id]".
    * @param {().Source} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Source] = js.native
  def create(callback: BodyResponseCallback[Schema$Source]): Unit = js.native
  def create(params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarCreate): GaxiosPromise[Schema$Source] = js.native
  def create(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarCreate,
    callback: BodyResponseCallback[Schema$Source]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarCreate,
    options: BodyResponseCallback[Schema$Source],
    callback: BodyResponseCallback[Schema$Source]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Source] = js.native
  def create(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Source]
  ): Unit = js.native
  /**
    * securitycenter.organizations.sources.get
    * @desc Gets a source.
    * @alias securitycenter.organizations.sources.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Relative resource name of the source. Its format is "organizations/[organization_id]/source/[source_id]".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Source] = js.native
  def get(callback: BodyResponseCallback[Schema$Source]): Unit = js.native
  def get(params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarGet): GaxiosPromise[Schema$Source] = js.native
  def get(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarGet,
    callback: BodyResponseCallback[Schema$Source]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarGet,
    options: BodyResponseCallback[Schema$Source],
    callback: BodyResponseCallback[Schema$Source]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Source] = js.native
  def get(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Source]
  ): Unit = js.native
  /**
    * securitycenter.organizations.sources.getIamPolicy
    * @desc Gets the access control policy on the specified Source.
    * @alias securitycenter.organizations.sources.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().GetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * securitycenter.organizations.sources.list
    * @desc Lists all sources belonging to an organization.
    * @alias securitycenter.organizations.sources.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000.
    * @param {string=} params.pageToken The value returned by the last `ListSourcesResponse`; indicates that this is a continuation of a prior `ListSources` call, and that the system should return the next page of data.
    * @param {string} params.parent Resource name of the parent of sources to list. Its format should be "organizations/[organization_id]".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListSourcesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListSourcesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarList): GaxiosPromise[Schema$ListSourcesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarList,
    callback: BodyResponseCallback[Schema$ListSourcesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarList,
    options: BodyResponseCallback[Schema$ListSourcesResponse],
    callback: BodyResponseCallback[Schema$ListSourcesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListSourcesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListSourcesResponse]
  ): Unit = js.native
  /**
    * securitycenter.organizations.sources.patch
    * @desc Updates a source.
    * @alias securitycenter.organizations.sources.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The relative resource name of this source. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: "organizations/123/sources/456"
    * @param {string=} params.updateMask The FieldMask to use when updating the source resource.
    * @param {().Source} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Source] = js.native
  def patch(callback: BodyResponseCallback[Schema$Source]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarPatch): GaxiosPromise[Schema$Source] = js.native
  def patch(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarPatch,
    callback: BodyResponseCallback[Schema$Source]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarPatch,
    options: BodyResponseCallback[Schema$Source],
    callback: BodyResponseCallback[Schema$Source]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Source] = js.native
  def patch(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Source]
  ): Unit = js.native
  /**
    * securitycenter.organizations.sources.setIamPolicy
    * @desc Sets the access control policy on the specified Source.
    * @alias securitycenter.organizations.sources.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * securitycenter.organizations.sources.testIamPermissions
    * @desc Returns the permissions that a caller has on the specified source.
    * @alias securitycenter.organizations.sources.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarOrganizationsDollarSourcesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
}

