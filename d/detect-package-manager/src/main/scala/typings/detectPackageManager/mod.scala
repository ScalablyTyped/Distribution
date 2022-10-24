package typings.detectPackageManager

import typings.detectPackageManager.anon.Cwd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("detect-package-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
  
  inline def detect(): js.Promise[PM] = ^.asInstanceOf[js.Dynamic].applyDynamic("detect")().asInstanceOf[js.Promise[PM]]
  inline def detect(param0: Cwd): js.Promise[PM] = ^.asInstanceOf[js.Dynamic].applyDynamic("detect")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PM]]
  
  inline def getNpmVersion(pm: PM): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNpmVersion")(pm.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.detectPackageManager.detectPackageManagerStrings.npm
    - typings.detectPackageManager.detectPackageManagerStrings.yarn
    - typings.detectPackageManager.detectPackageManagerStrings.pnpm
  */
  trait PM extends StObject
  object PM {
    
    inline def npm: typings.detectPackageManager.detectPackageManagerStrings.npm = "npm".asInstanceOf[typings.detectPackageManager.detectPackageManagerStrings.npm]
    
    inline def pnpm: typings.detectPackageManager.detectPackageManagerStrings.pnpm = "pnpm".asInstanceOf[typings.detectPackageManager.detectPackageManagerStrings.pnpm]
    
    inline def yarn: typings.detectPackageManager.detectPackageManagerStrings.yarn = "yarn".asInstanceOf[typings.detectPackageManager.detectPackageManagerStrings.yarn]
  }
}
