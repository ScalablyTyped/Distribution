package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AudioEncoder extends js.Object {
  var audioEncoder: Double
  var bitRate: js.UndefOr[Double] = js.undefined
  var extension: String
  var maxFileSize: js.UndefOr[Double] = js.undefined
  var numberOfChannels: js.UndefOr[Double] = js.undefined
  var outputFormat: Double
  var sampleRate: js.UndefOr[Double] = js.undefined
}

object Anon_AudioEncoder {
  @scala.inline
  def apply(
    audioEncoder: Double,
    extension: String,
    outputFormat: Double,
    bitRate: Int | Double = null,
    maxFileSize: Int | Double = null,
    numberOfChannels: Int | Double = null,
    sampleRate: Int | Double = null
  ): Anon_AudioEncoder = {
    val __obj = js.Dynamic.literal(audioEncoder = audioEncoder, extension = extension, outputFormat = outputFormat)
    if (bitRate != null) __obj.updateDynamic("bitRate")(bitRate.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (numberOfChannels != null) __obj.updateDynamic("numberOfChannels")(numberOfChannels.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AudioEncoder]
  }
}

