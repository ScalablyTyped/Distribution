package typings.firebasePerformance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iidServiceMod {
  
  @JSImport("@firebase/performance/dist/src/services/iid_service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAuthTokenPromise(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthTokenPromise")().asInstanceOf[js.Promise[String]]
  
  inline def getAuthenticationToken(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthenticationToken")().asInstanceOf[js.UndefOr[String]]
  
  inline def getIid(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIid")().asInstanceOf[js.UndefOr[String]]
  
  inline def getIidPromise(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIidPromise")().asInstanceOf[js.Promise[String]]
}
