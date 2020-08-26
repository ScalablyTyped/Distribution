package typings.facebookPixel.facebook.Pixel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchParameters extends js.Object {
  var content_category: js.UndefOr[String] = js.native
  var content_ids: js.UndefOr[js.Array[String]] = js.native
  var currency: js.UndefOr[String] = js.native
  var search_string: js.UndefOr[String] = js.native
  var value: js.UndefOr[Double] = js.native
}

object SearchParameters {
  @scala.inline
  def apply(): SearchParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchParameters]
  }
  @scala.inline
  implicit class SearchParametersOps[Self <: SearchParameters] (val x: Self) extends AnyVal {
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
    def setContent_category(value: String): Self = this.set("content_category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent_category: Self = this.set("content_category", js.undefined)
    @scala.inline
    def setContent_idsVarargs(value: String*): Self = this.set("content_ids", js.Array(value :_*))
    @scala.inline
    def setContent_ids(value: js.Array[String]): Self = this.set("content_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent_ids: Self = this.set("content_ids", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setSearch_string(value: String): Self = this.set("search_string", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch_string: Self = this.set("search_string", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

