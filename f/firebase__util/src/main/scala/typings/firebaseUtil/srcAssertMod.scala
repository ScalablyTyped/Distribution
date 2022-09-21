package typings.firebaseUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAssertMod {
  
  @JSImport("@firebase/util/dist/src/assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assert(assertion: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(assertion.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def assertionError(message: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("assertionError")(message.asInstanceOf[js.Any]).asInstanceOf[js.Error]
}
