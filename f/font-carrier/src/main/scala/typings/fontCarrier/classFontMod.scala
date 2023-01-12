package typings.fontCarrier

import typings.fontCarrier.classFontfaceMod.FontFaceOptions
import typings.fontCarrier.classGlyphMod.GlyphOptions
import typings.node.bufferMod.global.Buffer
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classFontMod {
  
  /** 一个 font 对象就表示解析后的字体对象，包含字体所有的信息 */
  @JSImport("font-carrier/class/font", JSImport.Namespace)
  @js.native
  open class ^ () extends Font
  
  trait FileOptions extends StObject {
    
    /** 支持文件地址，也支持文件 buffer */
    var path: js.UndefOr[String | Buffer] = js.undefined
    
    /** 导出的字体类型 */
    var types: js.UndefOr[js.Array[FontType]] = js.undefined
  }
  object FileOptions {
    
    inline def apply(): FileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileOptions] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String | Buffer): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setTypes(value: js.Array[FontType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setTypesVarargs(value: FontType*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
  
  /** 一个 font 对象就表示解析后的字体对象，包含字体所有的信息 */
  @js.native
  trait Font
    extends typings.fontCarrier.classBaseMod.^[FontOptions] {
    
    /** 返回所有的字体对象集合 */
    def allGlyph(): Record[String, typings.fontCarrier.classGlyphMod.^] = js.native
    
    /** 将当前字体的所有字形清空 */
    def clean(): Font = js.native
    
    /** 获取对应的 fontface 对象 */
    def getFontface(): typings.fontCarrier.classFontfaceMod.^ = js.native
    
    /** 获取指定文字（keys）的 glyph 对象, 如果是单个字就返回一个 glyph 对象，否则返回一个 hash 对象，key 是 unicode，value 是对应的 glyph 对象 */
    def getGlyph(keys: String): typings.fontCarrier.classGlyphMod.^ | (Record[String, typings.fontCarrier.classGlyphMod.^]) = js.native
    def getGlyph(keys: js.Array[String]): typings.fontCarrier.classGlyphMod.^ | (Record[String, typings.fontCarrier.classGlyphMod.^]) = js.native
    
    /** 获取指定文字（keys）的 SVG。 */
    def getSvg(keys: String): String | (Map[String, String]) = js.native
    
    /**
      * 精简当前字体
      * @param input input 是一个字符串，支持 unicode，会去掉 font 里面除 input 用到的字形之外所有的字形
      */
    def min(input: String): Font = js.native
    
    /**
      * 导出字体
      * @param options
      */
    def output(): js.Array[Buffer] = js.native
    def output(options: FileOptions): js.Array[Buffer] = js.native
    
    def setFontface(fontFace: FontFaceOptions): Unit = js.native
    /** 设置对应的 fontface 对象 */
    def setFontface(fontFace: typings.fontCarrier.classFontfaceMod.^): Unit = js.native
    
    /** 用于针对字设置对应的 glyph 对象 */
    def setGlyph(arg0: Record[String, typings.fontCarrier.classGlyphMod.^ | GlyphOptions]): Unit = js.native
    def setGlyph(key: String, value: GlyphOptions): Unit = js.native
    /** 用于针对字设置对应的 glyph 对象 */
    def setGlyph(key: String, value: typings.fontCarrier.classGlyphMod.^): Unit = js.native
    
    /** 用于针对字设置对应的 SVG 图形 key是对应的字，也可以是 unicode, value是对应的svg图形 */
    def setSvg(key: String, value: String): Unit = js.native
    /** 用于针对字设置对应的 SVG 图形, 可用于设置多个 */
    def setSvg(obj: Record[String, String]): Unit = js.native
  }
  
  trait FontOptions extends StObject {
    
    /** 字体的水平画布大小，默认是 1024 */
    var horizAdvX: Double
    
    /** 字体的 postscript name，默认是 1024 */
    var id: String
    
    /** 字体的垂直画布大小，默认是 1024 */
    var vertAdvY: Double
  }
  object FontOptions {
    
    inline def apply(horizAdvX: Double, id: String, vertAdvY: Double): FontOptions = {
      val __obj = js.Dynamic.literal(horizAdvX = horizAdvX.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], vertAdvY = vertAdvY.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FontOptions] (val x: Self) extends AnyVal {
      
      inline def setHorizAdvX(value: Double): Self = StObject.set(x, "horizAdvX", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setVertAdvY(value: Double): Self = StObject.set(x, "vertAdvY", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fontCarrier.fontCarrierStrings.ttf
    - typings.fontCarrier.fontCarrierStrings.eot
    - typings.fontCarrier.fontCarrierStrings.woff
    - typings.fontCarrier.fontCarrierStrings.woff2
    - typings.fontCarrier.fontCarrierStrings.svg
  */
  trait FontType extends StObject
  object FontType {
    
    inline def eot: typings.fontCarrier.fontCarrierStrings.eot = "eot".asInstanceOf[typings.fontCarrier.fontCarrierStrings.eot]
    
    inline def svg: typings.fontCarrier.fontCarrierStrings.svg = "svg".asInstanceOf[typings.fontCarrier.fontCarrierStrings.svg]
    
    inline def ttf: typings.fontCarrier.fontCarrierStrings.ttf = "ttf".asInstanceOf[typings.fontCarrier.fontCarrierStrings.ttf]
    
    inline def woff: typings.fontCarrier.fontCarrierStrings.woff = "woff".asInstanceOf[typings.fontCarrier.fontCarrierStrings.woff]
    
    inline def woff2: typings.fontCarrier.fontCarrierStrings.woff2 = "woff2".asInstanceOf[typings.fontCarrier.fontCarrierStrings.woff2]
  }
}
