package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AudioQuality extends js.Object {
  var audioQuality: scala.Double
  var bitDepthHint: js.UndefOr[scala.Double] = js.undefined
  var bitRate: scala.Double
  var bitRateStrategy: js.UndefOr[scala.Double] = js.undefined
  var extension: java.lang.String
  var linearPCMBitDepth: js.UndefOr[scala.Double] = js.undefined
  var linearPCMIsBigEndian: js.UndefOr[scala.Boolean] = js.undefined
  var linearPCMIsFloat: js.UndefOr[scala.Boolean] = js.undefined
  var numberOfChannels: scala.Double
  var outputFormat: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var sampleRate: scala.Double
}

object Anon_AudioQuality {
  @scala.inline
  def apply(
    audioQuality: scala.Double,
    bitRate: scala.Double,
    extension: java.lang.String,
    numberOfChannels: scala.Double,
    sampleRate: scala.Double,
    bitDepthHint: scala.Int | scala.Double = null,
    bitRateStrategy: scala.Int | scala.Double = null,
    linearPCMBitDepth: scala.Int | scala.Double = null,
    linearPCMIsBigEndian: js.UndefOr[scala.Boolean] = js.undefined,
    linearPCMIsFloat: js.UndefOr[scala.Boolean] = js.undefined,
    outputFormat: java.lang.String | scala.Double = null
  ): Anon_AudioQuality = {
    val __obj = js.Dynamic.literal(audioQuality = audioQuality, bitRate = bitRate, extension = extension, numberOfChannels = numberOfChannels, sampleRate = sampleRate)
    if (bitDepthHint != null) __obj.updateDynamic("bitDepthHint")(bitDepthHint.asInstanceOf[js.Any])
    if (bitRateStrategy != null) __obj.updateDynamic("bitRateStrategy")(bitRateStrategy.asInstanceOf[js.Any])
    if (linearPCMBitDepth != null) __obj.updateDynamic("linearPCMBitDepth")(linearPCMBitDepth.asInstanceOf[js.Any])
    if (!js.isUndefined(linearPCMIsBigEndian)) __obj.updateDynamic("linearPCMIsBigEndian")(linearPCMIsBigEndian)
    if (!js.isUndefined(linearPCMIsFloat)) __obj.updateDynamic("linearPCMIsFloat")(linearPCMIsFloat)
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AudioQuality]
  }
}

