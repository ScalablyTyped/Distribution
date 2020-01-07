package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/run/v1alpha1", "run_v1alpha1.Resource$Namespaces$Services")
@js.native
class ResourceDollarNamespacesDollarServices protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * run.namespaces.services.create
    * @desc Rpc to create a service.
    * @alias run.namespaces.services.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The project ID or project number in which this service should be created.
    * @param {().Service} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Service] = js.native
  def create(callback: BodyResponseCallback[Schema$Service]): Unit = js.native
  def create(params: ParamsDollarResourceDollarNamespacesDollarServicesDollarCreate): GaxiosPromise[Schema$Service] = js.native
  def create(
    params: ParamsDollarResourceDollarNamespacesDollarServicesDollarCreate,
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarNamespacesDollarServicesDollarCreate,
    options: BodyResponseCallback[Schema$Service],
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarNamespacesDollarServicesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Service] = js.native
  def create(
    params: ParamsDollarResourceDollarNamespacesDollarServicesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  /**
    * run.namespaces.services.delete
    * @desc Rpc to delete a service. This will cause the Service to stop
    * serving traffic and will delete the child entities like Routes,
    * Configurations and Revisions.
    * @alias run.namespaces.services.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.apiVersion Cloud Run currently ignores this parameter.
    * @param {string=} params.kind Cloud Run currently ignores this parameter.
    * @param {string} params.name The name of the service being deleted. If needed, replace {namespace_id} with the project ID.
    * @param {boolean=} params.orphanDependents Deprecated. Specifies the cascade behavior on delete. Cloud Run only supports cascading behavior, so this must be false. This attribute is deprecated, and is now replaced with PropagationPolicy See https://github.com/kubernetes/kubernetes/issues/46659 for more info.
    * @param {string=} params.propagationPolicy Specifies the propagation policy of delete. Cloud Run currently ignores this setting, and deletes in the background. Please see kubernetes.io/docs/concepts/workloads/controllers/garbage-collection/ for more information.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarNamespacesDollarServicesDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarNamespacesDollarServicesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarNamespacesDollarServicesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarNamespacesDollarServicesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarNamespacesDollarServicesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * run.namespaces.services.get
    * @desc Rpc to get information about a service.
    * @alias run.namespaces.services.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the service being retrieved. If needed, replace {namespace_id} with the project ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Service] = js.native
  def get(callback: BodyResponseCallback[Schema$Service]): Unit = js.native
  def get(params: ParamsDollarResourceDollarNamespacesDollarServicesDollarGet): GaxiosPromise[Schema$Service] = js.native
  def get(
    params: ParamsDollarResourceDollarNamespacesDollarServicesDollarGet,
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarNamespacesDollarServicesDollarGet,
    options: BodyResponseCallback[Schema$Service],
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarNamespacesDollarServicesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Service] = js.native
  def get(
    params: ParamsDollarResourceDollarNamespacesDollarServicesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  /**
    * run.namespaces.services.list
    * @desc Rpc to list services.
    * @alias run.namespaces.services.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.continue Optional encoded string to continue paging.
    * @param {string=} params.fieldSelector Allows to filter resources based on a specific value for a field name. Send this in a query string format. i.e. 'metadata.name%3Dlorem'. Not currently used by Cloud Run.
    * @param {boolean=} params.includeUninitialized Not currently used by Cloud Run.
    * @param {string=} params.labelSelector Allows to filter resources based on a label. Supported operations are =, !=, exists, in, and notIn.
    * @param {integer=} params.limit The maximum number of records that should be returned.
    * @param {string} params.parent The project ID or project number from which the services should be listed.
    * @param {string=} params.resourceVersion The baseline resource version from which the list or watch operation should start. Not currently used by Cloud Run.
    * @param {boolean=} params.watch Flag that indicates that the client expects to watch this resource as well. Not currently used by Cloud Run.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListServicesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListServicesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarNamespacesDollarServicesDollarList): GaxiosPromise[Schema$ListServicesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarNamespacesDollarServicesDollarList,
    callback: BodyResponseCallback[Schema$ListServicesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarNamespacesDollarServicesDollarList,
    options: BodyResponseCallback[Schema$ListServicesResponse],
    callback: BodyResponseCallback[Schema$ListServicesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarNamespacesDollarServicesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListServicesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarNamespacesDollarServicesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListServicesResponse]
  ): Unit = js.native
  /**
    * run.namespaces.services.replaceService
    * @desc Rpc to replace a service.  Only the spec and metadata labels and
    * annotations are modifiable. After the Update request, Cloud Run will work
    * to make the 'status' match the requested 'spec'.  May provide
    * metadata.resourceVersion to enforce update from last read for optimistic
    * concurrency control.
    * @alias run.namespaces.services.replaceService
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the service being replaced. If needed, replace {namespace_id} with the project ID.
    * @param {().Service} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def replaceService(): GaxiosPromise[Schema$Service] = js.native
  def replaceService(callback: BodyResponseCallback[Schema$Service]): Unit = js.native
  def replaceService(params: ParamsDollarResourceDollarNamespacesDollarServicesDollarReplaceservice): GaxiosPromise[Schema$Service] = js.native
  def replaceService(
    params: ParamsDollarResourceDollarNamespacesDollarServicesDollarReplaceservice,
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  def replaceService(
    params: ParamsDollarResourceDollarNamespacesDollarServicesDollarReplaceservice,
    options: BodyResponseCallback[Schema$Service],
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  def replaceService(
    params: ParamsDollarResourceDollarNamespacesDollarServicesDollarReplaceservice,
    options: MethodOptions
  ): GaxiosPromise[Schema$Service] = js.native
  def replaceService(
    params: ParamsDollarResourceDollarNamespacesDollarServicesDollarReplaceservice,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
}

