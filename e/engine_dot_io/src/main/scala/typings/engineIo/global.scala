package typings.engineIo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("byteArray")
  @js.native
  def byteArray: Any = js.native
  inline def byteArray_=(x: Any): Unit = js.Dynamic.global.updateDynamic("byteArray")(x.asInstanceOf[js.Any])
  
  @JSGlobal("byteCount")
  @js.native
  def byteCount: Any = js.native
  inline def byteCount_=(x: Any): Unit = js.Dynamic.global.updateDynamic("byteCount")(x.asInstanceOf[js.Any])
  
  @JSGlobal("byteIndex")
  @js.native
  def byteIndex: Any = js.native
  inline def byteIndex_=(x: Any): Unit = js.Dynamic.global.updateDynamic("byteIndex")(x.asInstanceOf[js.Any])
  
  inline def checkScalarValue(codePoint: Any, strict: Any): Boolean = (js.Dynamic.global.applyDynamic("checkScalarValue")(codePoint.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createByte(codePoint: Any, shift: Any): String = (js.Dynamic.global.applyDynamic("createByte")(codePoint.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decodeSymbol(strict: Any): Any = js.Dynamic.global.applyDynamic("decodeSymbol")(strict.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def encodeCodePoint(codePoint: Any, strict: Any): String = (js.Dynamic.global.applyDynamic("encodeCodePoint")(codePoint.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def readContinuationByte(): Double = js.Dynamic.global.applyDynamic("readContinuationByte")().asInstanceOf[Double]
  
  @JSGlobal("stringFromCharCode")
  @js.native
  def stringFromCharCode: js.Function1[/* repeated */ Double, String] = js.native
  inline def stringFromCharCode_=(x: js.Function1[/* repeated */ Double, String]): Unit = js.Dynamic.global.updateDynamic("stringFromCharCode")(x.asInstanceOf[js.Any])
  
  inline def ucs2decode(string: Any): js.Array[Any] = js.Dynamic.global.applyDynamic("ucs2decode")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def ucs2encode(array: Any): String = js.Dynamic.global.applyDynamic("ucs2encode")(array.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def utf8decode(byteString: Any, opts: Any): String = (js.Dynamic.global.applyDynamic("utf8decode")(byteString.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def utf8encode(string: Any, opts: Any): String = (js.Dynamic.global.applyDynamic("utf8encode")(string.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
}
