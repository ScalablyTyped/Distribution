package typings.devextremeRuntime

import typings.devextremeRuntime.anon.DefaultValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmInfernoCreateContextMod {
  
  @JSImport("@devextreme/runtime/esm/inferno/create_context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createContext[T](defaultValue: T): DefaultValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[DefaultValue]
}
