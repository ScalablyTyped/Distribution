package typings.googleapis.buildSrcApisProximitybeaconV1beta1Mod.proximitybeacon_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/proximitybeacon/v1beta1", "proximitybeacon_v1beta1.Resource$Namespaces")
@js.native
class Resource$Namespaces protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * proximitybeacon.namespaces.list
    * @desc Lists all attachment namespaces owned by your Google Developers
    * Console project. Attachment data associated with a beacon must include a
    * namespaced type, and the namespace must be owned by your project.
    * Authenticate using an [OAuth access
    * token](https://developers.google.com/identity/protocols/OAuth2) from a
    * signed-in user with **viewer**, **Is owner** or **Can edit** permissions
    * in the Google Developers Console project.
    * @alias proximitybeacon.namespaces.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.projectId The project id to list namespaces under. Optional.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListNamespacesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListNamespacesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarNamespacesDollarList): GaxiosPromise[Schema$ListNamespacesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarNamespacesDollarList,
    callback: BodyResponseCallback[Schema$ListNamespacesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarNamespacesDollarList,
    options: BodyResponseCallback[Schema$ListNamespacesResponse],
    callback: BodyResponseCallback[Schema$ListNamespacesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarNamespacesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListNamespacesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarNamespacesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListNamespacesResponse]
  ): Unit = js.native
  /**
    * proximitybeacon.namespaces.update
    * @desc Updates the information about the specified namespace. Only the
    * namespace visibility can be updated.
    * @alias proximitybeacon.namespaces.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.namespaceName Resource name of this namespace. Namespaces names have the format: <code>namespaces/<var>namespace</var></code>.
    * @param {string=} params.projectId The project id of the namespace to update. If the project id is not specified then the project making the request is used. The project id must match the project that owns the beacon. Optional.
    * @param {().Namespace} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Namespace] = js.native
  def update(callback: BodyResponseCallback[Schema$Namespace]): Unit = js.native
  def update(params: ParamsDollarResourceDollarNamespacesDollarUpdate): GaxiosPromise[Schema$Namespace] = js.native
  def update(
    params: ParamsDollarResourceDollarNamespacesDollarUpdate,
    callback: BodyResponseCallback[Schema$Namespace]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarNamespacesDollarUpdate,
    options: BodyResponseCallback[Schema$Namespace],
    callback: BodyResponseCallback[Schema$Namespace]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarNamespacesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Namespace] = js.native
  def update(
    params: ParamsDollarResourceDollarNamespacesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Namespace]
  ): Unit = js.native
}

