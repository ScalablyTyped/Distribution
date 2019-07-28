package typings.googleDotFeeds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaContent extends js.Object {
  var bitrate: Double
  var channels: String
  var duration: Double
  var expression: String
  var fileSize: Double
  var framerate: Double
  var height: Double
  var isDefault: Boolean
  var lang: String
  var medium: String
  var samplingrate: Double
  var `type`: String
  var url: String
  var width: Double
}

object MediaContent {
  @scala.inline
  def apply(
    bitrate: Double,
    channels: String,
    duration: Double,
    expression: String,
    fileSize: Double,
    framerate: Double,
    height: Double,
    isDefault: Boolean,
    lang: String,
    medium: String,
    samplingrate: Double,
    `type`: String,
    url: String,
    width: Double
  ): MediaContent = {
    val __obj = js.Dynamic.literal(bitrate = bitrate, channels = channels, duration = duration, expression = expression, fileSize = fileSize, framerate = framerate, height = height, isDefault = isDefault, lang = lang, medium = medium, samplingrate = samplingrate, url = url, width = width)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MediaContent]
  }
}

