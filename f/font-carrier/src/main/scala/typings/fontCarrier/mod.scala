package typings.fontCarrier

import typings.fontCarrier.classFontMod.FileOptions
import typings.fontCarrier.classFontMod.FontOptions
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("font-carrier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** 一个 font 对象就表示解析后的字体对象，包含字体所有的信息 */
  @JSImport("font-carrier", "Font")
  @js.native
  open class Font ()
    extends typings.fontCarrier.classFontMod.^
  
  /** fontface 对象包含了字体的一些特殊相关信息 */
  @JSImport("font-carrier", "FontFace")
  @js.native
  open class FontFace ()
    extends typings.fontCarrier.classFontfaceMod.^
  
  /** glyph 字形对象代表了具体某个字的信息 */
  @JSImport("font-carrier", "Glyph")
  @js.native
  open class Glyph ()
    extends typings.fontCarrier.classGlyphMod.^
  
  inline def create(): typings.fontCarrier.classFontMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.fontCarrier.classFontMod.^]
  inline def create(options: FileOptions): typings.fontCarrier.classFontMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.fontCarrier.classFontMod.^]
  
  inline def transfer(path: String): typings.fontCarrier.classFontMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("transfer")(path.asInstanceOf[js.Any]).asInstanceOf[typings.fontCarrier.classFontMod.^]
  inline def transfer(path: String, options: FontOptions): typings.fontCarrier.classFontMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("transfer")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fontCarrier.classFontMod.^]
  inline def transfer(path: Buffer): typings.fontCarrier.classFontMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("transfer")(path.asInstanceOf[js.Any]).asInstanceOf[typings.fontCarrier.classFontMod.^]
  inline def transfer(path: Buffer, options: FontOptions): typings.fontCarrier.classFontMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("transfer")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fontCarrier.classFontMod.^]
}
