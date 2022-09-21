package typings.gestalt.mod

import typings.gestalt.anon.Duration
import typings.gestalt.anon.Fullscreen
import typings.gestalt.anon.Loaded
import typings.gestalt.anon.Src
import typings.gestalt.anon.Time
import typings.gestalt.anon.Volume
import typings.gestalt.gestaltStrings.`scale-down`
import typings.gestalt.gestaltStrings.`use-credentials`
import typings.gestalt.gestaltStrings.anonymous
import typings.gestalt.gestaltStrings.auto
import typings.gestalt.gestaltStrings.black
import typings.gestalt.gestaltStrings.contain
import typings.gestalt.gestaltStrings.cover
import typings.gestalt.gestaltStrings.fill
import typings.gestalt.gestaltStrings.metadata
import typings.gestalt.gestaltStrings.none
import typings.gestalt.gestaltStrings.transparent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLVideoElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoProps extends StObject {
  
  var accessibilityMaximizeLabel: js.UndefOr[String] = js.undefined
  
  var accessibilityMinimizeLabel: js.UndefOr[String] = js.undefined
  
  var accessibilityMuteLabel: js.UndefOr[String] = js.undefined
  
  var accessibilityPauseLabel: js.UndefOr[String] = js.undefined
  
  var accessibilityPlayLabel: js.UndefOr[String] = js.undefined
  
  var accessibilityUnmuteLabel: js.UndefOr[String] = js.undefined
  
  var aspectRatio: Double
  
  var backgroundColor: js.UndefOr[black | transparent] = js.undefined
  
  var captions: String
  
  var children: js.UndefOr[Node] = js.undefined
  
  var controls: js.UndefOr[Boolean] = js.undefined
  
  var crossOrigin: js.UndefOr[anonymous | `use-credentials`] = js.undefined
  
  var disableRemotePlayback: js.UndefOr[Boolean] = js.undefined
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var objectFit: js.UndefOr[fill | contain | cover | none | `scale-down`] = js.undefined
  
  var onDurationChange: js.UndefOr[js.Function1[/* args */ Duration, Unit]] = js.undefined
  
  var onEnded: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], js.Object]] = js.undefined
  
  var onError: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], js.Object]] = js.undefined
  
  var onFullscreenChange: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], Fullscreen]] = js.undefined
  
  var onLoadStart: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], js.Object]] = js.undefined
  
  var onLoadedChange: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], Loaded]] = js.undefined
  
  var onPause: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLDivElement, Event], js.Object]] = js.undefined
  
  var onPlay: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLDivElement, Event], js.Object]] = js.undefined
  
  var onPlayheadDown: js.UndefOr[AbstractEventHandler[MouseEvent[HTMLDivElement, NativeMouseEvent], js.Object]] = js.undefined
  
  var onPlayheadUp: js.UndefOr[AbstractEventHandler[MouseEvent[HTMLDivElement, NativeMouseEvent], js.Object]] = js.undefined
  
  var onPlaying: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], js.Object]] = js.undefined
  
  var onReady: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], js.Object]] = js.undefined
  
  var onSeek: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], js.Object]] = js.undefined
  
  var onSeeking: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], js.Object]] = js.undefined
  
  var onStalled: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], js.Object]] = js.undefined
  
  var onTimeChange: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], Time]] = js.undefined
  
  var onVolumeChange: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLDivElement, Event], Volume]] = js.undefined
  
  var onWaiting: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], js.Object]] = js.undefined
  
  var playbackRate: js.UndefOr[Double] = js.undefined
  
  var playing: js.UndefOr[Boolean] = js.undefined
  
  var playsInline: js.UndefOr[Boolean] = js.undefined
  
  var poster: js.UndefOr[String] = js.undefined
  
  var preload: js.UndefOr[auto | metadata | none] = js.undefined
  
  var src: String | js.Array[Src]
  
  var startTime: js.UndefOr[Double] = js.undefined
  
  var volume: js.UndefOr[Double] = js.undefined
}
object VideoProps {
  
