package typings.firebasePerformance

import typings.firebaseApp.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appUtilsMod {
  
  @JSImport("@firebase/performance/dist/src/utils/app_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getApiKey(firebaseApp: FirebaseApp): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(firebaseApp.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getAppId(firebaseApp: FirebaseApp): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppId")(firebaseApp.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getProjectId(firebaseApp: FirebaseApp): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectId")(firebaseApp.asInstanceOf[js.Any]).asInstanceOf[String]
}
