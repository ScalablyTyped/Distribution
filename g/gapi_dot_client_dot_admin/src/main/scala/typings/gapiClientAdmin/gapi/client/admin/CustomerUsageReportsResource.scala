package typings.gapiClientAdmin.gapi.client.admin

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdmin.anon.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerUsageReportsResource extends js.Object {
  /** Retrieves a report which is a collection of properties / statistics for a specific customer. */
  def get(request: Date): Request[UsageReports] = js.native
}

object CustomerUsageReportsResource {
  @scala.inline
  def apply(get: Date => Request[UsageReports]): CustomerUsageReportsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[CustomerUsageReportsResource]
  }
  @scala.inline
  implicit class CustomerUsageReportsResourceOps[Self <: CustomerUsageReportsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Date => Request[UsageReports]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

