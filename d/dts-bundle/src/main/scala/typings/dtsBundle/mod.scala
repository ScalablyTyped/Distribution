package typings.dtsBundle

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dts-bundle", "bundle")
  @js.native
  def bundle(opts: Options): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    var baseDir: js.UndefOr[String] = js.native
    
    var emitOnIncludedFileNotFound: js.UndefOr[Boolean] = js.native
    
    var emitOnNoIncludedFileNotFound: js.UndefOr[Boolean] = js.native
    
    var exclude: js.UndefOr[RegExp | (js.Function2[/* file */ String, /* external */ Boolean, Boolean])] = js.native
    
    var externals: js.UndefOr[Boolean] = js.native
    
    var headerPath: js.UndefOr[String] = js.native
    
    var headerText: js.UndefOr[String] = js.native
    
    var indent: js.UndefOr[String] = js.native
    
    var main: String = js.native
    
    var name: String = js.native
    
    var newLine: js.UndefOr[String] = js.native
    
    var out: js.UndefOr[String] = js.native
    
    var outputAsModuleFolder: js.UndefOr[Boolean] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var referenceExternals: js.UndefOr[Boolean] = js.native
    
    var removeSource: js.UndefOr[Boolean] = js.native
    
    var separator: js.UndefOr[String] = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(main: String, name: String): Options = {
      val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseDirUndefined: Self = StObject.set(x, "baseDir", js.undefined)
      
      @scala.inline
      def setEmitOnIncludedFileNotFound(value: Boolean): Self = StObject.set(x, "emitOnIncludedFileNotFound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitOnIncludedFileNotFoundUndefined: Self = StObject.set(x, "emitOnIncludedFileNotFound", js.undefined)
      
      @scala.inline
      def setEmitOnNoIncludedFileNotFound(value: Boolean): Self = StObject.set(x, "emitOnNoIncludedFileNotFound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitOnNoIncludedFileNotFoundUndefined: Self = StObject.set(x, "emitOnNoIncludedFileNotFound", js.undefined)
      
      @scala.inline
      def setExclude(value: RegExp | (js.Function2[/* file */ String, /* external */ Boolean, Boolean])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeFunction2(value: (/* file */ String, /* external */ Boolean) => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExternals(value: Boolean): Self = StObject.set(x, "externals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalsUndefined: Self = StObject.set(x, "externals", js.undefined)
      
      @scala.inline
      def setHeaderPath(value: String): Self = StObject.set(x, "headerPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderPathUndefined: Self = StObject.set(x, "headerPath", js.undefined)
      
      @scala.inline
      def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewLine(value: String): Self = StObject.set(x, "newLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewLineUndefined: Self = StObject.set(x, "newLine", js.undefined)
      
      @scala.inline
      def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      @scala.inline
      def setOutputAsModuleFolder(value: Boolean): Self = StObject.set(x, "outputAsModuleFolder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputAsModuleFolderUndefined: Self = StObject.set(x, "outputAsModuleFolder", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setReferenceExternals(value: Boolean): Self = StObject.set(x, "referenceExternals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceExternalsUndefined: Self = StObject.set(x, "referenceExternals", js.undefined)
      
      @scala.inline
      def setRemoveSource(value: Boolean): Self = StObject.set(x, "removeSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveSourceUndefined: Self = StObject.set(x, "removeSource", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
