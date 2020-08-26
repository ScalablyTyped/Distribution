package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountSummariesResource extends js.Object {
  /** Lists account summaries (lightweight tree comprised of accounts/properties/profiles) to which the user has access. */
  def list(request: Key): Request[AccountSummaries] = js.native
}

object AccountSummariesResource {
  @scala.inline
  def apply(list: Key => Request[AccountSummaries]): AccountSummariesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AccountSummariesResource]
  }
  @scala.inline
  implicit class AccountSummariesResourceOps[Self <: AccountSummariesResource] (val x: Self) extends AnyVal {
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
    def setList(value: Key => Request[AccountSummaries]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

