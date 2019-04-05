package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Form extends js.Object {
  var formUrl: js.UndefOr[java.lang.String] = js.undefined
  var responseUrl: js.UndefOr[java.lang.String] = js.undefined
  var thumbnailUrl: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Form {
  @scala.inline
  def apply(
    formUrl: java.lang.String = null,
    responseUrl: java.lang.String = null,
    thumbnailUrl: java.lang.String = null,
    title: java.lang.String = null
  ): Form = {
    val __obj = js.Dynamic.literal()
    if (formUrl != null) __obj.updateDynamic("formUrl")(formUrl)
    if (responseUrl != null) __obj.updateDynamic("responseUrl")(responseUrl)
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Form]
  }
}

