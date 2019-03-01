package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AudioEncoder extends js.Object {
  var audioEncoder: scala.Double
  var bitRate: js.UndefOr[scala.Double] = js.undefined
  var extension: java.lang.String
  var maxFileSize: js.UndefOr[scala.Double] = js.undefined
  var numberOfChannels: js.UndefOr[scala.Double] = js.undefined
  var outputFormat: scala.Double
  var sampleRate: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AudioEncoder {
  @scala.inline
  def apply(
    audioEncoder: scala.Double,
    extension: java.lang.String,
    outputFormat: scala.Double,
    bitRate: scala.Int | scala.Double = null,
    maxFileSize: scala.Int | scala.Double = null,
    numberOfChannels: scala.Int | scala.Double = null,
    sampleRate: scala.Int | scala.Double = null
  ): Anon_AudioEncoder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("audioEncoder")(audioEncoder)
    __obj.updateDynamic("extension")(extension)
    __obj.updateDynamic("outputFormat")(outputFormat)
    if (bitRate != null) __obj.updateDynamic("bitRate")(bitRate.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (numberOfChannels != null) __obj.updateDynamic("numberOfChannels")(numberOfChannels.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AudioEncoder]
  }
}

