package typings.fastList

import org.scalablytyped.runtime.Shortcut
import typings.fastList.mod.FastListFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object FastList extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("FastList")
    @js.native
    open class ^[T] ()
      extends StObject
         with typings.fastList.mod.List[T]
    
    @JSGlobal("FastList")
    @js.native
    val ^ : FastListFactory = js.native
    
    type _To = FastListFactory
    
    /* This means you don't have to write `^`, but can instead just say `FastList.foo` */
    override def _to: FastListFactory = ^
  }
}
