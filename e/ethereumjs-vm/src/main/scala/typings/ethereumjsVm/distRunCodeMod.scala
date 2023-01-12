package typings.ethereumjsVm

import org.scalablytyped.runtime.StringDictionary
import typings.ethereumjsVm.distEvmEvmMod.ExecResult
import typings.ethereumjsVm.distEvmEvmMod.default
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRunCodeMod {
  
  @JSImport("ethereumjs-vm/dist/runCode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(opts: RunCodeOpts): js.Promise[ExecResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ExecResult]]
  
  trait RunCodeOpts extends StObject {
    
    /**
      * The address of the account that is executing this code. The address should be a `Buffer` of bytes. Defaults to `0`
      */
    var address: js.UndefOr[Buffer] = js.undefined
    
    /**
      * The [`Block`](https://github.com/ethereumjs/ethereumjs-block) the `tx` belongs to. If omitted a blank block will be used
      */
    var block: js.UndefOr[Any] = js.undefined
    
    /**
      * The address that ran this code. The address should be a `Buffer` of 20 bits. Defaults to `0`
      */
    var caller: js.UndefOr[Buffer] = js.undefined
    
    /**
      * The EVM code to run
      */
    var code: js.UndefOr[Buffer] = js.undefined
    
    /**
      * The input data
      */
    var data: js.UndefOr[Buffer] = js.undefined
    
    var depth: js.UndefOr[Double] = js.undefined
    
    var evm: js.UndefOr[default] = js.undefined
    
    /**
      * Gas limit
      */
    var gasLimit: js.UndefOr[Buffer] = js.undefined
    
    var gasPrice: js.UndefOr[Buffer] = js.undefined
    
    var isStatic: js.UndefOr[Boolean] = js.undefined
    
    var message: js.UndefOr[typings.ethereumjsVm.distEvmMessageMod.default] = js.undefined
    
    /**
      * The address where the call originated from. The address should be a `Buffer` of 20 bits. Defaults to `0`
      */
    var origin: js.UndefOr[Buffer] = js.undefined
    
    /**
      * The initial program counter. Defaults to `0`
      */
    var pc: js.UndefOr[Double] = js.undefined
    
    var selfdestruct: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    var txContext: js.UndefOr[typings.ethereumjsVm.distEvmTxContextMod.default] = js.undefined
    
    /**
      * The value in ether that is being sent to `opt.address`. Defaults to `0`
      */
    var value: js.UndefOr[Buffer] = js.undefined
  }
  object RunCodeOpts {
    
    inline def apply(): RunCodeOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunCodeOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RunCodeOpts] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: Buffer): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setBlock(value: Any): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      inline def setCaller(value: Buffer): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
      
      inline def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
      
      inline def setCode(value: Buffer): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setEvm(value: default): Self = StObject.set(x, "evm", value.asInstanceOf[js.Any])
      
      inline def setEvmUndefined: Self = StObject.set(x, "evm", js.undefined)
      
      inline def setGasLimit(value: Buffer): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      inline def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
      
      inline def setGasPrice(value: Buffer): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
      
      inline def setIsStaticUndefined: Self = StObject.set(x, "isStatic", js.undefined)
      
      inline def setMessage(value: typings.ethereumjsVm.distEvmMessageMod.default): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOrigin(value: Buffer): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setPc(value: Double): Self = StObject.set(x, "pc", value.asInstanceOf[js.Any])
      
      inline def setPcUndefined: Self = StObject.set(x, "pc", js.undefined)
      
      inline def setSelfdestruct(value: StringDictionary[Boolean]): Self = StObject.set(x, "selfdestruct", value.asInstanceOf[js.Any])
      
      inline def setSelfdestructUndefined: Self = StObject.set(x, "selfdestruct", js.undefined)
      
      inline def setTxContext(value: typings.ethereumjsVm.distEvmTxContextMod.default): Self = StObject.set(x, "txContext", value.asInstanceOf[js.Any])
      
      inline def setTxContextUndefined: Self = StObject.set(x, "txContext", js.undefined)
      
      inline def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
