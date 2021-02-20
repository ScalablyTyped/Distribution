package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeScriptConfigurationOverwriteMod {
  
  @js.native
  trait TypeScriptConfigurationOverwrite extends StObject {
    
    var compilerOptions: js.UndefOr[js.Object] = js.native
    
    var exclude: js.UndefOr[js.Array[String]] = js.native
    
    var `extends`: js.UndefOr[String] = js.native
    
    var files: js.UndefOr[js.Array[String]] = js.native
    
    var include: js.UndefOr[js.Array[String]] = js.native
    
    var references: js.UndefOr[js.Array[Path]] = js.native
  }
  object TypeScriptConfigurationOverwrite {
    
    @scala.inline
    def apply(): TypeScriptConfigurationOverwrite = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeScriptConfigurationOverwrite]
    }
    
    @scala.inline
    implicit class TypeScriptConfigurationOverwriteMutableBuilder[Self <: TypeScriptConfigurationOverwrite] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompilerOptions(value: js.Object): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setReferences(value: js.Array[Path]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
      
      @scala.inline
      def setReferencesVarargs(value: Path*): Self = StObject.set(x, "references", js.Array(value :_*))
    }
  }
}
