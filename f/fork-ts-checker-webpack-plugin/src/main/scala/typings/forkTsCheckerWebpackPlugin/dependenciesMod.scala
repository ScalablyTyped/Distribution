package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependenciesMod {
  
  trait Dependencies extends StObject {
    
    var dirs: js.Array[String]
    
    var extensions: js.Array[String]
    
    var files: js.Array[String]
  }
  object Dependencies {
    
    inline def apply(dirs: js.Array[String], extensions: js.Array[String], files: js.Array[String]): Dependencies = {
      val __obj = js.Dynamic.literal(dirs = dirs.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dependencies]
    }
    
    extension [Self <: Dependencies](x: Self) {
      
      inline def setDirs(value: js.Array[String]): Self = StObject.set(x, "dirs", value.asInstanceOf[js.Any])
      
      inline def setDirsVarargs(value: String*): Self = StObject.set(x, "dirs", js.Array(value :_*))
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
    }
  }
}
