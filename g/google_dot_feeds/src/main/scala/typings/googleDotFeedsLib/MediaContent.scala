package typings
package googleDotFeedsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaContent extends js.Object {
  var bitrate: scala.Double
  var channels: java.lang.String
  var duration: scala.Double
  var expression: java.lang.String
  var fileSize: scala.Double
  var framerate: scala.Double
  var height: scala.Double
  var isDefault: scala.Boolean
  var lang: java.lang.String
  var medium: java.lang.String
  var samplingrate: scala.Double
  var `type`: java.lang.String
  var url: java.lang.String
  var width: scala.Double
}

object MediaContent {
  @scala.inline
  def apply(
    bitrate: scala.Double,
    channels: java.lang.String,
    duration: scala.Double,
    expression: java.lang.String,
    fileSize: scala.Double,
    framerate: scala.Double,
    height: scala.Double,
    isDefault: scala.Boolean,
    lang: java.lang.String,
    medium: java.lang.String,
    samplingrate: scala.Double,
    `type`: java.lang.String,
    url: java.lang.String,
    width: scala.Double
  ): MediaContent = {
    val __obj = js.Dynamic.literal(bitrate = bitrate, channels = channels, duration = duration, expression = expression, fileSize = fileSize, framerate = framerate, height = height, isDefault = isDefault, lang = lang, medium = medium, samplingrate = samplingrate, url = url, width = width)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MediaContent]
  }
}

