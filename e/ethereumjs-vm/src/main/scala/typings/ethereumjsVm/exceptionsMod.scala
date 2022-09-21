package typings.ethereumjsVm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exceptionsMod {
  
  @js.native
  sealed trait ERROR extends StObject
  @JSImport("ethereumjs-vm/dist/exceptions", "ERROR")
  @js.native
  object ERROR extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ERROR & String] = js.native
    
    @js.native
    sealed trait CREATE_COLLISION
      extends StObject
         with ERROR
    /* "create collision" */ val CREATE_COLLISION: typings.ethereumjsVm.exceptionsMod.ERROR.CREATE_COLLISION & String = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR
      extends StObject
         with ERROR
    /* "internal error" */ val INTERNAL_ERROR: typings.ethereumjsVm.exceptionsMod.ERROR.INTERNAL_ERROR & String = js.native
    
    @js.native
    sealed trait INVALID_JUMP
      extends StObject
         with ERROR
    /* "invalid JUMP" */ val INVALID_JUMP: typings.ethereumjsVm.exceptionsMod.ERROR.INVALID_JUMP & String = js.native
    
    @js.native
    sealed trait INVALID_OPCODE
      extends StObject
         with ERROR
    /* "invalid opcode" */ val INVALID_OPCODE: typings.ethereumjsVm.exceptionsMod.ERROR.INVALID_OPCODE & String = js.native
    
    @js.native
    sealed trait OUT_OF_GAS
      extends StObject
         with ERROR
    /* "out of gas" */ val OUT_OF_GAS: typings.ethereumjsVm.exceptionsMod.ERROR.OUT_OF_GAS & String = js.native
    
    @js.native
    sealed trait OUT_OF_RANGE
      extends StObject
         with ERROR
    /* "value out of range" */ val OUT_OF_RANGE: typings.ethereumjsVm.exceptionsMod.ERROR.OUT_OF_RANGE & String = js.native
    
    @js.native
    sealed trait REFUND_EXHAUSTED
      extends StObject
         with ERROR
    /* "refund exhausted" */ val REFUND_EXHAUSTED: typings.ethereumjsVm.exceptionsMod.ERROR.REFUND_EXHAUSTED & String = js.native
    
    @js.native
    sealed trait REVERT
      extends StObject
         with ERROR
    /* "revert" */ val REVERT: typings.ethereumjsVm.exceptionsMod.ERROR.REVERT & String = js.native
    
    @js.native
    sealed trait STACK_OVERFLOW
      extends StObject
         with ERROR
    /* "stack overflow" */ val STACK_OVERFLOW: typings.ethereumjsVm.exceptionsMod.ERROR.STACK_OVERFLOW & String = js.native
    
    @js.native
    sealed trait STACK_UNDERFLOW
      extends StObject
         with ERROR
    /* "stack underflow" */ val STACK_UNDERFLOW: typings.ethereumjsVm.exceptionsMod.ERROR.STACK_UNDERFLOW & String = js.native
    
    @js.native
    sealed trait STATIC_STATE_CHANGE
      extends StObject
         with ERROR
    /* "static state change" */ val STATIC_STATE_CHANGE: typings.ethereumjsVm.exceptionsMod.ERROR.STATIC_STATE_CHANGE & String = js.native
    
    @js.native
    sealed trait STOP
      extends StObject
         with ERROR
    /* "stop" */ val STOP: typings.ethereumjsVm.exceptionsMod.ERROR.STOP & String = js.native
  }
  
  @JSImport("ethereumjs-vm/dist/exceptions", "VmError")
  @js.native
  open class VmError protected () extends StObject {
    def this(error: ERROR) = this()
    
    var error: ERROR = js.native
    
    var errorType: String = js.native
  }
}
