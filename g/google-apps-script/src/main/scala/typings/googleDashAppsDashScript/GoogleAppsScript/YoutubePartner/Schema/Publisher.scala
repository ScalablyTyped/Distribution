package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Publisher extends js.Object {
  var caeNumber: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var ipiNumber: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Publisher {
  @scala.inline
  def apply(
    caeNumber: String = null,
    id: String = null,
    ipiNumber: String = null,
    kind: String = null,
    name: String = null
  ): Publisher = {
    val __obj = js.Dynamic.literal()
    if (caeNumber != null) __obj.updateDynamic("caeNumber")(caeNumber)
    if (id != null) __obj.updateDynamic("id")(id)
    if (ipiNumber != null) __obj.updateDynamic("ipiNumber")(ipiNumber)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Publisher]
  }
}

