package typings.gapiClientPagespeedonline.anon

import typings.gapiClientPagespeedonline.gapi.client.pagespeedonline.PagespeedApiFormatStringV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Details extends js.Object {
  /** List of entries that provide additional details about a single URL. Optional. */
  var details: js.UndefOr[js.Array[PagespeedApiFormatStringV2]] = js.native
  /** A format string that gives information about the URL, and a list of arguments for that format string. */
  var result: js.UndefOr[PagespeedApiFormatStringV2] = js.native
}

object Details {
  @scala.inline
  def apply(): Details = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Details]
  }
  @scala.inline
  implicit class DetailsOps[Self <: Details] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetailsVarargs(value: PagespeedApiFormatStringV2*): Self = this.set("details", js.Array(value :_*))
    @scala.inline
    def setDetails(value: js.Array[PagespeedApiFormatStringV2]): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setResult(value: PagespeedApiFormatStringV2): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}

