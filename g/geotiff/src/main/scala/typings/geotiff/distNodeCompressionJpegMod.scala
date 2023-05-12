package typings.geotiff

import typings.geotiff.anon.DensityUnits
import typings.geotiff.anon.Flags0
import typings.std.ArrayBufferLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeCompressionJpegMod {
  
  @JSImport("geotiff/dist-node/compression/jpeg", JSImport.Default)
  @js.native
  open class default protected () extends JpegDecoder {
    def this(fileDirectory: Any) = this()
  }
  
  @js.native
  trait JpegDecoder
    extends typings.geotiff.distNodeCompressionBasedecoderMod.default {
    
    def decodeBlock(buffer: Any): ArrayBufferLike = js.native
    
    var reader: JpegStreamReader = js.native
  }
  
  trait JpegStreamReader extends StObject {
    
    var adobe: Flags0 | Null
    
    var frames: js.UndefOr[js.Array[Any]] = js.undefined
    
    def getResult(): js.typedarray.Uint8Array
    
    var huffmanTablesAC: js.Array[Any]
    
    var huffmanTablesDC: js.Array[Any]
    
    var jfif: DensityUnits | Null
    
    def parse(data: Any): Unit
    
    var quantizationTables: js.Array[Any]
    
    def resetFrames(): Unit
    
    var resetInterval: js.UndefOr[Double] = js.undefined
  }
  object JpegStreamReader {
    
    inline def apply(
      getResult: () => js.typedarray.Uint8Array,
      huffmanTablesAC: js.Array[Any],
      huffmanTablesDC: js.Array[Any],
      parse: Any => Unit,
      quantizationTables: js.Array[Any],
      resetFrames: () => Unit
    ): JpegStreamReader = {
      val __obj = js.Dynamic.literal(getResult = js.Any.fromFunction0(getResult), huffmanTablesAC = huffmanTablesAC.asInstanceOf[js.Any], huffmanTablesDC = huffmanTablesDC.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), quantizationTables = quantizationTables.asInstanceOf[js.Any], resetFrames = js.Any.fromFunction0(resetFrames), adobe = null, jfif = null)
      __obj.asInstanceOf[JpegStreamReader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JpegStreamReader] (val x: Self) extends AnyVal {
      
      inline def setAdobe(value: Flags0): Self = StObject.set(x, "adobe", value.asInstanceOf[js.Any])
      
      inline def setAdobeNull: Self = StObject.set(x, "adobe", null)
      
      inline def setFrames(value: js.Array[Any]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
      
      inline def setFramesVarargs(value: Any*): Self = StObject.set(x, "frames", js.Array(value*))
      
      inline def setGetResult(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "getResult", js.Any.fromFunction0(value))
      
      inline def setHuffmanTablesAC(value: js.Array[Any]): Self = StObject.set(x, "huffmanTablesAC", value.asInstanceOf[js.Any])
      
      inline def setHuffmanTablesACVarargs(value: Any*): Self = StObject.set(x, "huffmanTablesAC", js.Array(value*))
      
      inline def setHuffmanTablesDC(value: js.Array[Any]): Self = StObject.set(x, "huffmanTablesDC", value.asInstanceOf[js.Any])
      
      inline def setHuffmanTablesDCVarargs(value: Any*): Self = StObject.set(x, "huffmanTablesDC", js.Array(value*))
      
      inline def setJfif(value: DensityUnits): Self = StObject.set(x, "jfif", value.asInstanceOf[js.Any])
      
      inline def setJfifNull: Self = StObject.set(x, "jfif", null)
      
      inline def setParse(value: Any => Unit): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setQuantizationTables(value: js.Array[Any]): Self = StObject.set(x, "quantizationTables", value.asInstanceOf[js.Any])
      
      inline def setQuantizationTablesVarargs(value: Any*): Self = StObject.set(x, "quantizationTables", js.Array(value*))
      
      inline def setResetFrames(value: () => Unit): Self = StObject.set(x, "resetFrames", js.Any.fromFunction0(value))
      
      inline def setResetInterval(value: Double): Self = StObject.set(x, "resetInterval", value.asInstanceOf[js.Any])
      
      inline def setResetIntervalUndefined: Self = StObject.set(x, "resetInterval", js.undefined)
    }
  }
}
