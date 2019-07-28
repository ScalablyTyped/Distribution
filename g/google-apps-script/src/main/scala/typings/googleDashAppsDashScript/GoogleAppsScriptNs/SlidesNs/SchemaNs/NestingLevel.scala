package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestingLevel extends js.Object {
  var bulletStyle: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.TextStyle] = js.undefined
}

object NestingLevel {
  @scala.inline
  def apply(
    bulletStyle: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.TextStyle = null
  ): NestingLevel = {
    val __obj = js.Dynamic.literal()
    if (bulletStyle != null) __obj.updateDynamic("bulletStyle")(bulletStyle)
    __obj.asInstanceOf[NestingLevel]
  }
}

