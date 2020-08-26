package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CssResponseBytes extends js.Object {
  var cssResponseBytes: js.UndefOr[String] = js.native
  var flashResponseBytes: js.UndefOr[String] = js.native
  var htmlResponseBytes: js.UndefOr[String] = js.native
  var imageResponseBytes: js.UndefOr[String] = js.native
  var javascriptResponseBytes: js.UndefOr[String] = js.native
  var numberCssResources: js.UndefOr[Double] = js.native
  var numberHosts: js.UndefOr[Double] = js.native
  var numberJsResources: js.UndefOr[Double] = js.native
  var numberResources: js.UndefOr[Double] = js.native
  var numberStaticResources: js.UndefOr[Double] = js.native
  var otherResponseBytes: js.UndefOr[String] = js.native
  var textResponseBytes: js.UndefOr[String] = js.native
  var totalRequestBytes: js.UndefOr[String] = js.native
}

object CssResponseBytes {
  @scala.inline
  def apply(): CssResponseBytes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CssResponseBytes]
  }
  @scala.inline
  implicit class CssResponseBytesOps[Self <: CssResponseBytes] (val x: Self) extends AnyVal {
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
    def setCssResponseBytes(value: String): Self = this.set("cssResponseBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssResponseBytes: Self = this.set("cssResponseBytes", js.undefined)
    @scala.inline
    def setFlashResponseBytes(value: String): Self = this.set("flashResponseBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlashResponseBytes: Self = this.set("flashResponseBytes", js.undefined)
    @scala.inline
    def setHtmlResponseBytes(value: String): Self = this.set("htmlResponseBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlResponseBytes: Self = this.set("htmlResponseBytes", js.undefined)
    @scala.inline
    def setImageResponseBytes(value: String): Self = this.set("imageResponseBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageResponseBytes: Self = this.set("imageResponseBytes", js.undefined)
    @scala.inline
    def setJavascriptResponseBytes(value: String): Self = this.set("javascriptResponseBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJavascriptResponseBytes: Self = this.set("javascriptResponseBytes", js.undefined)
    @scala.inline
    def setNumberCssResources(value: Double): Self = this.set("numberCssResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberCssResources: Self = this.set("numberCssResources", js.undefined)
    @scala.inline
    def setNumberHosts(value: Double): Self = this.set("numberHosts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberHosts: Self = this.set("numberHosts", js.undefined)
    @scala.inline
    def setNumberJsResources(value: Double): Self = this.set("numberJsResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberJsResources: Self = this.set("numberJsResources", js.undefined)
    @scala.inline
    def setNumberResources(value: Double): Self = this.set("numberResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberResources: Self = this.set("numberResources", js.undefined)
    @scala.inline
    def setNumberStaticResources(value: Double): Self = this.set("numberStaticResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberStaticResources: Self = this.set("numberStaticResources", js.undefined)
    @scala.inline
    def setOtherResponseBytes(value: String): Self = this.set("otherResponseBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtherResponseBytes: Self = this.set("otherResponseBytes", js.undefined)
    @scala.inline
    def setTextResponseBytes(value: String): Self = this.set("textResponseBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextResponseBytes: Self = this.set("textResponseBytes", js.undefined)
    @scala.inline
    def setTotalRequestBytes(value: String): Self = this.set("totalRequestBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalRequestBytes: Self = this.set("totalRequestBytes", js.undefined)
  }
  
}

