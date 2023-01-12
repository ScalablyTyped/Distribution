package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFilesMatchMod {
  
  trait FilesMatch extends StObject {
    
    var dirs: js.Array[String]
    
    var excluded: js.Array[String]
    
    var extensions: js.Array[String]
    
    var files: js.Array[String]
  }
  object FilesMatch {
    
    inline def apply(
      dirs: js.Array[String],
      excluded: js.Array[String],
      extensions: js.Array[String],
      files: js.Array[String]
    ): FilesMatch = {
      val __obj = js.Dynamic.literal(dirs = dirs.asInstanceOf[js.Any], excluded = excluded.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilesMatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilesMatch] (val x: Self) extends AnyVal {
      
      inline def setDirs(value: js.Array[String]): Self = StObject.set(x, "dirs", value.asInstanceOf[js.Any])
      
      inline def setDirsVarargs(value: String*): Self = StObject.set(x, "dirs", js.Array(value*))
      
      inline def setExcluded(value: js.Array[String]): Self = StObject.set(x, "excluded", value.asInstanceOf[js.Any])
      
      inline def setExcludedVarargs(value: String*): Self = StObject.set(x, "excluded", js.Array(value*))
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    }
  }
}
