package typings.firebaseAppCheck

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugMod {
  
  @JSImport("@firebase/app-check/dist/esm/src/debug", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDebugToken(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDebugToken")().asInstanceOf[js.Promise[String]]
  
  object global {
    
    @JSGlobal("FIREBASE_APPCHECK_DEBUG_TOKEN")
    @js.native
    def FIREBASE_APPCHECK_DEBUG_TOKEN: js.UndefOr[Boolean | String] = js.native
    inline def FIREBASE_APPCHECK_DEBUG_TOKEN_=(x: js.UndefOr[Boolean | String]): Unit = js.Dynamic.global.updateDynamic("FIREBASE_APPCHECK_DEBUG_TOKEN")(x.asInstanceOf[js.Any])
  }
  
  inline def initializeDebugMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeDebugMode")().asInstanceOf[Unit]
  
  inline def isDebugMode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDebugMode")().asInstanceOf[Boolean]
}
