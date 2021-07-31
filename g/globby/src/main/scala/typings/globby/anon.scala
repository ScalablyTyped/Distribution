package typings.globby

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Extensions extends StObject {
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var files: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Extensions {
    
    @scala.inline
    def apply(): Extensions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Extensions]
    }
    
    @scala.inline
    implicit class ExtensionsMutableBuilder[Self <: Extensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
    }
  }
}
