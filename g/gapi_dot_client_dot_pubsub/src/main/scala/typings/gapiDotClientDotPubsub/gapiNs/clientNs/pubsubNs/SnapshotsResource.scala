package typings.gapiDotClientDotPubsub.gapiNs.clientNs.pubsubNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotPubsub.Anon_Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotsResource extends js.Object {
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: Anon_Accesstoken): Request[Policy]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: Anon_Accesstoken): Request[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: Anon_Accesstoken): Request[TestIamPermissionsResponse]
}

object SnapshotsResource {
  @scala.inline
  def apply(
    getIamPolicy: Anon_Accesstoken => Request[Policy],
    setIamPolicy: Anon_Accesstoken => Request[Policy],
    testIamPermissions: Anon_Accesstoken => Request[TestIamPermissionsResponse]
  ): SnapshotsResource = {
    val __obj = js.Dynamic.literal(getIamPolicy = js.Any.fromFunction1(getIamPolicy), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
  
    __obj.asInstanceOf[SnapshotsResource]
  }
}

