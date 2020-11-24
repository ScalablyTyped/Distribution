package typings.ethereumjsVm

import typings.bnJs.mod.^
import typings.ethereumjsVm.typesMod.PrecompileFunc
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-vm/dist/evm/message", JSImport.Namespace)
@js.native
object messageMod extends js.Object {
  
  @js.native
  trait Message extends js.Object {
    
    var _codeAddress: Buffer = js.native
    
    var caller: Buffer = js.native
    
    var code: Buffer | PrecompileFunc = js.native
    
    def codeAddress: Buffer = js.native
    
    var data: Buffer = js.native
    
    var delegatecall: Boolean = js.native
    
    var depth: Double = js.native
    
    var gasLimit: ^ = js.native
    
    var isCompiled: Boolean = js.native
    
    var isStatic: Boolean = js.native
    
    var salt: Buffer = js.native
    
    var selfdestruct: js.Any = js.native
    
    var to: Buffer = js.native
    
    var value: ^ = js.native
  }
  
  @js.native
  class default protected () extends Message {
    def this(opts: js.Any) = this()
  }
}
