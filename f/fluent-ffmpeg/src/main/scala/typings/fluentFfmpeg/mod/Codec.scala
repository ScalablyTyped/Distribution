package typings.fluentFfmpeg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Codec extends js.Object {
  var canDecode: Boolean
  var canEncode: Boolean
  var description: String
  var directRendering: js.UndefOr[Boolean] = js.undefined
  var drawHorizBand: js.UndefOr[Boolean] = js.undefined
  var intraFrameOnly: js.UndefOr[Boolean] = js.undefined
  var isLossless: js.UndefOr[Boolean] = js.undefined
  var isLossy: js.UndefOr[Boolean] = js.undefined
  var `type`: String
  var weirdFrameTruncation: js.UndefOr[Boolean] = js.undefined
}

object Codec {
  @scala.inline
  def apply(
    canDecode: Boolean,
    canEncode: Boolean,
    description: String,
    `type`: String,
    directRendering: js.UndefOr[Boolean] = js.undefined,
    drawHorizBand: js.UndefOr[Boolean] = js.undefined,
    intraFrameOnly: js.UndefOr[Boolean] = js.undefined,
    isLossless: js.UndefOr[Boolean] = js.undefined,
    isLossy: js.UndefOr[Boolean] = js.undefined,
    weirdFrameTruncation: js.UndefOr[Boolean] = js.undefined
  ): Codec = {
    val __obj = js.Dynamic.literal(canDecode = canDecode.asInstanceOf[js.Any], canEncode = canEncode.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(directRendering)) __obj.updateDynamic("directRendering")(directRendering.asInstanceOf[js.Any])
    if (!js.isUndefined(drawHorizBand)) __obj.updateDynamic("drawHorizBand")(drawHorizBand.asInstanceOf[js.Any])
    if (!js.isUndefined(intraFrameOnly)) __obj.updateDynamic("intraFrameOnly")(intraFrameOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(isLossless)) __obj.updateDynamic("isLossless")(isLossless.asInstanceOf[js.Any])
    if (!js.isUndefined(isLossy)) __obj.updateDynamic("isLossy")(isLossy.asInstanceOf[js.Any])
    if (!js.isUndefined(weirdFrameTruncation)) __obj.updateDynamic("weirdFrameTruncation")(weirdFrameTruncation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codec]
  }
}

