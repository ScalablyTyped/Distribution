package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestingLevel extends js.Object {
  var bulletStyle: js.UndefOr[TextStyle] = js.undefined
}

object NestingLevel {
  @scala.inline
  def apply(bulletStyle: TextStyle = null): NestingLevel = {
    val __obj = js.Dynamic.literal()
    if (bulletStyle != null) __obj.updateDynamic("bulletStyle")(bulletStyle)
    __obj.asInstanceOf[NestingLevel]
  }
}

