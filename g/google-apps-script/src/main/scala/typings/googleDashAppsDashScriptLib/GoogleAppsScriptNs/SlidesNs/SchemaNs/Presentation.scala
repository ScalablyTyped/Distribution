package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Presentation extends js.Object {
  var layouts: js.UndefOr[js.Array[Page]] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var masters: js.UndefOr[js.Array[Page]] = js.undefined
  var notesMaster: js.UndefOr[Page] = js.undefined
  var pageSize: js.UndefOr[Size] = js.undefined
  var presentationId: js.UndefOr[java.lang.String] = js.undefined
  var revisionId: js.UndefOr[java.lang.String] = js.undefined
  var slides: js.UndefOr[js.Array[Page]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Presentation {
  @scala.inline
  def apply(
    layouts: js.Array[Page] = null,
    locale: java.lang.String = null,
    masters: js.Array[Page] = null,
    notesMaster: Page = null,
    pageSize: Size = null,
    presentationId: java.lang.String = null,
    revisionId: java.lang.String = null,
    slides: js.Array[Page] = null,
    title: java.lang.String = null
  ): Presentation = {
    val __obj = js.Dynamic.literal()
    if (layouts != null) __obj.updateDynamic("layouts")(layouts)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (masters != null) __obj.updateDynamic("masters")(masters)
    if (notesMaster != null) __obj.updateDynamic("notesMaster")(notesMaster)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize)
    if (presentationId != null) __obj.updateDynamic("presentationId")(presentationId)
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId)
    if (slides != null) __obj.updateDynamic("slides")(slides)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Presentation]
  }
}

