package typings.googleDashAppsDashScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Residence extends js.Object {
  var current: js.UndefOr[Boolean] = js.undefined
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object Residence {
  @scala.inline
  def apply(current: js.UndefOr[Boolean] = js.undefined, metadata: FieldMetadata = null, value: String = null): Residence = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Residence]
  }
}

