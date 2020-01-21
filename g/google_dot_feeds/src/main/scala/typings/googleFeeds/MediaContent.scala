package typings.googleFeeds

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
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], framerate = framerate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], samplingrate = samplingrate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaContent]
  }
}

