package typings.fontmin

import typings.fontmin.anon.AjdustToEmBox
import typings.fontmin.anon.Contents
import typings.fontmin.anon.FontFamily
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fontmin", JSImport.Namespace)
  @js.native
  open class ^[SrcType /* <: ProbableAsSrc */] () extends Fontmin[SrcType]
  @JSImport("fontmin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def css(opts: CssOption): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(opts.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  /* static member */
  inline def glyph(opts: GlyphOption): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("glyph")(opts.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  /* static member */
  object mime {
    
    @JSImport("fontmin", "mime")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fontmin", "mime..*")
    @js.native
    def _empty: String = js.native
    
    inline def _empty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(".*")(x.asInstanceOf[js.Any])
    
    @JSImport("fontmin", "mime.eot")
    @js.native
    def eot: String = js.native
    inline def eot_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eot")(x.asInstanceOf[js.Any])
    
    @JSImport("fontmin", "mime.otf")
    @js.native
    def otf: String = js.native
    inline def otf_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("otf")(x.asInstanceOf[js.Any])
    
    @JSImport("fontmin", "mime.svg")
    @js.native
    def svg: String = js.native
    inline def svg_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("svg")(x.asInstanceOf[js.Any])
    
    @JSImport("fontmin", "mime.svgz")
    @js.native
    def svgz: String = js.native
    inline def svgz_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("svgz")(x.asInstanceOf[js.Any])
    
    @JSImport("fontmin", "mime.ttf")
    @js.native
    def ttf: String = js.native
    inline def ttf_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ttf")(x.asInstanceOf[js.Any])
    
    @JSImport("fontmin", "mime.woff")
    @js.native
    def woff: String = js.native
    
    @JSImport("fontmin", "mime.woff2")
    @js.native
    def woff2: String = js.native
    inline def woff2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("woff2")(x.asInstanceOf[js.Any])
    
    inline def woff_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("woff")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  inline def otf2ttf(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("otf2ttf")().asInstanceOf[Transform]
  inline def otf2ttf(opts: PluginCloneOption & PluginHintOption): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("otf2ttf")(opts.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  /* static member */
  @JSImport("fontmin", "plugins")
  @js.native
  def plugins: js.Array[String] = js.native
  inline def plugins_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plugins")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def svg2ttf(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("svg2ttf")().asInstanceOf[Transform]
  inline def svg2ttf(opts: PluginCloneOption & PluginHintOption): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("svg2ttf")(opts.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  /* static member */
  inline def svgs2ttf(file: String): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("svgs2ttf")(file.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def svgs2ttf(file: String, opts: PluginFromSVGOption): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("svgs2ttf")(file.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Transform]
  
  /* static member */
  inline def ttf2eot(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("ttf2eot")().asInstanceOf[Transform]
  inline def ttf2eot(opts: PluginCloneOption): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("ttf2eot")(opts.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  /* static member */
  inline def ttf2svg(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("ttf2svg")().asInstanceOf[Transform]
  inline def ttf2svg(opts: PluginCloneOption): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("ttf2svg")(opts.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  /* static member */
  inline def ttf2woff(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("ttf2woff")().asInstanceOf[Transform]
  inline def ttf2woff(opts: PluginCloneOption): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("ttf2woff")(opts.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  /* static member */
  inline def ttf2woff2(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("ttf2woff2")().asInstanceOf[Transform]
  inline def ttf2woff2(opts: PluginCloneOption): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("ttf2woff2")(opts.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  trait CssOption extends StObject {
    
    var asFileName: js.UndefOr[Boolean] = js.undefined
    
    var base64: js.UndefOr[Boolean] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var fontFamily: js.UndefOr[String | (js.Function2[/* fontinfo */ FontInfo, /* ttf */ Any, String])] = js.undefined
    
    var fontPath: js.UndefOr[String] = js.undefined
    
    var glyph: js.UndefOr[Boolean] = js.undefined
    
    var iconPrefix: js.UndefOr[String] = js.undefined
    
    var local: js.UndefOr[Boolean] = js.undefined
  }
  object CssOption {
    
    inline def apply(): CssOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CssOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CssOption] (val x: Self) extends AnyVal {
      
      inline def setAsFileName(value: Boolean): Self = StObject.set(x, "asFileName", value.asInstanceOf[js.Any])
      
      inline def setAsFileNameUndefined: Self = StObject.set(x, "asFileName", js.undefined)
      
      inline def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFontFamily(value: String | (js.Function2[/* fontinfo */ FontInfo, /* ttf */ Any, String])): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyFunction2(value: (/* fontinfo */ FontInfo, /* ttf */ Any) => String): Self = StObject.set(x, "fontFamily", js.Any.fromFunction2(value))
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontPath(value: String): Self = StObject.set(x, "fontPath", value.asInstanceOf[js.Any])
      
      inline def setFontPathUndefined: Self = StObject.set(x, "fontPath", js.undefined)
      
      inline def setGlyph(value: Boolean): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      inline def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
      
      inline def setIconPrefix(value: String): Self = StObject.set(x, "iconPrefix", value.asInstanceOf[js.Any])
      
      inline def setIconPrefixUndefined: Self = StObject.set(x, "iconPrefix", js.undefined)
      
      inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    }
  }
  
  trait FontInfo extends StObject {
    
    var base64: Boolean
    
    var fontFile: String
    
    var fontPath: String
    
    var glyph: Boolean
    
    var iconPrefix: String
    
    var local: Boolean
  }
  object FontInfo {
    
    inline def apply(
      base64: Boolean,
      fontFile: String,
      fontPath: String,
      glyph: Boolean,
      iconPrefix: String,
      local: Boolean
    ): FontInfo = {
      val __obj = js.Dynamic.literal(base64 = base64.asInstanceOf[js.Any], fontFile = fontFile.asInstanceOf[js.Any], fontPath = fontPath.asInstanceOf[js.Any], glyph = glyph.asInstanceOf[js.Any], iconPrefix = iconPrefix.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FontInfo] (val x: Self) extends AnyVal {
      
      inline def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setFontFile(value: String): Self = StObject.set(x, "fontFile", value.asInstanceOf[js.Any])
      
      inline def setFontPath(value: String): Self = StObject.set(x, "fontPath", value.asInstanceOf[js.Any])
      
      inline def setGlyph(value: Boolean): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      inline def setIconPrefix(value: String): Self = StObject.set(x, "iconPrefix", value.asInstanceOf[js.Any])
      
      inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fontmin[SrcType /* <: ProbableAsSrc */] extends EventEmitter {
    
    def dest(): String = js.native
    def dest(dir: String): Fontmin[SrcType] = js.native
    
    def run(cb: js.Function3[/* err */ js.Error, /* files */ js.Array[Contents], /* stream */ Any, Unit]): Any = js.native
    
    def src(): SrcType = js.native
    def src(file: String): Fontmin[String] = js.native
    def src(file: js.Array[String]): Fontmin[js.Array[String]] = js.native
    def src(file: Buffer): Fontmin[Buffer] = js.native
    
    def use(plugin: FontminPlugin): Fontmin[SrcType] = js.native
  }
  
  // tslint:disable-next-line ban-types
  type FontminPlugin = js.Function | Transform
  
  trait GlyphOption extends StObject {
    
    var basicText: js.UndefOr[Boolean] = js.undefined
    
    var hinting: js.UndefOr[Boolean] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var use: js.UndefOr[FontminPlugin] = js.undefined
  }
  object GlyphOption {
    
    inline def apply(): GlyphOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlyphOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlyphOption] (val x: Self) extends AnyVal {
      
      inline def setBasicText(value: Boolean): Self = StObject.set(x, "basicText", value.asInstanceOf[js.Any])
      
      inline def setBasicTextUndefined: Self = StObject.set(x, "basicText", js.undefined)
      
      inline def setHinting(value: Boolean): Self = StObject.set(x, "hinting", value.asInstanceOf[js.Any])
      
      inline def setHintingUndefined: Self = StObject.set(x, "hinting", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setUse(value: FontminPlugin): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    }
  }
  
  trait PluginCloneOption extends StObject {
    
    @JSName("clone")
    var clone_FPluginCloneOption: js.UndefOr[Boolean] = js.undefined
  }
  object PluginCloneOption {
    
    inline def apply(): PluginCloneOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginCloneOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluginCloneOption] (val x: Self) extends AnyVal {
      
      inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    }
  }
  
  trait PluginFromSVGOption
    extends StObject
       with PluginHintOption {
    
    var adjust: js.UndefOr[AjdustToEmBox] = js.undefined
    
    var fontName: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[FontFamily] = js.undefined
  }
  object PluginFromSVGOption {
    
    inline def apply(): PluginFromSVGOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginFromSVGOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluginFromSVGOption] (val x: Self) extends AnyVal {
      
      inline def setAdjust(value: AjdustToEmBox): Self = StObject.set(x, "adjust", value.asInstanceOf[js.Any])
      
      inline def setAdjustUndefined: Self = StObject.set(x, "adjust", js.undefined)
      
      inline def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
      
      inline def setFontNameUndefined: Self = StObject.set(x, "fontName", js.undefined)
      
      inline def setName(value: FontFamily): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait PluginHintOption extends StObject {
    
    var hinting: js.UndefOr[Boolean] = js.undefined
  }
  object PluginHintOption {
    
    inline def apply(): PluginHintOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginHintOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluginHintOption] (val x: Self) extends AnyVal {
      
      inline def setHinting(value: Boolean): Self = StObject.set(x, "hinting", value.asInstanceOf[js.Any])
      
      inline def setHintingUndefined: Self = StObject.set(x, "hinting", js.undefined)
    }
  }
  
  type ProbableAsSrc = js.Array[String] | String | Buffer
}
