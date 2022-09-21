package typings.eggErrors.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("egg-errors", "FrameworkBaseError")
@js.native
open class FrameworkBaseError protected ()
  extends typings.eggErrors.frameworkBaseErrorMod.FrameworkBaseError {
  def this(message: String, serialNumber: String) = this()
  def this(message: String, serialNumber: Double) = this()
  def this(message: String, serialNumber: String, errorContext: Any) = this()
  def this(message: String, serialNumber: Double, errorContext: Any) = this()
}
/* static members */
object FrameworkBaseError {
  
  @JSImport("egg-errors", "FrameworkBaseError")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(message: String, serialNumber: String): typings.eggErrors.frameworkBaseErrorMod.FrameworkBaseError = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(message.asInstanceOf[js.Any], serialNumber.asInstanceOf[js.Any])).asInstanceOf[typings.eggErrors.frameworkBaseErrorMod.FrameworkBaseError]
  inline def create(message: String, serialNumber: String, errorContext: Any): typings.eggErrors.frameworkBaseErrorMod.FrameworkBaseError = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(message.asInstanceOf[js.Any], serialNumber.asInstanceOf[js.Any], errorContext.asInstanceOf[js.Any])).asInstanceOf[typings.eggErrors.frameworkBaseErrorMod.FrameworkBaseError]
  inline def create(message: String, serialNumber: Double): typings.eggErrors.frameworkBaseErrorMod.FrameworkBaseError = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(message.asInstanceOf[js.Any], serialNumber.asInstanceOf[js.Any])).asInstanceOf[typings.eggErrors.frameworkBaseErrorMod.FrameworkBaseError]
  inline def create(message: String, serialNumber: Double, errorContext: Any): typings.eggErrors.frameworkBaseErrorMod.FrameworkBaseError = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(message.asInstanceOf[js.Any], serialNumber.asInstanceOf[js.Any], errorContext.asInstanceOf[js.Any])).asInstanceOf[typings.eggErrors.frameworkBaseErrorMod.FrameworkBaseError]
  
  inline def isFrameworkError(err: js.Error): /* is egg-errors.egg-errors/lib/framework/framework_base_error.FrameworkBaseError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFrameworkError")(err.asInstanceOf[js.Any]).asInstanceOf[/* is egg-errors.egg-errors/lib/framework/framework_base_error.FrameworkBaseError */ Boolean]
}
