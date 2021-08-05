package typings.gestalt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PulsarProps extends StObject {
  
  var paused: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
}
object PulsarProps {
  
  inline def apply(): PulsarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PulsarProps]
  }
  
  extension [Self <: PulsarProps](x: Self) {
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
