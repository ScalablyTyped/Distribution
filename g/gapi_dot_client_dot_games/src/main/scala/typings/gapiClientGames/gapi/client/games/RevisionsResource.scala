package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGames.anon.ClientRevision
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevisionsResource extends js.Object {
  /** Checks whether the games client is out of date. */
  def check(request: ClientRevision): Request[RevisionCheckResponse] = js.native
}

object RevisionsResource {
  @scala.inline
  def apply(check: ClientRevision => Request[RevisionCheckResponse]): RevisionsResource = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check))
    __obj.asInstanceOf[RevisionsResource]
  }
  @scala.inline
  implicit class RevisionsResourceOps[Self <: RevisionsResource] (val x: Self) extends AnyVal {
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
    def setCheck(value: ClientRevision => Request[RevisionCheckResponse]): Self = this.set("check", js.Any.fromFunction1(value))
  }
  
}

