package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

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
  def create(request: gapiDotClientDotSpannerLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Drops (aka deletes) a Cloud Spanner database. */
  def dropDatabase(request: gapiDotClientDotSpannerLib.Anon_AccesstokenAltBearertokenCallbackDatabase): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets the state of a Cloud Spanner database. */
  def get(request: gapiDotClientDotSpannerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Database]
  /**
    * Returns the schema of a Cloud Spanner database as a list of formatted
    * DDL statements. This method does not show pending schema updates, those may
    * be queried using the Operations API.
    */
  def getDdl(request: gapiDotClientDotSpannerLib.Anon_AccesstokenAltBearertokenCallbackDatabase): gapiDotClientLib.gapiNs.clientNs.Request[GetDatabaseDdlResponse]
  /**
    * Gets the access control policy for a database resource. Returns an empty
    * policy if a database exists but does not have a policy set.
    *
    * Authorization requires `spanner.databases.getIamPolicy` permission on
    * resource.
    */
  def getIamPolicy(request: gapiDotClientDotSpannerLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /** Lists Cloud Spanner databases. */
  def list(request: gapiDotClientDotSpannerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[ListDatabasesResponse]
  /**
    * Sets the access control policy on a database resource. Replaces any
    * existing policy.
    *
    * Authorization requires `spanner.databases.setIamPolicy` permission on
    * resource.
    */
  def setIamPolicy(request: gapiDotClientDotSpannerLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /**
    * Returns permissions that the caller has on the specified database resource.
    *
    * Attempting this RPC on a non-existent Cloud Spanner database will result in
    * a NOT_FOUND error if the user has `spanner.databases.list` permission on
    * the containing Cloud Spanner instance. Otherwise returns an empty set of
    * permissions.
    */
  def testIamPermissions(request: gapiDotClientDotSpannerLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[TestIamPermissionsResponse]
  /**
    * Updates the schema of a Cloud Spanner database by
    * creating/altering/dropping tables, columns, indexes, etc. The returned
    * long-running operation will have a name of
    * the format `<database_name>/operations/<operation_id>` and can be used to
    * track execution of the schema change(s). The
    * metadata field type is
    * UpdateDatabaseDdlMetadata.  The operation has no response.
    */
  def updateDdl(request: gapiDotClientDotSpannerLib.Anon_AccesstokenAltBearertokenCallbackDatabase): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object DatabasesResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotSpannerLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    dropDatabase: js.Function1[
      gapiDotClientDotSpannerLib.Anon_AccesstokenAltBearertokenCallbackDatabase, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotSpannerLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Database]
    ],
    getDdl: js.Function1[
      gapiDotClientDotSpannerLib.Anon_AccesstokenAltBearertokenCallbackDatabase, 
      gapiDotClientLib.gapiNs.clientNs.Request[GetDatabaseDdlResponse]
    ],
    getIamPolicy: js.Function1[
      gapiDotClientDotSpannerLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Policy]
    ],
    list: js.Function1[
      gapiDotClientDotSpannerLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListDatabasesResponse]
    ],
    operations: OperationsResource,
    sessions: SessionsResource,
    setIamPolicy: js.Function1[
      gapiDotClientDotSpannerLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Policy]
    ],
    testIamPermissions: js.Function1[
      gapiDotClientDotSpannerLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[TestIamPermissionsResponse]
    ],
    updateDdl: js.Function1[
      gapiDotClientDotSpannerLib.Anon_AccesstokenAltBearertokenCallbackDatabase, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): DatabasesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("dropDatabase")(dropDatabase)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("getDdl")(getDdl)
    __obj.updateDynamic("getIamPolicy")(getIamPolicy)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("operations")(operations)
    __obj.updateDynamic("sessions")(sessions)
    __obj.updateDynamic("setIamPolicy")(setIamPolicy)
    __obj.updateDynamic("testIamPermissions")(testIamPermissions)
    __obj.updateDynamic("updateDdl")(updateDdl)
    __obj.asInstanceOf[DatabasesResource]
  }
}

