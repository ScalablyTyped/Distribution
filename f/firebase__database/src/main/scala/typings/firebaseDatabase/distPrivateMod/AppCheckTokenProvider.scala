package typings.firebaseDatabase.distPrivateMod

import typings.firebaseAppCheckInteropTypes.mod.AppCheckTokenListener
import typings.firebaseAppCheckInteropTypes.mod.AppCheckTokenResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Abstraction around AppCheck's token fetching capabilities.
  */
@js.native
trait AppCheckTokenProvider extends StObject {
  
  def addTokenChangeListener(listener: AppCheckTokenListener): Unit = js.native
  
  /* private */ var appCheck: Any = js.native
  
  /* private */ var appCheckProvider: Any = js.native
  
  /* private */ var appName_ : Any = js.native
  
  def getToken(): js.Promise[AppCheckTokenResult] = js.native
  def getToken(forceRefresh: Boolean): js.Promise[AppCheckTokenResult] = js.native
  
  def notifyForInvalidToken(): Unit = js.native
}
