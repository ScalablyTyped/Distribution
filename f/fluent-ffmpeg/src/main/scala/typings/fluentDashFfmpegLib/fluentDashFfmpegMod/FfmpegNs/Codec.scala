package typings
package fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Codec extends js.Object {
  var canDecode: scala.Boolean
  var canEncode: scala.Boolean
  var description: java.lang.String
  var directRendering: js.UndefOr[scala.Boolean] = js.undefined
  var drawHorizBand: js.UndefOr[scala.Boolean] = js.undefined
  var intraFrameOnly: js.UndefOr[scala.Boolean] = js.undefined
  var isLossless: js.UndefOr[scala.Boolean] = js.undefined
  var isLossy: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: java.lang.String
  var weirdFrameTruncation: js.UndefOr[scala.Boolean] = js.undefined
}

object Codec {
  @scala.inline
  def apply(
    canDecode: scala.Boolean,
    canEncode: scala.Boolean,
    description: java.lang.String,
    `type`: java.lang.String,
    directRendering: js.UndefOr[scala.Boolean] = js.undefined,
    drawHorizBand: js.UndefOr[scala.Boolean] = js.undefined,
    intraFrameOnly: js.UndefOr[scala.Boolean] = js.undefined,
    isLossless: js.UndefOr[scala.Boolean] = js.undefined,
    isLossy: js.UndefOr[scala.Boolean] = js.undefined,
    weirdFrameTruncation: js.UndefOr[scala.Boolean] = js.undefined
  ): Codec = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("canDecode")(canDecode)
    __obj.updateDynamic("canEncode")(canEncode)
    __obj.updateDynamic("description")(description)
    if (!js.isUndefined(directRendering)) __obj.updateDynamic("directRendering")(directRendering)
    if (!js.isUndefined(drawHorizBand)) __obj.updateDynamic("drawHorizBand")(drawHorizBand)
    if (!js.isUndefined(intraFrameOnly)) __obj.updateDynamic("intraFrameOnly")(intraFrameOnly)
    if (!js.isUndefined(isLossless)) __obj.updateDynamic("isLossless")(isLossless)
    if (!js.isUndefined(isLossy)) __obj.updateDynamic("isLossy")(isLossy)
    if (!js.isUndefined(weirdFrameTruncation)) __obj.updateDynamic("weirdFrameTruncation")(weirdFrameTruncation)
    __obj.asInstanceOf[Codec]
  }
}

