package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobsResource extends js.Object {
  /** Cancels a running job. */
  def cancel(request: gapiDotClientDotMlLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Creates a training or a batch prediction job. */
  def create(request: gapiDotClientDotMlLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[GoogleCloudMlV1__Job]
  /** Describes a job. */
  def get(request: gapiDotClientDotMlLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[GoogleCloudMlV1__Job]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: gapiDotClientDotMlLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[GoogleIamV1__Policy]
  /** Lists the jobs in the project. */
  def list(request: gapiDotClientDotMlLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[GoogleCloudMlV1__ListJobsResponse]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: gapiDotClientDotMlLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[GoogleIamV1__Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: gapiDotClientDotMlLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[GoogleIamV1__TestIamPermissionsResponse]
}

object JobsResource {
  @scala.inline
  def apply(
    cancel: gapiDotClientDotMlLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[js.Object],
    create: gapiDotClientDotMlLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[GoogleCloudMlV1__Job],
    get: gapiDotClientDotMlLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[GoogleCloudMlV1__Job],
    getIamPolicy: gapiDotClientDotMlLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[GoogleIamV1__Policy],
    list: gapiDotClientDotMlLib.Anon_AccesstokenAltBearertokenCallback => gapiDotClientLib.gapiNs.clientNs.Request[GoogleCloudMlV1__ListJobsResponse],
    setIamPolicy: gapiDotClientDotMlLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[GoogleIamV1__Policy],
    testIamPermissions: gapiDotClientDotMlLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[GoogleIamV1__TestIamPermissionsResponse]
  ): JobsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
  
    __obj.asInstanceOf[JobsResource]
  }
}

