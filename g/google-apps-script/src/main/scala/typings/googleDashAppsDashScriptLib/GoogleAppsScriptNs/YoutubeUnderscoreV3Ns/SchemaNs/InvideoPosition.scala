package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvideoPosition extends js.Object {
  var cornerPosition: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object InvideoPosition {
  @scala.inline
  def apply(cornerPosition: java.lang.String = null, `type`: java.lang.String = null): InvideoPosition = {
    val __obj = js.Dynamic.literal()
    if (cornerPosition != null) __obj.updateDynamic("cornerPosition")(cornerPosition)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InvideoPosition]
  }
}

