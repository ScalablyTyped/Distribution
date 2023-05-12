package typings.estreeWalker

import typings.estreeWalker.mod.AsyncHandler
import typings.estreeWalker.mod.SyncHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Enter extends StObject {
    
    var enter: js.UndefOr[SyncHandler] = js.undefined
    
    var leave: js.UndefOr[SyncHandler] = js.undefined
  }
  object Enter {
    
    inline def apply(): Enter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Enter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Enter] (val x: Self) extends AnyVal {
      
      inline def setEnter(value: SyncHandler): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setLeave(value: SyncHandler): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
      
      inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    }
  }
  
  trait Leave extends StObject {
    
    var enter: js.UndefOr[AsyncHandler] = js.undefined
    
    var leave: js.UndefOr[AsyncHandler] = js.undefined
  }
  object Leave {
    
    inline def apply(): Leave = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Leave]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Leave] (val x: Self) extends AnyVal {
      
      inline def setEnter(value: AsyncHandler): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setLeave(value: AsyncHandler): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
      
      inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    }
  }
}
