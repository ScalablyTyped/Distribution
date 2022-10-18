package typings.firebaseStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcImplementationUtilsMod {
  
  @JSImport("@firebase/storage/dist/node-esm/src/implementation/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isRetryStatusCode(status: Double, additionalRetryCodes: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRetryStatusCode")(status.asInstanceOf[js.Any], additionalRetryCodes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
