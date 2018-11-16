package typings
package gapiDotClientDotSpeechLib.gapiNs.clientNs.speechNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LongRunningRecognizeRequest extends js.Object {
  /** &#42;Required&#42; The audio data to be recognized. */
  var audio: js.UndefOr[RecognitionAudio] = js.undefined
  /**
               * &#42;Required&#42; Provides information to the recognizer that specifies how to
               * process the request.
               */
  var config: js.UndefOr[RecognitionConfig] = js.undefined
}

