package typings
package gapiDotClientDotManufacturersLib.gapiNs.clientNs.manufacturersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Issue extends js.Object {
  /**
    * If present, the attribute that triggered the issue. For more information
    * about attributes, see
    * https://support.google.com/manufacturers/answer/6124116.
    */
  var attribute: js.UndefOr[java.lang.String] = js.undefined
  /** Description of the issue. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The severity of the issue. */
  var severity: js.UndefOr[java.lang.String] = js.undefined
  /** The timestamp when this issue appeared. */
  var timestamp: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The server-generated type of the issue, for example,
    * “INCORRECT_TEXT_FORMATTING”, “IMAGE_NOT_SERVEABLE”, etc.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Issue {
  @scala.inline
  def apply(
    attribute: java.lang.String = null,
    description: java.lang.String = null,
    severity: java.lang.String = null,
    timestamp: java.lang.String = null,
    `type`: java.lang.String = null
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

