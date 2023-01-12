package typings.gifencoder

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gifencoder", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with GIFEncoder {
    def this(width: Double, height: Double) = this()
  }
  
  trait ByteArray extends StObject {
    
    var data: js.Array[Double]
    
    def getData(): Buffer
  }
  object ByteArray {
    
    inline def apply(data: js.Array[Double], getData: () => Buffer): ByteArray = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getData = js.Any.fromFunction0(getData))
      __obj.asInstanceOf[ByteArray]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ByteArray] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setGetData(value: () => Buffer): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait GIFEncoder extends StObject {
    
    def addFrame(ctx: CanvasRenderingContext2D): Unit = js.native
    
    def createReadStream(): Readable = js.native
    
    def createWriteStream(options: GIFOptions): Transform = js.native
    
    def finish(): Unit = js.native
    
    var out: ByteArray = js.native
    
    def setDelay(/** frame delay in ms */ delay: Double): Unit = js.native
    
    def setQuality(/** image quality. 10 is default */ quality: Double): Unit = js.native
    
    def setRepeat(/** 0 for repeat, -1 for no-repeat */
    repeat: Double): Unit = js.native
    
    def setTransparent(color: String): Unit = js.native
    def setTransparent(color: Double): Unit = js.native
    
    def start(): Unit = js.native
  }
  
  trait GIFOptions extends StObject {
    
    /** frame delay in ms */
    var delay: Double
    
    /** image quality. 10 is default */
    var quality: Double
    
    /** 0 for repeat, -1 for no-repeat */
    var repeat: Double
  }
  object GIFOptions {
    
    inline def apply(delay: Double, quality: Double, repeat: Double): GIFOptions = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any])
      __obj.asInstanceOf[GIFOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GIFOptions] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    }
  }
}
