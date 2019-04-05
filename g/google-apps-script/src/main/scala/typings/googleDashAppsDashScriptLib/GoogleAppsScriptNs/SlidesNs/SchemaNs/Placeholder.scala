package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Placeholder extends js.Object {
  var index: js.UndefOr[scala.Double] = js.undefined
  var parentObjectId: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Placeholder {
  @scala.inline
  def apply(
    index: scala.Int | scala.Double = null,
    parentObjectId: java.lang.String = null,
    `type`: java.lang.String = null
  ): Placeholder = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (parentObjectId != null) __obj.updateDynamic("parentObjectId")(parentObjectId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Placeholder]
  }
}

