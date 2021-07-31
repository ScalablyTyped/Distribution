package typings.glob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IsDirectory extends StObject {
    
    def isDirectory(): Boolean
  }
  object IsDirectory {
    
    @scala.inline
    def apply(isDirectory: () => Boolean): IsDirectory = {
      val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory))
      __obj.asInstanceOf[IsDirectory]
    }
    
    @scala.inline
    implicit class IsDirectoryMutableBuilder[Self <: IsDirectory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsDirectory(value: () => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction0(value))
    }
  }
}
