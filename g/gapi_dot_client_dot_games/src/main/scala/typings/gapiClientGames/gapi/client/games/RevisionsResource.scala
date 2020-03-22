package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGames.AnonClientRevision
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevisionsResource extends js.Object {
  /** Checks whether the games client is out of date. */
  def check(request: AnonClientRevision): Request_[RevisionCheckResponse]
}

object RevisionsResource {
  @scala.inline
  def apply(check: AnonClientRevision => Request_[RevisionCheckResponse]): RevisionsResource = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check))
  
    __obj.asInstanceOf[RevisionsResource]
  }
}

