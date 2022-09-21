package typings.dirCompare

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferPoolMod {
  
  @JSImport("dir-compare/build/src/FileSystem/BufferPool", "BufferPool")
  @js.native
  open class BufferPool protected () extends StObject {
    /**
      *
      * @param bufSize Size of each buffer.
      * @param bufNo Number of buffers. Caller has to make sure no more than bufNo async processes run simultaneously.
      */
    def this(bufSize: Double, bufNo: Double) = this()
    
    def allocateBuffers(): BufferPair = js.native
    
    /* private */ val bufNo: Any = js.native
    
    /* private */ val bufSize: Any = js.native
    
    /* private */ val bufferPool: Any = js.native
    
    def freeBuffers(bufferPair: BufferPair): Unit = js.native
  }
  
  trait BufferPair extends StObject {
    
    var buf1: Buffer
    
    var buf2: Buffer
    
    var busy: Boolean
  }
  object BufferPair {
    
    inline def apply(buf1: Buffer, buf2: Buffer, busy: Boolean): BufferPair = {
      val __obj = js.Dynamic.literal(buf1 = buf1.asInstanceOf[js.Any], buf2 = buf2.asInstanceOf[js.Any], busy = busy.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferPair]
    }
    
    extension [Self <: BufferPair](x: Self) {
      
      inline def setBuf1(value: Buffer): Self = StObject.set(x, "buf1", value.asInstanceOf[js.Any])
      
      inline def setBuf2(value: Buffer): Self = StObject.set(x, "buf2", value.asInstanceOf[js.Any])
      
      inline def setBusy(value: Boolean): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
    }
  }
}
