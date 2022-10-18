package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptTypeScriptConfigOverwriteMod {
  
  trait TypeScriptConfigOverwrite extends StObject {
    
    var compilerOptions: js.UndefOr[Any] = js.undefined
    
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var `extends`: js.UndefOr[String] = js.undefined
    
    var files: js.UndefOr[js.Array[String]] = js.undefined
    
    var include: js.UndefOr[js.Array[String]] = js.undefined
    
    var references: js.UndefOr[js.Array[Path]] = js.undefined
  }
  object TypeScriptConfigOverwrite {
    
    inline def apply(): TypeScriptConfigOverwrite = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeScriptConfigOverwrite]
    }
    
    extension [Self <: TypeScriptConfigOverwrite](x: Self) {
      
      inline def setCompilerOptions(value: Any): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setReferences(value: js.Array[Path]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
      
      inline def setReferencesVarargs(value: Path*): Self = StObject.set(x, "references", js.Array(value*))
    }
  }
}
