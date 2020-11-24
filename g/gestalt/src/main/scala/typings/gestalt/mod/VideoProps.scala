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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoProps extends js.Object {
  
  var accessibilityMaximizeLabel: js.UndefOr[String] = js.native
  
  var accessibilityMinimizeLabel: js.UndefOr[String] = js.native
  
  var accessibilityMuteLabel: js.UndefOr[String] = js.native
  
  var accessibilityPauseLabel: js.UndefOr[String] = js.native
  
  var accessibilityPlayLabel: js.UndefOr[String] = js.native
  
  var accessibilityUnmuteLabel: js.UndefOr[String] = js.native
  
  var aspectRatio: Double = js.native
  
  var captions: String = js.native
  
  var children: js.UndefOr[Node] = js.native
  
  var controls: js.UndefOr[Boolean] = js.native
  
  var crossOrigin: js.UndefOr[anonymous | `use-credentials`] = js.native
  
  var loop: js.UndefOr[Boolean] = js.native
  
  var objectFit: js.UndefOr[fill | contain | cover | none | `scale-down`] = js.native
  
  var onDurationChange: js.UndefOr[js.Function1[/* args */ Duration, Unit]] = js.native
  
  var onEnded: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], js.Object]] = js.native
  
  var onFullscreenChange: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], Fullscreen]] = js.native
  
  var onLoadedChange: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], Loaded]] = js.native
  
  var onPause: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLDivElement, Event], js.Object]] = js.native
  
  var onPlay: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLDivElement, Event], js.Object]] = js.native
  
  var onPlayheadDown: js.UndefOr[AbstractEventHandler[MouseEvent[HTMLDivElement, NativeMouseEvent], js.Object]] = js.native
  
  var onPlayheadUp: js.UndefOr[AbstractEventHandler[MouseEvent[HTMLDivElement, NativeMouseEvent], js.Object]] = js.native
  
  var onReady: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], js.Object]] = js.native
  
  var onSeek: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], js.Object]] = js.native
  
  var onTimeChange: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLVideoElement, Event], Time]] = js.native
  
  var onVolumeChange: js.UndefOr[AbstractEventHandler[SyntheticEvent[HTMLDivElement, Event], Volume]] = js.native
  
  var playbackRate: js.UndefOr[Double] = js.native
  
  var playing: js.UndefOr[Boolean] = js.native
  
  var playsInline: js.UndefOr[Boolean] = js.native
  
  var poster: js.UndefOr[String] = js.native
  
  var preload: js.UndefOr[auto | metadata | none] = js.native
  
  var src: String | js.Array[Src] = js.native
  
  var volume: js.UndefOr[Double] = js.native
}
object VideoProps {
  
  @scala.inline
  def apply(aspectRatio: Double, captions: String, src: String | js.Array[Src]): VideoProps = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], captions = captions.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoProps]
  }
  
  @scala.inline
  implicit class VideoPropsOps[Self <: VideoProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAspectRatio(value: Double): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptions(value: String): Self = this.set("captions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcVarargs(value: Src*): Self = this.set("src", js.Array(value :_*))
    
    @scala.inline
    def setSrc(value: String | js.Array[Src]): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityMaximizeLabel(value: String): Self = this.set("accessibilityMaximizeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityMaximizeLabel: Self = this.set("accessibilityMaximizeLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityMinimizeLabel(value: String): Self = this.set("accessibilityMinimizeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityMinimizeLabel: Self = this.set("accessibilityMinimizeLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityMuteLabel(value: String): Self = this.set("accessibilityMuteLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityMuteLabel: Self = this.set("accessibilityMuteLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityPauseLabel(value: String): Self = this.set("accessibilityPauseLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityPauseLabel: Self = this.set("accessibilityPauseLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityPlayLabel(value: String): Self = this.set("accessibilityPlayLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityPlayLabel: Self = this.set("accessibilityPlayLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityUnmuteLabel(value: String): Self = this.set("accessibilityUnmuteLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityUnmuteLabel: Self = this.set("accessibilityUnmuteLabel", js.undefined)
    
    @scala.inline
    def setChildren(value: Node): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: anonymous | `use-credentials`): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setObjectFit(value: fill | contain | cover | none | `scale-down`): Self = this.set("objectFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectFit: Self = this.set("objectFit", js.undefined)
    
    @scala.inline
    def setOnDurationChange(value: /* args */ Duration => Unit): Self = this.set("onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDurationChange: Self = this.set("onDurationChange", js.undefined)
    
    @scala.inline
    def setOnEnded(
      value: /* arg */ js.Object with (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = this.set("onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", js.undefined)
    
    @scala.inline
    def setOnFullscreenChange(
      value: /* arg */ Fullscreen with (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = this.set("onFullscreenChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFullscreenChange: Self = this.set("onFullscreenChange", js.undefined)
    
    @scala.inline
    def setOnLoadedChange(
      value: /* arg */ Loaded with (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = this.set("onLoadedChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadedChange: Self = this.set("onLoadedChange", js.undefined)
    
    @scala.inline
    def setOnPause(
      value: /* arg */ js.Object with (typings.gestalt.anon.Event[SyntheticEvent[HTMLDivElement, Event]]) => Unit
    ): Self = this.set("onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    
    @scala.inline
    def setOnPlay(
      value: /* arg */ js.Object with (typings.gestalt.anon.Event[SyntheticEvent[HTMLDivElement, Event]]) => Unit
    ): Self = this.set("onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    
    @scala.inline
    def setOnPlayheadDown(
      value: /* arg */ js.Object with (typings.gestalt.anon.Event[MouseEvent[HTMLDivElement, NativeMouseEvent]]) => Unit
    ): Self = this.set("onPlayheadDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPlayheadDown: Self = this.set("onPlayheadDown", js.undefined)
    
    @scala.inline
    def setOnPlayheadUp(
      value: /* arg */ js.Object with (typings.gestalt.anon.Event[MouseEvent[HTMLDivElement, NativeMouseEvent]]) => Unit
    ): Self = this.set("onPlayheadUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPlayheadUp: Self = this.set("onPlayheadUp", js.undefined)
    
    @scala.inline
    def setOnReady(
      value: /* arg */ js.Object with (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = this.set("onReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
    
    @scala.inline
    def setOnSeek(
      value: /* arg */ js.Object with (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = this.set("onSeek", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSeek: Self = this.set("onSeek", js.undefined)
    
    @scala.inline
    def setOnTimeChange(
      value: /* arg */ Time with (typings.gestalt.anon.Event[SyntheticEvent[HTMLVideoElement, Event]]) => Unit
    ): Self = this.set("onTimeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTimeChange: Self = this.set("onTimeChange", js.undefined)
    
    @scala.inline
    def setOnVolumeChange(
      value: /* arg */ Volume with (typings.gestalt.anon.Event[SyntheticEvent[HTMLDivElement, Event]]) => Unit
    ): Self = this.set("onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnVolumeChange: Self = this.set("onVolumeChange", js.undefined)
    
    @scala.inline
    def setPlaybackRate(value: Double): Self = this.set("playbackRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaybackRate: Self = this.set("playbackRate", js.undefined)
    
    @scala.inline
    def setPlaying(value: Boolean): Self = this.set("playing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaying: Self = this.set("playing", js.undefined)
    
    @scala.inline
    def setPlaysInline(value: Boolean): Self = this.set("playsInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaysInline: Self = this.set("playsInline", js.undefined)
    
    @scala.inline
    def setPoster(value: String): Self = this.set("poster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoster: Self = this.set("poster", js.undefined)
    
    @scala.inline
    def setPreload(value: auto | metadata | none): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
}
