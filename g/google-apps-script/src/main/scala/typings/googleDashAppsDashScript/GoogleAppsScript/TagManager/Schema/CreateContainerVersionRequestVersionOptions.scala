package typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateContainerVersionRequestVersionOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var notes: js.UndefOr[String] = js.undefined
}

object CreateContainerVersionRequestVersionOptions {
  @scala.inline
  def apply(name: String = null, notes: String = null): CreateContainerVersionRequestVersionOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    __obj.asInstanceOf[CreateContainerVersionRequestVersionOptions]
  }
}

