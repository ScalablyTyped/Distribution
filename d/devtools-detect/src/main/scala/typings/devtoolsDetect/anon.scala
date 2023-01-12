package typings.devtoolsDetect

import typings.devtoolsDetect.mod.Orientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IsOpen extends StObject {
    
    /**
    	Whether DevTools is open.
    	*/
    val isOpen: Boolean
    
    /**
    	Orientation of the DevTools if it's open.
    	*/
    val orientation: js.UndefOr[Orientation] = js.undefined
  }
  object IsOpen {
    
    inline def apply(isOpen: Boolean): IsOpen = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsOpen]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsOpen] (val x: Self) extends AnyVal {
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    }
  }
}
