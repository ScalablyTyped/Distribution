package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Serviceaccountkeys")
@js.native
class ResourceServiceaccountkeys protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * androidenterprise.serviceaccountkeys.delete
    * @desc Removes and invalidates the specified credentials for the service
    * account associated with this enterprise. The calling service account must
    * have been retrieved by calling Enterprises.GetServiceAccount and must
    * have been set as the enterprise service account by calling
    * Enterprises.SetAccount.
    * @alias androidenterprise.serviceaccountkeys.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.keyId The ID of the key.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceServiceaccountkeysDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceServiceaccountkeysDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceServiceaccountkeysDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceServiceaccountkeysDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceServiceaccountkeysDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * androidenterprise.serviceaccountkeys.insert
    * @desc Generates new credentials for the service account associated with
    * this enterprise. The calling service account must have been retrieved by
    * calling Enterprises.GetServiceAccount and must have been set as the
    * enterprise service account by calling Enterprises.SetAccount.  Only the
    * type of the key should be populated in the resource to be inserted.
    * @alias androidenterprise.serviceaccountkeys.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {().ServiceAccountKey} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaServiceAccountKey] = js.native
  def insert(callback: BodyResponseCallback[SchemaServiceAccountKey]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaServiceAccountKey] = js.native
  def insert(params: ParamsResourceServiceaccountkeysInsert): GaxiosPromise[SchemaServiceAccountKey] = js.native
  def insert(
    params: ParamsResourceServiceaccountkeysInsert,
    callback: BodyResponseCallback[SchemaServiceAccountKey]
  ): Unit = js.native
  def insert(
    params: ParamsResourceServiceaccountkeysInsert,
    options: BodyResponseCallback[SchemaServiceAccountKey],
    callback: BodyResponseCallback[SchemaServiceAccountKey]
  ): Unit = js.native
  def insert(params: ParamsResourceServiceaccountkeysInsert, options: MethodOptions): GaxiosPromise[SchemaServiceAccountKey] = js.native
  def insert(
    params: ParamsResourceServiceaccountkeysInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaServiceAccountKey]
  ): Unit = js.native
  
  /**
    * androidenterprise.serviceaccountkeys.list
    * @desc Lists all active credentials for the service account associated
    * with this enterprise. Only the ID and key type are returned. The calling
    * service account must have been retrieved by calling
    * Enterprises.GetServiceAccount and must have been set as the enterprise
    * service account by calling Enterprises.SetAccount.
    * @alias androidenterprise.serviceaccountkeys.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaServiceAccountKeysListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaServiceAccountKeysListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaServiceAccountKeysListResponse] = js.native
  def list(params: ParamsResourceServiceaccountkeysList): GaxiosPromise[SchemaServiceAccountKeysListResponse] = js.native
  def list(
    params: ParamsResourceServiceaccountkeysList,
    callback: BodyResponseCallback[SchemaServiceAccountKeysListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceServiceaccountkeysList,
    options: BodyResponseCallback[SchemaServiceAccountKeysListResponse],
    callback: BodyResponseCallback[SchemaServiceAccountKeysListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceServiceaccountkeysList, options: MethodOptions): GaxiosPromise[SchemaServiceAccountKeysListResponse] = js.native
  def list(
    params: ParamsResourceServiceaccountkeysList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaServiceAccountKeysListResponse]
  ): Unit = js.native
}
