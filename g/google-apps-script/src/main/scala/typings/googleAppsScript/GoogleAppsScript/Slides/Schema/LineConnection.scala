package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineConnection extends js.Object {
  var connectedObjectId: js.UndefOr[String] = js.undefined
  var connectionSiteIndex: js.UndefOr[Double] = js.undefined
}

object LineConnection {
  @scala.inline
  def apply(connectedObjectId: String = null, connectionSiteIndex: js.UndefOr[Double] = js.undefined): LineConnection = {
    val __obj = js.Dynamic.literal()
    if (connectedObjectId != null) __obj.updateDynamic("connectedObjectId")(connectedObjectId.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionSiteIndex)) __obj.updateDynamic("connectionSiteIndex")(connectionSiteIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineConnection]
  }
}

