package typings.easeljs.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonHelper extends StObject {
  
  // properties
  var downLabel: String | Double
  
  var enabled: Boolean
  
  /**
    * @deprecated - use the 'enabled' property instead
    */
  def getEnabled(): Boolean
  
  var outLabel: String | Double
  
  var overLabel: String | Double
  
  var play: Boolean
  
  // methods
  /**
    * @deprecated - use the 'enabled' property instead
    */
  def setEnabled(value: Boolean): Unit
  
  var target: MovieClip | Sprite
}
object ButtonHelper {
  
  inline def apply(
    downLabel: String | Double,
    enabled: Boolean,
    getEnabled: () => Boolean,
    outLabel: String | Double,
    overLabel: String | Double,
    play: Boolean,
    setEnabled: Boolean => Unit,
    target: MovieClip | Sprite
  ): ButtonHelper = {
    val __obj = js.Dynamic.literal(downLabel = downLabel.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], getEnabled = js.Any.fromFunction0(getEnabled), outLabel = outLabel.asInstanceOf[js.Any], overLabel = overLabel.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], setEnabled = js.Any.fromFunction1(setEnabled), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonHelper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonHelper] (val x: Self) extends AnyVal {
    
    inline def setDownLabel(value: String | Double): Self = StObject.set(x, "downLabel", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setGetEnabled(value: () => Boolean): Self = StObject.set(x, "getEnabled", js.Any.fromFunction0(value))
    
    inline def setOutLabel(value: String | Double): Self = StObject.set(x, "outLabel", value.asInstanceOf[js.Any])
    
    inline def setOverLabel(value: String | Double): Self = StObject.set(x, "overLabel", value.asInstanceOf[js.Any])
    
    inline def setPlay(value: Boolean): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
    
    inline def setSetEnabled(value: Boolean => Unit): Self = StObject.set(x, "setEnabled", js.Any.fromFunction1(value))
    
    inline def setTarget(value: MovieClip | Sprite): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
