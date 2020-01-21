package typings.gapiClientAdmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApplicationName extends js.Object {
  /** Application name to which the event belongs. */
  var applicationName: js.UndefOr[String] = js.undefined
  /** Obfuscated customer ID of the source customer. */
  var customerId: js.UndefOr[String] = js.undefined
  /** Time of occurrence of the activity. */
  var time: js.UndefOr[String] = js.undefined
  /** Unique qualifier if multiple events have the same time. */
  var uniqueQualifier: js.UndefOr[String] = js.undefined
}

object AnonApplicationName {
  @scala.inline
  def apply(
    applicationName: String = null,
    customerId: String = null,
    time: String = null,
    uniqueQualifier: String = null
  ): AnonApplicationName = {
    val __obj = js.Dynamic.literal()
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName.asInstanceOf[js.Any])
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (uniqueQualifier != null) __obj.updateDynamic("uniqueQualifier")(uniqueQualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApplicationName]
  }
}

