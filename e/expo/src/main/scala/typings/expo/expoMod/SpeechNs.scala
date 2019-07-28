package typings.expo.expoMod

import typings.expo.expoMod.SpeechNs.SpeechOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Speech")
@js.native
object SpeechNs extends js.Object {
  trait SpeechOptions extends js.Object {
    var language: js.UndefOr[String] = js.undefined
    var onDone: js.UndefOr[js.Function0[Unit]] = js.undefined
    var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
    var onStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    var onStopped: js.UndefOr[js.Function0[Unit]] = js.undefined
    var pitch: js.UndefOr[Double] = js.undefined
    var rate: js.UndefOr[Double] = js.undefined
  }
  
  def isSpeakingAsync(): js.Promise[Boolean] = js.native
  /** Available on iOS only */
  def pause(): Unit = js.native
  /** Available on iOS only */
  def resume(): Unit = js.native
  def speak(text: String): Unit = js.native
  def speak(text: String, options: SpeechOptions): Unit = js.native
  def stop(): Unit = js.native
}

