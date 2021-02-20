package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fullscreen extends StObject {
  
  var fullscreen: Boolean = js.native
}
object Fullscreen {
  
  @scala.inline
  def apply(fullscreen: Boolean): Fullscreen = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fullscreen]
  }
  
  @scala.inline
  implicit class FullscreenMutableBuilder[Self <: Fullscreen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
  }
}
