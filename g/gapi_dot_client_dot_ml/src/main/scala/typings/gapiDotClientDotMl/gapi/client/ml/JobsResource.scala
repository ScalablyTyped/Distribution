package typings.gapiDotClientDotMl.gapi.client.ml

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotMl.Anon_Accesstoken
import typings.gapiDotClientDotMl.Anon_AccesstokenAlt
import typings.gapiDotClientDotMl.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotMl.Anon_AccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobsResource extends js.Object {
  /** Cancels a running job. */
  def cancel(request: Anon_Accesstoken): Request[js.Object]
  /** Creates a training or a batch prediction job. */
  def create(request: Anon_AccesstokenAlt): Request[GoogleCloudMlV1__Job]
  /** Describes a job. */
  def get(request: Anon_Accesstoken): Request[GoogleCloudMlV1__Job]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: Anon_AccesstokenAltBearertoken): Request[GoogleIamV1__Policy]
  /** Lists the jobs in the project. */
  def list(request: Anon_AccesstokenAltBearertokenCallback): Request[GoogleCloudMlV1__ListJobsResponse]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: Anon_AccesstokenAltBearertoken): Request[GoogleIamV1__Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: Anon_AccesstokenAltBearertoken): Request[GoogleIamV1__TestIamPermissionsResponse]
}

object JobsResource {
  @scala.inline
  def apply(
    cancel: Anon_Accesstoken => Request[js.Object],
    create: Anon_AccesstokenAlt => Request[GoogleCloudMlV1__Job],
    get: Anon_Accesstoken => Request[GoogleCloudMlV1__Job],
    getIamPolicy: Anon_AccesstokenAltBearertoken => Request[GoogleIamV1__Policy],
    list: Anon_AccesstokenAltBearertokenCallback => Request[GoogleCloudMlV1__ListJobsResponse],
    setIamPolicy: Anon_AccesstokenAltBearertoken => Request[GoogleIamV1__Policy],
    testIamPermissions: Anon_AccesstokenAltBearertoken => Request[GoogleIamV1__TestIamPermissionsResponse]
  ): JobsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
  
    __obj.asInstanceOf[JobsResource]
  }
}

