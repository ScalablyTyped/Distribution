package typings.firefoxWebextBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndOffset extends StObject {
  
  var endOffset: Double
  
  var endTextNodePos: Double
  
  var framePos: Double
  
  var startOffset: Double
  
  var startTextNodePos: Double
}
object EndOffset {
  
  inline def apply(
    endOffset: Double,
    endTextNodePos: Double,
    framePos: Double,
    startOffset: Double,
    startTextNodePos: Double
  ): EndOffset = {
    val __obj = js.Dynamic.literal(endOffset = endOffset.asInstanceOf[js.Any], endTextNodePos = endTextNodePos.asInstanceOf[js.Any], framePos = framePos.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], startTextNodePos = startTextNodePos.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndOffset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndOffset] (val x: Self) extends AnyVal {
    
    inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setEndTextNodePos(value: Double): Self = StObject.set(x, "endTextNodePos", value.asInstanceOf[js.Any])
    
    inline def setFramePos(value: Double): Self = StObject.set(x, "framePos", value.asInstanceOf[js.Any])
    
    inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setStartTextNodePos(value: Double): Self = StObject.set(x, "startTextNodePos", value.asInstanceOf[js.Any])
  }
}
