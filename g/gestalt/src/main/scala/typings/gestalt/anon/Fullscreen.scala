package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fullscreen extends StObject {
  
  var fullscreen: Boolean
}
object Fullscreen {
  
  inline def apply(fullscreen: Boolean): Fullscreen = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fullscreen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fullscreen] (val x: Self) extends AnyVal {
    
    inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
  }
}
