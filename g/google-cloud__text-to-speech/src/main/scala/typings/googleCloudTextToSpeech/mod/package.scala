package typings.googleCloudTextToSpeech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type APICallback[T] = js.Function2[
    /* err */ typings.googleCloudTextToSpeech.mod.GoogleError | scala.Null, 
    /* response */ js.UndefOr[T], 
    scala.Unit
  ]
  type GoogleError = js.Any
  type ListVoicesOptions = typings.googleCloudTextToSpeech.mod.CallOptions
  type ListVoicesResponse = js.Array[typings.googleCloudTextToSpeech.mod.Voice]
  type SynthesizeSpeechOptions = typings.googleCloudTextToSpeech.mod.CallOptions
}
