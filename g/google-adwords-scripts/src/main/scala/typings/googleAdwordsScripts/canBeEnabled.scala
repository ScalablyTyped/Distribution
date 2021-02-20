package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Extendables
@js.native
trait canBeEnabled extends StObject {
  
  def enable(): Unit = js.native
  
  def isEnabled(): Boolean = js.native
  
  def isPaused(): Boolean = js.native
  
  def pause(): Unit = js.native
}
object canBeEnabled {
  
  @scala.inline
  def apply(enable: () => Unit, isEnabled: () => Boolean, isPaused: () => Boolean, pause: () => Unit): canBeEnabled = {
    val __obj = js.Dynamic.literal(enable = js.Any.fromFunction0(enable), isEnabled = js.Any.fromFunction0(isEnabled), isPaused = js.Any.fromFunction0(isPaused), pause = js.Any.fromFunction0(pause))
    __obj.asInstanceOf[canBeEnabled]
  }
  
  @scala.inline
  implicit class canBeEnabledMutableBuilder[Self <: canBeEnabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEnabled(value: () => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsPaused(value: () => Boolean): Self = StObject.set(x, "isPaused", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
  }
}
