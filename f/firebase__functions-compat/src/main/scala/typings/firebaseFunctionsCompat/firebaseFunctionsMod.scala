package typings.firebaseFunctionsCompat

import typings.firebaseFunctions.mod.Functions
import typings.firebaseFunctions.mod.HttpsCallableOptions
import typings.firebaseFunctions.mod.HttpsCallable_
import typings.firebaseFunctionsCompat.mod.FirebaseApp
import typings.firebaseFunctionsTypes.mod.FirebaseFunctions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object firebaseFunctionsMod {
  
  @JSImport("@firebase/functions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connectFunctionsEmulator(functionsInstance: FirebaseFunctions, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFunctionsEmulator")(functionsInstance.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getFunctions(app: js.UndefOr[FirebaseApp], regionOrCustomDomain: js.UndefOr[String]): Functions = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctions")(app.asInstanceOf[js.Any], regionOrCustomDomain.asInstanceOf[js.Any])).asInstanceOf[Functions]
  
  inline def httpsCallable[RequestData, ResponseData](functionsInstance: FirebaseFunctions, name: String, options: js.UndefOr[HttpsCallableOptions]): HttpsCallable_[RequestData, ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("httpsCallable")(functionsInstance.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HttpsCallable_[RequestData, ResponseData]]
  
  inline def httpsCallableFromURL[RequestData, ResponseData](functionsInstance: FirebaseFunctions, url: String, options: js.UndefOr[HttpsCallableOptions]): HttpsCallable_[RequestData, ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("httpsCallableFromURL")(functionsInstance.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HttpsCallable_[RequestData, ResponseData]]
}
