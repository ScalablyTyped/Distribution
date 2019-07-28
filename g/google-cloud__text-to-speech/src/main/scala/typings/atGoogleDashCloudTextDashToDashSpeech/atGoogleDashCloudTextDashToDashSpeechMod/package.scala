package typings.atGoogleDashCloudTextDashToDashSpeech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atGoogleDashCloudTextDashToDashSpeechMod {
  type APICallback[T] = js.Function2[/* err */ GoogleError | Null, /* response */ js.UndefOr[T], Unit]
  type GoogleError = js.Any
  type ListVoicesOptions = CallOptions
  type ListVoicesResponse = js.Array[Voice]
  type SynthesizeSpeechOptions = CallOptions
}
