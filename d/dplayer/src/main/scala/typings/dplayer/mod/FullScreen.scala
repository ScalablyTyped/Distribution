package typings.dplayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullScreen extends StObject {
  
  def cancel(`type`: FullScreenType): Unit
  
  def request(`type`: FullScreenType): Unit
}
object FullScreen {
  
  inline def apply(cancel: FullScreenType => Unit, request: FullScreenType => Unit): FullScreen = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), request = js.Any.fromFunction1(request))
    __obj.asInstanceOf[FullScreen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FullScreen] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: FullScreenType => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    inline def setRequest(value: FullScreenType => Unit): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
  }
}
