package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildReference extends js.Object {
  var childLink: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
}

object ChildReference {
  @scala.inline
  def apply(childLink: String = null, id: String = null, kind: String = null, selfLink: String = null): ChildReference = {
    val __obj = js.Dynamic.literal()
    if (childLink != null) __obj.updateDynamic("childLink")(childLink)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[ChildReference]
  }
}

