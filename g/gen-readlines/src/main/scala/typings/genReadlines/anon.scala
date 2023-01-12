package typings.genReadlines

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BufferSize extends StObject {
    
    var bufferSize: js.UndefOr[Double] = js.undefined
    
    var maxLineLength: js.UndefOr[Double] = js.undefined
    
    var position: js.UndefOr[Double] = js.undefined
  }
  object BufferSize {
    
    inline def apply(): BufferSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BufferSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BufferSize] (val x: Self) extends AnyVal {
      
      inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      inline def setMaxLineLength(value: Double): Self = StObject.set(x, "maxLineLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLineLengthUndefined: Self = StObject.set(x, "maxLineLength", js.undefined)
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  trait MaxLineLength extends StObject {
    
    var bufferSize: js.UndefOr[Double] = js.undefined
    
    var maxLineLength: js.UndefOr[Double] = js.undefined
  }
  object MaxLineLength {
    
    inline def apply(): MaxLineLength = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxLineLength]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaxLineLength] (val x: Self) extends AnyVal {
      
      inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      inline def setMaxLineLength(value: Double): Self = StObject.set(x, "maxLineLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLineLengthUndefined: Self = StObject.set(x, "maxLineLength", js.undefined)
    }
  }
}
