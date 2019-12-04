package typings.dmgDashBuilder

import typings.appDashBuilderDashLib.appDashBuilderDashLibMod.PlatformPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dmg-builder/out/dmgLicense", JSImport.Namespace)
@js.native
object outDmgLicenseMod extends js.Object {
  def addLicenseToDmg(packager: PlatformPackager[_], dmgPath: String): js.Promise[String | Null] = js.native
}

