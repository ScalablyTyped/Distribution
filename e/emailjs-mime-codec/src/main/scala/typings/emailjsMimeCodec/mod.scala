package typings.emailjsMimeCodec

import typings.emailjsMimeCodec.anon.Key
import typings.emailjsMimeCodec.anon.Params
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("emailjs-mime-codec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def base64Decode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Decode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def base64Decode(str: String, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("base64Decode")(str.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def base64Encode(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Encode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def base64Encode(data: String, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("base64Encode")(data.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def base64Encode(data: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Encode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def base64Encode(data: js.typedarray.Uint8Array, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("base64Encode")(data.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def continuationEncode(key: String, data: String, maxLength: Double): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("continuationEncode")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  inline def continuationEncode(key: String, data: String, maxLength: Double, fromCharset: String): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("continuationEncode")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  inline def continuationEncode(key: js.typedarray.Uint8Array, data: String, maxLength: Double): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("continuationEncode")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  inline def continuationEncode(key: js.typedarray.Uint8Array, data: String, maxLength: Double, fromCharset: String): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("continuationEncode")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  
  inline def convert(data: String, fromCharset: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def convert(data: js.typedarray.Uint8Array, fromCharset: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def decode(buf: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decode(buf: js.typedarray.Uint8Array, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encode(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def foldLines(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("foldLines")().asInstanceOf[String]
  inline def foldLines(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("foldLines")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def foldLines(str: String, afterSpace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldLines")(str.asInstanceOf[js.Any], afterSpace.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def foldLines(str: Unit, afterSpace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldLines")(str.asInstanceOf[js.Any], afterSpace.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def headerLineDecode(): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("headerLineDecode")().asInstanceOf[Key]
  inline def headerLineDecode(headerLine: String): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("headerLineDecode")(headerLine.asInstanceOf[js.Any]).asInstanceOf[Key]
  
  inline def headerLineEncode(key: String, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("headerLineEncode")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def headerLineEncode(key: String, value: String, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("headerLineEncode")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def headerLineEncode(key: String, value: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("headerLineEncode")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def headerLineEncode(key: String, value: js.typedarray.Uint8Array, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("headerLineEncode")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def headerLinesDecode(headers: String): Record[String, String | js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("headerLinesDecode")(headers.asInstanceOf[js.Any]).asInstanceOf[Record[String, String | js.Array[String]]]
  
  inline def mimeDecode(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mimeDecode")().asInstanceOf[String]
  inline def mimeDecode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mimeDecode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def mimeDecode(str: String, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeDecode")(str.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mimeDecode(str: Unit, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeDecode")(str.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def mimeEncode(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mimeEncode")().asInstanceOf[String]
  inline def mimeEncode(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mimeEncode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def mimeEncode(data: String, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeEncode")(data.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mimeEncode(data: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mimeEncode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def mimeEncode(data: js.typedarray.Uint8Array, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeEncode")(data.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mimeEncode(data: Unit, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeEncode")(data.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def mimeWordDecode(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordDecode")().asInstanceOf[String]
  inline def mimeWordDecode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordDecode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mimeWordEncode(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordEncode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def mimeWordEncode(data: String, mimeWordEncoding: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordEncode")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mimeWordEncode(data: String, mimeWordEncoding: String, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordEncode")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mimeWordEncode(data: String, mimeWordEncoding: Unit, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordEncode")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mimeWordEncode(data: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordEncode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def mimeWordEncode(data: js.typedarray.Uint8Array, mimeWordEncoding: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordEncode")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mimeWordEncode(data: js.typedarray.Uint8Array, mimeWordEncoding: String, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordEncode")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mimeWordEncode(data: js.typedarray.Uint8Array, mimeWordEncoding: Unit, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordEncode")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def mimeWordsDecode(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordsDecode")().asInstanceOf[String]
  inline def mimeWordsDecode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordsDecode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mimeWordsEncode(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordsEncode")().asInstanceOf[String]
  inline def mimeWordsEncode(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordsEncode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def mimeWordsEncode(data: String, mimeWordEncoding: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordsEncode")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mimeWordsEncode(data: String, mimeWordEncoding: String, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordsEncode")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mimeWordsEncode(data: String, mimeWordEncoding: Unit, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordsEncode")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mimeWordsEncode(data: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordsEncode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def mimeWordsEncode(data: js.typedarray.Uint8Array, mimeWordEncoding: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordsEncode")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mimeWordsEncode(data: js.typedarray.Uint8Array, mimeWordEncoding: String, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordsEncode")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mimeWordsEncode(data: js.typedarray.Uint8Array, mimeWordEncoding: Unit, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordsEncode")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mimeWordsEncode(data: Unit, mimeWordEncoding: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordsEncode")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mimeWordsEncode(data: Unit, mimeWordEncoding: String, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordsEncode")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mimeWordsEncode(data: Unit, mimeWordEncoding: Unit, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeWordsEncode")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseHeaderValue(str: String): Params = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHeaderValue")(str.asInstanceOf[js.Any]).asInstanceOf[Params]
  
  inline def quotedPrintableDecode(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("quotedPrintableDecode")().asInstanceOf[String]
  inline def quotedPrintableDecode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("quotedPrintableDecode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def quotedPrintableDecode(str: String, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("quotedPrintableDecode")(str.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def quotedPrintableDecode(str: Unit, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("quotedPrintableDecode")(str.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def quotedPrintableEncode(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("quotedPrintableEncode")().asInstanceOf[String]
  inline def quotedPrintableEncode(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("quotedPrintableEncode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def quotedPrintableEncode(data: String, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("quotedPrintableEncode")(data.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def quotedPrintableEncode(data: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("quotedPrintableEncode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def quotedPrintableEncode(data: js.typedarray.Uint8Array, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("quotedPrintableEncode")(data.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def quotedPrintableEncode(data: Unit, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("quotedPrintableEncode")(data.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
}
