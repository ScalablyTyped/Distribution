package typings.firebaseUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationMod {
  
  @JSImport("@firebase/util/dist/src/validation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def errorPrefix(fnName: String, argumentNumber: Double, optional: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("errorPrefix")(fnName.asInstanceOf[js.Any], argumentNumber.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def validateArgCount(fnName: String, minCount: Double, maxCount: Double, argCount: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateArgCount")(fnName.asInstanceOf[js.Any], minCount.asInstanceOf[js.Any], maxCount.asInstanceOf[js.Any], argCount.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def validateCallback(fnName: String, argumentNumber: Double, callback: js.Function, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateCallback")(fnName.asInstanceOf[js.Any], argumentNumber.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def validateContextObject(fnName: String, argumentNumber: Double, context: js.Any, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateContextObject")(fnName.asInstanceOf[js.Any], argumentNumber.asInstanceOf[js.Any], context.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def validateNamespace(fnName: String, argumentNumber: Double, namespace: String, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateNamespace")(fnName.asInstanceOf[js.Any], argumentNumber.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
