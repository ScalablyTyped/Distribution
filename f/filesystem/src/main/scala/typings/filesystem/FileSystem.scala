package typings.filesystem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface represents a file system.
  */
trait FileSystem extends StObject {
  
  /**
    * This is the name of the file system. The specifics of naming filesystems is unspecified, but a name must be unique across the list of exposed file systems.
    * @readonly
    */
  var name: String
  
  /**
    * The root directory of the file system.
    * @readonly
    */
  var root: DirectoryEntry
}
object FileSystem {
  
  inline def apply(name: String, root: DirectoryEntry): FileSystem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystem]
  }
  
  extension [Self <: FileSystem](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: DirectoryEntry): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
