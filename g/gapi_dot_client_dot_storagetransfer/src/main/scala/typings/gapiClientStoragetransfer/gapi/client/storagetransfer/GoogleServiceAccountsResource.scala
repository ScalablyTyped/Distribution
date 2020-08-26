package typings.gapiClientStoragetransfer.gapi.client.storagetransfer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientStoragetransfer.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleServiceAccountsResource extends js.Object {
  /**
    * Returns the Google service account that is used by Storage Transfer
    * Service to access buckets in the project where transfers
    * run or in other projects. Each Google service account is associated
    * with one Google Cloud Platform Console project. Users
    * should add this service account to the Google Cloud Storage bucket
    * ACLs to grant access to Storage Transfer Service. This service
    * account is created and owned by Storage Transfer Service and can
    * only be used by Storage Transfer Service.
    */
  def get(request: Accesstoken): Request[GoogleServiceAccount] = js.native
}

object GoogleServiceAccountsResource {
  @scala.inline
  def apply(get: Accesstoken => Request[GoogleServiceAccount]): GoogleServiceAccountsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[GoogleServiceAccountsResource]
  }
  @scala.inline
  implicit class GoogleServiceAccountsResourceOps[Self <: GoogleServiceAccountsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Accesstoken => Request[GoogleServiceAccount]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

