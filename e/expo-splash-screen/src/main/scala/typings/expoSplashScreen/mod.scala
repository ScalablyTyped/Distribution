package typings.expoSplashScreen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-splash-screen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def hide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Unit]
  
  @scala.inline
  def hideAsync(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hideAsync")().asInstanceOf[js.Promise[Boolean]]
  
  @scala.inline
  def preventAutoHide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventAutoHide")().asInstanceOf[Unit]
  
  @scala.inline
  def preventAutoHideAsync(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("preventAutoHideAsync")().asInstanceOf[js.Promise[Boolean]]
}
