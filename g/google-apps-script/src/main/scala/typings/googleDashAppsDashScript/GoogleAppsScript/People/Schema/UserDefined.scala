package typings.googleDashAppsDashScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDefined extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object UserDefined {
  @scala.inline
  def apply(key: String = null, metadata: FieldMetadata = null, value: String = null): UserDefined = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[UserDefined]
  }
}

