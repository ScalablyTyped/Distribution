package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideProperties extends js.Object {
  var layoutObjectId: js.UndefOr[java.lang.String] = js.undefined
  var masterObjectId: js.UndefOr[java.lang.String] = js.undefined
  var notesPage: js.UndefOr[Page] = js.undefined
}

object SlideProperties {
  @scala.inline
  def apply(
    layoutObjectId: java.lang.String = null,
    masterObjectId: java.lang.String = null,
    notesPage: Page = null
  ): SlideProperties = {
    val __obj = js.Dynamic.literal()
    if (layoutObjectId != null) __obj.updateDynamic("layoutObjectId")(layoutObjectId)
    if (masterObjectId != null) __obj.updateDynamic("masterObjectId")(masterObjectId)
    if (notesPage != null) __obj.updateDynamic("notesPage")(notesPage)
    __obj.asInstanceOf[SlideProperties]
  }
}

