package typings.easyXapiSupertest.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferSize extends StObject {
  
  var bufferSize: js.UndefOr[Double] = js.undefined
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var fd: js.UndefOr[String] = js.undefined
  
  var flags: js.UndefOr[String] = js.undefined
  
  var mode: js.UndefOr[Double] = js.undefined
}
object BufferSize {
  
  @scala.inline
  def apply(): BufferSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferSize]
  }
  
  @scala.inline
  implicit class BufferSizeMutableBuilder[Self <: BufferSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFd(value: String): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
    
    @scala.inline
    def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
