package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Speech")
@js.native
object SpeechNs extends js.Object {
  trait SpeechOptions extends js.Object {
    var language: js.UndefOr[java.lang.String] = js.undefined
    var onDone: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
    var onError: js.UndefOr[js.Function1[/* error */ java.lang.String, scala.Unit]] = js.undefined
    var onStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
    var onStopped: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
    var pitch: js.UndefOr[scala.Double] = js.undefined
    var rate: js.UndefOr[scala.Double] = js.undefined
  }
  
  def isSpeakingAsync(): js.Promise[scala.Boolean] = js.native
  /** Available on iOS only */
  def pause(): scala.Unit = js.native
  /** Available on iOS only */
  def resume(): scala.Unit = js.native
  def speak(text: java.lang.String): scala.Unit = js.native
  def speak(text: java.lang.String, options: SpeechOptions): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

