package typings.estreeWalker

import typings.estree.mod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Enter extends StObject {
    
    var enter: js.UndefOr[
        js.ThisFunction4[
          /* this */ Remove, 
          /* node */ BaseNode, 
          /* parent */ BaseNode, 
          /* key */ String, 
          /* index */ Double, 
          js.Promise[Unit]
        ]
      ] = js.undefined
    
    var leave: js.UndefOr[
        js.ThisFunction4[
          /* this */ Remove, 
          /* node */ BaseNode, 
          /* parent */ BaseNode, 
          /* key */ String, 
          /* index */ Double, 
          js.Promise[Unit]
        ]
      ] = js.undefined
  }
  object Enter {
    
    inline def apply(): Enter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Enter]
    }
    
    extension [Self <: Enter](x: Self) {
      
      inline def setEnter(
        value: js.ThisFunction4[
              /* this */ Remove, 
              /* node */ BaseNode, 
              /* parent */ BaseNode, 
              /* key */ String, 
              /* index */ Double, 
              js.Promise[Unit]
            ]
      ): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setLeave(
        value: js.ThisFunction4[
              /* this */ Remove, 
              /* node */ BaseNode, 
              /* parent */ BaseNode, 
              /* key */ String, 
              /* index */ Double, 
              js.Promise[Unit]
            ]
      ): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
      
      inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    }
  }
  
  trait Leave extends StObject {
    
    var enter: js.UndefOr[
        js.ThisFunction4[
          /* this */ Remove, 
          /* node */ BaseNode, 
          /* parent */ BaseNode, 
          /* key */ String, 
          /* index */ Double, 
          Unit
        ]
      ] = js.undefined
    
    var leave: js.UndefOr[
        js.ThisFunction4[
          /* this */ Remove, 
          /* node */ BaseNode, 
          /* parent */ BaseNode, 
          /* key */ String, 
          /* index */ Double, 
          Unit
        ]
      ] = js.undefined
  }
  object Leave {
    
    inline def apply(): Leave = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Leave]
    }
    
    extension [Self <: Leave](x: Self) {
      
      inline def setEnter(
        value: js.ThisFunction4[
              /* this */ Remove, 
              /* node */ BaseNode, 
              /* parent */ BaseNode, 
              /* key */ String, 
              /* index */ Double, 
              Unit
            ]
      ): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setLeave(
        value: js.ThisFunction4[
              /* this */ Remove, 
              /* node */ BaseNode, 
              /* parent */ BaseNode, 
              /* key */ String, 
              /* index */ Double, 
              Unit
            ]
      ): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
      
      inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    }
  }
  
  trait Remove extends StObject {
    
    def remove(): Unit
    
    def replace(node: BaseNode): Unit
    
    def skip(): Unit
  }
  object Remove {
    
    inline def apply(remove: () => Unit, replace: BaseNode => Unit, skip: () => Unit): Remove = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove), replace = js.Any.fromFunction1(replace), skip = js.Any.fromFunction0(skip))
      __obj.asInstanceOf[Remove]
    }
    
    extension [Self <: Remove](x: Self) {
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setReplace(value: BaseNode => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
      
      inline def setSkip(value: () => Unit): Self = StObject.set(x, "skip", js.Any.fromFunction0(value))
    }
  }
}
