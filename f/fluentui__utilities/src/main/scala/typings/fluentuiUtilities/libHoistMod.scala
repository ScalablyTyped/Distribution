package typings.fluentuiUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHoistMod {
  
  @JSImport("@fluentui/utilities/lib/hoist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hoistMethods(destination: Any, source: Any): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hoistMethods")(destination.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def hoistMethods(destination: Any, source: Any, exclusions: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hoistMethods")(destination.asInstanceOf[js.Any], source.asInstanceOf[js.Any], exclusions.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def unhoistMethods(source: Any, methodNames: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unhoistMethods")(source.asInstanceOf[js.Any], methodNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
