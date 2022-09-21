package typings.firebasePerformance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iidServiceMod {
  
  @JSImport("@firebase/performance/dist/src/services/iid_service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAuthTokenPromise(
    installationsService: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseInstallationsInternal */ Any
  ): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthTokenPromise")(installationsService.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getAuthenticationToken(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthenticationToken")().asInstanceOf[js.UndefOr[String]]
  
  inline def getIid(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIid")().asInstanceOf[js.UndefOr[String]]
  
  inline def getIidPromise(
    installationsService: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseInstallationsInternal */ Any
  ): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIidPromise")(installationsService.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
