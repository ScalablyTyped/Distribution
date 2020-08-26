package typings.gapiClientSpanner.gapi.client.spanner

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSpanner.anon.Accesstoken
import typings.gapiClientSpanner.anon.Alt
import typings.gapiClientSpanner.anon.Key
import typings.gapiClientSpanner.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabasesResource extends js.Object {
  var operations: OperationsResource = js.native
  var sessions: SessionsResource = js.native
  /**
    * Creates a new Cloud Spanner database and starts to prepare it for serving.
    * The returned long-running operation will
    * have a name of the format `<database_name>/operations/<operation_id>` and
    * can be used to track preparation of the database. The
    * metadata field type is
    * CreateDatabaseMetadata. The
    * response field type is
    * Database, if successful.
    */
  def create(request: Key): Request[Operation] = js.native
  /** Drops (aka deletes) a Cloud Spanner database. */
  def dropDatabase(request: typings.gapiClientSpanner.anon.Database): Request[js.Object] = js.native
  /** Gets the state of a Cloud Spanner database. */
  def get(request: Accesstoken): Request[Database] = js.native
  /**
    * Returns the schema of a Cloud Spanner database as a list of formatted
    * DDL statements. This method does not show pending schema updates, those may
    * be queried using the Operations API.
    */
  def getDdl(request: typings.gapiClientSpanner.anon.Database): Request[GetDatabaseDdlResponse] = js.native
  /**
    * Gets the access control policy for a database resource. Returns an empty
    * policy if a database exists but does not have a policy set.
    *
    * Authorization requires `spanner.databases.getIamPolicy` permission on
    * resource.
    */
  def getIamPolicy(request: Oauthtoken): Request[Policy] = js.native
  /** Lists Cloud Spanner databases. */
  def list(request: Alt): Request[ListDatabasesResponse] = js.native
  /**
    * Sets the access control policy on a database resource. Replaces any
    * existing policy.
    *
    * Authorization requires `spanner.databases.setIamPolicy` permission on
    * resource.
    */
  def setIamPolicy(request: Oauthtoken): Request[Policy] = js.native
  /**
    * Returns permissions that the caller has on the specified database resource.
    *
    * Attempting this RPC on a non-existent Cloud Spanner database will result in
    * a NOT_FOUND error if the user has `spanner.databases.list` permission on
    * the containing Cloud Spanner instance. Otherwise returns an empty set of
    * permissions.
    */
  def testIamPermissions(request: Oauthtoken): Request[TestIamPermissionsResponse] = js.native
  /**
    * Updates the schema of a Cloud Spanner database by
    * creating/altering/dropping tables, columns, indexes, etc. The returned
    * long-running operation will have a name of
    * the format `<database_name>/operations/<operation_id>` and can be used to
    * track execution of the schema change(s). The
    * metadata field type is
    * UpdateDatabaseDdlMetadata.  The operation has no response.
    */
  def updateDdl(request: typings.gapiClientSpanner.anon.Database): Request[Operation] = js.native
}

object DatabasesResource {
  @scala.inline
  def apply(
    create: Key => Request[Operation],
    dropDatabase: typings.gapiClientSpanner.anon.Database => Request[js.Object],
    get: Accesstoken => Request[Database],
    getDdl: typings.gapiClientSpanner.anon.Database => Request[GetDatabaseDdlResponse],
    getIamPolicy: Oauthtoken => Request[Policy],
    list: Alt => Request[ListDatabasesResponse],
    operations: OperationsResource,
    sessions: SessionsResource,
    setIamPolicy: Oauthtoken => Request[Policy],
    testIamPermissions: Oauthtoken => Request[TestIamPermissionsResponse],
    updateDdl: typings.gapiClientSpanner.anon.Database => Request[Operation]
  ): DatabasesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), dropDatabase = js.Any.fromFunction1(dropDatabase), get = js.Any.fromFunction1(get), getDdl = js.Any.fromFunction1(getDdl), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), operations = operations.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any], setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), updateDdl = js.Any.fromFunction1(updateDdl))
    __obj.asInstanceOf[DatabasesResource]
  }
  @scala.inline
  implicit class DatabasesResourceOps[Self <: DatabasesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: Key => Request[Operation]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDropDatabase(value: typings.gapiClientSpanner.anon.Database => Request[js.Object]): Self = this.set("dropDatabase", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Accesstoken => Request[Database]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDdl(value: typings.gapiClientSpanner.anon.Database => Request[GetDatabaseDdlResponse]): Self = this.set("getDdl", js.Any.fromFunction1(value))
    @scala.inline
    def setGetIamPolicy(value: Oauthtoken => Request[Policy]): Self = this.set("getIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[ListDatabasesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setOperations(value: OperationsResource): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessions(value: SessionsResource): Self = this.set("sessions", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetIamPolicy(value: Oauthtoken => Request[Policy]): Self = this.set("setIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setTestIamPermissions(value: Oauthtoken => Request[TestIamPermissionsResponse]): Self = this.set("testIamPermissions", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateDdl(value: typings.gapiClientSpanner.anon.Database => Request[Operation]): Self = this.set("updateDdl", js.Any.fromFunction1(value))
  }
  
}

