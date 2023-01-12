package typings.glob.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDirectory extends StObject {
  
  def isDirectory(): Boolean
}
object IsDirectory {
  
  inline def apply(isDirectory: () => Boolean): IsDirectory = {
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory))
    __obj.asInstanceOf[IsDirectory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsDirectory] (val x: Self) extends AnyVal {
    
    inline def setIsDirectory(value: () => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction0(value))
  }
}
