package typings.gapiDotClientDotManufacturers.gapiNs.clientNs.manufacturersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Issue extends js.Object {
  /**
    * If present, the attribute that triggered the issue. For more information
    * about attributes, see
    * https://support.google.com/manufacturers/answer/6124116.
    */
  var attribute: js.UndefOr[String] = js.undefined
  /** Description of the issue. */
  var description: js.UndefOr[String] = js.undefined
  /** The severity of the issue. */
  var severity: js.UndefOr[String] = js.undefined
  /** The timestamp when this issue appeared. */
  var timestamp: js.UndefOr[String] = js.undefined
  /**
    * The server-generated type of the issue, for example,
    * “INCORRECT_TEXT_FORMATTING”, “IMAGE_NOT_SERVEABLE”, etc.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Issue {
  @scala.inline
  def apply(
    attribute: String = null,
    description: String = null,
    severity: String = null,
    timestamp: String = null,
    `type`: String = null
  ): Issue = {
    val __obj = js.Dynamic.literal()
    if (attribute != null) __obj.updateDynamic("attribute")(attribute)
    if (description != null) __obj.updateDynamic("description")(description)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Issue]
  }
}

