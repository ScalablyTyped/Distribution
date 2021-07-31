package typings.ethereumjsVm

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object txContextMod {
  
  @JSImport("ethereumjs-vm/dist/evm/txContext", JSImport.Default)
  @js.native
  class default protected ()
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
    
    @scala.inline
    def apply(gasPrice: Buffer, origin: Buffer): TxContext = {
      val __obj = js.Dynamic.literal(gasPrice = gasPrice.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
      __obj.asInstanceOf[TxContext]
    }
    
    @scala.inline
    implicit class TxContextMutableBuilder[Self <: TxContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGasPrice(value: Buffer): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: Buffer): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    }
  }
}
