package typings.dmgBuilder

import typings.appBuilderLib.mod.PlatformPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dmgLicenseMod {
  
  @JSImport("dmg-builder/out/dmgLicense", "addLicenseToDmg")
  @js.native
  def addLicenseToDmg(packager: PlatformPackager[_], dmgPath: String): js.Promise[String | Null] = js.native
}
