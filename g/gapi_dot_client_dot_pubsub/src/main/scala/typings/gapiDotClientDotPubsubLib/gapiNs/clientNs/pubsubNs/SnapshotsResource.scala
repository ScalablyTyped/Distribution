package typings
package gapiDotClientDotPubsubLib.gapiNs.clientNs.pubsubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SnapshotsResource extends js.Object {
  /**
               * Gets the access control policy for a resource.
               * Returns an empty policy if the resource exists and does not have a policy
               * set.
               */
  def getIamPolicy(request: gapiDotClientDotPubsubLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /**
               * Sets the access control policy on the specified resource. Replaces any
               * existing policy.
               */
  def setIamPolicy(request: gapiDotClientDotPubsubLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /**
               * Returns permissions that a caller has on the specified resource.
               * If the resource does not exist, this will return an empty set of
               * permissions, not a NOT_FOUND error.
               *
               * Note: This operation is designed to be used for building permission-aware
               * UIs and command-line tools, not for authorization checking. This operation
               * may "fail open" without warning.
               */
  def testIamPermissions(request: gapiDotClientDotPubsubLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[TestIamPermissionsResponse]
}

