package typings
package gapiDotClientDotSearchconsoleLib.gapiNs.clientNs.searchconsoleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileFriendlyTestResource extends js.Object {
  /** Runs Mobile-Friendly Test for a given URL. */
  def run(request: gapiDotClientDotSearchconsoleLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[RunMobileFriendlyTestResponse]
}

object MobileFriendlyTestResource {
  @scala.inline
  def apply(
    run: js.Function1[
      gapiDotClientDotSearchconsoleLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[RunMobileFriendlyTestResponse]
    ]
  ): MobileFriendlyTestResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("run")(run)
    __obj.asInstanceOf[MobileFriendlyTestResource]
  }
}

