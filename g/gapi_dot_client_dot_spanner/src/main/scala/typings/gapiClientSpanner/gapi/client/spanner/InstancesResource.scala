package typings.gapiClientSpanner.gapi.client.spanner

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSpanner.AnonAccesstoken
import typings.gapiClientSpanner.AnonFilter
import typings.gapiClientSpanner.AnonKey
import typings.gapiClientSpanner.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesResource extends js.Object {
  var databases: DatabasesResource
  var operations: OperationsResource
  /**
    * Creates an instance and begins preparing it to begin serving. The
    * returned long-running operation
    * can be used to track the progress of preparing the new
    * instance. The instance name is assigned by the caller. If the
    * named instance already exists, `CreateInstance` returns
    * `ALREADY_EXISTS`.
    *
    * Immediately upon completion of this request:
    *
    * &#42; The instance is readable via the API, with all requested attributes
    * but no allocated resources. Its state is `CREATING`.
    *
    * Until completion of the returned operation:
    *
    * &#42; Cancelling the operation renders the instance immediately unreadable
    * via the API.
    * &#42; The instance can be deleted.
    * &#42; All other attempts to modify the instance are rejected.
    *
    * Upon completion of the returned operation:
    *
    * &#42; Billing for all successfully-allocated resources begins (some types
    * may have lower than the requested levels).
    * &#42; Databases can be created in the instance.
    * &#42; The instance's allocated resource levels are readable via the API.
    * &#42; The instance's state becomes `READY`.
    *
    * The returned long-running operation will
    * have a name of the format `<instance_name>/operations/<operation_id>` and
    * can be used to track creation of the instance.  The
    * metadata field type is
    * CreateInstanceMetadata.
    * The response field type is
    * Instance, if successful.
    */
  def create(request: AnonKey): Request_[Operation]
  /**
    * Deletes an instance.
    *
    * Immediately upon completion of the request:
    *
    * &#42; Billing ceases for all of the instance's reserved resources.
    *
    * Soon afterward:
    *
    * &#42; The instance and &#42;all of its databases&#42; immediately and
    * irrevocably disappear from the API. All data in the databases
    * is permanently deleted.
    */
  def delete(request: AnonAccesstoken): Request_[js.Object]
  /** Gets information about a particular instance. */
  def get(request: AnonAccesstoken): Request_[Instance]
  /**
    * Gets the access control policy for an instance resource. Returns an empty
    * policy if an instance exists but does not have a policy set.
    *
    * Authorization requires `spanner.instances.getIamPolicy` on
    * resource.
    */
  def getIamPolicy(request: AnonOauthtoken): Request_[Policy]
  /** Lists all instances in the given project. */
  def list(request: AnonFilter): Request_[ListInstancesResponse]
  /**
    * Updates an instance, and begins allocating or releasing resources
    * as requested. The returned long-running
    * operation can be used to track the
    * progress of updating the instance. If the named instance does not
    * exist, returns `NOT_FOUND`.
    *
    * Immediately upon completion of this request:
    *
    * &#42; For resource types for which a decrease in the instance's allocation
    * has been requested, billing is based on the newly-requested level.
    *
    * Until completion of the returned operation:
    *
    * &#42; Cancelling the operation sets its metadata's
    * cancel_time, and begins
    * restoring resources to their pre-request values. The operation
    * is guaranteed to succeed at undoing all resource changes,
    * after which point it terminates with a `CANCELLED` status.
    * &#42; All other attempts to modify the instance are rejected.
    * &#42; Reading the instance via the API continues to give the pre-request
    * resource levels.
    *
    * Upon completion of the returned operation:
    *
    * &#42; Billing begins for all successfully-allocated resources (some types
    * may have lower than the requested levels).
    * &#42; All newly-reserved resources are available for serving the instance's
    * tables.
    * &#42; The instance's new resource levels are readable via the API.
    *
    * The returned long-running operation will
    * have a name of the format `<instance_name>/operations/<operation_id>` and
    * can be used to track the instance modification.  The
    * metadata field type is
    * UpdateInstanceMetadata.
    * The response field type is
    * Instance, if successful.
    *
    * Authorization requires `spanner.instances.update` permission on
    * resource name.
    */
  def patch(request: AnonAccesstoken): Request_[Operation]
  /**
    * Sets the access control policy on an instance resource. Replaces any
    * existing policy.
    *
    * Authorization requires `spanner.instances.setIamPolicy` on
    * resource.
    */
  def setIamPolicy(request: AnonOauthtoken): Request_[Policy]
  /**
    * Returns permissions that the caller has on the specified instance resource.
    *
    * Attempting this RPC on a non-existent Cloud Spanner instance resource will
    * result in a NOT_FOUND error if the user has `spanner.instances.list`
    * permission on the containing Google Cloud Project. Otherwise returns an
    * empty set of permissions.
    */
  def testIamPermissions(request: AnonOauthtoken): Request_[TestIamPermissionsResponse]
}

object InstancesResource {
  @scala.inline
  def apply(
    create: AnonKey => Request_[Operation],
    databases: DatabasesResource,
    delete: AnonAccesstoken => Request_[js.Object],
    get: AnonAccesstoken => Request_[Instance],
    getIamPolicy: AnonOauthtoken => Request_[Policy],
    list: AnonFilter => Request_[ListInstancesResponse],
    operations: OperationsResource,
    patch: AnonAccesstoken => Request_[Operation],
    setIamPolicy: AnonOauthtoken => Request_[Policy],
    testIamPermissions: AnonOauthtoken => Request_[TestIamPermissionsResponse]
  ): InstancesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), databases = databases.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), operations = operations.asInstanceOf[js.Any], patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
    __obj.asInstanceOf[InstancesResource]
  }
}

