package typings.googleapis.anon

import typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.SchemaPagespeedApiFormatStringV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Urls extends js.Object {
  var header: js.UndefOr[SchemaPagespeedApiFormatStringV2] = js.native
  var urls: js.UndefOr[js.Array[DetailsResult]] = js.native
}

object Urls {
  @scala.inline
  def apply(): Urls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Urls]
  }
  @scala.inline
  implicit class UrlsOps[Self <: Urls] (val x: Self) extends AnyVal {
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
    def setHeader(value: SchemaPagespeedApiFormatStringV2): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setUrlsVarargs(value: DetailsResult*): Self = this.set("urls", js.Array(value :_*))
    @scala.inline
    def setUrls(value: js.Array[DetailsResult]): Self = this.set("urls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
  }
  
}

