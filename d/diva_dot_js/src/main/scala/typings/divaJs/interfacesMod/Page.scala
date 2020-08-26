package typings.divaJs.interfacesMod

import typings.divaJs.anon.D
import typings.divaJs.anon.H
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Page extends js.Object {
  var api: Double = js.native
  var canvas: String = js.native
  var d: H = js.native
  var f: String = js.native
  var facingPages: Boolean = js.native
  var il: String = js.native
  var l: String = js.native
  var m: Double = js.native
  var otherImages: D = js.native
  var paged: Boolean = js.native
  var url: String = js.native
  var xoffset: Double = js.native
  var yoffset: Double = js.native
}

object Page {
  @scala.inline
  def apply(
    api: Double,
    canvas: String,
    d: H,
    f: String,
    facingPages: Boolean,
    il: String,
    l: String,
    m: Double,
    otherImages: D,
    paged: Boolean,
    url: String,
    xoffset: Double,
    yoffset: Double
  ): Page = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], facingPages = facingPages.asInstanceOf[js.Any], il = il.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], otherImages = otherImages.asInstanceOf[js.Any], paged = paged.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xoffset = xoffset.asInstanceOf[js.Any], yoffset = yoffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  @scala.inline
  implicit class PageOps[Self <: Page] (val x: Self) extends AnyVal {
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
    def setApi(value: Double): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanvas(value: String): Self = this.set("canvas", value.asInstanceOf[js.Any])
    @scala.inline
    def setD(value: H): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def setF(value: String): Self = this.set("f", value.asInstanceOf[js.Any])
    @scala.inline
    def setFacingPages(value: Boolean): Self = this.set("facingPages", value.asInstanceOf[js.Any])
    @scala.inline
    def setIl(value: String): Self = this.set("il", value.asInstanceOf[js.Any])
    @scala.inline
    def setL(value: String): Self = this.set("l", value.asInstanceOf[js.Any])
    @scala.inline
    def setM(value: Double): Self = this.set("m", value.asInstanceOf[js.Any])
    @scala.inline
    def setOtherImages(value: D): Self = this.set("otherImages", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaged(value: Boolean): Self = this.set("paged", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setXoffset(value: Double): Self = this.set("xoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setYoffset(value: Double): Self = this.set("yoffset", value.asInstanceOf[js.Any])
  }
  
}

