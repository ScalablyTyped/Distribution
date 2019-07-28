package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AudioQuality extends js.Object {
  var audioQuality: Double
  var bitDepthHint: js.UndefOr[Double] = js.undefined
  var bitRate: Double
  var bitRateStrategy: js.UndefOr[Double] = js.undefined
  var extension: String
  var linearPCMBitDepth: js.UndefOr[Double] = js.undefined
  var linearPCMIsBigEndian: js.UndefOr[Boolean] = js.undefined
  var linearPCMIsFloat: js.UndefOr[Boolean] = js.undefined
  var numberOfChannels: Double
  var outputFormat: js.UndefOr[String | Double] = js.undefined
  var sampleRate: Double
}

object Anon_AudioQuality {
  @scala.inline
  def apply(
    audioQuality: Double,
    bitRate: Double,
    extension: String,
    numberOfChannels: Double,
    sampleRate: Double,
    bitDepthHint: Int | Double = null,
    bitRateStrategy: Int | Double = null,
    linearPCMBitDepth: Int | Double = null,
    linearPCMIsBigEndian: js.UndefOr[Boolean] = js.undefined,
    linearPCMIsFloat: js.UndefOr[Boolean] = js.undefined,
    outputFormat: String | Double = null
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

