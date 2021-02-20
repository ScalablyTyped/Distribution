package typings.escPosEncoder

import typings.escPosEncoder.escPosEncoderNumbers.`1`
import typings.escPosEncoder.escPosEncoderNumbers.`2`
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("esc-pos-encoder", JSImport.Namespace)
  @js.native
  class ^ () extends EscPosEncoder
  
  @js.native
  trait EscPosEncoder extends StObject {
    
    def align(value: alignType): EscPosEncoder = js.native
    
    def barcode(value: String, symbology: symbologyType, height: Double): EscPosEncoder = js.native
    
    def bold(): EscPosEncoder = js.native
    def bold(value: Boolean): EscPosEncoder = js.native
    
    def codepage(value: codepageType): EscPosEncoder = js.native
    
    def cut(): EscPosEncoder = js.native
    def cut(value: cutType): EscPosEncoder = js.native
    
    def encode(): Uint8Array = js.native
    
    def image(element: js.Any, width: Double, height: Double): EscPosEncoder = js.native
    def image(
      element: js.Any,
      width: Double,
      height: Double,
      algorithm: js.UndefOr[scala.Nothing],
      threshold: Double
    ): EscPosEncoder = js.native
    def image(element: js.Any, width: Double, height: Double, algorithm: imgAlgType): EscPosEncoder = js.native
    def image(element: js.Any, width: Double, height: Double, algorithm: imgAlgType, threshold: Double): EscPosEncoder = js.native
    
    def initialize(): EscPosEncoder = js.native
    
    def italic(): EscPosEncoder = js.native
    def italic(value: Boolean): EscPosEncoder = js.native
    
    def line(value: String): EscPosEncoder = js.native
    def line(value: String, wrap: Double): EscPosEncoder = js.native
    
    def newline(): EscPosEncoder = js.native
    
    def qrcode(value: String): EscPosEncoder = js.native
    def qrcode(
      value: String,
      model: js.UndefOr[scala.Nothing],
      size: js.UndefOr[scala.Nothing],
      errorLevel: qrErrorLevelType
    ): EscPosEncoder = js.native
    def qrcode(value: String, model: js.UndefOr[scala.Nothing], size: qrSizeType): EscPosEncoder = js.native
    def qrcode(value: String, model: js.UndefOr[scala.Nothing], size: qrSizeType, errorLevel: qrErrorLevelType): EscPosEncoder = js.native
    @JSName("qrcode")
    def qrcode_1(value: String, model: `1`): EscPosEncoder = js.native
    @JSName("qrcode")
    def qrcode_1(value: String, model: `1`, size: js.UndefOr[scala.Nothing], errorLevel: qrErrorLevelType): EscPosEncoder = js.native
    @JSName("qrcode")
    def qrcode_1(value: String, model: `1`, size: qrSizeType): EscPosEncoder = js.native
    @JSName("qrcode")
    def qrcode_1(value: String, model: `1`, size: qrSizeType, errorLevel: qrErrorLevelType): EscPosEncoder = js.native
    @JSName("qrcode")
    def qrcode_2(value: String, model: `2`): EscPosEncoder = js.native
    @JSName("qrcode")
    def qrcode_2(value: String, model: `2`, size: js.UndefOr[scala.Nothing], errorLevel: qrErrorLevelType): EscPosEncoder = js.native
    @JSName("qrcode")
    def qrcode_2(value: String, model: `2`, size: qrSizeType): EscPosEncoder = js.native
    @JSName("qrcode")
    def qrcode_2(value: String, model: `2`, size: qrSizeType, errorLevel: qrErrorLevelType): EscPosEncoder = js.native
    
    def raw(data: js.Array[Double]): EscPosEncoder = js.native
    def raw(data: Uint8Array): EscPosEncoder = js.native
    
    def size(value: sizeType): EscPosEncoder = js.native
    
    def text(value: String): EscPosEncoder = js.native
    def text(value: String, wrap: Double): EscPosEncoder = js.native
    
    def underline(): EscPosEncoder = js.native
    def underline(value: Boolean): EscPosEncoder = js.native
    @JSName("underline")
    def underline_2(value: `2`): EscPosEncoder = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.escPosEncoder.escPosEncoderStrings.left
    - typings.escPosEncoder.escPosEncoderStrings.center
    - typings.escPosEncoder.escPosEncoderStrings.right
  */
  trait alignType extends StObject
  object alignType {
    
    @scala.inline
    def center: typings.escPosEncoder.escPosEncoderStrings.center = "center".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.center]
    
    @scala.inline
    def left: typings.escPosEncoder.escPosEncoderStrings.left = "left".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.left]
    
    @scala.inline
    def right: typings.escPosEncoder.escPosEncoderStrings.right = "right".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.escPosEncoder.escPosEncoderStrings.cp437
    - typings.escPosEncoder.escPosEncoderStrings.cp737
    - typings.escPosEncoder.escPosEncoderStrings.cp850
    - typings.escPosEncoder.escPosEncoderStrings.cp775
    - typings.escPosEncoder.escPosEncoderStrings.cp852
    - typings.escPosEncoder.escPosEncoderStrings.cp855
    - typings.escPosEncoder.escPosEncoderStrings.cp857
    - typings.escPosEncoder.escPosEncoderStrings.cp858
    - typings.escPosEncoder.escPosEncoderStrings.cp860
    - typings.escPosEncoder.escPosEncoderStrings.cp861
    - typings.escPosEncoder.escPosEncoderStrings.cp862
    - typings.escPosEncoder.escPosEncoderStrings.cp863
    - typings.escPosEncoder.escPosEncoderStrings.cp864
    - typings.escPosEncoder.escPosEncoderStrings.cp865
    - typings.escPosEncoder.escPosEncoderStrings.cp866
    - typings.escPosEncoder.escPosEncoderStrings.cp869
    - typings.escPosEncoder.escPosEncoderStrings.cp936
    - typings.escPosEncoder.escPosEncoderStrings.cp949
    - typings.escPosEncoder.escPosEncoderStrings.cp950
    - typings.escPosEncoder.escPosEncoderStrings.cp1252
    - typings.escPosEncoder.escPosEncoderStrings.iso88596
    - typings.escPosEncoder.escPosEncoderStrings.shiftjis
    - typings.escPosEncoder.escPosEncoderStrings.windows1250
    - typings.escPosEncoder.escPosEncoderStrings.windows1251
    - typings.escPosEncoder.escPosEncoderStrings.windows1252
    - typings.escPosEncoder.escPosEncoderStrings.windows1253
    - typings.escPosEncoder.escPosEncoderStrings.windows1254
    - typings.escPosEncoder.escPosEncoderStrings.windows1255
    - typings.escPosEncoder.escPosEncoderStrings.windows1256
    - typings.escPosEncoder.escPosEncoderStrings.windows1257
    - typings.escPosEncoder.escPosEncoderStrings.windows1258
  */
  trait codepageType extends StObject
  object codepageType {
    
    @scala.inline
    def cp1252: typings.escPosEncoder.escPosEncoderStrings.cp1252 = "cp1252".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp1252]
    
    @scala.inline
    def cp437: typings.escPosEncoder.escPosEncoderStrings.cp437 = "cp437".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp437]
    
    @scala.inline
    def cp737: typings.escPosEncoder.escPosEncoderStrings.cp737 = "cp737".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp737]
    
    @scala.inline
    def cp775: typings.escPosEncoder.escPosEncoderStrings.cp775 = "cp775".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp775]
    
    @scala.inline
    def cp850: typings.escPosEncoder.escPosEncoderStrings.cp850 = "cp850".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp850]
    
    @scala.inline
    def cp852: typings.escPosEncoder.escPosEncoderStrings.cp852 = "cp852".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp852]
    
    @scala.inline
    def cp855: typings.escPosEncoder.escPosEncoderStrings.cp855 = "cp855".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp855]
    
    @scala.inline
    def cp857: typings.escPosEncoder.escPosEncoderStrings.cp857 = "cp857".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp857]
    
    @scala.inline
    def cp858: typings.escPosEncoder.escPosEncoderStrings.cp858 = "cp858".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp858]
    
    @scala.inline
    def cp860: typings.escPosEncoder.escPosEncoderStrings.cp860 = "cp860".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp860]
    
    @scala.inline
    def cp861: typings.escPosEncoder.escPosEncoderStrings.cp861 = "cp861".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp861]
    
    @scala.inline
    def cp862: typings.escPosEncoder.escPosEncoderStrings.cp862 = "cp862".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp862]
    
    @scala.inline
    def cp863: typings.escPosEncoder.escPosEncoderStrings.cp863 = "cp863".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp863]
    
    @scala.inline
    def cp864: typings.escPosEncoder.escPosEncoderStrings.cp864 = "cp864".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp864]
    
    @scala.inline
    def cp865: typings.escPosEncoder.escPosEncoderStrings.cp865 = "cp865".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp865]
    
    @scala.inline
    def cp866: typings.escPosEncoder.escPosEncoderStrings.cp866 = "cp866".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp866]
    
    @scala.inline
    def cp869: typings.escPosEncoder.escPosEncoderStrings.cp869 = "cp869".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp869]
    
    @scala.inline
    def cp936: typings.escPosEncoder.escPosEncoderStrings.cp936 = "cp936".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp936]
    
    @scala.inline
    def cp949: typings.escPosEncoder.escPosEncoderStrings.cp949 = "cp949".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp949]
    
    @scala.inline
    def cp950: typings.escPosEncoder.escPosEncoderStrings.cp950 = "cp950".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp950]
    
    @scala.inline
    def iso88596: typings.escPosEncoder.escPosEncoderStrings.iso88596 = "iso88596".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.iso88596]
    
    @scala.inline
    def shiftjis: typings.escPosEncoder.escPosEncoderStrings.shiftjis = "shiftjis".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.shiftjis]
    
    @scala.inline
    def windows1250: typings.escPosEncoder.escPosEncoderStrings.windows1250 = "windows1250".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.windows1250]
    
    @scala.inline
    def windows1251: typings.escPosEncoder.escPosEncoderStrings.windows1251 = "windows1251".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.windows1251]
    
    @scala.inline
    def windows1252: typings.escPosEncoder.escPosEncoderStrings.windows1252 = "windows1252".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.windows1252]
    
    @scala.inline
    def windows1253: typings.escPosEncoder.escPosEncoderStrings.windows1253 = "windows1253".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.windows1253]
    
    @scala.inline
    def windows1254: typings.escPosEncoder.escPosEncoderStrings.windows1254 = "windows1254".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.windows1254]
    
    @scala.inline
    def windows1255: typings.escPosEncoder.escPosEncoderStrings.windows1255 = "windows1255".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.windows1255]
    
    @scala.inline
    def windows1256: typings.escPosEncoder.escPosEncoderStrings.windows1256 = "windows1256".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.windows1256]
    
    @scala.inline
    def windows1257: typings.escPosEncoder.escPosEncoderStrings.windows1257 = "windows1257".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.windows1257]
    
    @scala.inline
    def windows1258: typings.escPosEncoder.escPosEncoderStrings.windows1258 = "windows1258".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.windows1258]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.escPosEncoder.escPosEncoderStrings.full
    - typings.escPosEncoder.escPosEncoderStrings.partial
  */
  trait cutType extends StObject
  object cutType {
    
    @scala.inline
    def full: typings.escPosEncoder.escPosEncoderStrings.full = "full".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.full]
    
    @scala.inline
    def partial: typings.escPosEncoder.escPosEncoderStrings.partial = "partial".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.partial]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.escPosEncoder.escPosEncoderStrings.threshold
    - typings.escPosEncoder.escPosEncoderStrings.bayer
    - typings.escPosEncoder.escPosEncoderStrings.floydsteinberg
    - typings.escPosEncoder.escPosEncoderStrings.atkinson
  */
  trait imgAlgType extends StObject
  object imgAlgType {
    
    @scala.inline
    def atkinson: typings.escPosEncoder.escPosEncoderStrings.atkinson = "atkinson".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.atkinson]
    
    @scala.inline
    def bayer: typings.escPosEncoder.escPosEncoderStrings.bayer = "bayer".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.bayer]
    
    @scala.inline
    def floydsteinberg: typings.escPosEncoder.escPosEncoderStrings.floydsteinberg = "floydsteinberg".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.floydsteinberg]
    
    @scala.inline
    def threshold: typings.escPosEncoder.escPosEncoderStrings.threshold = "threshold".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.threshold]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.escPosEncoder.escPosEncoderStrings.l
    - typings.escPosEncoder.escPosEncoderStrings.m
    - typings.escPosEncoder.escPosEncoderStrings.q
    - typings.escPosEncoder.escPosEncoderStrings.h
  */
  trait qrErrorLevelType extends StObject
  object qrErrorLevelType {
    
    @scala.inline
    def h: typings.escPosEncoder.escPosEncoderStrings.h = "h".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.h]
    
    @scala.inline
    def l: typings.escPosEncoder.escPosEncoderStrings.l = "l".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.l]
    
    @scala.inline
    def m: typings.escPosEncoder.escPosEncoderStrings.m = "m".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.m]
    
    @scala.inline
    def q: typings.escPosEncoder.escPosEncoderStrings.q = "q".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.q]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.escPosEncoder.escPosEncoderNumbers.`1`
    - typings.escPosEncoder.escPosEncoderNumbers.`2`
    - typings.escPosEncoder.escPosEncoderNumbers.`3`
    - typings.escPosEncoder.escPosEncoderNumbers.`4`
    - typings.escPosEncoder.escPosEncoderNumbers.`5`
    - typings.escPosEncoder.escPosEncoderNumbers.`6`
    - typings.escPosEncoder.escPosEncoderNumbers.`7`
    - typings.escPosEncoder.escPosEncoderNumbers.`8`
  */
  trait qrSizeType extends StObject
  object qrSizeType {
    
    @scala.inline
    def `1`: typings.escPosEncoder.escPosEncoderNumbers.`1` = 1.asInstanceOf[typings.escPosEncoder.escPosEncoderNumbers.`1`]
    
    @scala.inline
    def `2`: typings.escPosEncoder.escPosEncoderNumbers.`2` = 2.asInstanceOf[typings.escPosEncoder.escPosEncoderNumbers.`2`]
    
    @scala.inline
    def `3`: typings.escPosEncoder.escPosEncoderNumbers.`3` = 3.asInstanceOf[typings.escPosEncoder.escPosEncoderNumbers.`3`]
    
    @scala.inline
    def `4`: typings.escPosEncoder.escPosEncoderNumbers.`4` = 4.asInstanceOf[typings.escPosEncoder.escPosEncoderNumbers.`4`]
    
    @scala.inline
    def `5`: typings.escPosEncoder.escPosEncoderNumbers.`5` = 5.asInstanceOf[typings.escPosEncoder.escPosEncoderNumbers.`5`]
    
    @scala.inline
    def `6`: typings.escPosEncoder.escPosEncoderNumbers.`6` = 6.asInstanceOf[typings.escPosEncoder.escPosEncoderNumbers.`6`]
    
    @scala.inline
    def `7`: typings.escPosEncoder.escPosEncoderNumbers.`7` = 7.asInstanceOf[typings.escPosEncoder.escPosEncoderNumbers.`7`]
    
    @scala.inline
    def `8`: typings.escPosEncoder.escPosEncoderNumbers.`8` = 8.asInstanceOf[typings.escPosEncoder.escPosEncoderNumbers.`8`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.escPosEncoder.escPosEncoderStrings.small
    - typings.escPosEncoder.escPosEncoderStrings.normal
  */
  trait sizeType extends StObject
  object sizeType {
    
    @scala.inline
    def normal: typings.escPosEncoder.escPosEncoderStrings.normal = "normal".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.normal]
    
    @scala.inline
    def small: typings.escPosEncoder.escPosEncoderStrings.small = "small".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.escPosEncoder.escPosEncoderStrings.upca
    - typings.escPosEncoder.escPosEncoderStrings.upce
    - typings.escPosEncoder.escPosEncoderStrings.ean13
    - typings.escPosEncoder.escPosEncoderStrings.ean8
    - typings.escPosEncoder.escPosEncoderStrings.coda39
    - typings.escPosEncoder.escPosEncoderStrings.itf
    - typings.escPosEncoder.escPosEncoderStrings.codabar
  */
  trait symbologyType extends StObject
  object symbologyType {
    
    @scala.inline
    def coda39: typings.escPosEncoder.escPosEncoderStrings.coda39 = "coda39".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.coda39]
    
    @scala.inline
    def codabar: typings.escPosEncoder.escPosEncoderStrings.codabar = "codabar".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.codabar]
    
    @scala.inline
    def ean13: typings.escPosEncoder.escPosEncoderStrings.ean13 = "ean13".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.ean13]
    
    @scala.inline
    def ean8: typings.escPosEncoder.escPosEncoderStrings.ean8 = "ean8".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.ean8]
    
    @scala.inline
    def itf: typings.escPosEncoder.escPosEncoderStrings.itf = "itf".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.itf]
    
    @scala.inline
    def upca: typings.escPosEncoder.escPosEncoderStrings.upca = "upca".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.upca]
    
    @scala.inline
    def upce: typings.escPosEncoder.escPosEncoderStrings.upce = "upce".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.upce]
  }
}
