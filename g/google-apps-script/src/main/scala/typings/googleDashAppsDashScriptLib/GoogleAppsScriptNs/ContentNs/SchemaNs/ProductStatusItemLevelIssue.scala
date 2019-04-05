package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductStatusItemLevelIssue extends js.Object {
  var attributeName: js.UndefOr[java.lang.String] = js.undefined
  var code: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var destination: js.UndefOr[java.lang.String] = js.undefined
  var detail: js.UndefOr[java.lang.String] = js.undefined
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  var resolution: js.UndefOr[java.lang.String] = js.undefined
  var servability: js.UndefOr[java.lang.String] = js.undefined
}

object ProductStatusItemLevelIssue {
  @scala.inline
  def apply(
    attributeName: java.lang.String = null,
    code: java.lang.String = null,
    description: java.lang.String = null,
    destination: java.lang.String = null,
    detail: java.lang.String = null,
    documentation: java.lang.String = null,
    resolution: java.lang.String = null,
    servability: java.lang.String = null
  ): ProductStatusItemLevelIssue = {
    val __obj = js.Dynamic.literal()
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName)
    if (code != null) __obj.updateDynamic("code")(code)
    if (description != null) __obj.updateDynamic("description")(description)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution)
    if (servability != null) __obj.updateDynamic("servability")(servability)
    __obj.asInstanceOf[ProductStatusItemLevelIssue]
  }
}

