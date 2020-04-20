package typings.gapiClientStoragetransfer.gapi.client.storagetransfer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientStoragetransfer.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def get(request: AnonAccesstoken): Request_[GoogleServiceAccount]
}

object GoogleServiceAccountsResource {
  @scala.inline
  def apply(get: AnonAccesstoken => Request_[GoogleServiceAccount]): GoogleServiceAccountsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[GoogleServiceAccountsResource]
  }
}

