package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/ml/v1", "ml_v1.Resource$Projects$Models$Versions")
@js.native
class ResourceDollarProjectsDollarModelsDollarVersions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * ml.projects.models.versions.create
    * @desc Creates a new version of a model from a trained TensorFlow model.
    * If the version created in the cloud by this call is the first deployed
    * version of the specified model, it will be made the default version of
    * the model. When you add a version to a model that already has one or more
    * versions, the default version does not automatically change. If you want
    * a new version to be the default, you must call
    * [projects.models.versions.setDefault](/ml-engine/reference/rest/v1/projects.models.versions/setDefault).
    * @alias ml.projects.models.versions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The name of the model.
    * @param {().GoogleCloudMlV1__Version} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$GoogleLongrunning__Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$GoogleLongrunning__Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarCreate): GaxiosPromise[Schema$GoogleLongrunning__Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarCreate,
    callback: BodyResponseCallback[Schema$GoogleLongrunning__Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarCreate,
    options: BodyResponseCallback[Schema$GoogleLongrunning__Operation],
    callback: BodyResponseCallback[Schema$GoogleLongrunning__Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleLongrunning__Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunning__Operation]
  ): Unit = js.native
  /**
    * ml.projects.models.versions.delete
    * @desc Deletes a model version.  Each model can have multiple versions
    * deployed and in use at any given time. Use this method to remove a single
    * version.  Note: You cannot delete the version that is set as the default
    * version of the model unless it is the only remaining version.
    * @alias ml.projects.models.versions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the version. You can get the names of all the versions of a model by calling [projects.models.versions.list](/ml-engine/reference/rest/v1/projects.models.versions/list).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$GoogleLongrunning__Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$GoogleLongrunning__Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarDelete): GaxiosPromise[Schema$GoogleLongrunning__Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarDelete,
    callback: BodyResponseCallback[Schema$GoogleLongrunning__Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarDelete,
    options: BodyResponseCallback[Schema$GoogleLongrunning__Operation],
    callback: BodyResponseCallback[Schema$GoogleLongrunning__Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleLongrunning__Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunning__Operation]
  ): Unit = js.native
  /**
    * ml.projects.models.versions.get
    * @desc Gets information about a model version.  Models can have multiple
    * versions. You can call
    * [projects.models.versions.list](/ml-engine/reference/rest/v1/projects.models.versions/list)
    * to get the same information that this method returns for all of the
    * versions of a model.
    * @alias ml.projects.models.versions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the version.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleCloudMlV1__Version] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Version]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarGet): GaxiosPromise[Schema$GoogleCloudMlV1__Version] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarGet,
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Version]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarGet,
    options: BodyResponseCallback[Schema$GoogleCloudMlV1__Version],
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Version]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudMlV1__Version] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Version]
  ): Unit = js.native
  /**
    * ml.projects.models.versions.list
    * @desc Gets basic information about all the versions of a model.  If you
    * expect that a model has many versions, or if you need to handle only a
    * limited number of results at a time, you can request that the list be
    * retrieved in batches (called pages).  If there are no versions that match
    * the request parameters, the list request returns an empty response body:
    * {}.
    * @alias ml.projects.models.versions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Optional. Specifies the subset of versions to retrieve.
    * @param {integer=} params.pageSize Optional. The number of versions to retrieve per "page" of results. If there are more remaining results than this number, the response message will contain a valid value in the `next_page_token` field.  The default value is 20, and the maximum page size is 100.
    * @param {string=} params.pageToken Optional. A page token to request the next page of results.  You get the token from the `next_page_token` field of the response from the previous call.
    * @param {string} params.parent Required. The name of the model for which to list the version.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GoogleCloudMlV1__ListVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GoogleCloudMlV1__ListVersionsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarList): GaxiosPromise[Schema$GoogleCloudMlV1__ListVersionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarList,
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__ListVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarList,
    options: BodyResponseCallback[Schema$GoogleCloudMlV1__ListVersionsResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__ListVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudMlV1__ListVersionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__ListVersionsResponse]
  ): Unit = js.native
  /**
    * ml.projects.models.versions.patch
    * @desc Updates the specified Version resource.  Currently the only
    * update-able fields are `description` and `autoScaling.minNodes`.
    * @alias ml.projects.models.versions.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the model.
    * @param {string=} params.updateMask Required. Specifies the path, relative to `Version`, of the field to update. Must be present and non-empty.  For example, to change the description of a version to "foo", the `update_mask` parameter would be specified as `description`, and the `PATCH` request body would specify the new value, as follows:     {       "description": "foo"     }  Currently the only supported update mask fields are `description` and `autoScaling.minNodes`.
    * @param {().GoogleCloudMlV1__Version} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$GoogleLongrunning__Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$GoogleLongrunning__Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarPatch): GaxiosPromise[Schema$GoogleLongrunning__Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarPatch,
    callback: BodyResponseCallback[Schema$GoogleLongrunning__Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarPatch,
    options: BodyResponseCallback[Schema$GoogleLongrunning__Operation],
    callback: BodyResponseCallback[Schema$GoogleLongrunning__Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleLongrunning__Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunning__Operation]
  ): Unit = js.native
  /**
    * ml.projects.models.versions.setDefault
    * @desc Designates a version to be the default for the model.  The default
    * version is used for prediction requests made against the model that don't
    * specify a version.  The first version to be created for a model is
    * automatically set as the default. You must make any subsequent changes to
    * the default version setting manually using this method.
    * @alias ml.projects.models.versions.setDefault
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the version to make the default for the model. You can get the names of all the versions of a model by calling [projects.models.versions.list](/ml-engine/reference/rest/v1/projects.models.versions/list).
    * @param {().GoogleCloudMlV1__SetDefaultVersionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setDefault(): GaxiosPromise[Schema$GoogleCloudMlV1__Version] = js.native
  def setDefault(callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Version]): Unit = js.native
  def setDefault(params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarSetdefault): GaxiosPromise[Schema$GoogleCloudMlV1__Version] = js.native
  def setDefault(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarSetdefault,
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Version]
  ): Unit = js.native
  def setDefault(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarSetdefault,
    options: BodyResponseCallback[Schema$GoogleCloudMlV1__Version],
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Version]
  ): Unit = js.native
  def setDefault(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarSetdefault,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudMlV1__Version] = js.native
  def setDefault(
    params: ParamsDollarResourceDollarProjectsDollarModelsDollarVersionsDollarSetdefault,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Version]
  ): Unit = js.native
}

