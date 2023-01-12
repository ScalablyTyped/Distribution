package typings.filesystem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface represents a file system.
  */
trait FileSystemSync extends StObject {
  
  /**
    * This is the name of the file system. The specifics of naming filesystems is unspecified, but a name must be unique across the list of exposed file systems.
    */
  var name: String
  
  /**
    * root The root directory of the file system.
    */
  var root: DirectoryEntrySync
}
object FileSystemSync {
  
  inline def apply(name: String, root: DirectoryEntrySync): FileSystemSync = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemSync]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSystemSync] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: DirectoryEntrySync): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
