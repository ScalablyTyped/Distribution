package typings.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1beta1", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Fhirstores$Fhir")
@js.native
class ResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhir protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var Observation: ResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarObservation = js.native
  var Patient: ResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarPatient = js.native
  var _history: ResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollar_history = js.native
  var context: APIRequestContext = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir._search
    * @desc Searches resources in the given FHIR store.  # Search Parameters
    * The server's capability statement, retrieved through
    * GetCapabilityStatement, indicates which search parameters are supported
    * on each FHIR resource.  # Search Modifiers  Modifier   | Supported
    * ----------- | --------- `:missing`  | Yes `:exact`    | Yes `:contains` |
    * Yes `:text`     | Yes `:in`       | Yes `:not-in`   | Yes `:above`    |
    * Yes `:below`    | Yes `:[type]`   | Yes `:not`      | Yes `:recurse`  |
    * No
    * @alias healthcare.projects.locations.datasets.fhirStores.fhir._search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Name of the FHIR store to retrieve resources from.
    * @param {().SearchResourcesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def _search(): GaxiosPromise[Schema$HttpBody] = js.native
  def _search(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def _search(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollar_search
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def _search(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollar_search,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def _search(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollar_search,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def _search(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollar_search,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def _search(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollar_search,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.conditionalDeleteResource
    * @desc Deletes FHIR resources matching a search query.  Note: unless
    * resource versioning is disabled by setting the
    * disable_resource_versioning flag on the FHIR store, the deleted resources
    * will be moved to a history repository that can still be retrieved through
    * GetResourceVersion and related methods, unless they are removed by the
    * DeleteResourceVersions method.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.fhir.conditionalDeleteResource
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the FHIR store this resource belongs to.
    * @param {string} params.type The type of the resource to update.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def conditionalDeleteResource(): GaxiosPromise[Schema$Empty] = js.native
  def conditionalDeleteResource(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def conditionalDeleteResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarConditionaldeleteresource
  ): GaxiosPromise[Schema$Empty] = js.native
  def conditionalDeleteResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarConditionaldeleteresource,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def conditionalDeleteResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarConditionaldeleteresource,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def conditionalDeleteResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarConditionaldeleteresource,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def conditionalDeleteResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarConditionaldeleteresource,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.conditionalPatchResource
    * @desc Updates parts of a resource if the resource exists based on the
    * search criteria specified via query parameters.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.fhir.conditionalPatchResource
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the FHIR store this resource belongs to.
    * @param {string} params.type The type of the resource to update.
    * @param {().HttpBody} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def conditionalPatchResource(): GaxiosPromise[Schema$HttpBody] = js.native
  def conditionalPatchResource(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def conditionalPatchResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarConditionalpatchresource
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def conditionalPatchResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarConditionalpatchresource,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def conditionalPatchResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarConditionalpatchresource,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def conditionalPatchResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarConditionalpatchresource,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def conditionalPatchResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarConditionalpatchresource,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.conditionalUpdateResource
    * @desc Updates the entire resource if the resource exists based on the
    * search criteria specified via query parameters.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.fhir.conditionalUpdateResource
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the FHIR store this resource belongs to.
    * @param {string} params.type The type of the resource to update.
    * @param {().HttpBody} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def conditionalUpdateResource(): GaxiosPromise[Schema$HttpBody] = js.native
  def conditionalUpdateResource(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def conditionalUpdateResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarConditionalupdateresource
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def conditionalUpdateResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarConditionalupdateresource,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def conditionalUpdateResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarConditionalupdateresource,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def conditionalUpdateResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarConditionalupdateresource,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def conditionalUpdateResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarConditionalupdateresource,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.createResource
    * @desc Creates a FHIR resource.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.fhir.createResource
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the FHIR store this resource belongs to.
    * @param {string} params.type The type of the resource to create.
    * @param {().HttpBody} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createResource(): GaxiosPromise[Schema$HttpBody] = js.native
  def createResource(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def createResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarCreateresource
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def createResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarCreateresource,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def createResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarCreateresource,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def createResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarCreateresource,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def createResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarCreateresource,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.delete
    * @desc Deletes a FHIR resource.  Note: unless resource versioning is
    * disabled by setting the disable_resource_versioning flag on the FHIR
    * store, the deleted resources will be moved to a history repository that
    * can still be retrieved through GetResourceVersion and related methods,
    * unless they are removed by the DeleteResourceVersions method.
    * @alias healthcare.projects.locations.datasets.fhirStores.fhir.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the resource to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$HttpBody] = js.native
  def delete(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarDelete
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarDelete,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarDelete,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.delete$purge
    * @desc Deletes all the historical versions of a resource (excluding
    * current version) from the FHIR store. To remove all versions of a
    * resource, first delete the current version and call this method.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.fhir.delete$purge
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the resource to purge.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  @JSName("delete$purge")
  def delete$purge(): GaxiosPromise[Schema$Empty] = js.native
  @JSName("delete$purge")
  def delete$purge(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  @JSName("delete$purge")
  def delete$purge(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarDeleteDollarpurge
  ): GaxiosPromise[Schema$Empty] = js.native
  @JSName("delete$purge")
  def delete$purge(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarDeleteDollarpurge,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  @JSName("delete$purge")
  def delete$purge(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarDeleteDollarpurge,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  @JSName("delete$purge")
  def delete$purge(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarDeleteDollarpurge,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  @JSName("delete$purge")
  def delete$purge(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarDeleteDollarpurge,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.get
    * @desc Gets a FHIR resource.
    * @alias healthcare.projects.locations.datasets.fhirStores.fhir.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the resource to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$HttpBody] = js.native
  def get(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarGet
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarGet,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarGet,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.getMetadata
    * @desc Gets the FHIR capability statement for the store, which contains a
    * description of functionality supported by the server.
    * @alias healthcare.projects.locations.datasets.fhirStores.fhir.getMetadata
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the FHIR store to retrieve the capabilities for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getMetadata(): GaxiosPromise[Schema$HttpBody] = js.native
  def getMetadata(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def getMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarGetmetadata
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def getMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarGetmetadata,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def getMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarGetmetadata,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def getMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarGetmetadata,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def getMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarGetmetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.patch
    * @desc Updates part of an existing resource.
    * @alias healthcare.projects.locations.datasets.fhirStores.fhir.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the resource to update.
    * @param {().HttpBody} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$HttpBody] = js.native
  def patch(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarPatch
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarPatch,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarPatch,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.searchResources
    * @desc Searches resources in the given FHIR store.  # Search Parameters
    * The server's capability statement, retrieved through
    * GetCapabilityStatement, indicates which search parameters are supported
    * on each FHIR resource.  # Search Modifiers  Modifier   | Supported
    * ----------- | --------- `:missing`  | Yes `:exact`    | Yes `:contains` |
    * Yes `:text`     | Yes `:in`       | Yes `:not-in`   | Yes `:above`    |
    * Yes `:below`    | Yes `:[type]`   | Yes `:not`      | Yes `:recurse`  |
    * No
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.fhir.searchResources
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Name of the FHIR store to retrieve resources from.
    * @param {string} params.resourceType The type of the resource to search.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def searchResources(): GaxiosPromise[Schema$HttpBody] = js.native
  def searchResources(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def searchResources(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarSearchresources
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def searchResources(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarSearchresources,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def searchResources(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarSearchresources,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def searchResources(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarSearchresources,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def searchResources(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarSearchresources,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.update
    * @desc Updates the entire resource or creates a new resource with a client
    * specified ID if the resource does not exist and the FHIR store has
    * enable_update_create set.
    * @alias healthcare.projects.locations.datasets.fhirStores.fhir.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the resource to update.
    * @param {().HttpBody} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$HttpBody] = js.native
  def update(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarUpdate
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarUpdate,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarUpdate,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhirDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
}

