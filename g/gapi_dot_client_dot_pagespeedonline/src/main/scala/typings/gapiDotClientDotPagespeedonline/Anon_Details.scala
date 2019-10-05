package typings.gapiDotClientDotPagespeedonline

import typings.gapiDotClientDotPagespeedonline.gapi.client.pagespeedonline.PagespeedApiFormatStringV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Details extends js.Object {
  /** List of entries that provide additional details about a single URL. Optional. */
  var details: js.UndefOr[js.Array[PagespeedApiFormatStringV2]] = js.undefined
  /** A format string that gives information about the URL, and a list of arguments for that format string. */
  var result: js.UndefOr[PagespeedApiFormatStringV2] = js.undefined
}

object Anon_Details {
  @scala.inline
  def apply(details: js.Array[PagespeedApiFormatStringV2] = null, result: PagespeedApiFormatStringV2 = null): Anon_Details = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[Anon_Details]
  }
}

