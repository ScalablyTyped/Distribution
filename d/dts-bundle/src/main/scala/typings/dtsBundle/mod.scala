package typings.dtsBundle

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dts-bundle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bundle(opts: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var baseDir: js.UndefOr[String] = js.undefined
    
    var emitOnIncludedFileNotFound: js.UndefOr[Boolean] = js.undefined
    
    var emitOnNoIncludedFileNotFound: js.UndefOr[Boolean] = js.undefined
    
    var exclude: js.UndefOr[js.RegExp | (js.Function2[/* file */ String, /* external */ Boolean, Boolean])] = js.undefined
    
    var externals: js.UndefOr[Boolean] = js.undefined
    
    var headerPath: js.UndefOr[String] = js.undefined
    
    var headerText: js.UndefOr[String] = js.undefined
    
    var indent: js.UndefOr[String] = js.undefined
    
    var main: String
    
    var name: String
    
    var newLine: js.UndefOr[String] = js.undefined
    
    var out: js.UndefOr[String] = js.undefined
    
    var outputAsModuleFolder: js.UndefOr[Boolean] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var referenceExternals: js.UndefOr[Boolean] = js.undefined
    
    var removeSource: js.UndefOr[Boolean] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(main: String, name: String): Options = {
      val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      inline def setBaseDirUndefined: Self = StObject.set(x, "baseDir", js.undefined)
      
      inline def setEmitOnIncludedFileNotFound(value: Boolean): Self = StObject.set(x, "emitOnIncludedFileNotFound", value.asInstanceOf[js.Any])
      
      inline def setEmitOnIncludedFileNotFoundUndefined: Self = StObject.set(x, "emitOnIncludedFileNotFound", js.undefined)
      
      inline def setEmitOnNoIncludedFileNotFound(value: Boolean): Self = StObject.set(x, "emitOnNoIncludedFileNotFound", value.asInstanceOf[js.Any])
      
      inline def setEmitOnNoIncludedFileNotFoundUndefined: Self = StObject.set(x, "emitOnNoIncludedFileNotFound", js.undefined)
      
      inline def setExclude(value: js.RegExp | (js.Function2[/* file */ String, /* external */ Boolean, Boolean])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeFunction2(value: (/* file */ String, /* external */ Boolean) => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction2(value))
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExternals(value: Boolean): Self = StObject.set(x, "externals", value.asInstanceOf[js.Any])
      
      inline def setExternalsUndefined: Self = StObject.set(x, "externals", js.undefined)
      
      inline def setHeaderPath(value: String): Self = StObject.set(x, "headerPath", value.asInstanceOf[js.Any])
      
      inline def setHeaderPathUndefined: Self = StObject.set(x, "headerPath", js.undefined)
      
      inline def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      inline def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNewLine(value: String): Self = StObject.set(x, "newLine", value.asInstanceOf[js.Any])
      
      inline def setNewLineUndefined: Self = StObject.set(x, "newLine", js.undefined)
      
      inline def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      inline def setOutputAsModuleFolder(value: Boolean): Self = StObject.set(x, "outputAsModuleFolder", value.asInstanceOf[js.Any])
      
      inline def setOutputAsModuleFolderUndefined: Self = StObject.set(x, "outputAsModuleFolder", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setReferenceExternals(value: Boolean): Self = StObject.set(x, "referenceExternals", value.asInstanceOf[js.Any])
      
      inline def setReferenceExternalsUndefined: Self = StObject.set(x, "referenceExternals", js.undefined)
      
      inline def setRemoveSource(value: Boolean): Self = StObject.set(x, "removeSource", value.asInstanceOf[js.Any])
      
      inline def setRemoveSourceUndefined: Self = StObject.set(x, "removeSource", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
