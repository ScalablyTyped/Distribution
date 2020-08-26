package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import typings.gapiClient.gapi.client.Request
import typings.gapiClientServicemanagement.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumersResource extends js.Object {
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: Key): Request[Policy] = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: Key): Request[Policy] = js.native
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: Key): Request[TestIamPermissionsResponse] = js.native
}

object ConsumersResource {
  @scala.inline
  def apply(
    getIamPolicy: Key => Request[Policy],
    setIamPolicy: Key => Request[Policy],
    testIamPermissions: Key => Request[TestIamPermissionsResponse]
  ): ConsumersResource = {
    val __obj = js.Dynamic.literal(getIamPolicy = js.Any.fromFunction1(getIamPolicy), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
    __obj.asInstanceOf[ConsumersResource]
  }
  @scala.inline
  implicit class ConsumersResourceOps[Self <: ConsumersResource] (val x: Self) extends AnyVal {
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
    def setGetIamPolicy(value: Key => Request[Policy]): Self = this.set("getIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIamPolicy(value: Key => Request[Policy]): Self = this.set("setIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setTestIamPermissions(value: Key => Request[TestIamPermissionsResponse]): Self = this.set("testIamPermissions", js.Any.fromFunction1(value))
  }
  
}

