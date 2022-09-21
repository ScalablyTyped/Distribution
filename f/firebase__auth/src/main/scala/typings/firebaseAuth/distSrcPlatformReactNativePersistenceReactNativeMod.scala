package typings.firebaseAuth

import typings.firebaseAuth.distSrcModelPublicTypesMod.Persistence
import typings.firebaseAuth.distSrcModelPublicTypesMod.ReactNativeAsyncStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPlatformReactNativePersistenceReactNativeMod {
  
  @JSImport("@firebase/auth/dist/src/platform_react_native/persistence/react_native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getReactNativePersistence(storage: ReactNativeAsyncStorage): Persistence = ^.asInstanceOf[js.Dynamic].applyDynamic("getReactNativePersistence")(storage.asInstanceOf[js.Any]).asInstanceOf[Persistence]
}
