package typings.ethereumjsVm

import org.scalablytyped.runtime.StringDictionary
import typings.ethereumjsVm.evmMod.EVMResult
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runCallMod {
  
  @JSImport("ethereumjs-vm/dist/runCall", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(opts: RunCallOpts): js.Promise[EVMResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[EVMResult]]
  
  trait RunCallOpts extends StObject {
    
    var block: js.UndefOr[js.Any] = js.undefined
    
    var caller: js.UndefOr[Buffer] = js.undefined
    
    /**
      * This is for CALLCODE where the code to load is different than the code from the to account
      */
    var code: js.UndefOr[Buffer] = js.undefined
    
    var compiled: js.UndefOr[Boolean] = js.undefined
    
    var data: js.UndefOr[Buffer] = js.undefined
    
    var delegatecall: js.UndefOr[Boolean] = js.undefined
    
    var depth: js.UndefOr[Double] = js.undefined
    
    var gasLimit: js.UndefOr[Buffer] = js.undefined
    
    var gasPrice: js.UndefOr[Buffer] = js.undefined
    
    var origin: js.UndefOr[Buffer] = js.undefined
    
    var salt: js.UndefOr[Buffer] = js.undefined
    
    var selfdestruct: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    var static: js.UndefOr[Boolean] = js.undefined
    
    var to: js.UndefOr[Buffer] = js.undefined
    
    var value: js.UndefOr[Buffer] = js.undefined
  }
  object RunCallOpts {
    
    inline def apply(): RunCallOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunCallOpts]
    }
    
    extension [Self <: RunCallOpts](x: Self) {
      
      inline def setBlock(value: js.Any): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      inline def setCaller(value: Buffer): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
      
      inline def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
      
      inline def setCode(value: Buffer): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setCompiled(value: Boolean): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
      
      inline def setCompiledUndefined: Self = StObject.set(x, "compiled", js.undefined)
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDelegatecall(value: Boolean): Self = StObject.set(x, "delegatecall", value.asInstanceOf[js.Any])
      
      inline def setDelegatecallUndefined: Self = StObject.set(x, "delegatecall", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setGasLimit(value: Buffer): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      inline def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
      
      inline def setGasPrice(value: Buffer): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      inline def setOrigin(value: Buffer): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setSalt(value: Buffer): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      inline def setSelfdestruct(value: StringDictionary[Boolean]): Self = StObject.set(x, "selfdestruct", value.asInstanceOf[js.Any])
      
      inline def setSelfdestructUndefined: Self = StObject.set(x, "selfdestruct", js.undefined)
      
      inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
      
      inline def setTo(value: Buffer): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
