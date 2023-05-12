package typings.firebase

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseFunctions.mod.Functions
import typings.firebaseFunctions.mod.HttpsCallableOptions
import typings.firebaseFunctions.mod.HttpsCallable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compatAppCheckDistEsmFunctionsMod {
  
  @JSImport("firebase/compat/app-check/dist/esm/functions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connectFunctionsEmulator(functionsInstance: Functions, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFunctionsEmulator")(functionsInstance.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getFunctions(): Functions = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctions")().asInstanceOf[Functions]
  inline def getFunctions(app: Unit, regionOrCustomDomain: String): Functions = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctions")(app.asInstanceOf[js.Any], regionOrCustomDomain.asInstanceOf[js.Any])).asInstanceOf[Functions]
  inline def getFunctions(app: FirebaseApp): Functions = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctions")(app.asInstanceOf[js.Any]).asInstanceOf[Functions]
  inline def getFunctions(app: FirebaseApp, regionOrCustomDomain: String): Functions = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctions")(app.asInstanceOf[js.Any], regionOrCustomDomain.asInstanceOf[js.Any])).asInstanceOf[Functions]
  
  inline def httpsCallable[RequestData, ResponseData](functionsInstance: Functions, name: String): HttpsCallable_[RequestData, ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("httpsCallable")(functionsInstance.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[HttpsCallable_[RequestData, ResponseData]]
  inline def httpsCallable[RequestData, ResponseData](functionsInstance: Functions, name: String, options: HttpsCallableOptions): HttpsCallable_[RequestData, ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("httpsCallable")(functionsInstance.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HttpsCallable_[RequestData, ResponseData]]
  
  inline def httpsCallableFromURL[RequestData, ResponseData](functionsInstance: Functions, url: String): HttpsCallable_[RequestData, ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("httpsCallableFromURL")(functionsInstance.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[HttpsCallable_[RequestData, ResponseData]]
  inline def httpsCallableFromURL[RequestData, ResponseData](functionsInstance: Functions, url: String, options: HttpsCallableOptions): HttpsCallable_[RequestData, ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("httpsCallableFromURL")(functionsInstance.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HttpsCallable_[RequestData, ResponseData]]
}
