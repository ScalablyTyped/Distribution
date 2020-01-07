package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/bigtableadmin/v2", "bigtableadmin_v2.Resource$Projects$Instances$Tables")
@js.native
class ResourceDollarProjectsDollarInstancesDollarTables protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * bigtableadmin.projects.instances.tables.checkConsistency
    * @desc Checks replication consistency based on a consistency token, that
    * is, if replication has caught up based on the conditions specified in the
    * token and the check request.
    * @alias bigtableadmin.projects.instances.tables.checkConsistency
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The unique name of the Table for which to check replication consistency. Values are of the form `projects/<project>/instances/<instance>/tables/<table>`.
    * @param {().CheckConsistencyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def checkConsistency(): GaxiosPromise[Schema$CheckConsistencyResponse] = js.native
  def checkConsistency(callback: BodyResponseCallback[Schema$CheckConsistencyResponse]): Unit = js.native
  def checkConsistency(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarCheckconsistency): GaxiosPromise[Schema$CheckConsistencyResponse] = js.native
  def checkConsistency(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarCheckconsistency,
    callback: BodyResponseCallback[Schema$CheckConsistencyResponse]
  ): Unit = js.native
  def checkConsistency(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarCheckconsistency,
    options: BodyResponseCallback[Schema$CheckConsistencyResponse],
    callback: BodyResponseCallback[Schema$CheckConsistencyResponse]
  ): Unit = js.native
  def checkConsistency(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarCheckconsistency,
    options: MethodOptions
  ): GaxiosPromise[Schema$CheckConsistencyResponse] = js.native
  def checkConsistency(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarCheckconsistency,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CheckConsistencyResponse]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.tables.create
    * @desc Creates a new table in the specified instance. The table can be
    * created with a full set of initial column families, specified in the
    * request.
    * @alias bigtableadmin.projects.instances.tables.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The unique name of the instance in which to create the table. Values are of the form `projects/<project>/instances/<instance>`.
    * @param {().CreateTableRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Table] = js.native
  def create(callback: BodyResponseCallback[Schema$Table]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarCreate): GaxiosPromise[Schema$Table] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarCreate,
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarCreate,
    options: BodyResponseCallback[Schema$Table],
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Table] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.tables.delete
    * @desc Permanently deletes a specified table and all of its data.
    * @alias bigtableadmin.projects.instances.tables.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The unique name of the table to be deleted. Values are of the form `projects/<project>/instances/<instance>/tables/<table>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.tables.dropRowRange
    * @desc Permanently drop/delete a row range from a specified table. The
    * request can specify whether to delete all rows in a table, or only those
    * that match a particular prefix.
    * @alias bigtableadmin.projects.instances.tables.dropRowRange
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The unique name of the table on which to drop a range of rows. Values are of the form `projects/<project>/instances/<instance>/tables/<table>`.
    * @param {().DropRowRangeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def dropRowRange(): GaxiosPromise[Schema$Empty] = js.native
  def dropRowRange(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def dropRowRange(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarDroprowrange): GaxiosPromise[Schema$Empty] = js.native
  def dropRowRange(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarDroprowrange,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def dropRowRange(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarDroprowrange,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def dropRowRange(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarDroprowrange,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def dropRowRange(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarDroprowrange,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.tables.generateConsistencyToken
    * @desc Generates a consistency token for a Table, which can be used in
    * CheckConsistency to check whether mutations to the table that finished
    * before this call started have been replicated. The tokens will be
    * available for 90 days.
    * @alias bigtableadmin.projects.instances.tables.generateConsistencyToken
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The unique name of the Table for which to create a consistency token. Values are of the form `projects/<project>/instances/<instance>/tables/<table>`.
    * @param {().GenerateConsistencyTokenRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generateConsistencyToken(): GaxiosPromise[Schema$GenerateConsistencyTokenResponse] = js.native
  def generateConsistencyToken(callback: BodyResponseCallback[Schema$GenerateConsistencyTokenResponse]): Unit = js.native
  def generateConsistencyToken(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarGenerateconsistencytoken
  ): GaxiosPromise[Schema$GenerateConsistencyTokenResponse] = js.native
  def generateConsistencyToken(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarGenerateconsistencytoken,
    callback: BodyResponseCallback[Schema$GenerateConsistencyTokenResponse]
  ): Unit = js.native
  def generateConsistencyToken(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarGenerateconsistencytoken,
    options: BodyResponseCallback[Schema$GenerateConsistencyTokenResponse],
    callback: BodyResponseCallback[Schema$GenerateConsistencyTokenResponse]
  ): Unit = js.native
  def generateConsistencyToken(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarGenerateconsistencytoken,
    options: MethodOptions
  ): GaxiosPromise[Schema$GenerateConsistencyTokenResponse] = js.native
  def generateConsistencyToken(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarGenerateconsistencytoken,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GenerateConsistencyTokenResponse]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.tables.get
    * @desc Gets metadata information about the specified table.
    * @alias bigtableadmin.projects.instances.tables.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The unique name of the requested table. Values are of the form `projects/<project>/instances/<instance>/tables/<table>`.
    * @param {string=} params.view The view to be applied to the returned table's fields. Defaults to `SCHEMA_VIEW` if unspecified.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Table] = js.native
  def get(callback: BodyResponseCallback[Schema$Table]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarGet): GaxiosPromise[Schema$Table] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarGet,
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarGet,
    options: BodyResponseCallback[Schema$Table],
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Table] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.tables.getIamPolicy
    * @desc Gets the access control policy for an instance resource. Returns an
    * empty policy if an table exists but does not have a policy set.
    * @alias bigtableadmin.projects.instances.tables.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().GetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.tables.list
    * @desc Lists all tables served from a specified instance.
    * @alias bigtableadmin.projects.instances.tables.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Maximum number of results per page. CURRENTLY UNIMPLEMENTED AND IGNORED.
    * @param {string=} params.pageToken The value of `next_page_token` returned by a previous call.
    * @param {string} params.parent The unique name of the instance for which tables should be listed. Values are of the form `projects/<project>/instances/<instance>`.
    * @param {string=} params.view The view to be applied to the returned tables' fields. Defaults to `NAME_ONLY` if unspecified; no others are currently supported.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListTablesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListTablesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarList): GaxiosPromise[Schema$ListTablesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarList,
    callback: BodyResponseCallback[Schema$ListTablesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarList,
    options: BodyResponseCallback[Schema$ListTablesResponse],
    callback: BodyResponseCallback[Schema$ListTablesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListTablesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListTablesResponse]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.tables.modifyColumnFamilies
    * @desc Performs a series of column family modifications on the specified
    * table. Either all or none of the modifications will occur before this
    * method returns, but data requests received prior to that point may see a
    * table where only some modifications have taken effect.
    * @alias bigtableadmin.projects.instances.tables.modifyColumnFamilies
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The unique name of the table whose families should be modified. Values are of the form `projects/<project>/instances/<instance>/tables/<table>`.
    * @param {().ModifyColumnFamiliesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def modifyColumnFamilies(): GaxiosPromise[Schema$Table] = js.native
  def modifyColumnFamilies(callback: BodyResponseCallback[Schema$Table]): Unit = js.native
  def modifyColumnFamilies(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarModifycolumnfamilies): GaxiosPromise[Schema$Table] = js.native
  def modifyColumnFamilies(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarModifycolumnfamilies,
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  def modifyColumnFamilies(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarModifycolumnfamilies,
    options: BodyResponseCallback[Schema$Table],
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  def modifyColumnFamilies(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarModifycolumnfamilies,
    options: MethodOptions
  ): GaxiosPromise[Schema$Table] = js.native
  def modifyColumnFamilies(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarModifycolumnfamilies,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.tables.setIamPolicy
    * @desc Sets the access control policy on a table resource. Replaces any
    * existing policy.
    * @alias bigtableadmin.projects.instances.tables.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.tables.testIamPermissions
    * @desc Returns permissions that the caller has on the specified table
    * resource.
    * @alias bigtableadmin.projects.instances.tables.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
}

