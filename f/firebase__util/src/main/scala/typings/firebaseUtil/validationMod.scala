package typings.firebaseUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationMod {
  
  @JSImport("@firebase/util/dist/node-esm/src/validation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def errorPrefix(fnName: String, argName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("errorPrefix")(fnName.asInstanceOf[js.Any], argName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def validateArgCount(fnName: String, minCount: Double, maxCount: Double, argCount: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateArgCount")(fnName.asInstanceOf[js.Any], minCount.asInstanceOf[js.Any], maxCount.asInstanceOf[js.Any], argCount.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateCallback(fnName: String, argumentName: String, callback: js.Function, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateCallback")(fnName.asInstanceOf[js.Any], argumentName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateContextObject(fnName: String, argumentName: String, context: Any, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateContextObject")(fnName.asInstanceOf[js.Any], argumentName.asInstanceOf[js.Any], context.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateNamespace(fnName: String, namespace: String, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateNamespace")(fnName.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
