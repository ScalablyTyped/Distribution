package typings
package atGoogleDashCloudTextDashToDashSpeechLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atGoogleDashCloudTextDashToDashSpeechMod {
  type APICallback[T] = js.Function2[/* err */ GoogleError | scala.Null, /* response */ js.UndefOr[T], scala.Unit]
  type GoogleError = js.Any
  type ListVoicesOptions = CallOptions
  type ListVoicesResponse = js.Array[Voice]
  type SynthesizeSpeechOptions = CallOptions
}
