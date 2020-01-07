package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Dynamictargetingkeys")
@js.native
class Resource$Dynamictargetingkeys protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.dynamicTargetingKeys.delete
    * @desc Deletes an existing dynamic targeting key.
    * @alias dfareporting.dynamicTargetingKeys.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of this dynamic targeting key. This is a required field. Must be less than 256 characters long and cannot contain commas. All characters are converted to lowercase.
    * @param {string} params.objectId ID of the object of this dynamic targeting key. This is a required field.
    * @param {string} params.objectType Type of the object of this dynamic targeting key. This is a required field.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarDynamictargetingkeysDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarDynamictargetingkeysDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarDynamictargetingkeysDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarDynamictargetingkeysDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarDynamictargetingkeysDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * dfareporting.dynamicTargetingKeys.insert
    * @desc Inserts a new dynamic targeting key. Keys must be created at the
    * advertiser level before being assigned to the advertiser's ads,
    * creatives, or placements. There is a maximum of 1000 keys per advertiser,
    * out of which a maximum of 20 keys can be assigned per ad, creative, or
    * placement.
    * @alias dfareporting.dynamicTargetingKeys.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().DynamicTargetingKey} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$DynamicTargetingKey] = js.native
  def insert(callback: BodyResponseCallback[Schema$DynamicTargetingKey]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarDynamictargetingkeysDollarInsert): GaxiosPromise[Schema$DynamicTargetingKey] = js.native
  def insert(
    params: ParamsDollarResourceDollarDynamictargetingkeysDollarInsert,
    callback: BodyResponseCallback[Schema$DynamicTargetingKey]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarDynamictargetingkeysDollarInsert,
    options: BodyResponseCallback[Schema$DynamicTargetingKey],
    callback: BodyResponseCallback[Schema$DynamicTargetingKey]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarDynamictargetingkeysDollarInsert, options: MethodOptions): GaxiosPromise[Schema$DynamicTargetingKey] = js.native
  def insert(
    params: ParamsDollarResourceDollarDynamictargetingkeysDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DynamicTargetingKey]
  ): Unit = js.native
  /**
    * dfareporting.dynamicTargetingKeys.list
    * @desc Retrieves a list of dynamic targeting keys.
    * @alias dfareporting.dynamicTargetingKeys.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.advertiserId Select only dynamic targeting keys whose object has this advertiser ID.
    * @param {string=} params.names Select only dynamic targeting keys exactly matching these names.
    * @param {string=} params.objectId Select only dynamic targeting keys with this object ID.
    * @param {string=} params.objectType Select only dynamic targeting keys with this object type.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$DynamicTargetingKeysListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$DynamicTargetingKeysListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarDynamictargetingkeysDollarList): GaxiosPromise[Schema$DynamicTargetingKeysListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDynamictargetingkeysDollarList,
    callback: BodyResponseCallback[Schema$DynamicTargetingKeysListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarDynamictargetingkeysDollarList,
    options: BodyResponseCallback[Schema$DynamicTargetingKeysListResponse],
    callback: BodyResponseCallback[Schema$DynamicTargetingKeysListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarDynamictargetingkeysDollarList, options: MethodOptions): GaxiosPromise[Schema$DynamicTargetingKeysListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDynamictargetingkeysDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DynamicTargetingKeysListResponse]
  ): Unit = js.native
}

