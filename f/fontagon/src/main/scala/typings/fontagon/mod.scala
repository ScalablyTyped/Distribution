package typings.fontagon

import typings.fontagon.anon.RecordStyleSheetGeneratio
import typings.fontagon.fontagonStrings.all
import typings.std.Record
import typings.svg2ttf.mod.FontOptions
import typings.svgicons2svgfont.mod.SvgIcons2FontOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * You can easily create web-icon-font by creating svg as font.
    */
  inline def apply(options: Options): js.Promise[Options] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Options]]
  
  @JSImport("fontagon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FormatOptions extends StObject {
    
    // provided to match convention, package has no options
    var eot: js.UndefOr[Record[String, Any]] = js.undefined
    
    var svg: js.UndefOr[SvgIcons2FontOptions] = js.undefined
    
    var ttf: js.UndefOr[FontOptions] = js.undefined
    
    var woff: js.UndefOr[typings.ttf2woff.mod.Options] = js.undefined
    
    // provided to match convention, package has no options
    var woff2: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object FormatOptions {
    
    inline def apply(): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptions]
    }
    
    extension [Self <: FormatOptions](x: Self) {
      
      inline def setEot(value: Record[String, Any]): Self = StObject.set(x, "eot", value.asInstanceOf[js.Any])
      
      inline def setEotUndefined: Self = StObject.set(x, "eot", js.undefined)
      
      inline def setSvg(value: SvgIcons2FontOptions): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
      
      inline def setTtf(value: FontOptions): Self = StObject.set(x, "ttf", value.asInstanceOf[js.Any])
      
      inline def setTtfUndefined: Self = StObject.set(x, "ttf", js.undefined)
      
      inline def setWoff(value: typings.ttf2woff.mod.Options): Self = StObject.set(x, "woff", value.asInstanceOf[js.Any])
      
      inline def setWoff2(value: Record[String, Any]): Self = StObject.set(x, "woff2", value.asInstanceOf[js.Any])
      
      inline def setWoff2Undefined: Self = StObject.set(x, "woff2", js.undefined)
      
      inline def setWoffUndefined: Self = StObject.set(x, "woff", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Additional options for CSS templates, that extends default options.
      */
    var classOptions: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * Specific codepoints for certain icons.
      * Icons without codepoints will have codepoints incremented from startCodepoint skipping duplicates.
      */
    var codepoints: js.UndefOr[Record[String, Double]] = js.undefined
    
    /**
      * Directory for generated font files.
      * Default: `dist/`
      */
    var dist: js.UndefOr[String] = js.undefined
    
    /**
      * List of SVG files.
      */
    var files: js.Array[String]
    
    /**
      * Specify a font name and the default name for the font file.
      * @default `fontagon-icons`
      */
    var fontName: js.UndefOr[String] = js.undefined
    
    /**
      * Specific per format arbitrary options to pass to the generator
      */
    var formatOptions: js.UndefOr[FormatOptions] = js.undefined
    
    // undocumented
    var html: js.UndefOr[Boolean] = js.undefined
    
    var htmlTemplate: js.UndefOr[String] = js.undefined
    
    var logs: js.UndefOr[Boolean] = js.undefined
    
    var normalize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Order of src values in font-face in CSS file.
      * @default ['eot', 'woff2', 'woff', 'ttf', 'svg']
      */
    var order: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Function that takes path of file and return name of icon.
      * @default basename of file
      */
    var rename: js.UndefOr[js.Function1[/* path */ String, js.UndefOr[String]]] = js.undefined
    
    /**
      * Starting codepoint. Defaults to beginning of unicode private area.
      * @default 0xF101
      */
    var startCodepoint: js.UndefOr[Double] = js.undefined
    
    /**
      * stylesheet file generation type
      * @default `all`
      */
    var style: js.UndefOr[StyleSheetGenerationType | all] = js.undefined
    
    /**
      * Specify a custom style template.
      */
    var styleTemplate: js.UndefOr[RecordStyleSheetGeneratio] = js.undefined
    
    var types: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * It is possible to not create files and get generated fonts in object to write them to files later.
      * @default true
      */
    var writeFiles: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(files: js.Array[String]): Options = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setClassOptions(value: Record[String, Any]): Self = StObject.set(x, "classOptions", value.asInstanceOf[js.Any])
      
      inline def setClassOptionsUndefined: Self = StObject.set(x, "classOptions", js.undefined)
      
      inline def setCodepoints(value: Record[String, Double]): Self = StObject.set(x, "codepoints", value.asInstanceOf[js.Any])
      
      inline def setCodepointsUndefined: Self = StObject.set(x, "codepoints", js.undefined)
      
      inline def setDist(value: String): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
      
      inline def setDistUndefined: Self = StObject.set(x, "dist", js.undefined)
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
      
      inline def setFontNameUndefined: Self = StObject.set(x, "fontName", js.undefined)
      
      inline def setFormatOptions(value: FormatOptions): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
      
      inline def setFormatOptionsUndefined: Self = StObject.set(x, "formatOptions", js.undefined)
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlTemplate(value: String): Self = StObject.set(x, "htmlTemplate", value.asInstanceOf[js.Any])
      
      inline def setHtmlTemplateUndefined: Self = StObject.set(x, "htmlTemplate", js.undefined)
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setLogs(value: Boolean): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      inline def setLogsUndefined: Self = StObject.set(x, "logs", js.undefined)
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setOrder(value: js.Array[String]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrderVarargs(value: String*): Self = StObject.set(x, "order", js.Array(value*))
      
      inline def setRename(value: /* path */ String => js.UndefOr[String]): Self = StObject.set(x, "rename", js.Any.fromFunction1(value))
      
      inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
      
      inline def setStartCodepoint(value: Double): Self = StObject.set(x, "startCodepoint", value.asInstanceOf[js.Any])
      
      inline def setStartCodepointUndefined: Self = StObject.set(x, "startCodepoint", js.undefined)
      
      inline def setStyle(value: StyleSheetGenerationType | all): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleTemplate(value: RecordStyleSheetGeneratio): Self = StObject.set(x, "styleTemplate", value.asInstanceOf[js.Any])
      
      inline def setStyleTemplateUndefined: Self = StObject.set(x, "styleTemplate", js.undefined)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
      
      inline def setWriteFiles(value: Boolean): Self = StObject.set(x, "writeFiles", value.asInstanceOf[js.Any])
      
      inline def setWriteFilesUndefined: Self = StObject.set(x, "writeFiles", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fontagon.fontagonStrings.css
    - typings.fontagon.fontagonStrings.sass
    - typings.fontagon.fontagonStrings.less
    - typings.fontagon.fontagonStrings.stylus
  */
  trait StyleSheetGenerationType extends StObject
  object StyleSheetGenerationType {
    
    inline def css: typings.fontagon.fontagonStrings.css = "css".asInstanceOf[typings.fontagon.fontagonStrings.css]
    
    inline def less: typings.fontagon.fontagonStrings.less = "less".asInstanceOf[typings.fontagon.fontagonStrings.less]
    
    inline def sass: typings.fontagon.fontagonStrings.sass = "sass".asInstanceOf[typings.fontagon.fontagonStrings.sass]
    
    inline def stylus: typings.fontagon.fontagonStrings.stylus = "stylus".asInstanceOf[typings.fontagon.fontagonStrings.stylus]
  }
}
