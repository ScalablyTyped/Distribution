package typings
package gapiDotClientDotCloudkmsLib.gapiNs.clientNs.cloudkmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait KeyRingsResource extends js.Object {
  var cryptoKeys: CryptoKeysResource
  /** Create a new KeyRing in a given Project and Location. */
  def create(request: gapiDotClientDotCloudkmsLib.Anon_ParentAccesstokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[KeyRing]
  /** Returns metadata for a given KeyRing. */
  def get(request: gapiDotClientDotCloudkmsLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[KeyRing]
  /**
               * Gets the access control policy for a resource.
               * Returns an empty policy if the resource exists and does not have a policy
               * set.
               */
  def getIamPolicy(request: gapiDotClientDotCloudkmsLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /** Lists KeyRings. */
  def list(request: gapiDotClientDotCloudkmsLib.Anon_ParentAccesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ListKeyRingsResponse]
  /**
               * Sets the access control policy on the specified resource. Replaces any
               * existing policy.
               */
  def setIamPolicy(request: gapiDotClientDotCloudkmsLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /**
               * Returns permissions that a caller has on the specified resource.
               * If the resource does not exist, this will return an empty set of
               * permissions, not a NOT_FOUND error.
               *
               * Note: This operation is designed to be used for building permission-aware
               * UIs and command-line tools, not for authorization checking. This operation
               * may "fail open" without warning.
               */
  def testIamPermissions(request: gapiDotClientDotCloudkmsLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[TestIamPermissionsResponse]
}

