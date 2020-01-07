package typings.googleapis.buildSrcApisServiceconsumermanagementV1Mod.serviceconsumermanagement_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/serviceconsumermanagement/v1", "serviceconsumermanagement_v1.Resource$Services$Tenancyunits")
@js.native
class ResourceDollarServicesDollarTenancyunits protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * serviceconsumermanagement.services.tenancyUnits.addProject
    * @desc Add a new tenant project to the tenancy unit. There can be a
    * maximum of 512 tenant projects in a tenancy unit. If there are previously
    * failed `AddTenantProject` calls, you might need to call
    * `RemoveTenantProject` first to resolve them before you can make another
    * call to `AddTenantProject` with the same tag. Operation<response: Empty>.
    * @alias serviceconsumermanagement.services.tenancyUnits.addProject
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Name of the tenancy unit.
    * @param {().AddTenantProjectRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addProject(): GaxiosPromise[Schema$Operation] = js.native
  def addProject(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def addProject(params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarAddproject): GaxiosPromise[Schema$Operation] = js.native
  def addProject(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarAddproject,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def addProject(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarAddproject,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def addProject(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarAddproject,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def addProject(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarAddproject,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * serviceconsumermanagement.services.tenancyUnits.applyProjectConfig
    * @desc Apply a configuration to an existing tenant project. This project
    * must exist in an active state and have the original owner account. The
    * caller must have permission to add a project to the given tenancy unit.
    * The configuration is applied, but any existing settings on the project
    * aren't modified. Specified policy bindings are applied. Existing bindings
    * aren't modified. Specified services are activated. No service is
    * deactivated. If specified, new billing configuration is applied. Omit a
    * billing configuration to keep the existing one. A service account in the
    * project is created if previously non existed. The specified folder is
    * ignored, as moving a tenant project to a different folder isn't
    * supported. The operation fails if any of the steps fail, but no rollback
    * of already applied configuration changes is attempted.
    * Operation<response: Empty>.
    * @alias serviceconsumermanagement.services.tenancyUnits.applyProjectConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the tenancy unit.
    * @param {().ApplyTenantProjectConfigRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def applyProjectConfig(): GaxiosPromise[Schema$Operation] = js.native
  def applyProjectConfig(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def applyProjectConfig(params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarApplyprojectconfig): GaxiosPromise[Schema$Operation] = js.native
  def applyProjectConfig(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarApplyprojectconfig,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def applyProjectConfig(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarApplyprojectconfig,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def applyProjectConfig(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarApplyprojectconfig,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def applyProjectConfig(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarApplyprojectconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * serviceconsumermanagement.services.tenancyUnits.attachProject
    * @desc Attach an existing project to the tenancy unit as a new tenant
    * resource. The project could either be the tenant project reserved by
    * calling `AddTenantProject` under a tenancy unit of a service producer's
    * project of a managed service, or from a separate project. The caller is
    * checked against a set of permissions as if calling `AddTenantProject` on
    * the same service consumer. To trigger the attachment, the targeted tenant
    * project must be in a folder. Make sure the ServiceConsumerManagement
    * service account is the owner of that project. These two requirements are
    * already met if the project is reserved by calling `AddTenantProject`.
    * Operation<response: Empty>.
    * @alias serviceconsumermanagement.services.tenancyUnits.attachProject
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the tenancy unit that the project will be attached to.
    * @param {().AttachTenantProjectRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def attachProject(): GaxiosPromise[Schema$Operation] = js.native
  def attachProject(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def attachProject(params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarAttachproject): GaxiosPromise[Schema$Operation] = js.native
  def attachProject(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarAttachproject,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def attachProject(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarAttachproject,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def attachProject(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarAttachproject,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def attachProject(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarAttachproject,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * serviceconsumermanagement.services.tenancyUnits.create
    * @desc Creates a tenancy unit with no tenant resources.
    * @alias serviceconsumermanagement.services.tenancyUnits.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent services/{service}/{collection id}/{resource id} {collection id} is the cloud resource collection type representing the service consumer, for example 'projects', or 'organizations'. {resource id} is the consumer numeric id, such as project number: '123456'. {service} the name of a managed service, such as 'service.googleapis.com'. Enables service binding using the new tenancy unit.
    * @param {().CreateTenancyUnitRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$TenancyUnit] = js.native
  def create(callback: BodyResponseCallback[Schema$TenancyUnit]): Unit = js.native
  def create(params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarCreate): GaxiosPromise[Schema$TenancyUnit] = js.native
  def create(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarCreate,
    callback: BodyResponseCallback[Schema$TenancyUnit]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarCreate,
    options: BodyResponseCallback[Schema$TenancyUnit],
    callback: BodyResponseCallback[Schema$TenancyUnit]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$TenancyUnit] = js.native
  def create(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TenancyUnit]
  ): Unit = js.native
  /**
    * serviceconsumermanagement.services.tenancyUnits.delete
    * @desc Delete a tenancy unit. Before you delete the tenancy unit, there
    * should be no tenant resources in it that aren't in a DELETED state.
    * Operation<response: Empty>.
    * @alias serviceconsumermanagement.services.tenancyUnits.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the tenancy unit to be deleted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * serviceconsumermanagement.services.tenancyUnits.deleteProject
    * @desc Deletes the specified project resource identified by a tenant
    * resource tag. The mothod removes a project lien with a 'TenantManager'
    * origin if that was added. It will then attempt to delete the project. If
    * that operation fails, this method also fails. After the project has been
    * deleted, the tenant resource state is set to DELETED.  To permanently
    * remove resource metadata, call the `RemoveTenantProject` method. New
    * resources with the same tag can't be added if there are existing
    * resources in a DELETED state. Operation<response: Empty>.
    * @alias serviceconsumermanagement.services.tenancyUnits.deleteProject
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the tenancy unit. Such as 'services/service.googleapis.com/projects/12345/tenancyUnits/abcd'.
    * @param {().DeleteTenantProjectRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteProject(): GaxiosPromise[Schema$Operation] = js.native
  def deleteProject(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def deleteProject(params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarDeleteproject): GaxiosPromise[Schema$Operation] = js.native
  def deleteProject(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarDeleteproject,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def deleteProject(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarDeleteproject,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def deleteProject(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarDeleteproject,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def deleteProject(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarDeleteproject,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * serviceconsumermanagement.services.tenancyUnits.list
    * @desc Find the tenancy unit for a managed service and service consumer.
    * This method shouldn't be used in a service producer's runtime path, for
    * example to find the tenant project number when creating VMs. Service
    * producers must persist the tenant project's information after the project
    * is created.
    * @alias serviceconsumermanagement.services.tenancyUnits.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Filter expression over tenancy resources field. Optional.
    * @param {integer=} params.pageSize The maximum number of results returned by this request.
    * @param {string=} params.pageToken The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of `nextPageToken` from the previous response.
    * @param {string} params.parent Managed service and service consumer. Required. services/{service}/{collection id}/{resource id} {collection id} is the cloud resource collection type representing the service consumer, for example 'projects', or 'organizations'. {resource id} is the consumer numeric id, such as project number: '123456'. {service} the name of a service, such as 'service.googleapis.com'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListTenancyUnitsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListTenancyUnitsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarList): GaxiosPromise[Schema$ListTenancyUnitsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarList,
    callback: BodyResponseCallback[Schema$ListTenancyUnitsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarList,
    options: BodyResponseCallback[Schema$ListTenancyUnitsResponse],
    callback: BodyResponseCallback[Schema$ListTenancyUnitsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListTenancyUnitsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListTenancyUnitsResponse]
  ): Unit = js.native
  /**
    * serviceconsumermanagement.services.tenancyUnits.removeProject
    * @desc Removes the specified project resource identified by a tenant
    * resource tag. The method removes the project lien with 'TenantManager'
    * origin if that was added. It then attempts to delete the project. If that
    * operation fails, this method also fails. Calls to remove already removed
    * or non-existent tenant project succeed. After the project has been
    * deleted, or if was already in a DELETED state, resource metadata is
    * permanently removed from the tenancy unit. Operation<response: Empty>.
    * @alias serviceconsumermanagement.services.tenancyUnits.removeProject
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the tenancy unit. Such as 'services/service.googleapis.com/projects/12345/tenancyUnits/abcd'.
    * @param {().RemoveTenantProjectRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def removeProject(): GaxiosPromise[Schema$Operation] = js.native
  def removeProject(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def removeProject(params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarRemoveproject): GaxiosPromise[Schema$Operation] = js.native
  def removeProject(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarRemoveproject,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def removeProject(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarRemoveproject,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def removeProject(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarRemoveproject,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def removeProject(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarRemoveproject,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * serviceconsumermanagement.services.tenancyUnits.undeleteProject
    * @desc Attempts to undelete a previously deleted tenant project. The
    * project must be in a DELETED state. There are no guarantees that an
    * undeleted project will be in a fully restored and functional state. Call
    * the `ApplyTenantProjectConfig` method to update its configuration and
    * then validate all managed service resources. Operation<response: Empty>.
    * @alias serviceconsumermanagement.services.tenancyUnits.undeleteProject
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the tenancy unit. Such as 'services/service.googleapis.com/projects/12345/tenancyUnits/abcd'.
    * @param {().UndeleteTenantProjectRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def undeleteProject(): GaxiosPromise[Schema$Operation] = js.native
  def undeleteProject(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def undeleteProject(params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarUndeleteproject): GaxiosPromise[Schema$Operation] = js.native
  def undeleteProject(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarUndeleteproject,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def undeleteProject(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarUndeleteproject,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def undeleteProject(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarUndeleteproject,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def undeleteProject(
    params: ParamsDollarResourceDollarServicesDollarTenancyunitsDollarUndeleteproject,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

