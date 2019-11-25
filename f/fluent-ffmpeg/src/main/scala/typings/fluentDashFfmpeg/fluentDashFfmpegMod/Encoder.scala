package typings.fluentDashFfmpeg.fluentDashFfmpegMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoder extends js.Object {
  var description: String
  var directRendering: Boolean
  var drawHorizBand: Boolean
  var experimental: Boolean
  var frameMT: Boolean
  var sliceMT: Boolean
  var `type`: String
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
}

