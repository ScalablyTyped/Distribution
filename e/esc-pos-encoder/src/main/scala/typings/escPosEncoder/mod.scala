package typings.escPosEncoder

import typings.escPosEncoder.anon.Align
import typings.escPosEncoder.anon.MarginLeft
import typings.escPosEncoder.anon.Style
import typings.escPosEncoder.escPosEncoderInts.`1`
import typings.escPosEncoder.escPosEncoderInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("esc-pos-encoder", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with EscPosEncoder
  
  @js.native
  trait EscPosEncoder extends StObject {
    
    def align(value: alignType): EscPosEncoder = js.native
    
    def barcode(value: String, symbology: symbologyType, height: Double): EscPosEncoder = js.native
    
    def bold(): EscPosEncoder = js.native
    def bold(value: Boolean): EscPosEncoder = js.native
    
    def box(options: MarginLeft, value: String): EscPosEncoder = js.native
    def box(options: MarginLeft, value: js.Function1[/* encoder */ this.type, this.type]): EscPosEncoder = js.native
    
    def codepage(value: codepageType): EscPosEncoder = js.native
    
    def cut(): EscPosEncoder = js.native
    def cut(value: cutType): EscPosEncoder = js.native
    
    def encode(): js.typedarray.Uint8Array = js.native
    
    def height(value: Double): EscPosEncoder = js.native
    
    def image(element: Any, width: Double, height: Double): EscPosEncoder = js.native
    def image(element: Any, width: Double, height: Double, algorithm: Unit, threshold: Double): EscPosEncoder = js.native
    def image(element: Any, width: Double, height: Double, algorithm: imgAlgType): EscPosEncoder = js.native
    def image(element: Any, width: Double, height: Double, algorithm: imgAlgType, threshold: Double): EscPosEncoder = js.native
    
    def initialize(): EscPosEncoder = js.native
    
    def invert(): EscPosEncoder = js.native
    def invert(value: Boolean): EscPosEncoder = js.native
    
    def italic(): EscPosEncoder = js.native
    def italic(value: Boolean): EscPosEncoder = js.native
    
    def line(value: String): EscPosEncoder = js.native
    def line(value: String, wrap: Double): EscPosEncoder = js.native
    
    def newline(): EscPosEncoder = js.native
    
    def pulse(device: deviceType, on: Double, off: Double): EscPosEncoder = js.native
    
    def qrcode(value: String): EscPosEncoder = js.native
    def qrcode(value: String, model: `1` | `2`): EscPosEncoder = js.native
    def qrcode(value: String, model: `1` | `2`, size: Unit, errorLevel: qrErrorLevelType): EscPosEncoder = js.native
    def qrcode(value: String, model: `1` | `2`, size: qrSizeType): EscPosEncoder = js.native
    def qrcode(value: String, model: `1` | `2`, size: qrSizeType, errorLevel: qrErrorLevelType): EscPosEncoder = js.native
    def qrcode(value: String, model: Unit, size: Unit, errorLevel: qrErrorLevelType): EscPosEncoder = js.native
    def qrcode(value: String, model: Unit, size: qrSizeType): EscPosEncoder = js.native
    def qrcode(value: String, model: Unit, size: qrSizeType, errorLevel: qrErrorLevelType): EscPosEncoder = js.native
    
    def raw(data: js.Array[Double]): EscPosEncoder = js.native
    def raw(data: js.typedarray.Uint8Array): EscPosEncoder = js.native
    
    def rule(options: Style): EscPosEncoder = js.native
    
    def size(value: sizeType): EscPosEncoder = js.native
    
    def table(
      columns: js.Array[Align],
      data: js.Array[js.Array[String | (js.Function1[/* encoder */ this.type, this.type])]]
    ): EscPosEncoder = js.native
    
    def text(value: String): EscPosEncoder = js.native
    def text(value: String, wrap: Double): EscPosEncoder = js.native
    
    def underline(): EscPosEncoder = js.native
    def underline(value: Boolean): EscPosEncoder = js.native
    @JSName("underline")
    def underline_2(value: `2`): EscPosEncoder = js.native
    
    def width(value: Double): EscPosEncoder = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.escPosEncoder.escPosEncoderStrings.left
    - typings.escPosEncoder.escPosEncoderStrings.center
    - typings.escPosEncoder.escPosEncoderStrings.right
  */
  trait alignType extends StObject
  object alignType {
    
    inline def center: typings.escPosEncoder.escPosEncoderStrings.center = "center".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.center]
    
    inline def left: typings.escPosEncoder.escPosEncoderStrings.left = "left".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.left]
    
    inline def right: typings.escPosEncoder.escPosEncoderStrings.right = "right".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.right]
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
    
    inline def cp1252: typings.escPosEncoder.escPosEncoderStrings.cp1252 = "cp1252".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp1252]
    
    inline def cp437: typings.escPosEncoder.escPosEncoderStrings.cp437 = "cp437".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp437]
    
    inline def cp737: typings.escPosEncoder.escPosEncoderStrings.cp737 = "cp737".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp737]
    
    inline def cp775: typings.escPosEncoder.escPosEncoderStrings.cp775 = "cp775".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp775]
    
    inline def cp850: typings.escPosEncoder.escPosEncoderStrings.cp850 = "cp850".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp850]
    
    inline def cp852: typings.escPosEncoder.escPosEncoderStrings.cp852 = "cp852".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp852]
    
    inline def cp855: typings.escPosEncoder.escPosEncoderStrings.cp855 = "cp855".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp855]
    
    inline def cp857: typings.escPosEncoder.escPosEncoderStrings.cp857 = "cp857".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp857]
    
    inline def cp858: typings.escPosEncoder.escPosEncoderStrings.cp858 = "cp858".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp858]
    
    inline def cp860: typings.escPosEncoder.escPosEncoderStrings.cp860 = "cp860".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp860]
    
    inline def cp861: typings.escPosEncoder.escPosEncoderStrings.cp861 = "cp861".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp861]
    
    inline def cp862: typings.escPosEncoder.escPosEncoderStrings.cp862 = "cp862".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp862]
    
    inline def cp863: typings.escPosEncoder.escPosEncoderStrings.cp863 = "cp863".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp863]
    
    inline def cp864: typings.escPosEncoder.escPosEncoderStrings.cp864 = "cp864".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp864]
    
    inline def cp865: typings.escPosEncoder.escPosEncoderStrings.cp865 = "cp865".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp865]
    
    inline def cp866: typings.escPosEncoder.escPosEncoderStrings.cp866 = "cp866".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp866]
    
    inline def cp869: typings.escPosEncoder.escPosEncoderStrings.cp869 = "cp869".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp869]
    
    inline def cp936: typings.escPosEncoder.escPosEncoderStrings.cp936 = "cp936".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp936]
    
    inline def cp949: typings.escPosEncoder.escPosEncoderStrings.cp949 = "cp949".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp949]
    
    inline def cp950: typings.escPosEncoder.escPosEncoderStrings.cp950 = "cp950".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.cp950]
    
    inline def iso88596: typings.escPosEncoder.escPosEncoderStrings.iso88596 = "iso88596".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.iso88596]
    
    inline def shiftjis: typings.escPosEncoder.escPosEncoderStrings.shiftjis = "shiftjis".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.shiftjis]
    
    inline def windows1250: typings.escPosEncoder.escPosEncoderStrings.windows1250 = "windows1250".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.windows1250]
    
    inline def windows1251: typings.escPosEncoder.escPosEncoderStrings.windows1251 = "windows1251".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.windows1251]
    
    inline def windows1252: typings.escPosEncoder.escPosEncoderStrings.windows1252 = "windows1252".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.windows1252]
    
    inline def windows1253: typings.escPosEncoder.escPosEncoderStrings.windows1253 = "windows1253".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.windows1253]
    
    inline def windows1254: typings.escPosEncoder.escPosEncoderStrings.windows1254 = "windows1254".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.windows1254]
    
    inline def windows1255: typings.escPosEncoder.escPosEncoderStrings.windows1255 = "windows1255".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.windows1255]
    
    inline def windows1256: typings.escPosEncoder.escPosEncoderStrings.windows1256 = "windows1256".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.windows1256]
    
    inline def windows1257: typings.escPosEncoder.escPosEncoderStrings.windows1257 = "windows1257".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.windows1257]
    
    inline def windows1258: typings.escPosEncoder.escPosEncoderStrings.windows1258 = "windows1258".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.windows1258]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.escPosEncoder.escPosEncoderStrings.full
    - typings.escPosEncoder.escPosEncoderStrings.partial
  */
  trait cutType extends StObject
  object cutType {
    
    inline def full: typings.escPosEncoder.escPosEncoderStrings.full = "full".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.full]
    
    inline def partial: typings.escPosEncoder.escPosEncoderStrings.partial = "partial".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.partial]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.escPosEncoder.escPosEncoderInts.`0`
    - typings.escPosEncoder.escPosEncoderInts.`1`
  */
  trait deviceType extends StObject
  object deviceType {
    
    inline def `0`: typings.escPosEncoder.escPosEncoderInts.`0` = 0.asInstanceOf[typings.escPosEncoder.escPosEncoderInts.`0`]
    
    inline def `1`: typings.escPosEncoder.escPosEncoderInts.`1` = 1.asInstanceOf[typings.escPosEncoder.escPosEncoderInts.`1`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.escPosEncoder.escPosEncoderStrings.threshold
    - typings.escPosEncoder.escPosEncoderStrings.bayer
    - typings.escPosEncoder.escPosEncoderStrings.floydsteinberg
    - typings.escPosEncoder.escPosEncoderStrings.atkinson
  */
  trait imgAlgType extends StObject
  object imgAlgType {
    
    inline def atkinson: typings.escPosEncoder.escPosEncoderStrings.atkinson = "atkinson".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.atkinson]
    
    inline def bayer: typings.escPosEncoder.escPosEncoderStrings.bayer = "bayer".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.bayer]
    
    inline def floydsteinberg: typings.escPosEncoder.escPosEncoderStrings.floydsteinberg = "floydsteinberg".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.floydsteinberg]
    
    inline def threshold: typings.escPosEncoder.escPosEncoderStrings.threshold = "threshold".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.threshold]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.escPosEncoder.escPosEncoderStrings.l
    - typings.escPosEncoder.escPosEncoderStrings.m
    - typings.escPosEncoder.escPosEncoderStrings.q
    - typings.escPosEncoder.escPosEncoderStrings.h
  */
  trait qrErrorLevelType extends StObject
  object qrErrorLevelType {
    
    inline def h: typings.escPosEncoder.escPosEncoderStrings.h = "h".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.h]
    
    inline def l: typings.escPosEncoder.escPosEncoderStrings.l = "l".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.l]
    
    inline def m: typings.escPosEncoder.escPosEncoderStrings.m = "m".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.m]
    
    inline def q: typings.escPosEncoder.escPosEncoderStrings.q = "q".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.q]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.escPosEncoder.escPosEncoderInts.`1`
    - typings.escPosEncoder.escPosEncoderInts.`2`
    - typings.escPosEncoder.escPosEncoderInts.`3`
    - typings.escPosEncoder.escPosEncoderInts.`4`
    - typings.escPosEncoder.escPosEncoderInts.`5`
    - typings.escPosEncoder.escPosEncoderInts.`6`
    - typings.escPosEncoder.escPosEncoderInts.`7`
    - typings.escPosEncoder.escPosEncoderInts.`8`
  */
  trait qrSizeType extends StObject
  object qrSizeType {
    
    inline def `1`: typings.escPosEncoder.escPosEncoderInts.`1` = 1.asInstanceOf[typings.escPosEncoder.escPosEncoderInts.`1`]
    
    inline def `2`: typings.escPosEncoder.escPosEncoderInts.`2` = 2.asInstanceOf[typings.escPosEncoder.escPosEncoderInts.`2`]
    
    inline def `3`: typings.escPosEncoder.escPosEncoderInts.`3` = 3.asInstanceOf[typings.escPosEncoder.escPosEncoderInts.`3`]
    
    inline def `4`: typings.escPosEncoder.escPosEncoderInts.`4` = 4.asInstanceOf[typings.escPosEncoder.escPosEncoderInts.`4`]
    
    inline def `5`: typings.escPosEncoder.escPosEncoderInts.`5` = 5.asInstanceOf[typings.escPosEncoder.escPosEncoderInts.`5`]
    
    inline def `6`: typings.escPosEncoder.escPosEncoderInts.`6` = 6.asInstanceOf[typings.escPosEncoder.escPosEncoderInts.`6`]
    
    inline def `7`: typings.escPosEncoder.escPosEncoderInts.`7` = 7.asInstanceOf[typings.escPosEncoder.escPosEncoderInts.`7`]
    
    inline def `8`: typings.escPosEncoder.escPosEncoderInts.`8` = 8.asInstanceOf[typings.escPosEncoder.escPosEncoderInts.`8`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.escPosEncoder.escPosEncoderStrings.small
    - typings.escPosEncoder.escPosEncoderStrings.normal
  */
  trait sizeType extends StObject
  object sizeType {
    
    inline def normal: typings.escPosEncoder.escPosEncoderStrings.normal = "normal".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.normal]
    
    inline def small: typings.escPosEncoder.escPosEncoderStrings.small = "small".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.escPosEncoder.escPosEncoderStrings.single
    - typings.escPosEncoder.escPosEncoderStrings.double
  */
  trait styleType extends StObject
  object styleType {
    
    inline def double: typings.escPosEncoder.escPosEncoderStrings.double = "double".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.double]
    
    inline def single: typings.escPosEncoder.escPosEncoderStrings.single = "single".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.single]
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
    
    inline def coda39: typings.escPosEncoder.escPosEncoderStrings.coda39 = "coda39".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.coda39]
    
    inline def codabar: typings.escPosEncoder.escPosEncoderStrings.codabar = "codabar".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.codabar]
    
    inline def ean13: typings.escPosEncoder.escPosEncoderStrings.ean13 = "ean13".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.ean13]
    
    inline def ean8: typings.escPosEncoder.escPosEncoderStrings.ean8 = "ean8".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.ean8]
    
    inline def itf: typings.escPosEncoder.escPosEncoderStrings.itf = "itf".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.itf]
    
    inline def upca: typings.escPosEncoder.escPosEncoderStrings.upca = "upca".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.upca]
    
    inline def upce: typings.escPosEncoder.escPosEncoderStrings.upce = "upce".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.upce]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.escPosEncoder.escPosEncoderStrings.top
    - typings.escPosEncoder.escPosEncoderStrings.bottom
  */
  trait verticalAlignType extends StObject
  object verticalAlignType {
    
    inline def bottom: typings.escPosEncoder.escPosEncoderStrings.bottom = "bottom".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.bottom]
    
    inline def top: typings.escPosEncoder.escPosEncoderStrings.top = "top".asInstanceOf[typings.escPosEncoder.escPosEncoderStrings.top]
  }
}
