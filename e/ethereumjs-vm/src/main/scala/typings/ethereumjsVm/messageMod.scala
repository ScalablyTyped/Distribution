package typings.ethereumjsVm

import typings.bnJs.mod.^
import typings.ethereumjsVm.typesMod.PrecompileFunc
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  @JSImport("ethereumjs-vm/dist/evm/message", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Message {
    def this(opts: js.Any) = this()
  }
  
  @js.native
  trait Message extends StObject {
    
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
}
