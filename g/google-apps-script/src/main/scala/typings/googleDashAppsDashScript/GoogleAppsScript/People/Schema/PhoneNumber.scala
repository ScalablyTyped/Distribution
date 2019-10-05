package typings.googleDashAppsDashScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneNumber extends js.Object {
  var canonicalForm: js.UndefOr[String] = js.undefined
  var formattedType: js.UndefOr[String] = js.undefined
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object PhoneNumber {
  @scala.inline
  def apply(
    canonicalForm: String = null,
    formattedType: String = null,
    metadata: FieldMetadata = null,
    `type`: String = null,
    value: String = null
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

