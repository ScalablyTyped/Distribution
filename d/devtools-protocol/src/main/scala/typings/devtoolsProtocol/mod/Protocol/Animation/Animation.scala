package typings.devtoolsProtocol.mod.Protocol.Animation

import typings.devtoolsProtocol.devtoolsProtocolStrings.CSSAnimation
import typings.devtoolsProtocol.devtoolsProtocolStrings.CSSTransition
import typings.devtoolsProtocol.devtoolsProtocolStrings.WebAnimation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation extends StObject {
  
  /**
    * A unique ID for `Animation` representing the sources that triggered this CSS
    * animation/transition.
    */
  var cssId: js.UndefOr[String] = js.native
  
  /**
    * `Animation`'s current time.
    */
  var currentTime: Double = js.native
  
  /**
    * `Animation`'s id.
    */
  var id: String = js.native
  
  /**
    * `Animation`'s name.
    */
  var name: String = js.native
  
  /**
    * `Animation`'s internal paused state.
    */
  var pausedState: Boolean = js.native
  
  /**
    * `Animation`'s play state.
    */
  var playState: String = js.native
  
  /**
    * `Animation`'s playback rate.
    */
  var playbackRate: Double = js.native
  
  /**
    * `Animation`'s source animation node.
    */
  var source: js.UndefOr[AnimationEffect] = js.native
  
  /**
    * `Animation`'s start time.
    */
  var startTime: Double = js.native
  
  /**
    * Animation type of `Animation`. (AnimationType enum)
    */
  var `type`: CSSTransition | CSSAnimation | WebAnimation = js.native
}
object Animation {
  
  @scala.inline
  def apply(
    currentTime: Double,
    id: String,
    name: String,
    pausedState: Boolean,
    playState: String,
    playbackRate: Double,
    startTime: Double,
    `type`: CSSTransition | CSSAnimation | WebAnimation
  ): typings.devtoolsProtocol.mod.Protocol.Animation.Animation = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pausedState = pausedState.asInstanceOf[js.Any], playState = playState.asInstanceOf[js.Any], playbackRate = playbackRate.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.devtoolsProtocol.mod.Protocol.Animation.Animation]
  }
  
  @scala.inline
  implicit class AnimationMutableBuilder[Self <: typings.devtoolsProtocol.mod.Protocol.Animation.Animation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCssId(value: String): Self = StObject.set(x, "cssId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssIdUndefined: Self = StObject.set(x, "cssId", js.undefined)
    
    @scala.inline
    def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPausedState(value: Boolean): Self = StObject.set(x, "pausedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayState(value: String): Self = StObject.set(x, "playState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: AnimationEffect): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CSSTransition | CSSAnimation | WebAnimation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
