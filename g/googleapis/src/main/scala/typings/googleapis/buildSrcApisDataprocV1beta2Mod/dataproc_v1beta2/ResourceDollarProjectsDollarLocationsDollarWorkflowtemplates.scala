package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dataproc/v1beta2", "dataproc_v1beta2.Resource$Projects$Locations$Workflowtemplates")
@js.native
class ResourceDollarProjectsDollarLocationsDollarWorkflowtemplates protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dataproc.projects.locations.workflowTemplates.create
    * @desc Creates new workflow template.
    * @alias dataproc.projects.locations.workflowTemplates.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The "resource name" of the region, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}
    * @param {().WorkflowTemplate} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$WorkflowTemplate] = js.native
  def create(callback: BodyResponseCallback[Schema$WorkflowTemplate]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarCreate): GaxiosPromise[Schema$WorkflowTemplate] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarCreate,
    callback: BodyResponseCallback[Schema$WorkflowTemplate]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarCreate,
    options: BodyResponseCallback[Schema$WorkflowTemplate],
    callback: BodyResponseCallback[Schema$WorkflowTemplate]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$WorkflowTemplate] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$WorkflowTemplate]
  ): Unit = js.native
  /**
    * dataproc.projects.locations.workflowTemplates.delete
    * @desc Deletes a workflow template. It does not cancel in-progress
    * workflows.
    * @alias dataproc.projects.locations.workflowTemplates.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The "resource name" of the workflow template, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}/workflowTemplates/{template_id}
    * @param {integer=} params.version Optional. The version of workflow template to delete. If specified, will only delete the template if the current server version matches specified version.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * dataproc.projects.locations.workflowTemplates.get
    * @desc Retrieves the latest workflow template.Can retrieve previously
    * instantiated template by specifying optional version parameter.
    * @alias dataproc.projects.locations.workflowTemplates.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The "resource name" of the workflow template, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}/workflowTemplates/{template_id}
    * @param {integer=} params.version Optional. The version of workflow template to retrieve. Only previously instatiated versions can be retrieved.If unspecified, retrieves the current version.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$WorkflowTemplate] = js.native
  def get(callback: BodyResponseCallback[Schema$WorkflowTemplate]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarGet): GaxiosPromise[Schema$WorkflowTemplate] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarGet,
    callback: BodyResponseCallback[Schema$WorkflowTemplate]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarGet,
    options: BodyResponseCallback[Schema$WorkflowTemplate],
    callback: BodyResponseCallback[Schema$WorkflowTemplate]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$WorkflowTemplate] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$WorkflowTemplate]
  ): Unit = js.native
  /**
    * dataproc.projects.locations.workflowTemplates.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias dataproc.projects.locations.workflowTemplates.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * dataproc.projects.locations.workflowTemplates.instantiate
    * @desc Instantiates a template and begins execution.The returned Operation
    * can be used to track execution of workflow by polling operations.get. The
    * Operation will complete when entire workflow is finished.The running
    * workflow can be aborted via operations.cancel. This will cause any
    * inflight jobs to be cancelled and workflow-owned clusters to be
    * deleted.The Operation.metadata will be WorkflowMetadata.On successful
    * completion, Operation.response will be Empty.
    * @alias dataproc.projects.locations.workflowTemplates.instantiate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The "resource name" of the workflow template, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}/workflowTemplates/{template_id}
    * @param {().InstantiateWorkflowTemplateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def instantiate(): GaxiosPromise[Schema$Operation] = js.native
  def instantiate(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def instantiate(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarInstantiate): GaxiosPromise[Schema$Operation] = js.native
  def instantiate(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarInstantiate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def instantiate(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarInstantiate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def instantiate(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarInstantiate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def instantiate(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarInstantiate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * dataproc.projects.locations.workflowTemplates.instantiateInline
    * @desc Instantiates a template and begins execution.This method is
    * equivalent to executing the sequence CreateWorkflowTemplate,
    * InstantiateWorkflowTemplate, DeleteWorkflowTemplate.The returned
    * Operation can be used to track execution of workflow by polling
    * operations.get. The Operation will complete when entire workflow is
    * finished.The running workflow can be aborted via operations.cancel. This
    * will cause any inflight jobs to be cancelled and workflow-owned clusters
    * to be deleted.The Operation.metadata will be WorkflowMetadata.On
    * successful completion, Operation.response will be Empty.
    * @alias dataproc.projects.locations.workflowTemplates.instantiateInline
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.instanceId Deprecated. Please use request_id field instead.
    * @param {string} params.parent Required. The "resource name" of the workflow template region, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}
    * @param {string=} params.requestId Optional. A tag that prevents multiple concurrent workflow instances with the same tag from running. This mitigates risk of concurrent instances started due to retries.It is recommended to always set this value to a UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier).The tag must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
    * @param {().WorkflowTemplate} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def instantiateInline(): GaxiosPromise[Schema$Operation] = js.native
  def instantiateInline(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def instantiateInline(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarInstantiateinline
  ): GaxiosPromise[Schema$Operation] = js.native
  def instantiateInline(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarInstantiateinline,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def instantiateInline(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarInstantiateinline,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def instantiateInline(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarInstantiateinline,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def instantiateInline(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarInstantiateinline,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * dataproc.projects.locations.workflowTemplates.list
    * @desc Lists workflows that match the specified filter in the request.
    * @alias dataproc.projects.locations.workflowTemplates.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional. The maximum number of results to return in each response.
    * @param {string=} params.pageToken Optional. The page token, returned by a previous call, to request the next page of results.
    * @param {string} params.parent Required. The "resource name" of the region, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListWorkflowTemplatesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListWorkflowTemplatesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarList): GaxiosPromise[Schema$ListWorkflowTemplatesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarList,
    callback: BodyResponseCallback[Schema$ListWorkflowTemplatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarList,
    options: BodyResponseCallback[Schema$ListWorkflowTemplatesResponse],
    callback: BodyResponseCallback[Schema$ListWorkflowTemplatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListWorkflowTemplatesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListWorkflowTemplatesResponse]
  ): Unit = js.native
  /**
    * dataproc.projects.locations.workflowTemplates.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias dataproc.projects.locations.workflowTemplates.setIamPolicy
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
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * dataproc.projects.locations.workflowTemplates.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.Note: This operation is designed to be
    * used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias dataproc.projects.locations.workflowTemplates.testIamPermissions
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
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarTestiampermissions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * dataproc.projects.locations.workflowTemplates.update
    * @desc Updates (replaces) workflow template. The updated template must
    * contain version that matches the current server version.
    * @alias dataproc.projects.locations.workflowTemplates.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. The "resource name" of the template, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}/workflowTemplates/{template_id}
    * @param {().WorkflowTemplate} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$WorkflowTemplate] = js.native
  def update(callback: BodyResponseCallback[Schema$WorkflowTemplate]): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarUpdate): GaxiosPromise[Schema$WorkflowTemplate] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarUpdate,
    callback: BodyResponseCallback[Schema$WorkflowTemplate]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarUpdate,
    options: BodyResponseCallback[Schema$WorkflowTemplate],
    callback: BodyResponseCallback[Schema$WorkflowTemplate]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$WorkflowTemplate] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$WorkflowTemplate]
  ): Unit = js.native
}

