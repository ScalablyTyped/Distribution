package typings.googleapis.appengineV1Mod.appengineV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/appengine/v1", "appengine_v1.Resource$Apps$Authorizedcertificates")
@js.native
class ResourceAppsAuthorizedcertificates protected () extends StObject {
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
  def create(): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def create(callback: BodyResponseCallback[SchemaAuthorizedCertificate]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def create(params: ParamsResourceAppsAuthorizedcertificatesCreate): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def create(
    params: ParamsResourceAppsAuthorizedcertificatesCreate,
    callback: BodyResponseCallback[SchemaAuthorizedCertificate]
  ): Unit = js.native
  def create(
    params: ParamsResourceAppsAuthorizedcertificatesCreate,
    options: BodyResponseCallback[SchemaAuthorizedCertificate],
    callback: BodyResponseCallback[SchemaAuthorizedCertificate]
  ): Unit = js.native
  def create(params: ParamsResourceAppsAuthorizedcertificatesCreate, options: MethodOptions): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def create(
    params: ParamsResourceAppsAuthorizedcertificatesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAuthorizedCertificate]
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
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAppsAuthorizedcertificatesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAppsAuthorizedcertificatesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAppsAuthorizedcertificatesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAppsAuthorizedcertificatesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAppsAuthorizedcertificatesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
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
  def get(): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def get(callback: BodyResponseCallback[SchemaAuthorizedCertificate]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def get(params: ParamsResourceAppsAuthorizedcertificatesGet): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def get(
    params: ParamsResourceAppsAuthorizedcertificatesGet,
    callback: BodyResponseCallback[SchemaAuthorizedCertificate]
  ): Unit = js.native
  def get(
    params: ParamsResourceAppsAuthorizedcertificatesGet,
    options: BodyResponseCallback[SchemaAuthorizedCertificate],
    callback: BodyResponseCallback[SchemaAuthorizedCertificate]
  ): Unit = js.native
  def get(params: ParamsResourceAppsAuthorizedcertificatesGet, options: MethodOptions): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def get(
    params: ParamsResourceAppsAuthorizedcertificatesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAuthorizedCertificate]
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
  def list(): GaxiosPromise[SchemaListAuthorizedCertificatesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAuthorizedCertificatesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAuthorizedCertificatesResponse] = js.native
  def list(params: ParamsResourceAppsAuthorizedcertificatesList): GaxiosPromise[SchemaListAuthorizedCertificatesResponse] = js.native
  def list(
    params: ParamsResourceAppsAuthorizedcertificatesList,
    callback: BodyResponseCallback[SchemaListAuthorizedCertificatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAppsAuthorizedcertificatesList,
    options: BodyResponseCallback[SchemaListAuthorizedCertificatesResponse],
    callback: BodyResponseCallback[SchemaListAuthorizedCertificatesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAppsAuthorizedcertificatesList, options: MethodOptions): GaxiosPromise[SchemaListAuthorizedCertificatesResponse] = js.native
  def list(
    params: ParamsResourceAppsAuthorizedcertificatesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAuthorizedCertificatesResponse]
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
  def patch(): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def patch(callback: BodyResponseCallback[SchemaAuthorizedCertificate]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def patch(params: ParamsResourceAppsAuthorizedcertificatesPatch): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def patch(
    params: ParamsResourceAppsAuthorizedcertificatesPatch,
    callback: BodyResponseCallback[SchemaAuthorizedCertificate]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAppsAuthorizedcertificatesPatch,
    options: BodyResponseCallback[SchemaAuthorizedCertificate],
    callback: BodyResponseCallback[SchemaAuthorizedCertificate]
  ): Unit = js.native
  def patch(params: ParamsResourceAppsAuthorizedcertificatesPatch, options: MethodOptions): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def patch(
    params: ParamsResourceAppsAuthorizedcertificatesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAuthorizedCertificate]
  ): Unit = js.native
}
