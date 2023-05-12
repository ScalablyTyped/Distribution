package typings.dragControls.anon

import typings.std.AudioContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAudioContext extends StObject {
  
  /**
    * Return the value of the variable `context` in the outer scope, if defined, otherwise set it to a new {@link https://developer.mozilla.org/en-US/docs/Web/API/AudioContext | AudioContext}.
    */
  def getContext(): AudioContext
  
  /**
    * Set the variable `context` in the outer scope to `value`.
    * @param value
    */
  def setContext(context: AudioContext): Unit
}
object TypeofAudioContext {
  
  inline def apply(getContext: () => AudioContext, setContext: AudioContext => Unit): TypeofAudioContext = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), setContext = js.Any.fromFunction1(setContext))
    __obj.asInstanceOf[TypeofAudioContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofAudioContext] (val x: Self) extends AnyVal {
    
    inline def setGetContext(value: () => AudioContext): Self = StObject.set(x, "getContext", js.Any.fromFunction0(value))
    
    inline def setSetContext(value: AudioContext => Unit): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
  }
}
