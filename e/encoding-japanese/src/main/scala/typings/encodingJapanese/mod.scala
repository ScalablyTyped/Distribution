package typings.encodingJapanese

import typings.encodingJapanese.encodingJapaneseStrings.array
import typings.encodingJapanese.encodingJapaneseStrings.arraybuffer
import typings.encodingJapanese.encodingJapaneseStrings.string
import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("encoding-japanese", "base64Decode")
  @js.native
  def base64Decode(data: String): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "base64Encode")
  @js.native
  def base64Encode(data: IntArrayType): String = js.native
  
  @JSImport("encoding-japanese", "codeToString")
  @js.native
  def codeToString(data: IntArrayType): String = js.native
  
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: String, options: ConvertArrayBufferOptions): ArrayBuffer = js.native
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: String, options: ConvertArrayOptions): js.Array[Double] = js.native
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: String, options: ConvertStringOptions): String = js.native
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: String, options: ConvertUnknownOptions): String = js.native
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: String, to: Encoding): String = js.native
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: String, to: Encoding, from: Encoding): String = js.native
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: RawType, options: ConvertArrayBufferOptions): ArrayBuffer = js.native
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: RawType, options: ConvertArrayOptions): js.Array[Double] = js.native
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: RawType, options: ConvertStringOptions): String = js.native
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: RawType, options: ConvertUnknownOptions): js.Array[Double] = js.native
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: RawType, to: Encoding): js.Array[Double] = js.native
  @JSImport("encoding-japanese", "convert")
  @js.native
  def convert(data: RawType, to: Encoding, from: Encoding): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "detect")
  @js.native
  def detect(data: String): EncodingDetection = js.native
  @JSImport("encoding-japanese", "detect")
  @js.native
  def detect(data: String, encodings: js.Array[Encoding]): EncodingDetection = js.native
  @JSImport("encoding-japanese", "detect")
  @js.native
  def detect(data: String, encodings: Encoding): EncodingDetection = js.native
  @JSImport("encoding-japanese", "detect")
  @js.native
  def detect(data: RawType): EncodingDetection = js.native
  @JSImport("encoding-japanese", "detect")
  @js.native
  def detect(data: RawType, encodings: js.Array[Encoding]): EncodingDetection = js.native
  @JSImport("encoding-japanese", "detect")
  @js.native
  def detect(data: RawType, encodings: Encoding): EncodingDetection = js.native
  
  @JSImport("encoding-japanese", "orders")
  @js.native
  val orders: js.Array[String] = js.native
  
  @JSImport("encoding-japanese", "stringToCode")
  @js.native
  def stringToCode(data: String): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "toHankakuCase")
  @js.native
  def toHankakuCase(data: String): String = js.native
  @JSImport("encoding-japanese", "toHankakuCase")
  @js.native
  def toHankakuCase(data: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "toHankakuSpace")
  @js.native
  def toHankakuSpace(data: String): String = js.native
  @JSImport("encoding-japanese", "toHankakuSpace")
  @js.native
  def toHankakuSpace(data: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "toHankanaCase")
  @js.native
  def toHankanaCase(data: String): String = js.native
  @JSImport("encoding-japanese", "toHankanaCase")
  @js.native
  def toHankanaCase(data: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "toHiraganaCase")
  @js.native
  def toHiraganaCase(data: String): String = js.native
  @JSImport("encoding-japanese", "toHiraganaCase")
  @js.native
  def toHiraganaCase(data: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "toKatakanaCase")
  @js.native
  def toKatakanaCase(data: String): String = js.native
  @JSImport("encoding-japanese", "toKatakanaCase")
  @js.native
  def toKatakanaCase(data: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "toZenkakuCase")
  @js.native
  def toZenkakuCase(data: String): String = js.native
  @JSImport("encoding-japanese", "toZenkakuCase")
  @js.native
  def toZenkakuCase(data: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "toZenkakuSpace")
  @js.native
  def toZenkakuSpace(data: String): String = js.native
  @JSImport("encoding-japanese", "toZenkakuSpace")
  @js.native
  def toZenkakuSpace(data: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "toZenkanaCase")
  @js.native
  def toZenkanaCase(data: String): String = js.native
  @JSImport("encoding-japanese", "toZenkanaCase")
  @js.native
  def toZenkanaCase(data: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "urlDecode")
  @js.native
  def urlDecode(data: String): js.Array[Double] = js.native
  
  @JSImport("encoding-japanese", "urlEncode")
  @js.native
  def urlEncode(data: IntArrayType): String = js.native
  
  @js.native
  trait ConvertArrayBufferOptions extends ConvertOptions {
    
    var bom: js.UndefOr[Boolean | String] = js.native
    
    var from: js.UndefOr[Encoding] = js.native
    
    var to: Encoding = js.native
    
    var `type`: arraybuffer = js.native
  }
  object ConvertArrayBufferOptions {
    
    @scala.inline
    def apply(to: Encoding, `type`: arraybuffer): ConvertArrayBufferOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertArrayBufferOptions]
    }
    
    @scala.inline
    implicit class ConvertArrayBufferOptionsMutableBuilder[Self <: ConvertArrayBufferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBom(value: Boolean | String): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      @scala.inline
      def setFrom(value: Encoding): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setTo(value: Encoding): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: arraybuffer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConvertArrayOptions extends ConvertOptions {
    
    var bom: js.UndefOr[Boolean | String] = js.native
    
    var from: js.UndefOr[Encoding] = js.native
    
    var to: Encoding = js.native
    
    var `type`: array = js.native
  }
  object ConvertArrayOptions {
    
    @scala.inline
    def apply(to: Encoding, `type`: array): ConvertArrayOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertArrayOptions]
    }
    
    @scala.inline
    implicit class ConvertArrayOptionsMutableBuilder[Self <: ConvertArrayOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBom(value: Boolean | String): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      @scala.inline
      def setFrom(value: Encoding): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setTo(value: Encoding): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def ConvertArrayBufferOptions(to: Encoding, `type`: arraybuffer): typings.encodingJapanese.mod.ConvertArrayBufferOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.encodingJapanese.mod.ConvertArrayBufferOptions]
    }
    
    @scala.inline
    def ConvertArrayOptions(to: Encoding, `type`: array): typings.encodingJapanese.mod.ConvertArrayOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.encodingJapanese.mod.ConvertArrayOptions]
    }
    
    @scala.inline
    def ConvertStringOptions(to: Encoding, `type`: string): typings.encodingJapanese.mod.ConvertStringOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.encodingJapanese.mod.ConvertStringOptions]
    }
    
    @scala.inline
    def ConvertUnknownOptions(to: Encoding): typings.encodingJapanese.mod.ConvertUnknownOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.encodingJapanese.mod.ConvertUnknownOptions]
    }
  }
  
  @js.native
  trait ConvertStringOptions extends ConvertOptions {
    
    var bom: js.UndefOr[Boolean | String] = js.native
    
    var from: js.UndefOr[Encoding] = js.native
    
    var to: Encoding = js.native
    
    var `type`: string = js.native
  }
  object ConvertStringOptions {
    
    @scala.inline
    def apply(to: Encoding, `type`: string): ConvertStringOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertStringOptions]
    }
    
    @scala.inline
    implicit class ConvertStringOptionsMutableBuilder[Self <: ConvertStringOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBom(value: Boolean | String): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      @scala.inline
      def setFrom(value: Encoding): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setTo(value: Encoding): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConvertUnknownOptions extends ConvertOptions {
    
    var bom: js.UndefOr[Boolean | String] = js.native
    
    var from: js.UndefOr[Encoding] = js.native
    
    var to: Encoding = js.native
  }
  object ConvertUnknownOptions {
    
    @scala.inline
    def apply(to: Encoding): ConvertUnknownOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertUnknownOptions]
    }
    
    @scala.inline
    implicit class ConvertUnknownOptionsMutableBuilder[Self <: ConvertUnknownOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBom(value: Boolean | String): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      @scala.inline
      def setFrom(value: Encoding): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setTo(value: Encoding): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def ASCII: typings.encodingJapanese.encodingJapaneseStrings.ASCII = "ASCII".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.ASCII]
    
    @scala.inline
    def AUTO: typings.encodingJapanese.encodingJapaneseStrings.AUTO = "AUTO".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.AUTO]
    
    @scala.inline
    def BINARY: typings.encodingJapanese.encodingJapaneseStrings.BINARY = "BINARY".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.BINARY]
    
    @scala.inline
    def EUCJP: typings.encodingJapanese.encodingJapaneseStrings.EUCJP = "EUCJP".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.EUCJP]
    
    @scala.inline
    def JIS: typings.encodingJapanese.encodingJapaneseStrings.JIS = "JIS".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.JIS]
    
    @scala.inline
    def SJIS: typings.encodingJapanese.encodingJapaneseStrings.SJIS = "SJIS".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.SJIS]
    
    @scala.inline
    def UNICODE: typings.encodingJapanese.encodingJapaneseStrings.UNICODE = "UNICODE".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UNICODE]
    
    @scala.inline
    def UTF16: typings.encodingJapanese.encodingJapaneseStrings.UTF16 = "UTF16".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UTF16]
    
    @scala.inline
    def UTF16BE: typings.encodingJapanese.encodingJapaneseStrings.UTF16BE = "UTF16BE".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UTF16BE]
    
    @scala.inline
    def UTF16LE: typings.encodingJapanese.encodingJapaneseStrings.UTF16LE = "UTF16LE".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UTF16LE]
    
    @scala.inline
    def UTF32: typings.encodingJapanese.encodingJapaneseStrings.UTF32 = "UTF32".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UTF32]
    
    @scala.inline
    def UTF8: typings.encodingJapanese.encodingJapaneseStrings.UTF8 = "UTF8".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UTF8]
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
    
    @scala.inline
    def ASCII: typings.encodingJapanese.encodingJapaneseStrings.ASCII = "ASCII".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.ASCII]
    
    @scala.inline
    def AUTO: typings.encodingJapanese.encodingJapaneseStrings.AUTO = "AUTO".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.AUTO]
    
    @scala.inline
    def BINARY: typings.encodingJapanese.encodingJapaneseStrings.BINARY = "BINARY".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.BINARY]
    
    @scala.inline
    def EUCJP: typings.encodingJapanese.encodingJapaneseStrings.EUCJP = "EUCJP".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.EUCJP]
    
    @scala.inline
    def JIS: typings.encodingJapanese.encodingJapaneseStrings.JIS = "JIS".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.JIS]
    
    @scala.inline
    def SJIS: typings.encodingJapanese.encodingJapaneseStrings.SJIS = "SJIS".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.SJIS]
    
    @scala.inline
    def UNICODE: typings.encodingJapanese.encodingJapaneseStrings.UNICODE = "UNICODE".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UNICODE]
    
    @scala.inline
    def UTF16: typings.encodingJapanese.encodingJapaneseStrings.UTF16 = "UTF16".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UTF16]
    
    @scala.inline
    def UTF16BE: typings.encodingJapanese.encodingJapaneseStrings.UTF16BE = "UTF16BE".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UTF16BE]
    
    @scala.inline
    def UTF16LE: typings.encodingJapanese.encodingJapaneseStrings.UTF16LE = "UTF16LE".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UTF16LE]
    
    @scala.inline
    def UTF32: typings.encodingJapanese.encodingJapaneseStrings.UTF32 = "UTF32".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UTF32]
    
    @scala.inline
    def UTF8: typings.encodingJapanese.encodingJapaneseStrings.UTF8 = "UTF8".asInstanceOf[typings.encodingJapanese.encodingJapaneseStrings.UTF8]
    
    @scala.inline
    def `false`: typings.encodingJapanese.encodingJapaneseBooleans.`false` = false.asInstanceOf[typings.encodingJapanese.encodingJapaneseBooleans.`false`]
  }
  
  type IntArrayType = js.Array[Double] | Uint8Array | Uint16Array | Uint32Array | Int8Array | Int16Array | Int32Array
  
  type RawType = IntArrayType | js.Array[Double] | Buffer
}
