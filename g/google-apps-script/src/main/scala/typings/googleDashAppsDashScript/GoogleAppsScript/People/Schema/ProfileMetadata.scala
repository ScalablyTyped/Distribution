package typings.googleDashAppsDashScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileMetadata extends js.Object {
  var objectType: js.UndefOr[String] = js.undefined
  var userTypes: js.UndefOr[js.Array[String]] = js.undefined
}

object ProfileMetadata {
  @scala.inline
  def apply(objectType: String = null, userTypes: js.Array[String] = null): ProfileMetadata = {
    val __obj = js.Dynamic.literal()
    if (objectType != null) __obj.updateDynamic("objectType")(objectType)
    if (userTypes != null) __obj.updateDynamic("userTypes")(userTypes)
    __obj.asInstanceOf[ProfileMetadata]
  }
}

