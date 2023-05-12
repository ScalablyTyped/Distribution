package typings.expressValidator

import typings.expressValidator.anon.Req
import typings.expressValidator.srcBaseMod.ErrorMessage
import typings.expressValidator.srcBaseMod.Location
import typings.expressValidator.srcBaseMod.Middleware
import typings.expressValidator.srcBaseMod.UnknownFieldInstance
import typings.expressValidator.srcBaseMod.UnknownFieldMessageFactory
import typings.expressValidator.srcChainContextRunnerMod.ContextRunner
import typings.expressValidator.srcChainValidationChainMod.ValidationChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMiddlewaresExactMod {
  
  @JSImport("express-validator/src/middlewares/exact", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkExact(): Middleware & ContextRunner = ^.asInstanceOf[js.Dynamic].applyDynamic("checkExact")().asInstanceOf[Middleware & ContextRunner]
  inline def checkExact(chains: Unit, opts: CheckExactOptions): Middleware & ContextRunner = (^.asInstanceOf[js.Dynamic].applyDynamic("checkExact")(chains.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Middleware & ContextRunner]
  inline def checkExact(chains: CheckExactInput): Middleware & ContextRunner = ^.asInstanceOf[js.Dynamic].applyDynamic("checkExact")(chains.asInstanceOf[js.Any]).asInstanceOf[Middleware & ContextRunner]
  inline def checkExact(chains: CheckExactInput, opts: CheckExactOptions): Middleware & ContextRunner = (^.asInstanceOf[js.Dynamic].applyDynamic("checkExact")(chains.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Middleware & ContextRunner]
  
  type CheckExactInput = ValidationChain | (js.Array[js.Array[ValidationChain] | ValidationChain])
  
  trait CheckExactOptions extends StObject {
    
    /**
      * The list of locations which `checkExact()` should check.
      * @default ['body', 'params', 'query']
      */
    var locations: js.UndefOr[js.Array[Location]] = js.undefined
    
    var message: js.UndefOr[UnknownFieldMessageFactory | ErrorMessage] = js.undefined
  }
  object CheckExactOptions {
    
    inline def apply(): CheckExactOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckExactOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckExactOptions] (val x: Self) extends AnyVal {
      
      inline def setLocations(value: js.Array[Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
      
      inline def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value*))
      
      inline def setMessage(value: UnknownFieldMessageFactory | ErrorMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageFunction2(value: (/* unknownFields */ js.Array[UnknownFieldInstance], /* opts */ Req) => Any): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setMessageVarargs(value: Any*): Self = StObject.set(x, "message", js.Array(value*))
    }
  }
}
