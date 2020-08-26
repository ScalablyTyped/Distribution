package typings.fluentFfmpeg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Codec extends js.Object {
  var canDecode: Boolean = js.native
  var canEncode: Boolean = js.native
  var description: String = js.native
  var directRendering: js.UndefOr[Boolean] = js.native
  var drawHorizBand: js.UndefOr[Boolean] = js.native
  var intraFrameOnly: js.UndefOr[Boolean] = js.native
  var isLossless: js.UndefOr[Boolean] = js.native
  var isLossy: js.UndefOr[Boolean] = js.native
  var `type`: String = js.native
  var weirdFrameTruncation: js.UndefOr[Boolean] = js.native
}

object Codec {
  @scala.inline
  def apply(canDecode: Boolean, canEncode: Boolean, description: String, `type`: String): Codec = {
    val __obj = js.Dynamic.literal(canDecode = canDecode.asInstanceOf[js.Any], canEncode = canEncode.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codec]
  }
  @scala.inline
  implicit class CodecOps[Self <: Codec] (val x: Self) extends AnyVal {
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
    def setCanDecode(value: Boolean): Self = this.set("canDecode", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanEncode(value: Boolean): Self = this.set("canEncode", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectRendering(value: Boolean): Self = this.set("directRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectRendering: Self = this.set("directRendering", js.undefined)
    @scala.inline
    def setDrawHorizBand(value: Boolean): Self = this.set("drawHorizBand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawHorizBand: Self = this.set("drawHorizBand", js.undefined)
    @scala.inline
    def setIntraFrameOnly(value: Boolean): Self = this.set("intraFrameOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntraFrameOnly: Self = this.set("intraFrameOnly", js.undefined)
    @scala.inline
    def setIsLossless(value: Boolean): Self = this.set("isLossless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLossless: Self = this.set("isLossless", js.undefined)
    @scala.inline
    def setIsLossy(value: Boolean): Self = this.set("isLossy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLossy: Self = this.set("isLossy", js.undefined)
    @scala.inline
    def setWeirdFrameTruncation(value: Boolean): Self = this.set("weirdFrameTruncation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeirdFrameTruncation: Self = this.set("weirdFrameTruncation", js.undefined)
  }
  
}

