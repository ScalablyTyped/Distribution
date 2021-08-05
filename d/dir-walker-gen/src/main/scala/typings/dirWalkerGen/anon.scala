package typings.dirWalkerGen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ExcludeExtensions extends StObject {
    
    /**
      * List of extensions to ignore
      * @default []
      */
    var excludeExtensions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Exclude all folder that ends with any of the given strings
      * @default []
      */
    var excludeFolders: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * (Required) List of starting folders
      */
    var folders: js.Array[String]
    
    /**
      * Ignores directories that start with a dot (e.g. .git, .vscode, etc)
      * @default {false}
      */
    var ignoreDotDir: js.UndefOr[Boolean] = js.undefined
    
    /**
      * List of extensions to scan (all other extensions are ignored)
      * @default []
      */
    var includeExtensions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Does not show console warning when directories do not exist
      * @default {false}
      */
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object ExcludeExtensions {
    
    inline def apply(folders: js.Array[String]): ExcludeExtensions = {
      val __obj = js.Dynamic.literal(folders = folders.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExcludeExtensions]
    }
    
    extension [Self <: ExcludeExtensions](x: Self) {
      
      inline def setExcludeExtensions(value: js.Array[String]): Self = StObject.set(x, "excludeExtensions", value.asInstanceOf[js.Any])
      
      inline def setExcludeExtensionsUndefined: Self = StObject.set(x, "excludeExtensions", js.undefined)
      
      inline def setExcludeExtensionsVarargs(value: String*): Self = StObject.set(x, "excludeExtensions", js.Array(value :_*))
      
      inline def setExcludeFolders(value: js.Array[String]): Self = StObject.set(x, "excludeFolders", value.asInstanceOf[js.Any])
      
      inline def setExcludeFoldersUndefined: Self = StObject.set(x, "excludeFolders", js.undefined)
      
      inline def setExcludeFoldersVarargs(value: String*): Self = StObject.set(x, "excludeFolders", js.Array(value :_*))
      
      inline def setFolders(value: js.Array[String]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
      
      inline def setFoldersVarargs(value: String*): Self = StObject.set(x, "folders", js.Array(value :_*))
      
      inline def setIgnoreDotDir(value: Boolean): Self = StObject.set(x, "ignoreDotDir", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDotDirUndefined: Self = StObject.set(x, "ignoreDotDir", js.undefined)
      
      inline def setIncludeExtensions(value: js.Array[String]): Self = StObject.set(x, "includeExtensions", value.asInstanceOf[js.Any])
      
      inline def setIncludeExtensionsUndefined: Self = StObject.set(x, "includeExtensions", js.undefined)
      
      inline def setIncludeExtensionsVarargs(value: String*): Self = StObject.set(x, "includeExtensions", js.Array(value :_*))
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
}
