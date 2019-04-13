package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProps extends js.Object {
  var isLooping: js.UndefOr[scala.Boolean] = js.undefined
  var isMuted: js.UndefOr[scala.Boolean] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ java.lang.String, scala.Unit]] = js.undefined
  var onIOSFullscreenUpdate: js.UndefOr[js.Function1[/* event */ FullscreenUpdateEvent, scala.Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* status */ PlaybackStatus, scala.Unit]] = js.undefined
  var onLoadStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPlaybackStatusUpdate: js.UndefOr[js.Function1[/* status */ PlaybackStatus, scala.Unit]] = js.undefined
  var onReadyForDisplay: js.UndefOr[js.Function1[/* event */ ReadyForDisplayEvent, scala.Unit]] = js.undefined
  var positionMillis: js.UndefOr[scala.Double] = js.undefined
  var posterSource: js.UndefOr[URISource | RequireSource] = js.undefined
  var progressUpdateIntervalMillis: js.UndefOr[scala.Double] = js.undefined
  var rate: js.UndefOr[scala.Double] = js.undefined
  var ref: js.UndefOr[reactLib.reactMod.Ref[PlaybackObject]] = js.undefined
  var resizeMode: js.UndefOr[ResizeModeContain | ResizeModeCover | ResizeModeStretch] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var scaleX: js.UndefOr[scala.Double] = js.undefined
  var scaleY: js.UndefOr[scala.Double] = js.undefined
  var shouldCorrectPitch: js.UndefOr[scala.Boolean] = js.undefined
  var shouldPlay: js.UndefOr[scala.Boolean] = js.undefined
  var source: js.UndefOr[PlaybackSource | scala.Null] = js.undefined
  var status: js.UndefOr[PlaybackStatusToSet] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var translateX: js.UndefOr[scala.Double] = js.undefined
  var translateY: js.UndefOr[scala.Double] = js.undefined
  var useNativeControls: js.UndefOr[scala.Boolean] = js.undefined
  var usePoster: js.UndefOr[scala.Boolean] = js.undefined
  var volume: js.UndefOr[scala.Double] = js.undefined
}

object VideoProps {
  @scala.inline
  def apply(
    isLooping: js.UndefOr[scala.Boolean] = js.undefined,
    isMuted: js.UndefOr[scala.Boolean] = js.undefined,
    onError: /* error */ java.lang.String => scala.Unit = null,
    onIOSFullscreenUpdate: /* event */ FullscreenUpdateEvent => scala.Unit = null,
    onLoad: /* status */ PlaybackStatus => scala.Unit = null,
    onLoadStart: () => scala.Unit = null,
    onPlaybackStatusUpdate: /* status */ PlaybackStatus => scala.Unit = null,
    onReadyForDisplay: /* event */ ReadyForDisplayEvent => scala.Unit = null,
    positionMillis: scala.Int | scala.Double = null,
    posterSource: URISource | RequireSource = null,
    progressUpdateIntervalMillis: scala.Int | scala.Double = null,
    rate: scala.Int | scala.Double = null,
    ref: reactLib.reactMod.Ref[PlaybackObject] = null,
    resizeMode: ResizeModeContain | ResizeModeCover | ResizeModeStretch = null,
    rotation: scala.Int | scala.Double = null,
    scaleX: scala.Int | scala.Double = null,
    scaleY: scala.Int | scala.Double = null,
    shouldCorrectPitch: js.UndefOr[scala.Boolean] = js.undefined,
    shouldPlay: js.UndefOr[scala.Boolean] = js.undefined,
    source: PlaybackSource = null,
    status: PlaybackStatusToSet = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    translateX: scala.Int | scala.Double = null,
    translateY: scala.Int | scala.Double = null,
    useNativeControls: js.UndefOr[scala.Boolean] = js.undefined,
    usePoster: js.UndefOr[scala.Boolean] = js.undefined,
    volume: scala.Int | scala.Double = null
  ): VideoProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isLooping)) __obj.updateDynamic("isLooping")(isLooping)
    if (!js.isUndefined(isMuted)) __obj.updateDynamic("isMuted")(isMuted)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onIOSFullscreenUpdate != null) __obj.updateDynamic("onIOSFullscreenUpdate")(js.Any.fromFunction1(onIOSFullscreenUpdate))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction0(onLoadStart))
    if (onPlaybackStatusUpdate != null) __obj.updateDynamic("onPlaybackStatusUpdate")(js.Any.fromFunction1(onPlaybackStatusUpdate))
    if (onReadyForDisplay != null) __obj.updateDynamic("onReadyForDisplay")(js.Any.fromFunction1(onReadyForDisplay))
    if (positionMillis != null) __obj.updateDynamic("positionMillis")(positionMillis.asInstanceOf[js.Any])
    if (posterSource != null) __obj.updateDynamic("posterSource")(posterSource.asInstanceOf[js.Any])
    if (progressUpdateIntervalMillis != null) __obj.updateDynamic("progressUpdateIntervalMillis")(progressUpdateIntervalMillis.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCorrectPitch)) __obj.updateDynamic("shouldCorrectPitch")(shouldCorrectPitch)
    if (!js.isUndefined(shouldPlay)) __obj.updateDynamic("shouldPlay")(shouldPlay)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (translateX != null) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    if (translateY != null) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeControls)) __obj.updateDynamic("useNativeControls")(useNativeControls)
    if (!js.isUndefined(usePoster)) __obj.updateDynamic("usePoster")(usePoster)
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoProps]
  }
}

