package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileFilter extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/file-filter
  var extensions: js.Array[String]
  
  var name: String
}
object FileFilter {
  
  @scala.inline
  def apply(extensions: js.Array[String], name: String): FileFilter = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileFilter]
  }
  
  @scala.inline
  implicit class FileFilterMutableBuilder[Self <: FileFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
