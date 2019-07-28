package typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotGames.Anon_AltClientRevision
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevisionsResource extends js.Object {
  /** Checks whether the games client is out of date. */
  def check(request: Anon_AltClientRevision): Request[RevisionCheckResponse]
}

object RevisionsResource {
  @scala.inline
  def apply(check: Anon_AltClientRevision => Request[RevisionCheckResponse]): RevisionsResource = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check))
  
    __obj.asInstanceOf[RevisionsResource]
  }
}

