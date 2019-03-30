package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleapiUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationshipInterest extends js.Object {
  var formattedValue: js.UndefOr[java.lang.String] = js.undefined
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object RelationshipInterest {
  @scala.inline
  def apply(
    formattedValue: java.lang.String = null,
    metadata: FieldMetadata = null,
    value: java.lang.String = null
  ): RelationshipInterest = {
    val __obj = js.Dynamic.literal()
    if (formattedValue != null) __obj.updateDynamic("formattedValue")(formattedValue)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RelationshipInterest]
  }
}

