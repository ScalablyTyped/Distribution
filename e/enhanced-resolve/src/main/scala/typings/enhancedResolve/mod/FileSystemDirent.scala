package typings.enhancedResolve.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemDirent extends StObject {
  
  def isDirectory(): Boolean
  
  def isFile(): Boolean
  
  var name: String | Buffer
}
object FileSystemDirent {
  
  inline def apply(isDirectory: () => Boolean, isFile: () => Boolean, name: String | Buffer): FileSystemDirent = {
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), isFile = js.Any.fromFunction0(isFile), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemDirent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSystemDirent] (val x: Self) extends AnyVal {
    
    inline def setIsDirectory(value: () => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction0(value))
    
    inline def setIsFile(value: () => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction0(value))
    
    inline def setName(value: String | Buffer): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
