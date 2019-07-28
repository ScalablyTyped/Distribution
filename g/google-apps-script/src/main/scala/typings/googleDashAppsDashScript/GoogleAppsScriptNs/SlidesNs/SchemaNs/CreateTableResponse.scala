package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTableResponse extends js.Object {
  var objectId: js.UndefOr[String] = js.undefined
}

object CreateTableResponse {
  @scala.inline
  def apply(objectId: String = null): CreateTableResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[CreateTableResponse]
  }
}

