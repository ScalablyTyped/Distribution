package typings.fastestsmallesttextencoderdecoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fastestsmallesttextencoderdecoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fastestsmallesttextencoderdecoder", "TextDecoder")
  @js.native
  open class TextDecoder () extends StObject {
    
    /**
      * https://developer.mozilla.org/en-US/docs/Web/API/TextDecoder/decode
      */
    def decode(): String = js.native
    def decode(binary: Unit, options: DecodeOptions): String = js.native
    def decode(binary: Binary): String = js.native
    def decode(binary: Binary, options: DecodeOptions): String = js.native
  }
  
  @JSImport("fastestsmallesttextencoderdecoder", "TextEncoder")
  @js.native
  open class TextEncoder () extends StObject {
    
    /**
      * https://developer.mozilla.org/en-US/docs/Web/API/TextEncoder/encode
      */
    def encode(text: String): js.typedarray.Uint8Array = js.native
    
    /**
      * https://developer.mozilla.org/en-US/docs/Web/API/TextEncoder/encodeInto
      */
    def encodeInfo(text: String, array: js.typedarray.Uint8Array): EncodingProgress = js.native
  }
  
  inline def decode(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")().asInstanceOf[String]
  inline def decode(binary: Unit, options: DecodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(binary.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def decode(binary: Binary): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(binary.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decode(binary: Binary, options: DecodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(binary.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encode(text: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(text.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  type Binary = js.typedarray.ArrayBuffer | js.typedarray.Uint8Array | js.typedarray.DataView
  
  trait DecodeOptions extends StObject {
    
    var stream: js.UndefOr[Boolean] = js.undefined
  }
  object DecodeOptions {
    
    inline def apply(): DecodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecodeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecodeOptions] (val x: Self) extends AnyVal {
      
      inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
  
  trait EncodingProgress extends StObject {
    
    // The number of UTF-16 units of code from the source that has been converted over to UTF-8. This may be less than
    // text.length if Uint8Array did not have enough space.
    var read: Double
    
    // The number of bytes modified in the destination Uint8Array. The bytes written are guaranteed to form complete
    // UTF-8 byte sequences.
    var written: Double
  }
  object EncodingProgress {
    
    inline def apply(read: Double, written: Double): EncodingProgress = {
      val __obj = js.Dynamic.literal(read = read.asInstanceOf[js.Any], written = written.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodingProgress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncodingProgress] (val x: Self) extends AnyVal {
      
      inline def setRead(value: Double): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setWritten(value: Double): Self = StObject.set(x, "written", value.asInstanceOf[js.Any])
    }
  }
}
