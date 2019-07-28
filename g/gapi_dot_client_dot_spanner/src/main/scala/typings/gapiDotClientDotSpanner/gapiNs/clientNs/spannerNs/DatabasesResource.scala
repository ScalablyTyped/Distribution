package typings.gapiDotClientDotSpanner.gapiNs.clientNs.spannerNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotSpanner.Anon_Accesstoken
import typings.gapiDotClientDotSpanner.Anon_AccesstokenAlt
import typings.gapiDotClientDotSpanner.Anon_AccesstokenAltBearertokenCallbackDatabase
import typings.gapiDotClientDotSpanner.Anon_AccesstokenAltBearertokenCallbackFields
import typings.gapiDotClientDotSpanner.Anon_AccesstokenAltBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabasesResource extends js.Object {
  var operations: OperationsResource
  var sessions: SessionsResource
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
  def create(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[Operation]
  /** Drops (aka deletes) a Cloud Spanner database. */
  def dropDatabase(request: Anon_AccesstokenAltBearertokenCallbackDatabase): Request[js.Object]
  /** Gets the state of a Cloud Spanner database. */
  def get(request: Anon_Accesstoken): Request[Database]
  /**
    * Returns the schema of a Cloud Spanner database as a list of formatted
    * DDL statements. This method does not show pending schema updates, those may
    * be queried using the Operations API.
    */
  def getDdl(request: Anon_AccesstokenAltBearertokenCallbackDatabase): Request[GetDatabaseDdlResponse]
  /**
    * Gets the access control policy for a database resource. Returns an empty
    * policy if a database exists but does not have a policy set.
    *
    * Authorization requires `spanner.databases.getIamPolicy` permission on
    * resource.
    */
  def getIamPolicy(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[Policy]
  /** Lists Cloud Spanner databases. */
  def list(request: Anon_AccesstokenAlt): Request[ListDatabasesResponse]
  /**
    * Sets the access control policy on a database resource. Replaces any
    * existing policy.
    *
    * Authorization requires `spanner.databases.setIamPolicy` permission on
    * resource.
    */
  def setIamPolicy(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[Policy]
  /**
    * Returns permissions that the caller has on the specified database resource.
    *
    * Attempting this RPC on a non-existent Cloud Spanner database will result in
    * a NOT_FOUND error if the user has `spanner.databases.list` permission on
    * the containing Cloud Spanner instance. Otherwise returns an empty set of
    * permissions.
    */
  def testIamPermissions(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[TestIamPermissionsResponse]
  /**
    * Updates the schema of a Cloud Spanner database by
    * creating/altering/dropping tables, columns, indexes, etc. The returned
    * long-running operation will have a name of
    * the format `<database_name>/operations/<operation_id>` and can be used to
    * track execution of the schema change(s). The
    * metadata field type is
    * UpdateDatabaseDdlMetadata.  The operation has no response.
    */
  def updateDdl(request: Anon_AccesstokenAltBearertokenCallbackDatabase): Request[Operation]
}

object DatabasesResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAltBearertokenCallbackFields => Request[Operation],
    dropDatabase: Anon_AccesstokenAltBearertokenCallbackDatabase => Request[js.Object],
    get: Anon_Accesstoken => Request[Database],
    getDdl: Anon_AccesstokenAltBearertokenCallbackDatabase => Request[GetDatabaseDdlResponse],
    getIamPolicy: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[Policy],
    list: Anon_AccesstokenAlt => Request[ListDatabasesResponse],
    operations: OperationsResource,
    sessions: SessionsResource,
    setIamPolicy: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[Policy],
    testIamPermissions: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[TestIamPermissionsResponse],
    updateDdl: Anon_AccesstokenAltBearertokenCallbackDatabase => Request[Operation]
  ): DatabasesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), dropDatabase = js.Any.fromFunction1(dropDatabase), get = js.Any.fromFunction1(get), getDdl = js.Any.fromFunction1(getDdl), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), operations = operations, sessions = sessions, setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), updateDdl = js.Any.fromFunction1(updateDdl))
  
    __obj.asInstanceOf[DatabasesResource]
  }
}

