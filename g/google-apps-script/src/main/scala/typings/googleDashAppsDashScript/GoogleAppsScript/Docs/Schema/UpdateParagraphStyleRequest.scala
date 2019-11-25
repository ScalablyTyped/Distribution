package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateParagraphStyleRequest extends js.Object {
  var fields: js.UndefOr[String] = js.undefined
  var paragraphStyle: js.UndefOr[ParagraphStyle] = js.undefined
  var range: js.UndefOr[Range] = js.undefined
}

object UpdateParagraphStyleRequest {
  @scala.inline
  def apply(fields: String = null, paragraphStyle: ParagraphStyle = null, range: Range = null): UpdateParagraphStyleRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (paragraphStyle != null) __obj.updateDynamic("paragraphStyle")(paragraphStyle.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateParagraphStyleRequest]
  }
}

