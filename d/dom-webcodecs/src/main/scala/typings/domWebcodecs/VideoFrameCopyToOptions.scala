package typings.domWebcodecs

import typings.std.DOMRectInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoFrameCopyToOptions extends StObject {
  
  var layout: js.UndefOr[js.Array[PlaneLayout]] = js.undefined
  
  var rect: js.UndefOr[DOMRectInit] = js.undefined
}
object VideoFrameCopyToOptions {
  
  inline def apply(): VideoFrameCopyToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoFrameCopyToOptions]
  }
  
  extension [Self <: VideoFrameCopyToOptions](x: Self) {
    
    inline def setLayout(value: js.Array[PlaneLayout]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLayoutVarargs(value: PlaneLayout*): Self = StObject.set(x, "layout", js.Array(value*))
    
    inline def setRect(value: DOMRectInit): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
  }
}
