package typings.gatsbyCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageManagerMod {
  
  @JSImport("gatsby-cli/lib/util/package-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPackageManager(): PackageManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageManager")().asInstanceOf[PackageManager]
  
  inline def setPackageManager(packageManager: PackageManager): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPackageManager")(packageManager.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.gatsbyCli.gatsbyCliStrings.yarn
    - typings.gatsbyCli.gatsbyCliStrings.npm
  */
  trait PackageManager extends StObject
  object PackageManager {
    
    inline def npm: typings.gatsbyCli.gatsbyCliStrings.npm = "npm".asInstanceOf[typings.gatsbyCli.gatsbyCliStrings.npm]
    
    inline def yarn: typings.gatsbyCli.gatsbyCliStrings.yarn = "yarn".asInstanceOf[typings.gatsbyCli.gatsbyCliStrings.yarn]
  }
}
