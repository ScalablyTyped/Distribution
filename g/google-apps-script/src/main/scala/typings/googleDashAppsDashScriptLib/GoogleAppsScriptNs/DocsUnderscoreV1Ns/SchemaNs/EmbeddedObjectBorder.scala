package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedObjectBorder extends js.Object {
  var color: js.UndefOr[OptionalColor] = js.undefined
  var dashStyle: js.UndefOr[java.lang.String] = js.undefined
  var propertyState: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[Dimension] = js.undefined
}

object EmbeddedObjectBorder {
  @scala.inline
  def apply(
    color: OptionalColor = null,
    dashStyle: java.lang.String = null,
    propertyState: java.lang.String = null,
    width: Dimension = null
  ): EmbeddedObjectBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle)
    if (propertyState != null) __obj.updateDynamic("propertyState")(propertyState)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[EmbeddedObjectBorder]
  }
}

