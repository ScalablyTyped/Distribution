package typings.expoConfig

import typings.expoConfig.anon.PickExpoConfigsdkVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIsLegacyImportsEnabledMod {
  
  @JSImport("@expo/config/build/isLegacyImportsEnabled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLegacyImportsEnabled(exp: PickExpoConfigsdkVersion): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegacyImportsEnabled")(exp.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
