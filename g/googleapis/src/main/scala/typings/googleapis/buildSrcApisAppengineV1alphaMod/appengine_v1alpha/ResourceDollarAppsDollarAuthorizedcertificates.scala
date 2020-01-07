package typings.googleapis.buildSrcApisAppengineV1alphaMod.appengine_v1alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/appengine/v1alpha", "appengine_v1alpha.Resource$Apps$Authorizedcertificates")
@js.native
class ResourceDollarAppsDollarAuthorizedcertificates protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * appengine.apps.authorizedCertificates.create
    * @desc Uploads the specified SSL certificate.
    * @alias appengine.apps.authorizedCertificates.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `parent`. Name of the parent Application resource. Example: apps/myapp.
    * @param {().AuthorizedCertificate} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$AuthorizedCertificate] = js.native
  def create(callback: BodyResponseCallback[Schema$AuthorizedCertificate]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarCreate): GaxiosPromise[Schema$AuthorizedCertificate] = js.native
  def create(
    params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarCreate,
    callback: BodyResponseCallback[Schema$AuthorizedCertificate]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarCreate,
    options: BodyResponseCallback[Schema$AuthorizedCertificate],
    callback: BodyResponseCallback[Schema$AuthorizedCertificate]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$AuthorizedCertificate] = js.native
  def create(
    params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AuthorizedCertificate]
  ): Unit = js.native
  /**
    * appengine.apps.authorizedCertificates.delete
    * @desc Deletes the specified SSL certificate.
    * @alias appengine.apps.authorizedCertificates.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the resource to delete. Example: apps/myapp/authorizedCertificates/12345.
    * @param {string} params.authorizedCertificatesId Part of `name`. See documentation of `appsId`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * appengine.apps.authorizedCertificates.get
    * @desc Gets the specified SSL certificate.
    * @alias appengine.apps.authorizedCertificates.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the resource requested. Example: apps/myapp/authorizedCertificates/12345.
    * @param {string} params.authorizedCertificatesId Part of `name`. See documentation of `appsId`.
    * @param {string=} params.view Controls the set of fields returned in the GET response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$AuthorizedCertificate] = js.native
  def get(callback: BodyResponseCallback[Schema$AuthorizedCertificate]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarGet): GaxiosPromise[Schema$AuthorizedCertificate] = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarGet,
    callback: BodyResponseCallback[Schema$AuthorizedCertificate]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarGet,
    options: BodyResponseCallback[Schema$AuthorizedCertificate],
    callback: BodyResponseCallback[Schema$AuthorizedCertificate]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$AuthorizedCertificate] = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AuthorizedCertificate]
  ): Unit = js.native
  /**
    * appengine.apps.authorizedCertificates.list
    * @desc Lists all SSL certificates the user is authorized to administer.
    * @alias appengine.apps.authorizedCertificates.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `parent`. Name of the parent Application resource. Example: apps/myapp.
    * @param {integer=} params.pageSize Maximum results to return per page.
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string=} params.view Controls the set of fields returned in the LIST response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListAuthorizedCertificatesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListAuthorizedCertificatesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarList): GaxiosPromise[Schema$ListAuthorizedCertificatesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarList,
    callback: BodyResponseCallback[Schema$ListAuthorizedCertificatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarList,
    options: BodyResponseCallback[Schema$ListAuthorizedCertificatesResponse],
    callback: BodyResponseCallback[Schema$ListAuthorizedCertificatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListAuthorizedCertificatesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListAuthorizedCertificatesResponse]
  ): Unit = js.native
  /**
    * appengine.apps.authorizedCertificates.patch
    * @desc Updates the specified SSL certificate. To renew a certificate and
    * maintain its existing domain mappings, update certificate_data with a new
    * certificate. The new certificate must be applicable to the same domains
    * as the original certificate. The certificate display_name may also be
    * updated.
    * @alias appengine.apps.authorizedCertificates.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the resource to update. Example: apps/myapp/authorizedCertificates/12345.
    * @param {string} params.authorizedCertificatesId Part of `name`. See documentation of `appsId`.
    * @param {string=} params.updateMask Standard field mask for the set of fields to be updated. Updates are only supported on the certificate_raw_data and display_name fields.
    * @param {().AuthorizedCertificate} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$AuthorizedCertificate] = js.native
  def patch(callback: BodyResponseCallback[Schema$AuthorizedCertificate]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarPatch): GaxiosPromise[Schema$AuthorizedCertificate] = js.native
  def patch(
    params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarPatch,
    callback: BodyResponseCallback[Schema$AuthorizedCertificate]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarPatch,
    options: BodyResponseCallback[Schema$AuthorizedCertificate],
    callback: BodyResponseCallback[Schema$AuthorizedCertificate]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$AuthorizedCertificate] = js.native
  def patch(
    params: ParamsDollarResourceDollarAppsDollarAuthorizedcertificatesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AuthorizedCertificate]
  ): Unit = js.native
}

