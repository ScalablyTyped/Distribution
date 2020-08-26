package typings.gapiClientIam.gapi.client.iam

import typings.gapiClient.gapi.client.Request
import typings.gapiClientIam.anon.Bearertoken
import typings.gapiClientIam.anon.PageSize
import typings.gapiClientIam.anon.Pp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceAccountsResource extends js.Object {
  var keys: KeysResource = js.native
  /**
    * Creates a ServiceAccount
    * and returns it.
    */
  def create(request: Bearertoken): Request[ServiceAccount] = js.native
  /** Deletes a ServiceAccount. */
  def delete(request: Bearertoken): Request[js.Object] = js.native
  /** Gets a ServiceAccount. */
  def get(request: Bearertoken): Request[ServiceAccount] = js.native
  /**
    * Returns the IAM access control policy for a
    * ServiceAccount.
    */
  def getIamPolicy(request: Pp): Request[Policy] = js.native
  /** Lists ServiceAccounts for a project. */
  def list(request: PageSize): Request[ListServiceAccountsResponse] = js.native
  /**
    * Sets the IAM access control policy for a
    * ServiceAccount.
    */
  def setIamPolicy(request: Pp): Request[Policy] = js.native
  /** Signs a blob using a service account's system-managed private key. */
  def signBlob(request: Bearertoken): Request[SignBlobResponse] = js.native
  /**
    * Signs a JWT using a service account's system-managed private key.
    *
    * If no expiry time (`exp`) is provided in the `SignJwtRequest`, IAM sets an
    * an expiry time of one hour by default. If you request an expiry time of
    * more than one hour, the request will fail.
    */
  def signJwt(request: Bearertoken): Request[SignJwtResponse] = js.native
  /**
    * Tests the specified permissions against the IAM access control policy
    * for a ServiceAccount.
    */
  def testIamPermissions(request: Pp): Request[TestIamPermissionsResponse] = js.native
  /**
    * Updates a ServiceAccount.
    *
    * Currently, only the following fields are updatable:
    * `display_name` .
    * The `etag` is mandatory.
    */
  def update(request: Bearertoken): Request[ServiceAccount] = js.native
}

object ServiceAccountsResource {
  @scala.inline
  def apply(
    create: Bearertoken => Request[ServiceAccount],
    delete: Bearertoken => Request[js.Object],
    get: Bearertoken => Request[ServiceAccount],
    getIamPolicy: Pp => Request[Policy],
    keys: KeysResource,
    list: PageSize => Request[ListServiceAccountsResponse],
    setIamPolicy: Pp => Request[Policy],
    signBlob: Bearertoken => Request[SignBlobResponse],
    signJwt: Bearertoken => Request[SignJwtResponse],
    testIamPermissions: Pp => Request[TestIamPermissionsResponse],
    update: Bearertoken => Request[ServiceAccount]
  ): ServiceAccountsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), keys = keys.asInstanceOf[js.Any], list = js.Any.fromFunction1(list), setIamPolicy = js.Any.fromFunction1(setIamPolicy), signBlob = js.Any.fromFunction1(signBlob), signJwt = js.Any.fromFunction1(signJwt), testIamPermissions = js.Any.fromFunction1(testIamPermissions), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ServiceAccountsResource]
  }
  @scala.inline
  implicit class ServiceAccountsResourceOps[Self <: ServiceAccountsResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Bearertoken => Request[ServiceAccount]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Bearertoken => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Bearertoken => Request[ServiceAccount]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetIamPolicy(value: Pp => Request[Policy]): Self = this.set("getIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setKeys(value: KeysResource): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def setList(value: PageSize => Request[ListServiceAccountsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIamPolicy(value: Pp => Request[Policy]): Self = this.set("setIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setSignBlob(value: Bearertoken => Request[SignBlobResponse]): Self = this.set("signBlob", js.Any.fromFunction1(value))
    @scala.inline
    def setSignJwt(value: Bearertoken => Request[SignJwtResponse]): Self = this.set("signJwt", js.Any.fromFunction1(value))
    @scala.inline
    def setTestIamPermissions(value: Pp => Request[TestIamPermissionsResponse]): Self = this.set("testIamPermissions", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Bearertoken => Request[ServiceAccount]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

