package typings.devextremeRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedMod {
  
  @JSImport("@devextreme/runtime/cjs/inferno/mocked/shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@devextreme/runtime/cjs/inferno/mocked/shared", "ERROR_MSG")
  @js.native
  val ERROR_MSG: /* "a runtime error occured! Use Inferno in development environment to find the error." */ String = js.native
  
  inline def isFunction(o: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(o.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isInvalid(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInvalid")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNull(o: Any): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(o.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
  
  inline def isNullOrUndef(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrUndef")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def throwError(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throwError")().asInstanceOf[Unit]
  inline def throwError(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
