package typings.firebaseAuth

import typings.firebaseAuth.distRnSrcModelPublicTypesMod.Persistence
import typings.firebaseAuth.distRnSrcModelPublicTypesMod.ReactNativeAsyncStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRnSrcPlatformReactNativePersistenceReactNativeMod {
  
  @JSImport("@firebase/auth/dist/rn/src/platform_react_native/persistence/react_native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getReactNativePersistence(storage: ReactNativeAsyncStorage): Persistence = ^.asInstanceOf[js.Dynamic].applyDynamic("getReactNativePersistence")(storage.asInstanceOf[js.Any]).asInstanceOf[Persistence]
}
