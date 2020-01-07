package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/spanner/v1", "spanner_v1.Resource$Projects$Instances$Databases")
@js.native
class ResourceDollarProjectsDollarInstancesDollarDatabases protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var operations: ResourceDollarProjectsDollarInstancesDollarDatabasesDollarOperations = js.native
  var sessions: ResourceDollarProjectsDollarInstancesDollarDatabasesDollarSessions = js.native
  /**
    * spanner.projects.instances.databases.create
    * @desc Creates a new Cloud Spanner database and starts to prepare it for
    * serving. The returned long-running operation will have a name of the
    * format `<database_name>/operations/<operation_id>` and can be used to
    * track preparation of the database. The metadata field type is
    * CreateDatabaseMetadata. The response field type is Database, if
    * successful.
    * @alias spanner.projects.instances.databases.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The name of the instance that will serve the new database. Values are of the form `projects/<project>/instances/<instance>`.
    * @param {().CreateDatabaseRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * spanner.projects.instances.databases.dropDatabase
    * @desc Drops (aka deletes) a Cloud Spanner database.
    * @alias spanner.projects.instances.databases.dropDatabase
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database Required. The database to be dropped.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def dropDatabase(): GaxiosPromise[Schema$Empty] = js.native
  def dropDatabase(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def dropDatabase(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarDropdatabase): GaxiosPromise[Schema$Empty] = js.native
  def dropDatabase(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarDropdatabase,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def dropDatabase(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarDropdatabase,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def dropDatabase(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarDropdatabase,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def dropDatabase(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarDropdatabase,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * spanner.projects.instances.databases.get
    * @desc Gets the state of a Cloud Spanner database.
    * @alias spanner.projects.instances.databases.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the requested database. Values are of the form `projects/<project>/instances/<instance>/databases/<database>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Database] = js.native
  def get(callback: BodyResponseCallback[Schema$Database]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarGet): GaxiosPromise[Schema$Database] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarGet,
    callback: BodyResponseCallback[Schema$Database]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarGet,
    options: BodyResponseCallback[Schema$Database],
    callback: BodyResponseCallback[Schema$Database]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Database] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Database]
  ): Unit = js.native
  /**
    * spanner.projects.instances.databases.getDdl
    * @desc Returns the schema of a Cloud Spanner database as a list of
    * formatted DDL statements. This method does not show pending schema
    * updates, those may be queried using the Operations API.
    * @alias spanner.projects.instances.databases.getDdl
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database Required. The database whose schema we wish to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getDdl(): GaxiosPromise[Schema$GetDatabaseDdlResponse] = js.native
  def getDdl(callback: BodyResponseCallback[Schema$GetDatabaseDdlResponse]): Unit = js.native
  def getDdl(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarGetddl): GaxiosPromise[Schema$GetDatabaseDdlResponse] = js.native
  def getDdl(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarGetddl,
    callback: BodyResponseCallback[Schema$GetDatabaseDdlResponse]
  ): Unit = js.native
  def getDdl(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarGetddl,
    options: BodyResponseCallback[Schema$GetDatabaseDdlResponse],
    callback: BodyResponseCallback[Schema$GetDatabaseDdlResponse]
  ): Unit = js.native
  def getDdl(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarGetddl,
    options: MethodOptions
  ): GaxiosPromise[Schema$GetDatabaseDdlResponse] = js.native
  def getDdl(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarGetddl,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetDatabaseDdlResponse]
  ): Unit = js.native
  /**
    * spanner.projects.instances.databases.getIamPolicy
    * @desc Gets the access control policy for a database resource. Returns an
    * empty policy if a database exists but does not have a policy set.
    * Authorization requires `spanner.databases.getIamPolicy` permission on
    * resource.
    * @alias spanner.projects.instances.databases.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The Cloud Spanner resource for which the policy is being retrieved. The format is `projects/<project ID>/instances/<instance ID>` for instance resources and `projects/<project ID>/instances/<instance ID>/databases/<database ID>` for database resources.
    * @param {().GetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * spanner.projects.instances.databases.list
    * @desc Lists Cloud Spanner databases.
    * @alias spanner.projects.instances.databases.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Number of databases to be returned in the response. If 0 or less, defaults to the server's maximum allowed page size.
    * @param {string=} params.pageToken If non-empty, `page_token` should contain a next_page_token from a previous ListDatabasesResponse.
    * @param {string} params.parent Required. The instance whose databases should be listed. Values are of the form `projects/<project>/instances/<instance>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListDatabasesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListDatabasesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarList): GaxiosPromise[Schema$ListDatabasesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarList,
    callback: BodyResponseCallback[Schema$ListDatabasesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarList,
    options: BodyResponseCallback[Schema$ListDatabasesResponse],
    callback: BodyResponseCallback[Schema$ListDatabasesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListDatabasesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListDatabasesResponse]
  ): Unit = js.native
  /**
    * spanner.projects.instances.databases.setIamPolicy
    * @desc Sets the access control policy on a database resource. Replaces any
    * existing policy.  Authorization requires `spanner.databases.setIamPolicy`
    * permission on resource.
    * @alias spanner.projects.instances.databases.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The Cloud Spanner resource for which the policy is being set. The format is `projects/<project ID>/instances/<instance ID>` for instance resources and `projects/<project ID>/instances/<instance ID>/databases/<database ID>` for databases resources.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * spanner.projects.instances.databases.testIamPermissions
    * @desc Returns permissions that the caller has on the specified database
    * resource.  Attempting this RPC on a non-existent Cloud Spanner database
    * will result in a NOT_FOUND error if the user has `spanner.databases.list`
    * permission on the containing Cloud Spanner instance. Otherwise returns an
    * empty set of permissions.
    * @alias spanner.projects.instances.databases.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The Cloud Spanner resource for which permissions are being tested. The format is `projects/<project ID>/instances/<instance ID>` for instance resources and `projects/<project ID>/instances/<instance ID>/databases/<database ID>` for database resources.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * spanner.projects.instances.databases.updateDdl
    * @desc Updates the schema of a Cloud Spanner database by
    * creating/altering/dropping tables, columns, indexes, etc. The returned
    * long-running operation will have a name of the format
    * `<database_name>/operations/<operation_id>` and can be used to track
    * execution of the schema change(s). The metadata field type is
    * UpdateDatabaseDdlMetadata.  The operation has no response.
    * @alias spanner.projects.instances.databases.updateDdl
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database Required. The database to update.
    * @param {().UpdateDatabaseDdlRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateDdl(): GaxiosPromise[Schema$Operation] = js.native
  def updateDdl(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def updateDdl(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarUpdateddl): GaxiosPromise[Schema$Operation] = js.native
  def updateDdl(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarUpdateddl,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def updateDdl(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarUpdateddl,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def updateDdl(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarUpdateddl,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def updateDdl(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarUpdateddl,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

