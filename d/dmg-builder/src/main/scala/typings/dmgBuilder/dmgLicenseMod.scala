package typings.dmgBuilder

import typings.appBuilderLib.mod.PlatformPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dmgLicenseMod {
  
  @JSImport("dmg-builder/out/dmgLicense", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addLicenseToDmg(packager: PlatformPackager[js.Any], dmgPath: String): js.Promise[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("addLicenseToDmg")(packager.asInstanceOf[js.Any], dmgPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Null]]
}
