package typings.firebaseAdmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectManagementApiRequestInternalMod {
  
  @JSImport("firebase-admin/lib/project-management/project-management-api-request-internal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertServerResponse(condition: Boolean, responseData: js.Object, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertServerResponse")(condition.asInstanceOf[js.Any], responseData.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
