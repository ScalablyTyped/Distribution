package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feature extends js.Object {
  var etags: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Feature {
  @scala.inline
  def apply(etags: String = null, kind: String = null, name: String = null): Feature = {
    val __obj = js.Dynamic.literal()
    if (etags != null) __obj.updateDynamic("etags")(etags)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Feature]
  }
}

