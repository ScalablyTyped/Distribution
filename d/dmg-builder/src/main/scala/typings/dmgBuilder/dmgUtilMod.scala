package typings.dmgBuilder

import typings.appBuilderLib.macPackagerMod.default
import typings.appBuilderLib.mod.PlatformPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dmgUtilMod {
  
  @JSImport("dmg-builder/out/dmgUtil", "DmgTarget")
  @js.native
  class DmgTarget protected ()
    extends typings.dmgBuilder.mod.DmgTarget {
    def this(packager: default, outDir: String) = this()
  }
  
  @JSImport("dmg-builder/out/dmgUtil", "attachAndExecute")
  @js.native
  def attachAndExecute(dmgPath: String, readWrite: Boolean, task: js.Function0[js.Promise[_]]): js.Promise[_] = js.native
  
  @JSImport("dmg-builder/out/dmgUtil", "computeBackground")
  @js.native
  def computeBackground(packager: PlatformPackager[_]): js.Promise[String] = js.native
  
  @JSImport("dmg-builder/out/dmgUtil", "detach")
  @js.native
  def detach(name: String): js.Promise[Unit] = js.native
  
  @JSImport("dmg-builder/out/dmgUtil", "getDmgTemplatePath")
  @js.native
  def getDmgTemplatePath(): String = js.native
  
  @JSImport("dmg-builder/out/dmgUtil", "getDmgVendorPath")
  @js.native
  def getDmgVendorPath(): String = js.native
}
