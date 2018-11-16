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
  var ref: js.UndefOr[reactLib.reactMod.ReactNs.Ref[PlaybackObject]] = js.undefined
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

