package typings.fontCarrier

import typings.fontCarrier.anon.Partialpathstringwidthnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classGlyphMod {
  
  /** glyph 字形对象代表了具体某个字的信息 */
  @JSImport("font-carrier/class/glyph", JSImport.Namespace)
  @js.native
  open class ^ () extends Glyph
  
  /** glyph 字形对象代表了具体某个字的信息 */
  @js.native
  trait Glyph
    extends typings.fontCarrier.classBaseMod.^[GlyphOptions] {
    
    /**
      * 获取当前字形对应的字体对象
      */
    def getFont(): typings.fontCarrier.classFontMod.^ = js.native
    
    /**
      * 设置当前 glyph 的字体，会按照新的字体做一系列的变换
      * @param font
      */
    def setFont(font: typings.fontCarrier.classFontMod.^): Unit = js.native
    
    /**
      * 导出当前字形对象的 SVG
      * @param path
      * @param options
      */
    def toSvg(): String = js.native
    def toSvg(options: Partialpathstringwidthnum): String = js.native
  }
  
  trait GlyphOptions extends StObject {
    
    /** 字体对应的序列，这个是具体的字体形状, 不是是做了变化之后的，不建议直接使用这个 d ，建议使用 SVG 参数替代，内部会帮忙把 SVG 转换成对应的 d 参数 */
    var d: String
    
    /** 字体对应的名称,默认是 unicode */
    var glyphName: String
    
    /** 字体的水平画布大小，默认 1024 */
    var horizAdvX: Double
    
    /** 字体对应的 unicode */
    var unicode: String
    
    /** 字体的垂直画布大小，默认 1024 */
    var vertAdvY: Double
  }
  object GlyphOptions {
    
    inline def apply(d: String, glyphName: String, horizAdvX: Double, unicode: String, vertAdvY: Double): GlyphOptions = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], glyphName = glyphName.asInstanceOf[js.Any], horizAdvX = horizAdvX.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any], vertAdvY = vertAdvY.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlyphOptions]
    }
    
    extension [Self <: GlyphOptions](x: Self) {
      
      inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setGlyphName(value: String): Self = StObject.set(x, "glyphName", value.asInstanceOf[js.Any])
      
      inline def setHorizAdvX(value: Double): Self = StObject.set(x, "horizAdvX", value.asInstanceOf[js.Any])
      
      inline def setUnicode(value: String): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      inline def setVertAdvY(value: Double): Self = StObject.set(x, "vertAdvY", value.asInstanceOf[js.Any])
    }
  }
}
