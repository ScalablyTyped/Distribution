package typings.devtoolsProtocol.mod.Protocol.Animation

import typings.devtoolsProtocol.devtoolsProtocolStrings.CSSAnimation
import typings.devtoolsProtocol.devtoolsProtocolStrings.CSSTransition
import typings.devtoolsProtocol.devtoolsProtocolStrings.WebAnimation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation extends StObject {
  
  /**
    * A unique ID for `Animation` representing the sources that triggered this CSS
    * animation/transition.
    */
  var cssId: js.UndefOr[String] = js.undefined
  
  /**
    * `Animation`'s current time.
    */
  var currentTime: Double
  
  /**
    * `Animation`'s id.
    */
  var id: String
  
  /**
    * `Animation`'s name.
    */
  var name: String
  
  /**
    * `Animation`'s internal paused state.
    */
  var pausedState: Boolean
  
  /**
    * `Animation`'s play state.
    */
  var playState: String
  
  /**
    * `Animation`'s playback rate.
    */
  var playbackRate: Double
  
  /**
    * `Animation`'s source animation node.
    */
  var source: js.UndefOr[AnimationEffect] = js.undefined
  
  /**
    * `Animation`'s start time.
    */
  var startTime: Double
  
  /**
    * Animation type of `Animation`. (AnimationType enum)
    */
  var `type`: CSSTransition | CSSAnimation | WebAnimation
}
object Animation {
  
  inline def apply(
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
  
  extension [Self <: typings.devtoolsProtocol.mod.Protocol.Animation.Animation](x: Self) {
    
    inline def setCssId(value: String): Self = StObject.set(x, "cssId", value.asInstanceOf[js.Any])
    
    inline def setCssIdUndefined: Self = StObject.set(x, "cssId", js.undefined)
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPausedState(value: Boolean): Self = StObject.set(x, "pausedState", value.asInstanceOf[js.Any])
    
    inline def setPlayState(value: String): Self = StObject.set(x, "playState", value.asInstanceOf[js.Any])
    
    inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    inline def setSource(value: AnimationEffect): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setType(value: CSSTransition | CSSAnimation | WebAnimation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
