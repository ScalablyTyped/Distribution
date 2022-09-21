package typings.domWebcodecs

import typings.std.DOMRectInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoFrameBufferInit extends StObject {
  
  var codedHeight: Double
  
  var codedWidth: Double
  
  var colorSpace: js.UndefOr[VideoColorSpaceInit] = js.undefined
  
  var displayHeight: js.UndefOr[Double] = js.undefined
  
  var displayWidth: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var format: VideoPixelFormat
  
  var layout: js.UndefOr[js.Array[PlaneLayout]] = js.undefined
  
  var timestamp: Double
  
  var visibleRect: js.UndefOr[DOMRectInit] = js.undefined
}
object VideoFrameBufferInit {
  
  inline def apply(codedHeight: Double, codedWidth: Double, format: VideoPixelFormat, timestamp: Double): VideoFrameBufferInit = {
    val __obj = js.Dynamic.literal(codedHeight = codedHeight.asInstanceOf[js.Any], codedWidth = codedWidth.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFrameBufferInit]
  }
  
  extension [Self <: VideoFrameBufferInit](x: Self) {
    
    inline def setCodedHeight(value: Double): Self = StObject.set(x, "codedHeight", value.asInstanceOf[js.Any])
    
    inline def setCodedWidth(value: Double): Self = StObject.set(x, "codedWidth", value.asInstanceOf[js.Any])
    
    inline def setColorSpace(value: VideoColorSpaceInit): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
    
    inline def setDisplayHeight(value: Double): Self = StObject.set(x, "displayHeight", value.asInstanceOf[js.Any])
    
    inline def setDisplayHeightUndefined: Self = StObject.set(x, "displayHeight", js.undefined)
    
    inline def setDisplayWidth(value: Double): Self = StObject.set(x, "displayWidth", value.asInstanceOf[js.Any])
    
    inline def setDisplayWidthUndefined: Self = StObject.set(x, "displayWidth", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFormat(value: VideoPixelFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: js.Array[PlaneLayout]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLayoutVarargs(value: PlaneLayout*): Self = StObject.set(x, "layout", js.Array(value*))
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setVisibleRect(value: DOMRectInit): Self = StObject.set(x, "visibleRect", value.asInstanceOf[js.Any])
    
    inline def setVisibleRectUndefined: Self = StObject.set(x, "visibleRect", js.undefined)
  }
}
