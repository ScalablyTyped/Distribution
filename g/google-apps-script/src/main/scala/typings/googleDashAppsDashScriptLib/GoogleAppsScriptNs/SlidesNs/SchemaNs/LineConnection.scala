package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineConnection extends js.Object {
  var connectedObjectId: js.UndefOr[java.lang.String] = js.undefined
  var connectionSiteIndex: js.UndefOr[scala.Double] = js.undefined
}

object LineConnection {
  @scala.inline
  def apply(connectedObjectId: java.lang.String = null, connectionSiteIndex: scala.Int | scala.Double = null): LineConnection = {
    val __obj = js.Dynamic.literal()
    if (connectedObjectId != null) __obj.updateDynamic("connectedObjectId")(connectedObjectId)
    if (connectionSiteIndex != null) __obj.updateDynamic("connectionSiteIndex")(connectionSiteIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineConnection]
  }
}

