package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestinationTableProperties extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var friendlyName: js.UndefOr[java.lang.String] = js.undefined
  var labels: js.UndefOr[js.Object] = js.undefined
}

object DestinationTableProperties {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    friendlyName: java.lang.String = null,
    labels: js.Object = null
  ): DestinationTableProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    __obj.asInstanceOf[DestinationTableProperties]
  }
}

