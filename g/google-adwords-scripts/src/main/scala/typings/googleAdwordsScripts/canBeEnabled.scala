package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Extendables
trait canBeEnabled extends StObject {
  
  def enable(): Unit
  
  def isEnabled(): Boolean
  
  def isPaused(): Boolean
  
  def pause(): Unit
}
object canBeEnabled {
  
  inline def apply(enable: () => Unit, isEnabled: () => Boolean, isPaused: () => Boolean, pause: () => Unit): canBeEnabled = {
    val __obj = js.Dynamic.literal(enable = js.Any.fromFunction0(enable), isEnabled = js.Any.fromFunction0(isEnabled), isPaused = js.Any.fromFunction0(isPaused), pause = js.Any.fromFunction0(pause))
    __obj.asInstanceOf[canBeEnabled]
  }
  
  extension [Self <: canBeEnabled](x: Self) {
    
    inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setIsEnabled(value: () => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction0(value))
    
    inline def setIsPaused(value: () => Boolean): Self = StObject.set(x, "isPaused", js.Any.fromFunction0(value))
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
  }
}
