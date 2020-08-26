package typings.gapiClientCloudbilling.gapi.client.cloudbilling

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudbilling.anon.Accesstoken
import typings.gapiClientCloudbilling.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsResource extends js.Object {
  /**
    * Gets the billing information for a project. The current authenticated user
    * must have [permission to view the
    * project](https://cloud.google.com/docs/permissions-overview#h.bgs0oxofvnoo
    * ).
    */
  def getBillingInfo(request: Alt): Request[ProjectBillingInfo] = js.native
  /**
    * Lists the projects associated with a billing account. The current
    * authenticated user must be an [owner of the billing
    * account](https://support.google.com/cloud/answer/4430947).
    */
  def list(request: Accesstoken): Request[ListProjectBillingInfoResponse] = js.native
  /**
    * Sets or updates the billing account associated with a project. You specify
    * the new billing account by setting the `billing_account_name` in the
    * `ProjectBillingInfo` resource to the resource name of a billing account.
    * Associating a project with an open billing account enables billing on the
    * project and allows charges for resource usage. If the project already had a
    * billing account, this method changes the billing account used for resource
    * usage charges.
    *
    * &#42;Note:&#42; Incurred charges that have not yet been reported in the transaction
    * history of the Google Cloud Console may be billed to the new billing
    * account, even if the charge occurred before the new billing account was
    * assigned to the project.
    *
    * The current authenticated user must have ownership privileges for both the
    * [project](https://cloud.google.com/docs/permissions-overview#h.bgs0oxofvnoo
    * ) and the [billing
    * account](https://support.google.com/cloud/answer/4430947).
    *
    * You can disable billing on the project by setting the
    * `billing_account_name` field to empty. This action disassociates the
    * current billing account from the project. Any billable activity of your
    * in-use services will stop, and your application could stop functioning as
    * expected. Any unbilled charges to date will be billed to the previously
    * associated account. The current authenticated user must be either an owner
    * of the project or an owner of the billing account for the project.
    *
    * Note that associating a project with a &#42;closed&#42; billing account will have
    * much the same effect as disabling billing on the project: any paid
    * resources used by the project will be shut down. Thus, unless you wish to
    * disable billing, you should always call this method with the name of an
    * &#42;open&#42; billing account.
    */
  def updateBillingInfo(request: Alt): Request[ProjectBillingInfo] = js.native
}

object ProjectsResource {
  @scala.inline
  def apply(
    getBillingInfo: Alt => Request[ProjectBillingInfo],
    list: Accesstoken => Request[ListProjectBillingInfoResponse],
    updateBillingInfo: Alt => Request[ProjectBillingInfo]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(getBillingInfo = js.Any.fromFunction1(getBillingInfo), list = js.Any.fromFunction1(list), updateBillingInfo = js.Any.fromFunction1(updateBillingInfo))
    __obj.asInstanceOf[ProjectsResource]
  }
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
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
    def setGetBillingInfo(value: Alt => Request[ProjectBillingInfo]): Self = this.set("getBillingInfo", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Accesstoken => Request[ListProjectBillingInfoResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateBillingInfo(value: Alt => Request[ProjectBillingInfo]): Self = this.set("updateBillingInfo", js.Any.fromFunction1(value))
  }
  
}

