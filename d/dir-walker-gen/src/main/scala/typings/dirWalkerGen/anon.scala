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
    
    @scala.inline
    def apply(folders: js.Array[String]): ExcludeExtensions = {
      val __obj = js.Dynamic.literal(folders = folders.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExcludeExtensions]
    }
    
    @scala.inline
    implicit class ExcludeExtensionsMutableBuilder[Self <: ExcludeExtensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcludeExtensions(value: js.Array[String]): Self = StObject.set(x, "excludeExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeExtensionsUndefined: Self = StObject.set(x, "excludeExtensions", js.undefined)
      
      @scala.inline
      def setExcludeExtensionsVarargs(value: String*): Self = StObject.set(x, "excludeExtensions", js.Array(value :_*))
      
      @scala.inline
      def setExcludeFolders(value: js.Array[String]): Self = StObject.set(x, "excludeFolders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeFoldersUndefined: Self = StObject.set(x, "excludeFolders", js.undefined)
      
      @scala.inline
      def setExcludeFoldersVarargs(value: String*): Self = StObject.set(x, "excludeFolders", js.Array(value :_*))
      
      @scala.inline
      def setFolders(value: js.Array[String]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFoldersVarargs(value: String*): Self = StObject.set(x, "folders", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreDotDir(value: Boolean): Self = StObject.set(x, "ignoreDotDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDotDirUndefined: Self = StObject.set(x, "ignoreDotDir", js.undefined)
      
      @scala.inline
      def setIncludeExtensions(value: js.Array[String]): Self = StObject.set(x, "includeExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeExtensionsUndefined: Self = StObject.set(x, "includeExtensions", js.undefined)
      
      @scala.inline
      def setIncludeExtensionsVarargs(value: String*): Self = StObject.set(x, "includeExtensions", js.Array(value :_*))
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
}
