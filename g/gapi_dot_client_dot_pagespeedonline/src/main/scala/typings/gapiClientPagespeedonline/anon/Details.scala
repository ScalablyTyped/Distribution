package typings.gapiClientPagespeedonline.anon

import typings.gapiClientPagespeedonline.gapi.client.pagespeedonline.PagespeedApiFormatStringV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Details extends js.Object {
  /** List of entries that provide additional details about a single URL. Optional. */
  var details: js.UndefOr[js.Array[PagespeedApiFormatStringV2]] = js.undefined
  /** A format string that gives information about the URL, and a list of arguments for that format string. */
  var result: js.UndefOr[PagespeedApiFormatStringV2] = js.undefined
}

object Details {
  @scala.inline
  def apply(details: js.Array[PagespeedApiFormatStringV2] = null, result: PagespeedApiFormatStringV2 = null): Details = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
}

