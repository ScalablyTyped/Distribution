package typings.gapiClientPubsub.gapi.client.pubsub

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPubsub.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotsResource extends js.Object {
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: Accesstoken): Request[Policy]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: Accesstoken): Request[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: Accesstoken): Request[TestIamPermissionsResponse]
}

object SnapshotsResource {
  @scala.inline
  def apply(
    getIamPolicy: Accesstoken => Request[Policy],
    setIamPolicy: Accesstoken => Request[Policy],
    testIamPermissions: Accesstoken => Request[TestIamPermissionsResponse]
  ): SnapshotsResource = {
    val __obj = js.Dynamic.literal(getIamPolicy = js.Any.fromFunction1(getIamPolicy), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
    __obj.asInstanceOf[SnapshotsResource]
  }
}

