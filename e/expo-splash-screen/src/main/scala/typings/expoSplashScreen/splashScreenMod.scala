package typings.expoSplashScreen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splashScreenMod {
  
  @JSImport("expo-splash-screen/build/SplashScreen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Unit]
  
  inline def hideAsync(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hideAsync")().asInstanceOf[js.Promise[Boolean]]
  
  inline def preventAutoHide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventAutoHide")().asInstanceOf[Unit]
  
  inline def preventAutoHideAsync(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("preventAutoHideAsync")().asInstanceOf[js.Promise[Boolean]]
}
