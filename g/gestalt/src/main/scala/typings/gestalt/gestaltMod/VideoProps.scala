package typings.gestalt.gestaltMod

import typings.gestalt.Anon_Duration
import typings.gestalt.Anon_EventFullscreen
import typings.gestalt.Anon_EventHTMLDivElementSyntheticEvent
import typings.gestalt.Anon_EventHTMLVideoElement
import typings.gestalt.Anon_EventLoaded
import typings.gestalt.Anon_EventTime
import typings.gestalt.Anon_EventVolume
import typings.gestalt.Anon_Src
import typings.gestalt.gestaltStrings.auto
import typings.gestalt.gestaltStrings.metadata
import typings.gestalt.gestaltStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProps extends js.Object {
  var accessibilityMaximizeLabel: js.UndefOr[String] = js.undefined
  var accessibilityMinimizeLabel: js.UndefOr[String] = js.undefined
  var accessibilityMuteLabel: js.UndefOr[String] = js.undefined
  var accessibilityPauseLabel: js.UndefOr[String] = js.undefined
  var accessibilityPlayLabel: js.UndefOr[String] = js.undefined
  var accessibilityUnmuteLabel: js.UndefOr[String] = js.undefined
  var aspectRatio: Double
  var captions: String
  var controls: js.UndefOr[Boolean] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var onDurationChange: js.UndefOr[js.Function1[/* args */ Anon_Duration, Unit]] = js.undefined
  var onEnded: js.UndefOr[js.Function1[/* args */ Anon_EventHTMLVideoElement, Unit]] = js.undefined
  var onFullscreenChange: js.UndefOr[js.Function1[/* args */ Anon_EventFullscreen, Unit]] = js.undefined
  var onLoadedChange: js.UndefOr[js.Function1[/* args */ Anon_EventLoaded, Unit]] = js.undefined
  var onPause: js.UndefOr[js.Function1[/* args */ Anon_EventHTMLDivElementSyntheticEvent, Unit]] = js.undefined
  var onPlay: js.UndefOr[js.Function1[/* args */ Anon_EventHTMLDivElementSyntheticEvent, Unit]] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* args */ Anon_EventHTMLVideoElement, Unit]] = js.undefined
  var onSeek: js.UndefOr[js.Function1[/* args */ Anon_EventHTMLVideoElement, Unit]] = js.undefined
  var onTimeChange: js.UndefOr[js.Function1[/* args */ Anon_EventTime, Unit]] = js.undefined
  var onVolumeChange: js.UndefOr[js.Function1[/* args */ Anon_EventVolume, Unit]] = js.undefined
  var playbackRate: js.UndefOr[Double] = js.undefined
  var playing: js.UndefOr[Boolean] = js.undefined
  var playsInline: js.UndefOr[Boolean] = js.undefined
  var poster: js.UndefOr[String] = js.undefined
  var preload: js.UndefOr[auto | metadata | none] = js.undefined
  var src: String | js.Array[Anon_Src]
  var volume: Double
}

object VideoProps {
  @scala.inline
  def apply(
    aspectRatio: Double,
    captions: String,
    src: String | js.Array[Anon_Src],
    volume: Double,
    accessibilityMaximizeLabel: String = null,
    accessibilityMinimizeLabel: String = null,
    accessibilityMuteLabel: String = null,
    accessibilityPauseLabel: String = null,
    accessibilityPlayLabel: String = null,
    accessibilityUnmuteLabel: String = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    onDurationChange: /* args */ Anon_Duration => Unit = null,
    onEnded: /* args */ Anon_EventHTMLVideoElement => Unit = null,
    onFullscreenChange: /* args */ Anon_EventFullscreen => Unit = null,
    onLoadedChange: /* args */ Anon_EventLoaded => Unit = null,
    onPause: /* args */ Anon_EventHTMLDivElementSyntheticEvent => Unit = null,
    onPlay: /* args */ Anon_EventHTMLDivElementSyntheticEvent => Unit = null,
    onReady: /* args */ Anon_EventHTMLVideoElement => Unit = null,
    onSeek: /* args */ Anon_EventHTMLVideoElement => Unit = null,
    onTimeChange: /* args */ Anon_EventTime => Unit = null,
    onVolumeChange: /* args */ Anon_EventVolume => Unit = null,
    playbackRate: Int | Double = null,
    playing: js.UndefOr[Boolean] = js.undefined,
    playsInline: js.UndefOr[Boolean] = js.undefined,
    poster: String = null,
    preload: auto | metadata | none = null
  ): VideoProps = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio, captions = captions, src = src.asInstanceOf[js.Any], volume = volume)
    if (accessibilityMaximizeLabel != null) __obj.updateDynamic("accessibilityMaximizeLabel")(accessibilityMaximizeLabel)
    if (accessibilityMinimizeLabel != null) __obj.updateDynamic("accessibilityMinimizeLabel")(accessibilityMinimizeLabel)
    if (accessibilityMuteLabel != null) __obj.updateDynamic("accessibilityMuteLabel")(accessibilityMuteLabel)
    if (accessibilityPauseLabel != null) __obj.updateDynamic("accessibilityPauseLabel")(accessibilityPauseLabel)
    if (accessibilityPlayLabel != null) __obj.updateDynamic("accessibilityPlayLabel")(accessibilityPlayLabel)
    if (accessibilityUnmuteLabel != null) __obj.updateDynamic("accessibilityUnmuteLabel")(accessibilityUnmuteLabel)
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onFullscreenChange != null) __obj.updateDynamic("onFullscreenChange")(js.Any.fromFunction1(onFullscreenChange))
    if (onLoadedChange != null) __obj.updateDynamic("onLoadedChange")(js.Any.fromFunction1(onLoadedChange))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1(onReady))
    if (onSeek != null) __obj.updateDynamic("onSeek")(js.Any.fromFunction1(onSeek))
    if (onTimeChange != null) __obj.updateDynamic("onTimeChange")(js.Any.fromFunction1(onTimeChange))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (playbackRate != null) __obj.updateDynamic("playbackRate")(playbackRate.asInstanceOf[js.Any])
    if (!js.isUndefined(playing)) __obj.updateDynamic("playing")(playing)
    if (!js.isUndefined(playsInline)) __obj.updateDynamic("playsInline")(playsInline)
    if (poster != null) __obj.updateDynamic("poster")(poster)
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoProps]
  }
}

