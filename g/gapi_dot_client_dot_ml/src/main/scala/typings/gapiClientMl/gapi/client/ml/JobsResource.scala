package typings.gapiClientMl.gapi.client.ml

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientMl.AnonAccesstoken
import typings.gapiClientMl.AnonAccesstokenAlt
import typings.gapiClientMl.AnonAccesstokenAltBearertoken
import typings.gapiClientMl.AnonAccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobsResource extends js.Object {
  /** Cancels a running job. */
  def cancel(request: AnonAccesstoken): Request_[js.Object]
  /** Creates a training or a batch prediction job. */
  def create(request: AnonAccesstokenAlt): Request_[GoogleCloudMlV1Job]
  /** Describes a job. */
  def get(request: AnonAccesstoken): Request_[GoogleCloudMlV1Job]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonAccesstokenAltBearertoken): Request_[GoogleIamV1Policy]
  /** Lists the jobs in the project. */
  def list(request: AnonAccesstokenAltBearertokenCallback): Request_[GoogleCloudMlV1ListJobsResponse]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: AnonAccesstokenAltBearertoken): Request_[GoogleIamV1Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: AnonAccesstokenAltBearertoken): Request_[GoogleIamV1TestIamPermissionsResponse]
}

object JobsResource {
  @scala.inline
  def apply(
    cancel: AnonAccesstoken => Request_[js.Object],
    create: AnonAccesstokenAlt => Request_[GoogleCloudMlV1Job],
    get: AnonAccesstoken => Request_[GoogleCloudMlV1Job],
    getIamPolicy: AnonAccesstokenAltBearertoken => Request_[GoogleIamV1Policy],
    list: AnonAccesstokenAltBearertokenCallback => Request_[GoogleCloudMlV1ListJobsResponse],
    setIamPolicy: AnonAccesstokenAltBearertoken => Request_[GoogleIamV1Policy],
    testIamPermissions: AnonAccesstokenAltBearertoken => Request_[GoogleIamV1TestIamPermissionsResponse]
  ): JobsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
  
    __obj.asInstanceOf[JobsResource]
  }
}

