package typings.encodingJapanese

import typings.encodingJapanese.mod.Encoding
import typings.encodingJapanese.mod.EncodingDetection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodingJapaneseStrings {
  
  @js.native
  sealed trait ASCII
    extends Encoding
       with EncodingDetection
  @scala.inline
  def ASCII: ASCII = "ASCII".asInstanceOf[ASCII]
  
  @js.native
  sealed trait AUTO
    extends Encoding
       with EncodingDetection
  @scala.inline
  def AUTO: AUTO = "AUTO".asInstanceOf[AUTO]
  
  @js.native
  sealed trait BINARY
    extends Encoding
       with EncodingDetection
  @scala.inline
  def BINARY: BINARY = "BINARY".asInstanceOf[BINARY]
  
  @js.native
  sealed trait EUCJP
    extends Encoding
       with EncodingDetection
  @scala.inline
  def EUCJP: EUCJP = "EUCJP".asInstanceOf[EUCJP]
  
  @js.native
  sealed trait JIS
    extends Encoding
       with EncodingDetection
  @scala.inline
  def JIS: JIS = "JIS".asInstanceOf[JIS]
  
  @js.native
  sealed trait SJIS
    extends Encoding
       with EncodingDetection
  @scala.inline
  def SJIS: SJIS = "SJIS".asInstanceOf[SJIS]
  
  @js.native
  sealed trait UNICODE
    extends Encoding
       with EncodingDetection
  @scala.inline
  def UNICODE: UNICODE = "UNICODE".asInstanceOf[UNICODE]
  
  @js.native
  sealed trait UTF16
    extends Encoding
       with EncodingDetection
  @scala.inline
  def UTF16: UTF16 = "UTF16".asInstanceOf[UTF16]
  
  @js.native
  sealed trait UTF16BE
    extends Encoding
       with EncodingDetection
  @scala.inline
  def UTF16BE: UTF16BE = "UTF16BE".asInstanceOf[UTF16BE]
  
  @js.native
  sealed trait UTF16LE
    extends Encoding
       with EncodingDetection
  @scala.inline
  def UTF16LE: UTF16LE = "UTF16LE".asInstanceOf[UTF16LE]
  
  @js.native
  sealed trait UTF32
    extends Encoding
       with EncodingDetection
  @scala.inline
  def UTF32: UTF32 = "UTF32".asInstanceOf[UTF32]
  
  @js.native
  sealed trait UTF8
    extends Encoding
       with EncodingDetection
  @scala.inline
  def UTF8: UTF8 = "UTF8".asInstanceOf[UTF8]
  
  @js.native
  sealed trait array extends StObject
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  
  @js.native
  sealed trait arraybuffer extends StObject
  @scala.inline
  def arraybuffer: arraybuffer = "arraybuffer".asInstanceOf[arraybuffer]
  
  @js.native
  sealed trait string extends StObject
  @scala.inline
  def string: string = "string".asInstanceOf[string]
}
