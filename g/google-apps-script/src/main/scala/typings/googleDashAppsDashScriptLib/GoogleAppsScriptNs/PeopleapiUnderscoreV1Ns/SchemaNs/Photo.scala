package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleapiUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Photo extends js.Object {
  var default: js.UndefOr[scala.Boolean] = js.undefined
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Photo {
  @scala.inline
  def apply(
    default: js.UndefOr[scala.Boolean] = js.undefined,
    metadata: FieldMetadata = null,
    url: java.lang.String = null
  ): Photo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Photo]
  }
}

