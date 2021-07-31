package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/bigtableadmin/v2", "bigtableadmin_v2.Resource$Projects$Instances$Tables")
@js.native
class ResourceProjectsInstancesTables protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
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
  def checkConsistency(): GaxiosPromise[SchemaCheckConsistencyResponse] = js.native
  def checkConsistency(callback: BodyResponseCallback[SchemaCheckConsistencyResponse]): Unit = js.native
  def checkConsistency(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCheckConsistencyResponse] = js.native
  def checkConsistency(params: ParamsResourceProjectsInstancesTablesCheckconsistency): GaxiosPromise[SchemaCheckConsistencyResponse] = js.native
  def checkConsistency(
    params: ParamsResourceProjectsInstancesTablesCheckconsistency,
    callback: BodyResponseCallback[SchemaCheckConsistencyResponse]
  ): Unit = js.native
  def checkConsistency(
    params: ParamsResourceProjectsInstancesTablesCheckconsistency,
    options: BodyResponseCallback[SchemaCheckConsistencyResponse],
    callback: BodyResponseCallback[SchemaCheckConsistencyResponse]
  ): Unit = js.native
  def checkConsistency(params: ParamsResourceProjectsInstancesTablesCheckconsistency, options: MethodOptions): GaxiosPromise[SchemaCheckConsistencyResponse] = js.native
  def checkConsistency(
    params: ParamsResourceProjectsInstancesTablesCheckconsistency,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCheckConsistencyResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
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
  def create(): GaxiosPromise[SchemaTable] = js.native
  def create(callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def create(params: ParamsResourceProjectsInstancesTablesCreate): GaxiosPromise[SchemaTable] = js.native
  def create(params: ParamsResourceProjectsInstancesTablesCreate, callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def create(
    params: ParamsResourceProjectsInstancesTablesCreate,
    options: BodyResponseCallback[SchemaTable],
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsInstancesTablesCreate, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def create(
    params: ParamsResourceProjectsInstancesTablesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTable]
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
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsInstancesTablesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsInstancesTablesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsInstancesTablesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsInstancesTablesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsInstancesTablesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
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
  def dropRowRange(): GaxiosPromise[SchemaEmpty] = js.native
  def dropRowRange(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def dropRowRange(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def dropRowRange(params: ParamsResourceProjectsInstancesTablesDroprowrange): GaxiosPromise[SchemaEmpty] = js.native
  def dropRowRange(
    params: ParamsResourceProjectsInstancesTablesDroprowrange,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def dropRowRange(
    params: ParamsResourceProjectsInstancesTablesDroprowrange,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def dropRowRange(params: ParamsResourceProjectsInstancesTablesDroprowrange, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def dropRowRange(
    params: ParamsResourceProjectsInstancesTablesDroprowrange,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
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
  def generateConsistencyToken(): GaxiosPromise[SchemaGenerateConsistencyTokenResponse] = js.native
  def generateConsistencyToken(callback: BodyResponseCallback[SchemaGenerateConsistencyTokenResponse]): Unit = js.native
  def generateConsistencyToken(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGenerateConsistencyTokenResponse] = js.native
  def generateConsistencyToken(params: ParamsResourceProjectsInstancesTablesGenerateconsistencytoken): GaxiosPromise[SchemaGenerateConsistencyTokenResponse] = js.native
  def generateConsistencyToken(
    params: ParamsResourceProjectsInstancesTablesGenerateconsistencytoken,
    callback: BodyResponseCallback[SchemaGenerateConsistencyTokenResponse]
  ): Unit = js.native
  def generateConsistencyToken(
    params: ParamsResourceProjectsInstancesTablesGenerateconsistencytoken,
    options: BodyResponseCallback[SchemaGenerateConsistencyTokenResponse],
    callback: BodyResponseCallback[SchemaGenerateConsistencyTokenResponse]
  ): Unit = js.native
  def generateConsistencyToken(params: ParamsResourceProjectsInstancesTablesGenerateconsistencytoken, options: MethodOptions): GaxiosPromise[SchemaGenerateConsistencyTokenResponse] = js.native
  def generateConsistencyToken(
    params: ParamsResourceProjectsInstancesTablesGenerateconsistencytoken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGenerateConsistencyTokenResponse]
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
  def get(): GaxiosPromise[SchemaTable] = js.native
  def get(callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def get(params: ParamsResourceProjectsInstancesTablesGet): GaxiosPromise[SchemaTable] = js.native
  def get(params: ParamsResourceProjectsInstancesTablesGet, callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def get(
    params: ParamsResourceProjectsInstancesTablesGet,
    options: BodyResponseCallback[SchemaTable],
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsInstancesTablesGet, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def get(
    params: ParamsResourceProjectsInstancesTablesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTable]
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
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsInstancesTablesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsInstancesTablesGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsInstancesTablesGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsInstancesTablesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsInstancesTablesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
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
  def list(): GaxiosPromise[SchemaListTablesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTablesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTablesResponse] = js.native
  def list(params: ParamsResourceProjectsInstancesTablesList): GaxiosPromise[SchemaListTablesResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstancesTablesList,
    callback: BodyResponseCallback[SchemaListTablesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsInstancesTablesList,
    options: BodyResponseCallback[SchemaListTablesResponse],
    callback: BodyResponseCallback[SchemaListTablesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsInstancesTablesList, options: MethodOptions): GaxiosPromise[SchemaListTablesResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstancesTablesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTablesResponse]
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
  def modifyColumnFamilies(): GaxiosPromise[SchemaTable] = js.native
  def modifyColumnFamilies(callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def modifyColumnFamilies(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def modifyColumnFamilies(params: ParamsResourceProjectsInstancesTablesModifycolumnfamilies): GaxiosPromise[SchemaTable] = js.native
  def modifyColumnFamilies(
    params: ParamsResourceProjectsInstancesTablesModifycolumnfamilies,
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
  def modifyColumnFamilies(
    params: ParamsResourceProjectsInstancesTablesModifycolumnfamilies,
    options: BodyResponseCallback[SchemaTable],
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
  def modifyColumnFamilies(params: ParamsResourceProjectsInstancesTablesModifycolumnfamilies, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def modifyColumnFamilies(
    params: ParamsResourceProjectsInstancesTablesModifycolumnfamilies,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTable]
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
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsInstancesTablesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsInstancesTablesSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsInstancesTablesSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsInstancesTablesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsInstancesTablesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
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
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsInstancesTablesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsInstancesTablesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsInstancesTablesTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsInstancesTablesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsInstancesTablesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
}
