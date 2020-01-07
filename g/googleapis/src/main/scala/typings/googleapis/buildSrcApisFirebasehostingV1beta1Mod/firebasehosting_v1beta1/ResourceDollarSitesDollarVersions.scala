package typings.googleapis.buildSrcApisFirebasehostingV1beta1Mod.firebasehosting_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/firebasehosting/v1beta1", "firebasehosting_v1beta1.Resource$Sites$Versions")
@js.native
class ResourceDollarSitesDollarVersions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var files: ResourceDollarSitesDollarVersionsDollarFiles = js.native
  /**
    * firebasehosting.sites.versions.create
    * @desc Creates a new version for a site.
    * @alias firebasehosting.sites.versions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The parent to create the version for, in the format: <code>sites/<var>site-name</var></code>
    * @param {string=} params.sizeBytes The self-reported size of the version. This value is used for a pre-emptive quota check for legacy version uploads.
    * @param {string=} params.versionId A unique id for the new version. This is only specified for legacy version creations.
    * @param {().Version} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Version] = js.native
  def create(callback: BodyResponseCallback[Schema$Version]): Unit = js.native
  def create(params: ParamsDollarResourceDollarSitesDollarVersionsDollarCreate): GaxiosPromise[Schema$Version] = js.native
  def create(
    params: ParamsDollarResourceDollarSitesDollarVersionsDollarCreate,
    callback: BodyResponseCallback[Schema$Version]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarSitesDollarVersionsDollarCreate,
    options: BodyResponseCallback[Schema$Version],
    callback: BodyResponseCallback[Schema$Version]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarSitesDollarVersionsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Version] = js.native
  def create(
    params: ParamsDollarResourceDollarSitesDollarVersionsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Version]
  ): Unit = js.native
  /**
    * firebasehosting.sites.versions.delete
    * @desc Deletes the specified version.
    * @alias firebasehosting.sites.versions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the version to be deleted, in the format: <code>sites/<var>site-name</var>/versions/<var>versionID</var></code>
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSitesDollarVersionsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarSitesDollarVersionsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarSitesDollarVersionsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSitesDollarVersionsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarSitesDollarVersionsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * firebasehosting.sites.versions.patch
    * @desc Updates the specified metadata for a version. Note that this method
    * will fail with `FAILED_PRECONDITION` in the event of an invalid state
    * transition. The only valid transition for a version is currently from a
    * `CREATED` status to a `FINALIZED` status. Use
    * [`DeleteVersion`](../sites.versions/delete) to set the status of a
    * version to `DELETED`.
    * @alias firebasehosting.sites.versions.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The unique identifier for a version, in the format: <code>sites/<var>site-name</var>/versions/<var>versionID</var></code> This name is provided in the response body when you call the [`CreateVersion`](../sites.versions/create) endpoint.
    * @param {string=} params.updateMask A set of field names from your [version](../sites.versions) that you want to update. <br>A field will be overwritten if, and only if, it's in the mask. <br>If a mask is not provided then a default mask of only [`status`](../sites.versions#Version.FIELDS.status) will be used.
    * @param {().Version} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Version] = js.native
  def patch(callback: BodyResponseCallback[Schema$Version]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarSitesDollarVersionsDollarPatch): GaxiosPromise[Schema$Version] = js.native
  def patch(
    params: ParamsDollarResourceDollarSitesDollarVersionsDollarPatch,
    callback: BodyResponseCallback[Schema$Version]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarSitesDollarVersionsDollarPatch,
    options: BodyResponseCallback[Schema$Version],
    callback: BodyResponseCallback[Schema$Version]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarSitesDollarVersionsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Version] = js.native
  def patch(
    params: ParamsDollarResourceDollarSitesDollarVersionsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Version]
  ): Unit = js.native
  /**
    * firebasehosting.sites.versions.populateFiles
    * @desc Adds content files to a version.
    * @alias firebasehosting.sites.versions.populateFiles
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The version to add files to, in the format: <code>sites/<var>site-name</var>/versions/<var>versionID</var></code>
    * @param {().PopulateVersionFilesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def populateFiles(): GaxiosPromise[Schema$PopulateVersionFilesResponse] = js.native
  def populateFiles(callback: BodyResponseCallback[Schema$PopulateVersionFilesResponse]): Unit = js.native
  def populateFiles(params: ParamsDollarResourceDollarSitesDollarVersionsDollarPopulatefiles): GaxiosPromise[Schema$PopulateVersionFilesResponse] = js.native
  def populateFiles(
    params: ParamsDollarResourceDollarSitesDollarVersionsDollarPopulatefiles,
    callback: BodyResponseCallback[Schema$PopulateVersionFilesResponse]
  ): Unit = js.native
  def populateFiles(
    params: ParamsDollarResourceDollarSitesDollarVersionsDollarPopulatefiles,
    options: BodyResponseCallback[Schema$PopulateVersionFilesResponse],
    callback: BodyResponseCallback[Schema$PopulateVersionFilesResponse]
  ): Unit = js.native
  def populateFiles(params: ParamsDollarResourceDollarSitesDollarVersionsDollarPopulatefiles, options: MethodOptions): GaxiosPromise[Schema$PopulateVersionFilesResponse] = js.native
  def populateFiles(
    params: ParamsDollarResourceDollarSitesDollarVersionsDollarPopulatefiles,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PopulateVersionFilesResponse]
  ): Unit = js.native
}