  inline def apply(aspectRatio: Double, captions: String, src: String | js.Array[Src]): VideoProps = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], captions = captions.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoProps]
  }
  
  extension [Self <: VideoProps](x: Self) {
    
    inline def setAccessibilityMaximizeLabel(value: String): Self = StObject.set(x, "accessibilityMaximizeLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityMaximizeLabelUndefined: Self = StObject.set(x, "accessibilityMaximizeLabel", js.undefined)
    
    inline def setAccessibilityMinimizeLabel(value: String): Self = StObject.set(x, "accessibilityMinimizeLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityMinimizeLabelUndefined: Self = StObject.set(x, "accessibilityMinimizeLabel", js.undefined)
    
    inline def setAccessibilityMuteLabel(value: String): Self = StObject.set(x, "accessibilityMuteLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityMuteLabelUndefined: Self = StObject.set(x, "accessibilityMuteLabel", js.undefined)
    
    inline def setAccessibilityPauseLabel(value: String): Self = StObject.set(x, "accessibilityPauseLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityPauseLabelUndefined: Self = StObject.set(x, "accessibilityPauseLabel", js.undefined)
    
    inline def setAccessibilityPlayLabel(value: String): Self = StObject.set(x, "accessibilityPlayLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityPlayLabelUndefined: Self = StObject.set(x, "accessibilityPlayLabel", js.undefined)
    
    inline def setAccessibilityUnmuteLabel(value: String): Self = StObject.set(x, "accessibilityUnmuteLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityUnmuteLabelUndefined: Self = StObject.set(x, "accessibilityUnmuteLabel", js.undefined)
    
    inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor(value: black | transparent): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setCaptions(value: String): Self = StObject.set(x, "captions", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setCrossOrigin(value: anonymous | `use-credentials`): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setDisableRemotePlayback(value: Boolean): Self = StObject.set(x, "disableRemotePlayback", value.asInstanceOf[js.Any])
    
    inline def setDisableRemotePlaybackUndefined: Self = StObject.set(x, "disableRemotePlayback", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setObjectFit(value: fill | contain | cover | none | `scale-down`): Self = StObject.set(x, "objectFit", value.asInstanceOf[js.Any])
    
    inline def setObjectFitUndefined: Self = StObject.set(x, "objectFit", js.undefined)
    
    inline def setOnDurationChange(value: /* args */ Duration => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
    
    inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    inline def setOnEnded(
      value: /* arg */ js.Object & (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
    
    inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    inline def setOnError(
      value: /* arg */ js.Object & (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnFullscreenChange(
      value: /* arg */ Fullscreen & (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = StObject.set(x, "onFullscreenChange", js.Any.fromFunction1(value))
    
    inline def setOnFullscreenChangeUndefined: Self = StObject.set(x, "onFullscreenChange", js.undefined)
    
    inline def setOnLoadStart(
      value: /* arg */ js.Object & (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
    
    inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    inline def setOnLoadedChange(
      value: /* arg */ Loaded & (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = StObject.set(x, "onLoadedChange", js.Any.fromFunction1(value))
    
    inline def setOnLoadedChangeUndefined: Self = StObject.set(x, "onLoadedChange", js.undefined)
    
    inline def setOnPause(
      value: /* arg */ js.Object & (typings.gestalt.anon.Event[SyntheticEvent[HTMLDivElement, Event]]) => Unit
    ): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnPlay(
      value: /* arg */ js.Object & (typings.gestalt.anon.Event[SyntheticEvent[HTMLDivElement, Event]]) => Unit
    ): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
    
    inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    inline def setOnPlayheadDown(
      value: /* arg */ js.Object & (typings.gestalt.anon.Event[MouseEvent[HTMLDivElement, NativeMouseEvent]]) => Unit
    ): Self = StObject.set(x, "onPlayheadDown", js.Any.fromFunction1(value))
    
    inline def setOnPlayheadDownUndefined: Self = StObject.set(x, "onPlayheadDown", js.undefined)
    
    inline def setOnPlayheadUp(
      value: /* arg */ js.Object & (typings.gestalt.anon.Event[MouseEvent[HTMLDivElement, NativeMouseEvent]]) => Unit
    ): Self = StObject.set(x, "onPlayheadUp", js.Any.fromFunction1(value))
    
    inline def setOnPlayheadUpUndefined: Self = StObject.set(x, "onPlayheadUp", js.undefined)
    
    inline def setOnPlaying(
      value: /* arg */ js.Object & (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
    
    inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    inline def setOnReady(
      value: /* arg */ js.Object & (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
    
    inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    inline def setOnSeek(
      value: /* arg */ js.Object & (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = StObject.set(x, "onSeek", js.Any.fromFunction1(value))
    
    inline def setOnSeekUndefined: Self = StObject.set(x, "onSeek", js.undefined)
    
    inline def setOnSeeking(
      value: /* arg */ js.Object & (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
    
    inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    inline def setOnStalled(
      value: /* arg */ js.Object & (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
    
    inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    inline def setOnTimeChange(
      value: /* arg */ Time & (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = StObject.set(x, "onTimeChange", js.Any.fromFunction1(value))
    
    inline def setOnTimeChangeUndefined: Self = StObject.set(x, "onTimeChange", js.undefined)
    
    inline def setOnVolumeChange(
      value: /* arg */ Volume & (typings.gestalt.anon.Event[SyntheticEvent[HTMLDivElement, Event]]) => Unit
    ): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
    
    inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    inline def setOnWaiting(
      value: /* arg */ js.Object & (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
    
    inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    inline def setPlaybackRateUndefined: Self = StObject.set(x, "playbackRate", js.undefined)
    
    inline def setPlaying(value: Boolean): Self = StObject.set(x, "playing", value.asInstanceOf[js.Any])
    
    inline def setPlayingUndefined: Self = StObject.set(x, "playing", js.undefined)
    
    inline def setPlaysInline(value: Boolean): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
    
    inline def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
    
    inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    
    inline def setPreload(value: auto | metadata | none): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setSrc(value: String | js.Array[Src]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcVarargs(value: Src*): Self = StObject.set(x, "src", js.Array(value*))
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
