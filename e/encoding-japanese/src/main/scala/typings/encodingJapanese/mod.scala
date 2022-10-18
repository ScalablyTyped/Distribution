package typings.encodingJapanese

import typings.encodingJapanese.encodingJapaneseStrings.`html-entity-hex`
import typings.encodingJapanese.encodingJapaneseStrings.`html-entity`
import typings.encodingJapanese.encodingJapaneseStrings.array
import typings.encodingJapanese.encodingJapaneseStrings.arraybuffer
import typings.encodingJapanese.encodingJapaneseStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("encoding-japanese", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def base64Decode(data: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Decode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def base64Encode(data: IntArrayType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Encode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def codeToString(data: IntArrayType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("codeToString")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def convert(data: String, options: ConvertArrayBufferOptions): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
  inline def convert(data: String, options: ConvertArrayOptions): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def convert(data: String, options: ConvertStringOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convert(data: String, options: ConvertUnknownOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convert(data: String, to: Encoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convert(data: String, to: Encoding, from: Encoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], to.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convert(data: IntArrayType, options: ConvertArrayBufferOptions): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
  inline def convert(data: IntArrayType, options: ConvertArrayOptions): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def convert(data: IntArrayType, options: ConvertStringOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convert(data: IntArrayType, options: ConvertUnknownOptions): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def convert(data: IntArrayType, to: Encoding): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def convert(data: IntArrayType, to: Encoding, from: Encoding): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], to.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def detect(data: String): EncodingDetection = ^.asInstanceOf[js.Dynamic].applyDynamic("detect")(data.asInstanceOf[js.Any]).asInstanceOf[EncodingDetection]
  inline def detect(data: String, encodings: js.Array[Encoding]): EncodingDetection = (^.asInstanceOf[js.Dynamic].applyDynamic("detect")(data.asInstanceOf[js.Any], encodings.asInstanceOf[js.Any])).asInstanceOf[EncodingDetection]
  inline def detect(data: String, encodings: Encoding): EncodingDetection = (^.asInstanceOf[js.Dynamic].applyDynamic("detect")(data.asInstanceOf[js.Any], encodings.asInstanceOf[js.Any])).asInstanceOf[EncodingDetection]
  inline def detect(data: IntArrayType): EncodingDetection = ^.asInstanceOf[js.Dynamic].applyDynamic("detect")(data.asInstanceOf[js.Any]).asInstanceOf[EncodingDetection]
  inline def detect(data: IntArrayType, encodings: js.Array[Encoding]): EncodingDetection = (^.asInstanceOf[js.Dynamic].applyDynamic("detect")(data.asInstanceOf[js.Any], encodings.asInstanceOf[js.Any])).asInstanceOf[EncodingDetection]
  inline def detect(data: IntArrayType, encodings: Encoding): EncodingDetection = (^.asInstanceOf[js.Dynamic].applyDynamic("detect")(data.asInstanceOf[js.Any], encodings.asInstanceOf[js.Any])).asInstanceOf[EncodingDetection]
  
  @JSImport("encoding-japanese", "orders")
  @js.native
  val orders: js.Array[String] = js.native
  
  inline def stringToCode(data: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToCode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def toHankakuCase(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHankakuCase")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toHankakuCase(data: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toHankakuCase")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def toHankakuSpace(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHankakuSpace")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toHankakuSpace(data: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toHankakuSpace")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def toHankanaCase(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHankanaCase")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toHankanaCase(data: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toHankanaCase")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def toHiraganaCase(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHiraganaCase")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toHiraganaCase(data: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toHiraganaCase")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def toKatakanaCase(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toKatakanaCase")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toKatakanaCase(data: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toKatakanaCase")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def toZenkakuCase(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toZenkakuCase")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toZenkakuCase(data: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toZenkakuCase")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def toZenkakuSpace(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toZenkakuSpace")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toZenkakuSpace(data: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toZenkakuSpace")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def toZenkanaCase(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toZenkanaCase")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toZenkanaCase(data: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toZenkanaCase")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def urlDecode(data: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("urlDecode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def urlEncode(data: IntArrayType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlEncode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("encoding-japanese", "version")
  @js.native
  val version: String = js.native
  
  trait ConvertArrayBufferOptions
    extends StObject
       with ConvertOptions {
    
    var bom: js.UndefOr[Boolean | String] = js.undefined
    
    var fallback: js.UndefOr[`html-entity` | `html-entity-hex`] = js.undefined
    
    var from: js.UndefOr[Encoding] = js.undefined
    
    var to: Encoding
    
    var `type`: arraybuffer
  }
  object ConvertArrayBufferOptions {
    
    inline def apply(to: Encoding): ConvertArrayBufferOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("arraybuffer")
      __obj.asInstanceOf[ConvertArrayBufferOptions]
    }
    
    extension [Self <: ConvertArrayBufferOptions](x: Self) {
      
      inline def setBom(value: Boolean | String): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      inline def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      inline def setFallback(value: `html-entity` | `html-entity-hex`): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setFrom(value: Encoding): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(value: Encoding): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setType(value: arraybuffer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConvertArrayOptions
    extends StObject
       with ConvertOptions {
    
    var bom: js.UndefOr[Boolean | String] = js.undefined
    
    var fallback: js.UndefOr[`html-entity` | `html-entity-hex`] = js.undefined
    
    var from: js.UndefOr[Encoding] = js.undefined
    
    var to: Encoding
    
    var `type`: array
  }
  object ConvertArrayOptions {
    
    inline def apply(to: Encoding): ConvertArrayOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("array")
      __obj.asInstanceOf[ConvertArrayOptions]
    }
    
    extension [Self <: ConvertArrayOptions](x: Self) {
      
      inline def setBom(value: Boolean | String): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      inline def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      inline def setFallback(value: `html-entity` | `html-entity-hex`): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setFrom(value: Encoding): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(value: Encoding): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.encodingJapanese.mod.ConvertStringOptions
    - typings.encodingJapanese.mod.ConvertArrayBufferOptions
    - typings.encodingJapanese.mod.ConvertArrayOptions
    - typings.encodingJapanese.mod.ConvertUnknownOptions
  */
  trait ConvertOptions extends StObject
  object ConvertOptions {
    
    inline def ConvertArrayBufferOptions(to: Encoding): typings.encodingJapanese.mod.ConvertArrayBufferOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("arraybuffer")
      __obj.asInstanceOf[typings.encodingJapanese.mod.ConvertArrayBufferOptions]
    }
    
    inline def ConvertArrayOptions(to: Encoding): typings.encodingJapanese.mod.ConvertArrayOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("array")
      __obj.asInstanceOf[typings.encodingJapanese.mod.ConvertArrayOptions]
    }
    
    inline def ConvertStringOptions(to: Encoding): typings.encodingJapanese.mod.ConvertStringOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[typings.encodingJapanese.mod.ConvertStringOptions]
    }
    
    inline def ConvertUnknownOptions(to: Encoding): typings.encodingJapanese.mod.ConvertUnknownOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.encodingJapanese.mod.ConvertUnknownOptions]
    }
  }
  
  trait ConvertStringOptions
    extends StObject
       with ConvertOptions {
    
    var bom: js.UndefOr[Boolean | String] = js.undefined
    
    var fallback: js.UndefOr[`html-entity` | `html-entity-hex`] = js.undefined
    
    var from: js.UndefOr[Encoding] = js.undefined
    
    var to: Encoding
    
    var `type`: string
  }
  object ConvertStringOptions {
    
    inline def apply(to: Encoding): ConvertStringOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[ConvertStringOptions]
    }
    
    extension [Self <: ConvertStringOptions](x: Self) {
      
      inline def setBom(value: Boolean | String): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      inline def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      inline def setFallback(value: `html-entity` | `html-entity-hex`): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setFrom(value: Encoding): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(value: Encoding): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConvertUnknownOptions
    extends StObject
       with ConvertOptions {
    
    var bom: js.UndefOr[Boolean | String] = js.undefined
    
    var fallback: js.UndefOr[`html-entity` | `html-entity-hex`] = js.undefined
    
    var from: js.UndefOr[Encoding] = js.undefined
    
    var to: Encoding
  }
  object ConvertUnknownOptions {
    
    inline def apply(to: Encoding): ConvertUnknownOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertUnknownOptions]
    }
    
    extension [Self <: ConvertUnknownOptions](x: Self) {
      
      inline def setBom(value: Boolean | String): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      inline def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      inline def setFallback(value: `html-entity` | `html-entity-hex`): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setFrom(value: Encoding): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(value: Encoding): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.encodingJapanese.encodingJapaneseStrings.UTF32
    - typings.encodingJapanese.encodingJapaneseStrings.UTF16
    - typings.encodingJapanese.encodingJapaneseStrings.UTF16BE
    - typings.encodingJapanese.encodingJapaneseStrings.UTF16LE
    - typings.encodingJapanese.encodingJapaneseStrings.BINARY
    - typings.encodingJapanese.encodingJapaneseStrings.ASCII
    - typings.encodingJapanese.encodingJapaneseStrings.JIS
    - typings.encodingJapanese.encodingJapaneseStrings.UTF8
    - typings.encodingJapanese.encodingJapaneseStrings.EUCJP
    - typings.encodingJapanese.encodingJapaneseStrings.SJIS
    - typings.encodingJapanese.encodingJapaneseStrings.UNICODE
    - typings.encodingJapanese.encodingJapaneseStrings.AUTO
  */
  trait Encoding extends StObject
  object Encoding {
    
    inline def ASCII: typings.encodingJapanese.encodingJapaneseStrings.ASCII = "ASCII".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.ASCII]
    
    inline def AUTO: typings.encodingJapanese.encodingJapaneseStrings.AUTO = "AUTO".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.AUTO]
    
    inline def BINARY: typings.encodingJapanese.encodingJapaneseStrings.BINARY = "BINARY".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.BINARY]
    
    inline def EUCJP: typings.encodingJapanese.encodingJapaneseStrings.EUCJP = "EUCJP".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.EUCJP]
    
    inline def JIS: typings.encodingJapanese.encodingJapaneseStrings.JIS = "JIS".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.JIS]
    
    inline def SJIS: typings.encodingJapanese.encodingJapaneseStrings.SJIS = "SJIS".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.SJIS]
    
    inline def UNICODE: typings.encodingJapanese.encodingJapaneseStrings.UNICODE = "UNICODE".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UNICODE]
    
    inline def UTF16: typings.encodingJapanese.encodingJapaneseStrings.UTF16 = "UTF16".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UTF16]
    
    inline def UTF16BE: typings.encodingJapanese.encodingJapaneseStrings.UTF16BE = "UTF16BE".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UTF16BE]
    
    inline def UTF16LE: typings.encodingJapanese.encodingJapaneseStrings.UTF16LE = "UTF16LE".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UTF16LE]
    
    inline def UTF32: typings.encodingJapanese.encodingJapaneseStrings.UTF32 = "UTF32".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UTF32]
    
    inline def UTF8: typings.encodingJapanese.encodingJapaneseStrings.UTF8 = "UTF8".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UTF8]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.encodingJapanese.encodingJapaneseBooleans.`false`
    - typings.encodingJapanese.encodingJapaneseStrings.UTF32
    - typings.encodingJapanese.encodingJapaneseStrings.UTF16
    - typings.encodingJapanese.encodingJapaneseStrings.UTF16BE
    - typings.encodingJapanese.encodingJapaneseStrings.UTF16LE
    - typings.encodingJapanese.encodingJapaneseStrings.BINARY
    - typings.encodingJapanese.encodingJapaneseStrings.ASCII
    - typings.encodingJapanese.encodingJapaneseStrings.JIS
    - typings.encodingJapanese.encodingJapaneseStrings.UTF8
    - typings.encodingJapanese.encodingJapaneseStrings.EUCJP
    - typings.encodingJapanese.encodingJapaneseStrings.SJIS
    - typings.encodingJapanese.encodingJapaneseStrings.UNICODE
    - typings.encodingJapanese.encodingJapaneseStrings.AUTO
  */
  trait EncodingDetection extends StObject
  object EncodingDetection {
    
    inline def ASCII: typings.encodingJapanese.encodingJapaneseStrings.ASCII = "ASCII".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.ASCII]
    
    inline def AUTO: typings.encodingJapanese.encodingJapaneseStrings.AUTO = "AUTO".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.AUTO]
    
    inline def BINARY: typings.encodingJapanese.encodingJapaneseStrings.BINARY = "BINARY".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.BINARY]
    
    inline def EUCJP: typings.encodingJapanese.encodingJapaneseStrings.EUCJP = "EUCJP".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.EUCJP]
    
    inline def JIS: typings.encodingJapanese.encodingJapaneseStrings.JIS = "JIS".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.JIS]
    
    inline def SJIS: typings.encodingJapanese.encodingJapaneseStrings.SJIS = "SJIS".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.SJIS]
    
    inline def UNICODE: typings.encodingJapanese.encodingJapaneseStrings.UNICODE = "UNICODE".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UNICODE]
    
    inline def UTF16: typings.encodingJapanese.encodingJapaneseStrings.UTF16 = "UTF16".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UTF16]
    
    inline def UTF16BE: typings.encodingJapanese.encodingJapaneseStrings.UTF16BE = "UTF16BE".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UTF16BE]
    
    inline def UTF16LE: typings.encodingJapanese.encodingJapaneseStrings.UTF16LE = "UTF16LE".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UTF16LE]
    
    inline def UTF32: typings.encodingJapanese.encodingJapaneseStrings.UTF32 = "UTF32".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UTF32]
    
    inline def UTF8: typings.encodingJapanese.encodingJapaneseStrings.UTF8 = "UTF8".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UTF8]
    
    inline def `false`: typings.encodingJapanese.encodingJapaneseBooleans.`false` = false.asInstanceOf[typings.encodingJapanese.encodingJapaneseBooleans.`false`]
  }
  
  type IntArrayType = js.Array[Double] | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array
}
