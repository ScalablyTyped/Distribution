package typings.fluentFfmpeg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encoder extends js.Object {
  var description: String = js.native
  var directRendering: Boolean = js.native
  var drawHorizBand: Boolean = js.native
  var experimental: Boolean = js.native
  var frameMT: Boolean = js.native
  var sliceMT: Boolean = js.native
  var `type`: String = js.native
}

object Encoder {
  @scala.inline
  def apply(
    description: String,
    directRendering: Boolean,
    drawHorizBand: Boolean,
    experimental: Boolean,
    frameMT: Boolean,
    sliceMT: Boolean,
    `type`: String
  ): Encoder = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], directRendering = directRendering.asInstanceOf[js.Any], drawHorizBand = drawHorizBand.asInstanceOf[js.Any], experimental = experimental.asInstanceOf[js.Any], frameMT = frameMT.asInstanceOf[js.Any], sliceMT = sliceMT.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoder]
  }
  @scala.inline
  implicit class EncoderOps[Self <: Encoder] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectRendering(value: Boolean): Self = this.set("directRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawHorizBand(value: Boolean): Self = this.set("drawHorizBand", value.asInstanceOf[js.Any])
    @scala.inline
    def setExperimental(value: Boolean): Self = this.set("experimental", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameMT(value: Boolean): Self = this.set("frameMT", value.asInstanceOf[js.Any])
    @scala.inline
    def setSliceMT(value: Boolean): Self = this.set("sliceMT", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

