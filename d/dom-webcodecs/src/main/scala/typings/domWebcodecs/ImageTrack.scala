package typings.domWebcodecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageTrack extends StObject {
  
  val animated: Boolean
  
  val frameCount: Double
  
  val repetitionCount: Double
  
  var selected: Boolean
}
object ImageTrack {
  
  inline def apply(animated: Boolean, frameCount: Double, repetitionCount: Double, selected: Boolean): ImageTrack = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any], frameCount = frameCount.asInstanceOf[js.Any], repetitionCount = repetitionCount.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageTrack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageTrack] (val x: Self) extends AnyVal {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setFrameCount(value: Double): Self = StObject.set(x, "frameCount", value.asInstanceOf[js.Any])
    
    inline def setRepetitionCount(value: Double): Self = StObject.set(x, "repetitionCount", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
