package typings.gapiClientMl.gapi.client.ml

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMl.anon.Accesstoken
import typings.gapiClientMl.anon.Alt
import typings.gapiClientMl.anon.Bearertoken
import typings.gapiClientMl.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobsResource extends js.Object {
  /** Cancels a running job. */
  def cancel(request: Accesstoken): Request[js.Object] = js.native
  /** Creates a training or a batch prediction job. */
  def create(request: Alt): Request[GoogleCloudMlV1Job] = js.native
  /** Describes a job. */
  def get(request: Accesstoken): Request[GoogleCloudMlV1Job] = js.native
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: Bearertoken): Request[GoogleIamV1Policy] = js.native
  /** Lists the jobs in the project. */
  def list(request: Callback): Request[GoogleCloudMlV1ListJobsResponse] = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: Bearertoken): Request[GoogleIamV1Policy] = js.native
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: Bearertoken): Request[GoogleIamV1TestIamPermissionsResponse] = js.native
}

object JobsResource {
  @scala.inline
  def apply(
    cancel: Accesstoken => Request[js.Object],
    create: Alt => Request[GoogleCloudMlV1Job],
    get: Accesstoken => Request[GoogleCloudMlV1Job],
    getIamPolicy: Bearertoken => Request[GoogleIamV1Policy],
    list: Callback => Request[GoogleCloudMlV1ListJobsResponse],
    setIamPolicy: Bearertoken => Request[GoogleIamV1Policy],
    testIamPermissions: Bearertoken => Request[GoogleIamV1TestIamPermissionsResponse]
  ): JobsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
    __obj.asInstanceOf[JobsResource]
  }
  @scala.inline
  implicit class JobsResourceOps[Self <: JobsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancel(value: Accesstoken => Request[js.Object]): Self = this.set("cancel", js.Any.fromFunction1(value))
    @scala.inline
    def setCreate(value: Alt => Request[GoogleCloudMlV1Job]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Accesstoken => Request[GoogleCloudMlV1Job]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetIamPolicy(value: Bearertoken => Request[GoogleIamV1Policy]): Self = this.set("getIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Callback => Request[GoogleCloudMlV1ListJobsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIamPolicy(value: Bearertoken => Request[GoogleIamV1Policy]): Self = this.set("setIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setTestIamPermissions(value: Bearertoken => Request[GoogleIamV1TestIamPermissionsResponse]): Self = this.set("testIamPermissions", js.Any.fromFunction1(value))
  }
  
}

