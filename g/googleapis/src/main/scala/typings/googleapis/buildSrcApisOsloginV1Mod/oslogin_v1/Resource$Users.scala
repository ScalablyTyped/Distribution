package typings.googleapis.buildSrcApisOsloginV1Mod.oslogin_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/oslogin/v1", "oslogin_v1.Resource$Users")
@js.native
class Resource$Users protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var projects: ResourceDollarUsersDollarProjects = js.native
  var sshPublicKeys: ResourceDollarUsersDollarSshpublickeys = js.native
  /**
    * oslogin.users.getLoginProfile
    * @desc Retrieves the profile information used for logging in to a virtual
    * machine on Google Compute Engine.
    * @alias oslogin.users.getLoginProfile
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The unique ID for the user in format `users/{user}`.
    * @param {string=} params.projectId The project ID of the Google Cloud Platform project.
    * @param {string=} params.systemId A system ID for filtering the results of the request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getLoginProfile(): GaxiosPromise[Schema$LoginProfile] = js.native
  def getLoginProfile(callback: BodyResponseCallback[Schema$LoginProfile]): Unit = js.native
  def getLoginProfile(params: ParamsDollarResourceDollarUsersDollarGetloginprofile): GaxiosPromise[Schema$LoginProfile] = js.native
  def getLoginProfile(
    params: ParamsDollarResourceDollarUsersDollarGetloginprofile,
    callback: BodyResponseCallback[Schema$LoginProfile]
  ): Unit = js.native
  def getLoginProfile(
    params: ParamsDollarResourceDollarUsersDollarGetloginprofile,
    options: BodyResponseCallback[Schema$LoginProfile],
    callback: BodyResponseCallback[Schema$LoginProfile]
  ): Unit = js.native
  def getLoginProfile(params: ParamsDollarResourceDollarUsersDollarGetloginprofile, options: MethodOptions): GaxiosPromise[Schema$LoginProfile] = js.native
  def getLoginProfile(
    params: ParamsDollarResourceDollarUsersDollarGetloginprofile,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LoginProfile]
  ): Unit = js.native
  /**
    * oslogin.users.importSshPublicKey
    * @desc Adds an SSH public key and returns the profile information. Default
    * POSIX account information is set when no username and UID exist as part
    * of the login profile.
    * @alias oslogin.users.importSshPublicKey
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The unique ID for the user in format `users/{user}`.
    * @param {string=} params.projectId The project ID of the Google Cloud Platform project.
    * @param {().SshPublicKey} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def importSshPublicKey(): GaxiosPromise[Schema$ImportSshPublicKeyResponse] = js.native
  def importSshPublicKey(callback: BodyResponseCallback[Schema$ImportSshPublicKeyResponse]): Unit = js.native
  def importSshPublicKey(params: ParamsDollarResourceDollarUsersDollarImportsshpublickey): GaxiosPromise[Schema$ImportSshPublicKeyResponse] = js.native
  def importSshPublicKey(
    params: ParamsDollarResourceDollarUsersDollarImportsshpublickey,
    callback: BodyResponseCallback[Schema$ImportSshPublicKeyResponse]
  ): Unit = js.native
  def importSshPublicKey(
    params: ParamsDollarResourceDollarUsersDollarImportsshpublickey,
    options: BodyResponseCallback[Schema$ImportSshPublicKeyResponse],
    callback: BodyResponseCallback[Schema$ImportSshPublicKeyResponse]
  ): Unit = js.native
  def importSshPublicKey(params: ParamsDollarResourceDollarUsersDollarImportsshpublickey, options: MethodOptions): GaxiosPromise[Schema$ImportSshPublicKeyResponse] = js.native
  def importSshPublicKey(
    params: ParamsDollarResourceDollarUsersDollarImportsshpublickey,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ImportSshPublicKeyResponse]
  ): Unit = js.native
}

