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
import typings.gestalt.gestaltStrings.contain
import typings.gestalt.gestaltStrings.cover
import typings.gestalt.gestaltStrings.fill
import typings.gestalt.gestaltStrings.metadata
import typings.gestalt.gestaltStrings.none
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
  
  var captions: String
  
  var children: js.UndefOr[Node] = js.undefined
  
  var controls: js.UndefOr[Boolean] = js.undefined
  
  var crossOrigin: js.UndefOr[anonymous | `use-credentials`] = js.undefined
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var objectFit: js.UndefOr[fill | contain | cover | none | `scale-down`] = js.undefined
  
  var onDurationChange: js.UndefOr[js.Function1[/* args */ Duration, Unit]] = js.undefined
  
  var onEnded: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], js.Object]] = js.undefined
  
  var onFullscreenChange: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], Fullscreen]] = js.undefined
  
  var onLoadedChange: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], Loaded]] = js.undefined
  
  var onPause: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLDivElement, Event], js.Object]] = js.undefined
  
  var onPlay: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLDivElement, Event], js.Object]] = js.undefined
  
  var onPlayheadDown: js.UndefOr[AbstractEventHandler[MouseEvent[HTMLDivElement, NativeMouseEvent], js.Object]] = js.undefined
  
  var onPlayheadUp: js.UndefOr[AbstractEventHandler[MouseEvent[HTMLDivElement, NativeMouseEvent], js.Object]] = js.undefined
  
  var onReady: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], js.Object]] = js.undefined
  
  var onSeek: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], js.Object]] = js.undefined
  
  var onTimeChange: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], Time]] = js.undefined
  
  var onVolumeChange: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLDivElement, Event], Volume]] = js.undefined
  
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
  def apply(aspectRatio: Double, captions: String, src: String | js.Array[Src]): VideoProps = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], captions = captions.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoProps]
  }
  
  @scala.inline
  implicit class VideoPropsMutableBuilder[Self <: VideoProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityMaximizeLabel(value: String): Self = StObject.set(x, "accessibilityMaximizeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityMaximizeLabelUndefined: Self = StObject.set(x, "accessibilityMaximizeLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityMinimizeLabel(value: String): Self = StObject.set(x, "accessibilityMinimizeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityMinimizeLabelUndefined: Self = StObject.set(x, "accessibilityMinimizeLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityMuteLabel(value: String): Self = StObject.set(x, "accessibilityMuteLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityMuteLabelUndefined: Self = StObject.set(x, "accessibilityMuteLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityPauseLabel(value: String): Self = StObject.set(x, "accessibilityPauseLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityPauseLabelUndefined: Self = StObject.set(x, "accessibilityPauseLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityPlayLabel(value: String): Self = StObject.set(x, "accessibilityPlayLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityPlayLabelUndefined: Self = StObject.set(x, "accessibilityPlayLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityUnmuteLabel(value: String): Self = StObject.set(x, "accessibilityUnmuteLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityUnmuteLabelUndefined: Self = StObject.set(x, "accessibilityUnmuteLabel", js.undefined)
    
    @scala.inline
    def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptions(value: String): Self = StObject.set(x, "captions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: anonymous | `use-credentials`): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setObjectFit(value: fill | contain | cover | none | `scale-down`): Self = StObject.set(x, "objectFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectFitUndefined: Self = StObject.set(x, "objectFit", js.undefined)
    
    @scala.inline
    def setOnDurationChange(value: /* args */ Duration => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    @scala.inline
    def setOnEnded(
      value: /* arg */ js.Object & (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    @scala.inline
    def setOnFullscreenChange(
      value: /* arg */ Fullscreen & (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = StObject.set(x, "onFullscreenChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFullscreenChangeUndefined: Self = StObject.set(x, "onFullscreenChange", js.undefined)
    
    @scala.inline
    def setOnLoadedChange(
      value: /* arg */ Loaded & (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = StObject.set(x, "onLoadedChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadedChangeUndefined: Self = StObject.set(x, "onLoadedChange", js.undefined)
    
    @scala.inline
    def setOnPause(
      value: /* arg */ js.Object & (typings.gestalt.anon.Event[SyntheticEvent[HTMLDivElement, Event]]) => Unit
    ): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    @scala.inline
    def setOnPlay(
      value: /* arg */ js.Object & (typings.gestalt.anon.Event[SyntheticEvent[HTMLDivElement, Event]]) => Unit
    ): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    @scala.inline
    def setOnPlayheadDown(
      value: /* arg */ js.Object & (typings.gestalt.anon.Event[MouseEvent[HTMLDivElement, NativeMouseEvent]]) => Unit
    ): Self = StObject.set(x, "onPlayheadDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlayheadDownUndefined: Self = StObject.set(x, "onPlayheadDown", js.undefined)
    
    @scala.inline
    def setOnPlayheadUp(
      value: /* arg */ js.Object & (typings.gestalt.anon.Event[MouseEvent[HTMLDivElement, NativeMouseEvent]]) => Unit
    ): Self = StObject.set(x, "onPlayheadUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlayheadUpUndefined: Self = StObject.set(x, "onPlayheadUp", js.undefined)
    
    @scala.inline
    def setOnReady(
      value: /* arg */ js.Object & (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    @scala.inline
    def setOnSeek(
      value: /* arg */ js.Object & (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = StObject.set(x, "onSeek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeekUndefined: Self = StObject.set(x, "onSeek", js.undefined)
    
    @scala.inline
    def setOnTimeChange(
      value: /* arg */ Time & (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = StObject.set(x, "onTimeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTimeChangeUndefined: Self = StObject.set(x, "onTimeChange", js.undefined)
    
    @scala.inline
    def setOnVolumeChange(
      value: /* arg */ Volume & (typings.gestalt.anon.Event[SyntheticEvent[HTMLDivElement, Event]]) => Unit
    ): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    @scala.inline
    def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackRateUndefined: Self = StObject.set(x, "playbackRate", js.undefined)
    
    @scala.inline
    def setPlaying(value: Boolean): Self = StObject.set(x, "playing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayingUndefined: Self = StObject.set(x, "playing", js.undefined)
    
    @scala.inline
    def setPlaysInline(value: Boolean): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
    
    @scala.inline
    def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    
    @scala.inline
    def setPreload(value: auto | metadata | none): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    @scala.inline
    def setSrc(value: String | js.Array[Src]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcVarargs(value: Src*): Self = StObject.set(x, "src", js.Array(value :_*))
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
