package typings.gatsbyImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FixedObject extends js.Object {
  var base64: js.UndefOr[String] = js.native
  var height: Double = js.native
  var media: js.UndefOr[String] = js.native
  var src: String = js.native
  var srcSet: String = js.native
  var srcSetWebp: js.UndefOr[String] = js.native
  var srcWebp: js.UndefOr[String] = js.native
  var tracedSVG: js.UndefOr[String] = js.native
  var width: Double = js.native
}

object FixedObject {
  @scala.inline
  def apply(height: Double, src: String, srcSet: String, width: Double): FixedObject = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], srcSet = srcSet.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedObject]
  }
  @scala.inline
  implicit class FixedObjectOps[Self <: FixedObject] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrcSet(value: String): Self = this.set("srcSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase64(value: String): Self = this.set("base64", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase64: Self = this.set("base64", js.undefined)
    @scala.inline
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def setSrcSetWebp(value: String): Self = this.set("srcSetWebp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcSetWebp: Self = this.set("srcSetWebp", js.undefined)
    @scala.inline
    def setSrcWebp(value: String): Self = this.set("srcWebp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcWebp: Self = this.set("srcWebp", js.undefined)
    @scala.inline
    def setTracedSVG(value: String): Self = this.set("tracedSVG", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracedSVG: Self = this.set("tracedSVG", js.undefined)
  }
  
}

