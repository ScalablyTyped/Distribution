package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Url extends js.Object {
  var formattedType: js.UndefOr[java.lang.String] = js.undefined
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Url {
  @scala.inline
  def apply(
    formattedType: java.lang.String = null,
    metadata: FieldMetadata = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): Url = {
    val __obj = js.Dynamic.literal()
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Url]
  }
}

