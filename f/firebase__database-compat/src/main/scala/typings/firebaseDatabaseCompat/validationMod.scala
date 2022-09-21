package typings.firebaseDatabaseCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationMod {
  
  @JSImport("@firebase/database-compat/dist/database-compat/src/util/validation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateBoolean(fnName: String, argumentName: String, bool: Any, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateBoolean")(fnName.asInstanceOf[js.Any], argumentName.asInstanceOf[js.Any], bool.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateEventType(fnName: String, eventType: String, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateEventType")(fnName.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
