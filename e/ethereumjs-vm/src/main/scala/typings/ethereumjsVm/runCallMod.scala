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
  
  @scala.inline
  def default(opts: RunCallOpts): js.Promise[EVMResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[EVMResult]]
  
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
    
    @scala.inline
    def apply(): RunCallOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunCallOpts]
    }
    
    @scala.inline
    implicit class RunCallOptsMutableBuilder[Self <: RunCallOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlock(value: js.Any): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      @scala.inline
      def setCaller(value: Buffer): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
      
      @scala.inline
      def setCode(value: Buffer): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setCompiled(value: Boolean): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompiledUndefined: Self = StObject.set(x, "compiled", js.undefined)
      
      @scala.inline
      def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDelegatecall(value: Boolean): Self = StObject.set(x, "delegatecall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelegatecallUndefined: Self = StObject.set(x, "delegatecall", js.undefined)
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setGasLimit(value: Buffer): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
      
      @scala.inline
      def setGasPrice(value: Buffer): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      @scala.inline
      def setOrigin(value: Buffer): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setSalt(value: Buffer): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      @scala.inline
      def setSelfdestruct(value: StringDictionary[Boolean]): Self = StObject.set(x, "selfdestruct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfdestructUndefined: Self = StObject.set(x, "selfdestruct", js.undefined)
      
      @scala.inline
      def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
      
      @scala.inline
      def setTo(value: Buffer): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
