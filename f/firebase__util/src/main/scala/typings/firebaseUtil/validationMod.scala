package typings.firebaseUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationMod {
  
  @JSImport("@firebase/util/dist/src/validation", "errorPrefix")
  @js.native
  def errorPrefix(fnName: String, argumentNumber: Double, optional: Boolean): String = js.native
  
  @JSImport("@firebase/util/dist/src/validation", "validateArgCount")
  @js.native
  def validateArgCount(fnName: String, minCount: Double, maxCount: Double, argCount: Double): Unit = js.native
  
  @JSImport("@firebase/util/dist/src/validation", "validateCallback")
  @js.native
  def validateCallback(fnName: String, argumentNumber: Double, callback: js.Function, optional: Boolean): Unit = js.native
  
  @JSImport("@firebase/util/dist/src/validation", "validateContextObject")
  @js.native
  def validateContextObject(fnName: String, argumentNumber: Double, context: js.Any, optional: Boolean): Unit = js.native
  
  @JSImport("@firebase/util/dist/src/validation", "validateNamespace")
  @js.native
  def validateNamespace(fnName: String, argumentNumber: Double, namespace: String, optional: Boolean): Unit = js.native
}
