package typings.gatsbyCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageManagerMod {
  
  @JSImport("gatsby-cli/lib/util/package-manager", "getPackageManager")
  @js.native
  def getPackageManager(): PackageManager = js.native
  
  @JSImport("gatsby-cli/lib/util/package-manager", "setPackageManager")
  @js.native
  def setPackageManager(packageManager: PackageManager): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.gatsbyCli.gatsbyCliStrings.yarn
    - typings.gatsbyCli.gatsbyCliStrings.npm
  */
  trait PackageManager extends StObject
  object PackageManager {
    
    @scala.inline
    def npm: typings.gatsbyCli.gatsbyCliStrings.npm = "npm".asInstanceOf[typings.gatsbyCli.gatsbyCliStrings.npm]
    
    @scala.inline
    def yarn: typings.gatsbyCli.gatsbyCliStrings.yarn = "yarn".asInstanceOf[typings.gatsbyCli.gatsbyCliStrings.yarn]
  }
}
