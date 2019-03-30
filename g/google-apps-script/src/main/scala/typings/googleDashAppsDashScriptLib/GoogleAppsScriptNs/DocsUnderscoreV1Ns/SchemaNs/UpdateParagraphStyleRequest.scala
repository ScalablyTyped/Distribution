package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateParagraphStyleRequest extends js.Object {
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var paragraphStyle: js.UndefOr[ParagraphStyle] = js.undefined
  var range: js.UndefOr[Range] = js.undefined
}

object UpdateParagraphStyleRequest {
  @scala.inline
  def apply(fields: java.lang.String = null, paragraphStyle: ParagraphStyle = null, range: Range = null): UpdateParagraphStyleRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (paragraphStyle != null) __obj.updateDynamic("paragraphStyle")(paragraphStyle)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[UpdateParagraphStyleRequest]
  }
}

