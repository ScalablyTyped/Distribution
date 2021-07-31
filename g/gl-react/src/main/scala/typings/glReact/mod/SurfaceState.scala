package typings.glReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SurfaceState extends StObject {
  
  var debug: Boolean
  
  var ready: Boolean
  
  var rebootId: Double
}
object SurfaceState {
  
  @scala.inline
  def apply(debug: Boolean, ready: Boolean, rebootId: Double): SurfaceState = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], rebootId = rebootId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceState]
  }
  
  @scala.inline
  implicit class SurfaceStateMutableBuilder[Self <: SurfaceState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRebootId(value: Double): Self = StObject.set(x, "rebootId", value.asInstanceOf[js.Any])
  }
}
