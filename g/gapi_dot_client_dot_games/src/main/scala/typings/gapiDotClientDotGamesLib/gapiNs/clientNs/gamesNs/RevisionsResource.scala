package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevisionsResource extends js.Object {
  /** Checks whether the games client is out of date. */
  def check(request: gapiDotClientDotGamesLib.Anon_AltClientRevision): gapiDotClientLib.gapiNs.clientNs.Request[RevisionCheckResponse]
}

object RevisionsResource {
  @scala.inline
  def apply(
    check: js.Function1[
      gapiDotClientDotGamesLib.Anon_AltClientRevision, 
      gapiDotClientLib.gapiNs.clientNs.Request[RevisionCheckResponse]
    ]
  ): RevisionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("check")(check)
    __obj.asInstanceOf[RevisionsResource]
  }
}

