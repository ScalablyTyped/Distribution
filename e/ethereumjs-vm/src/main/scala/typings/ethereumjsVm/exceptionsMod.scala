package typings.ethereumjsVm

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-vm/dist/exceptions", JSImport.Namespace)
@js.native
object exceptionsMod extends js.Object {
  
  @js.native
  sealed trait ERROR extends js.Object
  @js.native
  object ERROR extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ERROR with String] = js.native
    
    @js.native
    sealed trait CREATE_COLLISION extends ERROR
    /* "create collision" */ @js.native
    object CREATE_COLLISION extends TopLevel[CREATE_COLLISION with String]
    
    @js.native
    sealed trait INTERNAL_ERROR extends ERROR
    /* "internal error" */ @js.native
    object INTERNAL_ERROR extends TopLevel[INTERNAL_ERROR with String]
    
    @js.native
    sealed trait INVALID_JUMP extends ERROR
    /* "invalid JUMP" */ @js.native
    object INVALID_JUMP extends TopLevel[INVALID_JUMP with String]
    
    @js.native
    sealed trait INVALID_OPCODE extends ERROR
    /* "invalid opcode" */ @js.native
    object INVALID_OPCODE extends TopLevel[INVALID_OPCODE with String]
    
    @js.native
    sealed trait OUT_OF_GAS extends ERROR
    /* "out of gas" */ @js.native
    object OUT_OF_GAS extends TopLevel[OUT_OF_GAS with String]
    
    @js.native
    sealed trait OUT_OF_RANGE extends ERROR
    /* "value out of range" */ @js.native
    object OUT_OF_RANGE extends TopLevel[OUT_OF_RANGE with String]
    
    @js.native
    sealed trait REFUND_EXHAUSTED extends ERROR
    /* "refund exhausted" */ @js.native
    object REFUND_EXHAUSTED extends TopLevel[REFUND_EXHAUSTED with String]
    
    @js.native
    sealed trait REVERT extends ERROR
    /* "revert" */ @js.native
    object REVERT extends TopLevel[REVERT with String]
    
    @js.native
    sealed trait STACK_OVERFLOW extends ERROR
    /* "stack overflow" */ @js.native
    object STACK_OVERFLOW extends TopLevel[STACK_OVERFLOW with String]
    
    @js.native
    sealed trait STACK_UNDERFLOW extends ERROR
    /* "stack underflow" */ @js.native
    object STACK_UNDERFLOW extends TopLevel[STACK_UNDERFLOW with String]
    
    @js.native
    sealed trait STATIC_STATE_CHANGE extends ERROR
    /* "static state change" */ @js.native
    object STATIC_STATE_CHANGE extends TopLevel[STATIC_STATE_CHANGE with String]
    
    @js.native
    sealed trait STOP extends ERROR
    /* "stop" */ @js.native
    object STOP extends TopLevel[STOP with String]
  }
  
  @js.native
  class VmError protected () extends js.Object {
    def this(error: ERROR) = this()
    
    var error: ERROR = js.native
    
    var errorType: String = js.native
  }
}
