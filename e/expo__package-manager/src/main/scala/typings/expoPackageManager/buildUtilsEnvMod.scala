package typings.expoPackageManager

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsEnvMod extends Shortcut {
  
  @JSImport("@expo/package-manager/build/utils/env", JSImport.Default)
  @js.native
  val default: Env = js.native
  
  @js.native
  trait Env extends StObject {
    
    /** Determine if the package manager is running in a CI environment. */
    def CI: Boolean = js.native
  }
  
  type _To = Env
  
  /* This means you don't have to write `default`, but can instead just say `buildUtilsEnvMod.foo` */
  override def _to: Env = default
}
