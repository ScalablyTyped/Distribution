package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/sqladmin/v1beta4", "sqladmin_v1beta4.Resource$Sslcerts")
@js.native
class Resource$Sslcerts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * sql.sslCerts.createEphemeral
    * @desc Generates a short-lived X509 certificate containing the provided
    * public key and signed by a private key specific to the target instance.
    * Users may use the certificate to authenticate as themselves when
    * connecting to the database.
    * @alias sql.sslCerts.createEphemeral
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the Cloud SQL project.
    * @param {().SslCertsCreateEphemeralRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createEphemeral(): GaxiosPromise[Schema$SslCert] = js.native
  def createEphemeral(callback: BodyResponseCallback[Schema$SslCert]): Unit = js.native
  def createEphemeral(params: ParamsDollarResourceDollarSslcertsDollarCreateephemeral): GaxiosPromise[Schema$SslCert] = js.native
  def createEphemeral(
    params: ParamsDollarResourceDollarSslcertsDollarCreateephemeral,
    callback: BodyResponseCallback[Schema$SslCert]
  ): Unit = js.native
  def createEphemeral(
    params: ParamsDollarResourceDollarSslcertsDollarCreateephemeral,
    options: BodyResponseCallback[Schema$SslCert],
    callback: BodyResponseCallback[Schema$SslCert]
  ): Unit = js.native
  def createEphemeral(params: ParamsDollarResourceDollarSslcertsDollarCreateephemeral, options: MethodOptions): GaxiosPromise[Schema$SslCert] = js.native
  def createEphemeral(
    params: ParamsDollarResourceDollarSslcertsDollarCreateephemeral,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SslCert]
  ): Unit = js.native
  /**
    * sql.sslCerts.delete
    * @desc Deletes the SSL certificate. For First Generation instances, the
    * certificate remains valid until the instance is restarted.
    * @alias sql.sslCerts.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {string} params.sha1Fingerprint Sha1 FingerPrint.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSslcertsDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarSslcertsDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarSslcertsDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSslcertsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarSslcertsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * sql.sslCerts.get
    * @desc Retrieves a particular SSL certificate. Does not include the
    * private key (required for usage). The private key must be saved from the
    * response to initial creation.
    * @alias sql.sslCerts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {string} params.sha1Fingerprint Sha1 FingerPrint.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$SslCert] = js.native
  def get(callback: BodyResponseCallback[Schema$SslCert]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSslcertsDollarGet): GaxiosPromise[Schema$SslCert] = js.native
  def get(
    params: ParamsDollarResourceDollarSslcertsDollarGet,
    callback: BodyResponseCallback[Schema$SslCert]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSslcertsDollarGet,
    options: BodyResponseCallback[Schema$SslCert],
    callback: BodyResponseCallback[Schema$SslCert]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSslcertsDollarGet, options: MethodOptions): GaxiosPromise[Schema$SslCert] = js.native
  def get(
    params: ParamsDollarResourceDollarSslcertsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SslCert]
  ): Unit = js.native
  /**
    * sql.sslCerts.insert
    * @desc Creates an SSL certificate and returns it along with the private
    * key and server certificate authority. The new certificate will not be
    * usable until the instance is restarted.
    * @alias sql.sslCerts.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().SslCertsInsertRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$SslCertsInsertResponse] = js.native
  def insert(callback: BodyResponseCallback[Schema$SslCertsInsertResponse]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarSslcertsDollarInsert): GaxiosPromise[Schema$SslCertsInsertResponse] = js.native
  def insert(
    params: ParamsDollarResourceDollarSslcertsDollarInsert,
    callback: BodyResponseCallback[Schema$SslCertsInsertResponse]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarSslcertsDollarInsert,
    options: BodyResponseCallback[Schema$SslCertsInsertResponse],
    callback: BodyResponseCallback[Schema$SslCertsInsertResponse]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarSslcertsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$SslCertsInsertResponse] = js.native
  def insert(
    params: ParamsDollarResourceDollarSslcertsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SslCertsInsertResponse]
  ): Unit = js.native
  /**
    * sql.sslCerts.list
    * @desc Lists all of the current SSL certificates for the instance.
    * @alias sql.sslCerts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$SslCertsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$SslCertsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSslcertsDollarList): GaxiosPromise[Schema$SslCertsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSslcertsDollarList,
    callback: BodyResponseCallback[Schema$SslCertsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSslcertsDollarList,
    options: BodyResponseCallback[Schema$SslCertsListResponse],
    callback: BodyResponseCallback[Schema$SslCertsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSslcertsDollarList, options: MethodOptions): GaxiosPromise[Schema$SslCertsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSslcertsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SslCertsListResponse]
  ): Unit = js.native
}

