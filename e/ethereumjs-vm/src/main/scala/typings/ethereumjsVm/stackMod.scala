package typings.ethereumjsVm

import typings.bnJs.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-vm/dist/evm/stack", JSImport.Namespace)
@js.native
object stackMod extends js.Object {
  
  @js.native
  trait Stack extends js.Object {
    
    var _store: js.Array[^] = js.native
    
    /**
      * Pushes a copy of an item in the stack.
      * @param position - Index of item to be copied (1-indexed)
      */
    def dup(position: Double): Unit = js.native
    
    def length: Double = js.native
    
    def pop(): ^ = js.native
    
    /**
      * Pop multiple items from stack. Top of stack is first item
      * in returned array.
      * @param num - Number of items to pop
      */
    def popN(): js.Array[^] = js.native
    def popN(num: Double): js.Array[^] = js.native
    
    def push(value: ^): Unit = js.native
    
    /**
      * Swap top of stack with an item in the stack.
      * @param position - Index of item from top of the stack (0-indexed)
      */
    def swap(position: Double): Unit = js.native
  }
  
  @js.native
  class default () extends Stack
}
