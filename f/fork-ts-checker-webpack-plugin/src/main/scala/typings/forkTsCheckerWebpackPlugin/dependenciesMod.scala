package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependenciesMod {
  
  @js.native
  trait Dependencies extends StObject {
    
    var dirs: js.Array[String] = js.native
    
    var extensions: js.Array[String] = js.native
    
    var files: js.Array[String] = js.native
  }
  object Dependencies {
    
    @scala.inline
    def apply(dirs: js.Array[String], extensions: js.Array[String], files: js.Array[String]): Dependencies = {
      val __obj = js.Dynamic.literal(dirs = dirs.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dependencies]
    }
    
    @scala.inline
    implicit class DependenciesMutableBuilder[Self <: Dependencies] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirs(value: js.Array[String]): Self = StObject.set(x, "dirs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirsVarargs(value: String*): Self = StObject.set(x, "dirs", js.Array(value :_*))
      
      @scala.inline
      def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
    }
  }
}
