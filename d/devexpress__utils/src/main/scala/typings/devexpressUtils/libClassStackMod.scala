package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassStackMod {
  
  @JSImport("@devexpress/utils/lib/class/stack", "Stack")
  @js.native
  open class Stack[T] () extends StObject {
    
    /* private */ var _count: Any = js.native
    
    def count: Double = js.native
    
    def getPrevious(): T = js.native
    
    var last: js.UndefOr[T] = js.native
    
    /* private */ var list: Any = js.native
    
    def peek(): js.UndefOr[T] = js.native
    
    def pop(): js.UndefOr[T] = js.native
    
    def push(`val`: T): Unit = js.native
  }
}
