package typings
package ffmpegLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Audiocodecid extends js.Object {
  var audiocodecid: java.lang.String
  var audiodatarate: scala.Double
  var audiosamplerate: scala.Double
  var duration: scala.Double
  var encoder: java.lang.String
  var filesize: java.lang.String
  var height: scala.Double
  var stereo: scala.Boolean
  var videocodecid: java.lang.String
  var videodatarate: scala.Double
  var width: scala.Double
}

object Anon_Audiocodecid {
  @scala.inline
  def apply(
    audiocodecid: java.lang.String,
    audiodatarate: scala.Double,
    audiosamplerate: scala.Double,
    duration: scala.Double,
    encoder: java.lang.String,
    filesize: java.lang.String,
    height: scala.Double,
    stereo: scala.Boolean,
    videocodecid: java.lang.String,
    videodatarate: scala.Double,
    width: scala.Double
  ): Anon_Audiocodecid = {
    val __obj = js.Dynamic.literal(audiocodecid = audiocodecid, audiodatarate = audiodatarate, audiosamplerate = audiosamplerate, duration = duration, encoder = encoder, filesize = filesize, height = height, stereo = stereo, videocodecid = videocodecid, videodatarate = videodatarate, width = width)
  
    __obj.asInstanceOf[Anon_Audiocodecid]
  }
}

