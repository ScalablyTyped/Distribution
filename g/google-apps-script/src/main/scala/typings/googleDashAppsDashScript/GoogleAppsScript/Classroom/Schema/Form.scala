package typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Form extends js.Object {
  var formUrl: js.UndefOr[String] = js.undefined
  var responseUrl: js.UndefOr[String] = js.undefined
  var thumbnailUrl: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Form {
  @scala.inline
  def apply(
    formUrl: String = null,
    responseUrl: String = null,
    thumbnailUrl: String = null,
    title: String = null
  ): Form = {
    val __obj = js.Dynamic.literal()
    if (formUrl != null) __obj.updateDynamic("formUrl")(formUrl)
    if (responseUrl != null) __obj.updateDynamic("responseUrl")(responseUrl)
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Form]
  }
}

