package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleapiUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Biography extends js.Object {
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Biography {
  @scala.inline
  def apply(
    contentType: java.lang.String = null,
    metadata: FieldMetadata = null,
    value: java.lang.String = null
  ): Biography = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Biography]
  }
}

