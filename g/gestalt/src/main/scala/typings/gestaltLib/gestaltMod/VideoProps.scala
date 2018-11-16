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
  var onDurationChange: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_EventDuration, scala.Unit]] = js.undefined
  var onEnded: js.UndefOr[
    js.Function1[/* args */ gestaltLib.Anon_EventSyntheticEventHTMLVideoElement, scala.Unit]
  ] = js.undefined
  var onFullscreenChange: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_EventFullscreen, scala.Unit]] = js.undefined
  var onLoadedChange: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_EventLoaded, scala.Unit]] = js.undefined
  var onPause: js.UndefOr[
    js.Function1[/* args */ gestaltLib.Anon_EventSyntheticEventHTMLDivElement, scala.Unit]
  ] = js.undefined
  var onPlay: js.UndefOr[
    js.Function1[/* args */ gestaltLib.Anon_EventSyntheticEventHTMLDivElement, scala.Unit]
  ] = js.undefined
  var onReady: js.UndefOr[
    js.Function1[/* args */ gestaltLib.Anon_EventSyntheticEventHTMLVideoElement, scala.Unit]
  ] = js.undefined
  var onSeek: js.UndefOr[
    js.Function1[/* args */ gestaltLib.Anon_EventSyntheticEventHTMLVideoElement, scala.Unit]
  ] = js.undefined
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

