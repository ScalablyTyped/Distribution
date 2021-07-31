package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Volume extends StObject {
  
  var volume: Double
}
object Volume {
  
  @scala.inline
  def apply(volume: Double): Volume = {
    val __obj = js.Dynamic.literal(volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volume]
  }
  
  @scala.inline
  implicit class VolumeMutableBuilder[Self <: Volume] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
