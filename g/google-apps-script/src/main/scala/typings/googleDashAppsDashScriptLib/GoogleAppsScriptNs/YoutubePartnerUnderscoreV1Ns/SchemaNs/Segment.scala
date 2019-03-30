package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Segment extends js.Object {
  var duration: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var start: js.UndefOr[java.lang.String] = js.undefined
}

object Segment {
  @scala.inline
  def apply(duration: java.lang.String = null, kind: java.lang.String = null, start: java.lang.String = null): Segment = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Segment]
  }
}

