package typings.gapiClientGamesmanagement.gapi.client.gamesmanagement

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGamesmanagement.anon.ApplicationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationsResource extends js.Object {
  /** Get the list of players hidden from the given application. This method is only available to user accounts for your developer console. */
  def listHidden(request: ApplicationId): Request[HiddenPlayerList] = js.native
}

object ApplicationsResource {
  @scala.inline
  def apply(listHidden: ApplicationId => Request[HiddenPlayerList]): ApplicationsResource = {
    val __obj = js.Dynamic.literal(listHidden = js.Any.fromFunction1(listHidden))
    __obj.asInstanceOf[ApplicationsResource]
  }
  @scala.inline
  implicit class ApplicationsResourceOps[Self <: ApplicationsResource] (val x: Self) extends AnyVal {
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
    def setListHidden(value: ApplicationId => Request[HiddenPlayerList]): Self = this.set("listHidden", js.Any.fromFunction1(value))
  }
  
}

