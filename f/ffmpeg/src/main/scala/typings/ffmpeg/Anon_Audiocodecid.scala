package typings.ffmpeg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Audiocodecid extends js.Object {
  var audiocodecid: String
  var audiodatarate: Double
  var audiosamplerate: Double
  var duration: Double
  var encoder: String
  var filesize: String
  var height: Double
  var stereo: Boolean
  var videocodecid: String
  var videodatarate: Double
  var width: Double
}

object Anon_Audiocodecid {
  @scala.inline
  def apply(
    audiocodecid: String,
    audiodatarate: Double,
    audiosamplerate: Double,
    duration: Double,
    encoder: String,
    filesize: String,
    height: Double,
    stereo: Boolean,
    videocodecid: String,
    videodatarate: Double,
    width: Double
  ): Anon_Audiocodecid = {
    val __obj = js.Dynamic.literal(audiocodecid = audiocodecid.asInstanceOf[js.Any], audiodatarate = audiodatarate.asInstanceOf[js.Any], audiosamplerate = audiosamplerate.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], encoder = encoder.asInstanceOf[js.Any], filesize = filesize.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], stereo = stereo.asInstanceOf[js.Any], videocodecid = videocodecid.asInstanceOf[js.Any], videodatarate = videodatarate.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Audiocodecid]
  }
}

