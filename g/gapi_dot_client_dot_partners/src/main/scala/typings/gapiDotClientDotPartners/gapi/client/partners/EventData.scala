package typings.gapiDotClientDotPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData extends js.Object {
  /** Data type. */
  var key: js.UndefOr[String] = js.undefined
  /** Data values. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}

object EventData {
  @scala.inline
  def apply(key: String = null, values: js.Array[String] = null): EventData = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
}

