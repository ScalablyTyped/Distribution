package typings.encodingJapanese

import typings.encodingJapanese.mod.ConvertArrayBufferOptions
import typings.encodingJapanese.mod.ConvertArrayOptions
import typings.encodingJapanese.mod.ConvertStringOptions
import typings.encodingJapanese.mod.ConvertUnknownOptions
import typings.encodingJapanese.mod.EncodingDetection
import typings.encodingJapanese.mod.IntArrayType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Encoding {
    
    @JSGlobal("Encoding")
    @js.native
    val ^ : js.Any = js.native
    
    inline def base64Decode(data: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Decode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    
    inline def base64Encode(data: IntArrayType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Encode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def codeToString(data: IntArrayType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("codeToString")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def convert(data: String, options: ConvertArrayBufferOptions): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
    inline def convert(data: String, options: ConvertArrayOptions): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def convert(data: String, options: ConvertStringOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(data: String, options: ConvertUnknownOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(data: String, to: typings.encodingJapanese.mod.Encoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(
      data: String,
      to: typings.encodingJapanese.mod.Encoding,
      from: typings.encodingJapanese.mod.Encoding
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], to.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(data: IntArrayType, options: ConvertArrayBufferOptions): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
    inline def convert(data: IntArrayType, options: ConvertArrayOptions): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def convert(data: IntArrayType, options: ConvertStringOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(data: IntArrayType, options: ConvertUnknownOptions): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def convert(data: IntArrayType, to: typings.encodingJapanese.mod.Encoding): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def convert(
      data: IntArrayType,
      to: typings.encodingJapanese.mod.Encoding,
      from: typings.encodingJapanese.mod.Encoding
    ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], to.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def detect(data: String): EncodingDetection = ^.asInstanceOf[js.Dynamic].applyDynamic("detect")(data.asInstanceOf[js.Any]).asInstanceOf[EncodingDetection]
    inline def detect(data: String, encodings: js.Array[typings.encodingJapanese.mod.Encoding]): EncodingDetection = (^.asInstanceOf[js.Dynamic].applyDynamic("detect")(data.asInstanceOf[js.Any], encodings.asInstanceOf[js.Any])).asInstanceOf[EncodingDetection]
    inline def detect(data: String, encodings: typings.encodingJapanese.mod.Encoding): EncodingDetection = (^.asInstanceOf[js.Dynamic].applyDynamic("detect")(data.asInstanceOf[js.Any], encodings.asInstanceOf[js.Any])).asInstanceOf[EncodingDetection]
    inline def detect(data: IntArrayType): EncodingDetection = ^.asInstanceOf[js.Dynamic].applyDynamic("detect")(data.asInstanceOf[js.Any]).asInstanceOf[EncodingDetection]
    inline def detect(data: IntArrayType, encodings: js.Array[typings.encodingJapanese.mod.Encoding]): EncodingDetection = (^.asInstanceOf[js.Dynamic].applyDynamic("detect")(data.asInstanceOf[js.Any], encodings.asInstanceOf[js.Any])).asInstanceOf[EncodingDetection]
    inline def detect(data: IntArrayType, encodings: typings.encodingJapanese.mod.Encoding): EncodingDetection = (^.asInstanceOf[js.Dynamic].applyDynamic("detect")(data.asInstanceOf[js.Any], encodings.asInstanceOf[js.Any])).asInstanceOf[EncodingDetection]
    
    @JSGlobal("Encoding.orders")
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
    
    @JSGlobal("Encoding.version")
    @js.native
    val version: String = js.native
  }
}
