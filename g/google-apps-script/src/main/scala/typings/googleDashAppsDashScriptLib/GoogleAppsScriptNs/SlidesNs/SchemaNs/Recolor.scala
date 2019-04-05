package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recolor extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var recolorStops: js.UndefOr[js.Array[ColorStop]] = js.undefined
}

object Recolor {
  @scala.inline
  def apply(name: java.lang.String = null, recolorStops: js.Array[ColorStop] = null): Recolor = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (recolorStops != null) __obj.updateDynamic("recolorStops")(recolorStops)
    __obj.asInstanceOf[Recolor]
  }
}

