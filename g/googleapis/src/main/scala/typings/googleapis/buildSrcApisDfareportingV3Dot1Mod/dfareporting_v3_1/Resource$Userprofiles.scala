package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Userprofiles")
@js.native
class Resource$Userprofiles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.userProfiles.get
    * @desc Gets one user profile by ID.
    * @alias dfareporting.userProfiles.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId The user profile ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$UserProfile] = js.native
  def get(callback: BodyResponseCallback[Schema$UserProfile]): Unit = js.native
  def get(params: ParamsDollarResourceDollarUserprofilesDollarGet): GaxiosPromise[Schema$UserProfile] = js.native
  def get(
    params: ParamsDollarResourceDollarUserprofilesDollarGet,
    callback: BodyResponseCallback[Schema$UserProfile]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUserprofilesDollarGet,
    options: BodyResponseCallback[Schema$UserProfile],
    callback: BodyResponseCallback[Schema$UserProfile]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarUserprofilesDollarGet, options: MethodOptions): GaxiosPromise[Schema$UserProfile] = js.native
  def get(
    params: ParamsDollarResourceDollarUserprofilesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UserProfile]
  ): Unit = js.native
  /**
    * dfareporting.userProfiles.list
    * @desc Retrieves list of user profiles for a user.
    * @alias dfareporting.userProfiles.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$UserProfileList] = js.native
  def list(callback: BodyResponseCallback[Schema$UserProfileList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarUserprofilesDollarList): GaxiosPromise[Schema$UserProfileList] = js.native
  def list(
    params: ParamsDollarResourceDollarUserprofilesDollarList,
    callback: BodyResponseCallback[Schema$UserProfileList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUserprofilesDollarList,
    options: BodyResponseCallback[Schema$UserProfileList],
    callback: BodyResponseCallback[Schema$UserProfileList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarUserprofilesDollarList, options: MethodOptions): GaxiosPromise[Schema$UserProfileList] = js.native
  def list(
    params: ParamsDollarResourceDollarUserprofilesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UserProfileList]
  ): Unit = js.native
}

