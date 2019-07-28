package typings.expo.expoMod

import typings.react.reactMod.Ref
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProps extends js.Object {
  var isLooping: js.UndefOr[Boolean] = js.undefined
  var isMuted: js.UndefOr[Boolean] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.undefined
  var onIOSFullscreenUpdate: js.UndefOr[js.Function1[/* event */ FullscreenUpdateEvent, Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* status */ PlaybackStatus, Unit]] = js.undefined
  var onLoadStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPlaybackStatusUpdate: js.UndefOr[js.Function1[/* status */ PlaybackStatus, Unit]] = js.undefined
  var onReadyForDisplay: js.UndefOr[js.Function1[/* event */ ReadyForDisplayEvent, Unit]] = js.undefined
  var positionMillis: js.UndefOr[Double] = js.undefined
  var posterSource: js.UndefOr[URISource | RequireSource] = js.undefined
  var progressUpdateIntervalMillis: js.UndefOr[Double] = js.undefined
  var rate: js.UndefOr[Double] = js.undefined
  var ref: js.UndefOr[Ref[PlaybackObject]] = js.undefined
  var resizeMode: js.UndefOr[ResizeModeContain | ResizeModeCover | ResizeModeStretch] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var scaleX: js.UndefOr[Double] = js.undefined
  var scaleY: js.UndefOr[Double] = js.undefined
  var shouldCorrectPitch: js.UndefOr[Boolean] = js.undefined
  var shouldPlay: js.UndefOr[Boolean] = js.undefined
  var source: js.UndefOr[PlaybackSource | Null] = js.undefined
  var status: js.UndefOr[PlaybackStatusToSet] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var translateX: js.UndefOr[Double] = js.undefined
  var translateY: js.UndefOr[Double] = js.undefined
  var useNativeControls: js.UndefOr[Boolean] = js.undefined
  var usePoster: js.UndefOr[Boolean] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
}

object VideoProps {
  @scala.inline
  def apply(
    isLooping: js.UndefOr[Boolean] = js.undefined,
    isMuted: js.UndefOr[Boolean] = js.undefined,
    onError: /* error */ String => Unit = null,
    onIOSFullscreenUpdate: /* event */ FullscreenUpdateEvent => Unit = null,
    onLoad: /* status */ PlaybackStatus => Unit = null,
    onLoadStart: () => Unit = null,
    onPlaybackStatusUpdate: /* status */ PlaybackStatus => Unit = null,
    onReadyForDisplay: /* event */ ReadyForDisplayEvent => Unit = null,
    positionMillis: Int | Double = null,
    posterSource: URISource | RequireSource = null,
    progressUpdateIntervalMillis: Int | Double = null,
    rate: Int | Double = null,
    ref: Ref[PlaybackObject] = null,
    resizeMode: ResizeModeContain | ResizeModeCover | ResizeModeStretch = null,
    rotation: Int | Double = null,
    scaleX: Int | Double = null,
    scaleY: Int | Double = null,
    shouldCorrectPitch: js.UndefOr[Boolean] = js.undefined,
    shouldPlay: js.UndefOr[Boolean] = js.undefined,
    source: PlaybackSource = null,
    status: PlaybackStatusToSet = null,
    style: StyleProp[ViewStyle] = null,
    translateX: Int | Double = null,
    translateY: Int | Double = null,
    useNativeControls: js.UndefOr[Boolean] = js.undefined,
    usePoster: js.UndefOr[Boolean] = js.undefined,
    volume: Int | Double = null
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

