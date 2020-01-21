package typings.dmgBuilder

import typings.appBuilderLib.mod.PlatformPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dmg-builder/out/dmgLicense", JSImport.Namespace)
@js.native
object dmgLicenseMod extends js.Object {
  def addLicenseToDmg(packager: PlatformPackager[_], dmgPath: String): js.Promise[String | Null] = js.native
}

