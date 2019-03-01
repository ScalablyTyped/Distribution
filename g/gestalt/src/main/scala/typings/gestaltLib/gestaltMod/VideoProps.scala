package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProps extends js.Object {
  var accessibilityMaximizeLabel: js.UndefOr[java.lang.String] = js.undefined
  var accessibilityMinimizeLabel: js.UndefOr[java.lang.String] = js.undefined
  var accessibilityMuteLabel: js.UndefOr[java.lang.String] = js.undefined
  var accessibilityPauseLabel: js.UndefOr[java.lang.String] = js.undefined
  var accessibilityPlayLabel: js.UndefOr[java.lang.String] = js.undefined
  var accessibilityUnmuteLabel: js.UndefOr[java.lang.String] = js.undefined
  var aspectRatio: scala.Double
  var captions: java.lang.String
  var controls: js.UndefOr[scala.Boolean] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var onDurationChange: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_Duration, scala.Unit]] = js.undefined
  var onEnded: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_EventHTMLVideoElement, scala.Unit]] = js.undefined
  var onFullscreenChange: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_EventFullscreen, scala.Unit]] = js.undefined
  var onLoadedChange: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_EventLoaded, scala.Unit]] = js.undefined
  var onPause: js.UndefOr[
    js.Function1[/* args */ gestaltLib.Anon_EventHTMLDivElementSyntheticEvent, scala.Unit]
  ] = js.undefined
  var onPlay: js.UndefOr[
    js.Function1[/* args */ gestaltLib.Anon_EventHTMLDivElementSyntheticEvent, scala.Unit]
  ] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_EventHTMLVideoElement, scala.Unit]] = js.undefined
  var onSeek: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_EventHTMLVideoElement, scala.Unit]] = js.undefined
  var onTimeChange: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_EventTime, scala.Unit]] = js.undefined
  var onVolumeChange: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_EventVolume, scala.Unit]] = js.undefined
  var playbackRate: js.UndefOr[scala.Double] = js.undefined
  var playing: js.UndefOr[scala.Boolean] = js.undefined
  var playsInline: js.UndefOr[scala.Boolean] = js.undefined
  var poster: js.UndefOr[java.lang.String] = js.undefined
  var preload: js.UndefOr[
    gestaltLib.gestaltLibStrings.auto | gestaltLib.gestaltLibStrings.metadata | gestaltLib.gestaltLibStrings.none
  ] = js.undefined
  var src: java.lang.String | js.Array[gestaltLib.Anon_Src]
  var volume: scala.Double
}

object VideoProps {
  @scala.inline
  def apply(
    aspectRatio: scala.Double,
    captions: java.lang.String,
    src: java.lang.String | js.Array[gestaltLib.Anon_Src],
    volume: scala.Double,
    accessibilityMaximizeLabel: java.lang.String = null,
    accessibilityMinimizeLabel: java.lang.String = null,
    accessibilityMuteLabel: java.lang.String = null,
    accessibilityPauseLabel: java.lang.String = null,
    accessibilityPlayLabel: java.lang.String = null,
    accessibilityUnmuteLabel: java.lang.String = null,
    controls: js.UndefOr[scala.Boolean] = js.undefined,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    onDurationChange: js.Function1[/* args */ gestaltLib.Anon_Duration, scala.Unit] = null,
    onEnded: js.Function1[/* args */ gestaltLib.Anon_EventHTMLVideoElement, scala.Unit] = null,
    onFullscreenChange: js.Function1[/* args */ gestaltLib.Anon_EventFullscreen, scala.Unit] = null,
    onLoadedChange: js.Function1[/* args */ gestaltLib.Anon_EventLoaded, scala.Unit] = null,
    onPause: js.Function1[/* args */ gestaltLib.Anon_EventHTMLDivElementSyntheticEvent, scala.Unit] = null,
    onPlay: js.Function1[/* args */ gestaltLib.Anon_EventHTMLDivElementSyntheticEvent, scala.Unit] = null,
    onReady: js.Function1[/* args */ gestaltLib.Anon_EventHTMLVideoElement, scala.Unit] = null,
    onSeek: js.Function1[/* args */ gestaltLib.Anon_EventHTMLVideoElement, scala.Unit] = null,
    onTimeChange: js.Function1[/* args */ gestaltLib.Anon_EventTime, scala.Unit] = null,
    onVolumeChange: js.Function1[/* args */ gestaltLib.Anon_EventVolume, scala.Unit] = null,
    playbackRate: scala.Int | scala.Double = null,
    playing: js.UndefOr[scala.Boolean] = js.undefined,
    playsInline: js.UndefOr[scala.Boolean] = js.undefined,
    poster: java.lang.String = null,
    preload: gestaltLib.gestaltLibStrings.auto | gestaltLib.gestaltLibStrings.metadata | gestaltLib.gestaltLibStrings.none = null
  ): VideoProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aspectRatio")(aspectRatio)
    __obj.updateDynamic("captions")(captions)
    __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.updateDynamic("volume")(volume)
    if (accessibilityMaximizeLabel != null) __obj.updateDynamic("accessibilityMaximizeLabel")(accessibilityMaximizeLabel)
    if (accessibilityMinimizeLabel != null) __obj.updateDynamic("accessibilityMinimizeLabel")(accessibilityMinimizeLabel)
    if (accessibilityMuteLabel != null) __obj.updateDynamic("accessibilityMuteLabel")(accessibilityMuteLabel)
    if (accessibilityPauseLabel != null) __obj.updateDynamic("accessibilityPauseLabel")(accessibilityPauseLabel)
    if (accessibilityPlayLabel != null) __obj.updateDynamic("accessibilityPlayLabel")(accessibilityPlayLabel)
    if (accessibilityUnmuteLabel != null) __obj.updateDynamic("accessibilityUnmuteLabel")(accessibilityUnmuteLabel)
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(onDurationChange)
    if (onEnded != null) __obj.updateDynamic("onEnded")(onEnded)
    if (onFullscreenChange != null) __obj.updateDynamic("onFullscreenChange")(onFullscreenChange)
    if (onLoadedChange != null) __obj.updateDynamic("onLoadedChange")(onLoadedChange)
    if (onPause != null) __obj.updateDynamic("onPause")(onPause)
    if (onPlay != null) __obj.updateDynamic("onPlay")(onPlay)
    if (onReady != null) __obj.updateDynamic("onReady")(onReady)
    if (onSeek != null) __obj.updateDynamic("onSeek")(onSeek)
    if (onTimeChange != null) __obj.updateDynamic("onTimeChange")(onTimeChange)
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(onVolumeChange)
    if (playbackRate != null) __obj.updateDynamic("playbackRate")(playbackRate.asInstanceOf[js.Any])
    if (!js.isUndefined(playing)) __obj.updateDynamic("playing")(playing)
    if (!js.isUndefined(playsInline)) __obj.updateDynamic("playsInline")(playsInline)
    if (poster != null) __obj.updateDynamic("poster")(poster)
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoProps]
  }
}

