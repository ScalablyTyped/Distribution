package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationName extends js.Object {
  var applicationName: js.UndefOr[String] = js.native
  var customerId: js.UndefOr[String] = js.native
  var time: js.UndefOr[String] = js.native
  var uniqueQualifier: js.UndefOr[String] = js.native
}

object ApplicationName {
  @scala.inline
  def apply(
    applicationName: String = null,
    customerId: String = null,
    time: String = null,
    uniqueQualifier: String = null
  ): ApplicationName = {
    val __obj = js.Dynamic.literal()
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName.asInstanceOf[js.Any])
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (uniqueQualifier != null) __obj.updateDynamic("uniqueQualifier")(uniqueQualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationName]
  }
}

