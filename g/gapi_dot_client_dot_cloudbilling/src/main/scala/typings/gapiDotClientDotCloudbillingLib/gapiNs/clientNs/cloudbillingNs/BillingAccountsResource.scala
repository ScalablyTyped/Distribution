package typings
package gapiDotClientDotCloudbillingLib.gapiNs.clientNs.cloudbillingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingAccountsResource extends js.Object {
  var projects: ProjectsResource
  /**
    * Gets information about a billing account. The current authenticated user
    * must be an [owner of the billing
    * account](https://support.google.com/cloud/answer/4430947).
    */
  def get(request: gapiDotClientDotCloudbillingLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[BillingAccount]
  /**
    * Lists the billing accounts that the current authenticated user
    * [owns](https://support.google.com/cloud/answer/4430947).
    */
  def list(request: gapiDotClientDotCloudbillingLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ListBillingAccountsResponse]
}

