package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConferenceSolution extends js.Object {
  var iconUri: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[ConferenceSolutionKey] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object ConferenceSolution {
  @scala.inline
  def apply(iconUri: String = null, key: ConferenceSolutionKey = null, name: String = null): ConferenceSolution = {
    val __obj = js.Dynamic.literal()
    if (iconUri != null) __obj.updateDynamic("iconUri")(iconUri.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConferenceSolution]
  }
}

