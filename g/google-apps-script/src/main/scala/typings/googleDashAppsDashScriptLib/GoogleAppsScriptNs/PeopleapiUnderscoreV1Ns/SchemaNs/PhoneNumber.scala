package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleapiUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneNumber extends js.Object {
  var canonicalForm: js.UndefOr[java.lang.String] = js.undefined
  var formattedType: js.UndefOr[java.lang.String] = js.undefined
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object PhoneNumber {
  @scala.inline
  def apply(
    canonicalForm: java.lang.String = null,
    formattedType: java.lang.String = null,
    metadata: FieldMetadata = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): PhoneNumber = {
    val __obj = js.Dynamic.literal()
    if (canonicalForm != null) __obj.updateDynamic("canonicalForm")(canonicalForm)
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PhoneNumber]
  }
}

