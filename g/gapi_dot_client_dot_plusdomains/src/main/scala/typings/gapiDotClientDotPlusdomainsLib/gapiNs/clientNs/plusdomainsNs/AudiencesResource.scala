package typings
package gapiDotClientDotPlusdomainsLib.gapiNs.clientNs.plusdomainsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudiencesResource extends js.Object {
  /** List all of the audiences to which a user can share. */
  def list(request: gapiDotClientDotPlusdomainsLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[AudiencesFeed]
}

object AudiencesResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotPlusdomainsLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[AudiencesFeed]
    ]
  ): AudiencesResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[AudiencesResource]
  }
}

