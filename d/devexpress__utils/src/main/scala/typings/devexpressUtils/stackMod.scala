package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackMod {
  
  @JSImport("@devexpress/utils/lib/class/stack", "Stack")
  @js.native
  class Stack[T] () extends StObject {
    
    var _count: js.Any = js.native
    
    val count: Double = js.native
    
    def getPrevious(): T = js.native
    
    var last: js.UndefOr[T] = js.native
    
    var list: js.Any = js.native
    
    def peek(): js.UndefOr[T] = js.native
    
    def pop(): js.UndefOr[T] = js.native
    
    def push(`val`: T): Unit = js.native
  }
}
