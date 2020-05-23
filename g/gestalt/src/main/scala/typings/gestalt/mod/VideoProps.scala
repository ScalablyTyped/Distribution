package typings.gestalt.mod

import typings.gestalt.anon.Duration
import typings.gestalt.anon.Fullscreen
import typings.gestalt.anon.Loaded
import typings.gestalt.anon.Src
import typings.gestalt.anon.Time
import typings.gestalt.anon.Volume
import typings.gestalt.anon.`4`
import typings.gestalt.anon.`5`
import typings.gestalt.gestaltStrings.auto
import typings.gestalt.gestaltStrings.metadata
import typings.gestalt.gestaltStrings.none
import typings.react.mod.ReactNode
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
  var children: js.UndefOr[ReactNode] = js.undefined
  var controls: js.UndefOr[Boolean] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var onDurationChange: js.UndefOr[js.Function1[/* args */ Duration, Unit]] = js.undefined
  var onEnded: js.UndefOr[js.Function1[/* args */ `4`, Unit]] = js.undefined
  var onFullscreenChange: js.UndefOr[js.Function1[/* args */ Fullscreen, Unit]] = js.undefined
  var onLoadedChange: js.UndefOr[js.Function1[/* args */ Loaded, Unit]] = js.undefined
  var onPause: js.UndefOr[js.Function1[/* args */ `5`, Unit]] = js.undefined
  var onPlay: js.UndefOr[js.Function1[/* args */ `5`, Unit]] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* args */ `4`, Unit]] = js.undefined
  var onSeek: js.UndefOr[js.Function1[/* args */ `4`, Unit]] = js.undefined
  var onTimeChange: js.UndefOr[js.Function1[/* args */ Time, Unit]] = js.undefined
  var onVolumeChange: js.UndefOr[js.Function1[/* args */ Volume, Unit]] = js.undefined
  var playbackRate: js.UndefOr[Double] = js.undefined
  var playing: js.UndefOr[Boolean] = js.undefined
  var playsInline: js.UndefOr[Boolean] = js.undefined
  var poster: js.UndefOr[String] = js.undefined
  var preload: js.UndefOr[auto | metadata | none] = js.undefined
  var src: String | js.Array[Src]
  var volume: js.UndefOr[Double] = js.undefined
}

object VideoProps {
  @scala.inline
  def apply(
    aspectRatio: Double,
    captions: String,
    src: String | js.Array[Src],
    accessibilityMaximizeLabel: String = null,
    accessibilityMinimizeLabel: String = null,
    accessibilityMuteLabel: String = null,
    accessibilityPauseLabel: String = null,
    accessibilityPlayLabel: String = null,
    accessibilityUnmuteLabel: String = null,
    children: ReactNode = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    onDurationChange: /* args */ Duration => Unit = null,
    onEnded: /* args */ `4` => Unit = null,
    onFullscreenChange: /* args */ Fullscreen => Unit = null,
    onLoadedChange: /* args */ Loaded => Unit = null,
    onPause: /* args */ `5` => Unit = null,
    onPlay: /* args */ `5` => Unit = null,
    onReady: /* args */ `4` => Unit = null,
    onSeek: /* args */ `4` => Unit = null,
    onTimeChange: /* args */ Time => Unit = null,
    onVolumeChange: /* args */ Volume => Unit = null,
    playbackRate: js.UndefOr[Double] = js.undefined,
    playing: js.UndefOr[Boolean] = js.undefined,
    playsInline: js.UndefOr[Boolean] = js.undefined,
    poster: String = null,
    preload: auto | metadata | none = null,
    volume: js.UndefOr[Double] = js.undefined
  ): VideoProps = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], captions = captions.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    if (accessibilityMaximizeLabel != null) __obj.updateDynamic("accessibilityMaximizeLabel")(accessibilityMaximizeLabel.asInstanceOf[js.Any])
    if (accessibilityMinimizeLabel != null) __obj.updateDynamic("accessibilityMinimizeLabel")(accessibilityMinimizeLabel.asInstanceOf[js.Any])
    if (accessibilityMuteLabel != null) __obj.updateDynamic("accessibilityMuteLabel")(accessibilityMuteLabel.asInstanceOf[js.Any])
    if (accessibilityPauseLabel != null) __obj.updateDynamic("accessibilityPauseLabel")(accessibilityPauseLabel.asInstanceOf[js.Any])
    if (accessibilityPlayLabel != null) __obj.updateDynamic("accessibilityPlayLabel")(accessibilityPlayLabel.asInstanceOf[js.Any])
    if (accessibilityUnmuteLabel != null) __obj.updateDynamic("accessibilityUnmuteLabel")(accessibilityUnmuteLabel.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(playbackRate)) __obj.updateDynamic("playbackRate")(playbackRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(playing)) __obj.updateDynamic("playing")(playing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(playsInline)) __obj.updateDynamic("playsInline")(playsInline.get.asInstanceOf[js.Any])
    if (poster != null) __obj.updateDynamic("poster")(poster.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoProps]
  }
}

