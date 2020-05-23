package typings.ffmpegConcat.mod

import typings.ffmpegConcat.ffmpegConcatStrings.jpg
import typings.ffmpegConcat.ffmpegConcatStrings.png
import typings.ffmpegConcat.ffmpegConcatStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcatOptions extends js.Object {
  var audio: js.UndefOr[String] = js.undefined
  var cleanupFrames: js.UndefOr[Boolean] = js.undefined
  var concurrency: js.UndefOr[Double] = js.undefined
  var frameFormat: js.UndefOr[jpg | png | raw] = js.undefined
  var log: js.UndefOr[js.Function1[/* stdout */ String, Unit]] = js.undefined
  var output: String
  var tempDir: js.UndefOr[String] = js.undefined
  var transition: js.UndefOr[Transition] = js.undefined
  var transitions: js.UndefOr[js.Array[Transition]] = js.undefined
  var videos: js.Array[String]
}

object ConcatOptions {
  @scala.inline
  def apply(
    output: String,
    videos: js.Array[String],
    audio: String = null,
    cleanupFrames: js.UndefOr[Boolean] = js.undefined,
    concurrency: js.UndefOr[Double] = js.undefined,
    frameFormat: jpg | png | raw = null,
    log: /* stdout */ String => Unit = null,
    tempDir: String = null,
    transition: Transition = null,
    transitions: js.Array[Transition] = null
  ): ConcatOptions = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], videos = videos.asInstanceOf[js.Any])
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (!js.isUndefined(cleanupFrames)) __obj.updateDynamic("cleanupFrames")(cleanupFrames.get.asInstanceOf[js.Any])
    if (!js.isUndefined(concurrency)) __obj.updateDynamic("concurrency")(concurrency.get.asInstanceOf[js.Any])
    if (frameFormat != null) __obj.updateDynamic("frameFormat")(frameFormat.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction1(log))
    if (tempDir != null) __obj.updateDynamic("tempDir")(tempDir.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (transitions != null) __obj.updateDynamic("transitions")(transitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatOptions]
  }
}

