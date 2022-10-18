package typings.ethereumjsVm

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEvmTxContextMod {
  
  @JSImport("ethereumjs-vm/dist/evm/txContext", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TxContext {
    def this(gasPrice: Buffer, origin: Buffer) = this()
    
    /* CompleteClass */
    var gasPrice: Buffer = js.native
    
    /* CompleteClass */
    var origin: Buffer = js.native
  }
  
  trait TxContext extends StObject {
    
    var gasPrice: Buffer
    
    var origin: Buffer
  }
  object TxContext {
    
    inline def apply(gasPrice: Buffer, origin: Buffer): TxContext = {
      val __obj = js.Dynamic.literal(gasPrice = gasPrice.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
      __obj.asInstanceOf[TxContext]
    }
    
    extension [Self <: TxContext](x: Self) {
      
      inline def setGasPrice(value: Buffer): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: Buffer): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    }
  }
}
