package typings.expressValidator

import typings.expressValidator.srcBaseMod.Request
import typings.expressValidator.srcBaseMod.ValidationError
import typings.expressValidator.srcContextMod.ReadonlyContext
import typings.expressValidator.srcValidationResultMod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcChainContextRunnerMod {
  
  @js.native
  trait ContextRunner extends StObject {
    
    /**
      * Runs the current validation chain.
      * @param req the express request to validate
      * @param options an object of options to customize how the chain will be run
      * @returns a promise for a {@link Result} that resolves when the validation chain has finished
      */
    def run(req: Request): js.Promise[ResultWithContext] = js.native
    def run(req: Request, options: ContextRunningOptions): js.Promise[ResultWithContext] = js.native
  }
  
  trait ContextRunningOptions extends StObject {
    
    /**
      * Defines whether errors and sanitization should be persisted to `req`.
      * @default false
      */
    var dryRun: js.UndefOr[Boolean] = js.undefined
  }
  object ContextRunningOptions {
    
    inline def apply(): ContextRunningOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextRunningOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextRunningOptions] (val x: Self) extends AnyVal {
      
      inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    }
  }
  
  @js.native
  trait ResultWithContext extends Result[ValidationError] {
    
    val context: ReadonlyContext = js.native
  }
}
