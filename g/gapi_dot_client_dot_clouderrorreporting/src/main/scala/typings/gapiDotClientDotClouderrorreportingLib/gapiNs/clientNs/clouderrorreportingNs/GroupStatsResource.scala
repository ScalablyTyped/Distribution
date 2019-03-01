package typings
package gapiDotClientDotClouderrorreportingLib.gapiNs.clientNs.clouderrorreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupStatsResource extends js.Object {
  /** Lists the specified groups. */
  def list(request: gapiDotClientDotClouderrorreportingLib.Anon_AccesstokenAlignment): gapiDotClientLib.gapiNs.clientNs.Request[ListGroupStatsResponse]
}

object GroupStatsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotClouderrorreportingLib.Anon_AccesstokenAlignment, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListGroupStatsResponse]
    ]
  ): GroupStatsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[GroupStatsResource]
  }
}

