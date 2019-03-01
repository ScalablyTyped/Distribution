package typings
package fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoder extends js.Object {
  var description: java.lang.String
  var directRendering: scala.Boolean
  var drawHorizBand: scala.Boolean
  var experimental: scala.Boolean
  var frameMT: scala.Boolean
  var sliceMT: scala.Boolean
  var `type`: java.lang.String
}

object Encoder {
  @scala.inline
  def apply(
    description: java.lang.String,
    directRendering: scala.Boolean,
    drawHorizBand: scala.Boolean,
    experimental: scala.Boolean,
    frameMT: scala.Boolean,
    sliceMT: scala.Boolean,
    `type`: java.lang.String
  ): Encoder = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("directRendering")(directRendering)
    __obj.updateDynamic("drawHorizBand")(drawHorizBand)
    __obj.updateDynamic("experimental")(experimental)
    __obj.updateDynamic("frameMT")(frameMT)
    __obj.updateDynamic("sliceMT")(sliceMT)
    __obj.asInstanceOf[Encoder]
  }
}

