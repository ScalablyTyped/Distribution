package typings.eggErrors

import typings.eggErrors.mod.EggBaseError
import typings.eggErrors.mod.ErrorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frameworkBaseErrorMod {
  
  @JSImport("egg-errors/lib/framework/framework_base_error", "FRAMEWORK_ERROR_SYMBOL")
  @js.native
  val FRAMEWORK_ERROR_SYMBOL: js.Symbol = js.native
  
  @JSImport("egg-errors/lib/framework/framework_base_error", "FrameworkBaseError")
  @js.native
  open class FrameworkBaseError protected () extends EggBaseError[ErrorOptions] {
    def this(message: String, serialNumber: String) = this()
    def this(message: String, serialNumber: Double) = this()
    def this(message: String, serialNumber: String, errorContext: Any) = this()
    def this(message: String, serialNumber: Double, errorContext: Any) = this()
    
    val errorContext: js.UndefOr[Any] = js.native
    
    def module: String = js.native
    
    val serialNumber: String = js.native
  }
  /* static members */
  object FrameworkBaseError {
    
    @JSImport("egg-errors/lib/framework/framework_base_error", "FrameworkBaseError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(message: String, serialNumber: String): FrameworkBaseError = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(message.asInstanceOf[js.Any], serialNumber.asInstanceOf[js.Any])).asInstanceOf[FrameworkBaseError]
    inline def create(message: String, serialNumber: String, errorContext: Any): FrameworkBaseError = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(message.asInstanceOf[js.Any], serialNumber.asInstanceOf[js.Any], errorContext.asInstanceOf[js.Any])).asInstanceOf[FrameworkBaseError]
    inline def create(message: String, serialNumber: Double): FrameworkBaseError = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(message.asInstanceOf[js.Any], serialNumber.asInstanceOf[js.Any])).asInstanceOf[FrameworkBaseError]
    inline def create(message: String, serialNumber: Double, errorContext: Any): FrameworkBaseError = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(message.asInstanceOf[js.Any], serialNumber.asInstanceOf[js.Any], errorContext.asInstanceOf[js.Any])).asInstanceOf[FrameworkBaseError]
    
    inline def isFrameworkError(err: js.Error): /* is egg-errors.egg-errors/lib/framework/framework_base_error.FrameworkBaseError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFrameworkError")(err.asInstanceOf[js.Any]).asInstanceOf[/* is egg-errors.egg-errors/lib/framework/framework_base_error.FrameworkBaseError */ Boolean]
  }
}
