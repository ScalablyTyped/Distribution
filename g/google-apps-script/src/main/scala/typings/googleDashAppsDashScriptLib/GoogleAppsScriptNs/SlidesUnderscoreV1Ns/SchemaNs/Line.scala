package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line extends js.Object {
  var lineCategory: js.UndefOr[java.lang.String] = js.undefined
  var lineProperties: js.UndefOr[LineProperties] = js.undefined
  var lineType: js.UndefOr[java.lang.String] = js.undefined
}

object Line {
  @scala.inline
  def apply(
    lineCategory: java.lang.String = null,
    lineProperties: LineProperties = null,
    lineType: java.lang.String = null
  ): Line = {
    val __obj = js.Dynamic.literal()
    if (lineCategory != null) __obj.updateDynamic("lineCategory")(lineCategory)
    if (lineProperties != null) __obj.updateDynamic("lineProperties")(lineProperties)
    if (lineType != null) __obj.updateDynamic("lineType")(lineType)
    __obj.asInstanceOf[Line]
  }
}

