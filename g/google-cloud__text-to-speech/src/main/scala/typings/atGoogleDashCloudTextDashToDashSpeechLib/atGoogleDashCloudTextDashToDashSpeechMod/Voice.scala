package typings
package atGoogleDashCloudTextDashToDashSpeechLib.atGoogleDashCloudTextDashToDashSpeechMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Voice extends js.Object {
  var language_codes: js.Array[java.lang.String]
  var name: java.lang.String
  var naturalSampleRateHertz: scala.Double
  var ssmlGender: SsmlVoiceGender
}

object Voice {
  @scala.inline
  def apply(
    language_codes: js.Array[java.lang.String],
    name: java.lang.String,
    naturalSampleRateHertz: scala.Double,
    ssmlGender: SsmlVoiceGender
  ): Voice = {
    val __obj = js.Dynamic.literal(language_codes = language_codes, name = name, naturalSampleRateHertz = naturalSampleRateHertz, ssmlGender = ssmlGender)
  
    __obj.asInstanceOf[Voice]
  }
}

