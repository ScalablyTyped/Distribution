package typings.expressFlash2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Flash extends StObject {
    
    var flash: js.UndefOr[typings.expressFlash2.mod.global.Express.Flash] = js.undefined
  }
  object Flash {
    
    @scala.inline
    def apply(): Flash = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Flash]
    }
    
    @scala.inline
    implicit class FlashMutableBuilder[Self <: Flash] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlash(value: typings.expressFlash2.mod.global.Express.Flash): Self = StObject.set(x, "flash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlashUndefined: Self = StObject.set(x, "flash", js.undefined)
    }
  }
}
