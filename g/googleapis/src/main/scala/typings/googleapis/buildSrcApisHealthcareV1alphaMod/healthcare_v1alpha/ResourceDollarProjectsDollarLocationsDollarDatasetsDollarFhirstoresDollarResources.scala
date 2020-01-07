package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1alpha", "healthcare_v1alpha.Resource$Projects$Locations$Datasets$Fhirstores$Resources")
@js.native
class ResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResources protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var Patient: ResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarPatient = js.native
  var _history: ResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollar_history = js.native
  var context: APIRequestContext = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources._search
    * @desc Searches resources in the given FHIR store.  # Search Parameters
    * The server's capability statement, retrieved through
    * GetCapabilityStatement, indicates which search parameters are supported
    * on each FHIR resource.  # Search Modifiers  Modifier   | Supported
    * ----------- | --------- `:missing`  | Yes `:exact`    | Yes `:contains` |
    * Yes `:text`     | Yes `:in`       | Yes `:not-in`   | Yes `:above`    |
    * Yes `:below`    | Yes `:[type]`   | Yes `:not`      | Yes `:recurse`  |
    * No
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.resources._search
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollar_search
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def _search(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollar_search,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def _search(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollar_search,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def _search(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollar_search,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def _search(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollar_search,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources.conditionalDeleteResource
    * @desc Deletes FHIR resources matching a search query. Note: unless
    * resource versioning is disabled by setting the
    * disable_resource_versioning flag on the FHIR store, the deleted resources
    * will be moved to a history repository that can still be retrieved through
    * GetResourceVersion and related methods, unless they are removed by the
    * DeleteResourceVersions method.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.resources.conditionalDeleteResource
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarConditionaldeleteresource
  ): GaxiosPromise[Schema$Empty] = js.native
  def conditionalDeleteResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarConditionaldeleteresource,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def conditionalDeleteResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarConditionaldeleteresource,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def conditionalDeleteResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarConditionaldeleteresource,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def conditionalDeleteResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarConditionaldeleteresource,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources.conditionalPatchResource
    * @desc Updates parts of a resource if the resource exists based on the
    * search criteria specified via query parameters.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.resources.conditionalPatchResource
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarConditionalpatchresource
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def conditionalPatchResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarConditionalpatchresource,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def conditionalPatchResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarConditionalpatchresource,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def conditionalPatchResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarConditionalpatchresource,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def conditionalPatchResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarConditionalpatchresource,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources.conditionalUpdateResource
    * @desc Updates the entire resource if the resource exists based on the
    * search criteria specified via query parameters.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.resources.conditionalUpdateResource
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarConditionalupdateresource
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def conditionalUpdateResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarConditionalupdateresource,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def conditionalUpdateResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarConditionalupdateresource,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def conditionalUpdateResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarConditionalupdateresource,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def conditionalUpdateResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarConditionalupdateresource,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources.createResource
    * @desc Creates a FHIR resource.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.resources.createResource
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarCreateresource
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def createResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarCreateresource,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def createResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarCreateresource,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def createResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarCreateresource,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def createResource(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarCreateresource,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources.delete
    * @desc Deletes a FHIR resource. Note: unless resource versioning is
    * disabled by setting the disable_resource_versioning flag on the FHIR
    * store, the deleted resources will be moved to a history repository that
    * can still be retrieved through GetResourceVersion and related methods,
    * unless they are removed by the DeleteResourceVersions method.
    * @alias healthcare.projects.locations.datasets.fhirStores.resources.delete
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarDelete
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarDelete,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarDelete,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources.delete$purge
    * @desc Deletes all the historical versions of a resource (excluding
    * current version) from the FHIR store. To remove all versions of a
    * resource, first delete the current version and call this API.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.resources.delete$purge
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarDeleteDollarpurge
  ): GaxiosPromise[Schema$Empty] = js.native
  @JSName("delete$purge")
  def delete$purge(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarDeleteDollarpurge,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  @JSName("delete$purge")
  def delete$purge(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarDeleteDollarpurge,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  @JSName("delete$purge")
  def delete$purge(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarDeleteDollarpurge,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  @JSName("delete$purge")
  def delete$purge(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarDeleteDollarpurge,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources.get
    * @desc Gets a FHIR resource.
    * @alias healthcare.projects.locations.datasets.fhirStores.resources.get
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarGet
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarGet,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarGet,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources.getMetadata
    * @desc Gets the capabilities statement for the store.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.resources.getMetadata
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarGetmetadata
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def getMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarGetmetadata,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def getMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarGetmetadata,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def getMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarGetmetadata,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def getMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarGetmetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources.patch
    * @desc Updates part of an existing resource.
    * @alias healthcare.projects.locations.datasets.fhirStores.resources.patch
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarPatch
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarPatch,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarPatch,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources.searchResources
    * @desc Searches resources in the given FHIR store.  # Search Parameters
    * The server's capability statement, retrieved through
    * GetCapabilityStatement, indicates which search parameters are supported
    * on each FHIR resource.  # Search Modifiers  Modifier   | Supported
    * ----------- | --------- `:missing`  | Yes `:exact`    | Yes `:contains` |
    * Yes `:text`     | Yes `:in`       | Yes `:not-in`   | Yes `:above`    |
    * Yes `:below`    | Yes `:[type]`   | Yes `:not`      | Yes `:recurse`  |
    * No
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.resources.searchResources
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarSearchresources
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def searchResources(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarSearchresources,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def searchResources(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarSearchresources,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def searchResources(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarSearchresources,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def searchResources(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarSearchresources,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources.update
    * @desc Updates the entire resource or creates a new resource with a client
    * specified ID if the resource does not exist and the FHIR store has
    * enable_update_create set.
    * @alias healthcare.projects.locations.datasets.fhirStores.resources.update
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarUpdate
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarUpdate,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarUpdate,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
}

