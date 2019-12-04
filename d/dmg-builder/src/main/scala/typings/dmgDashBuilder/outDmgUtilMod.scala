package typings.dmgDashBuilder

import typings.appDashBuilderDashLib.appDashBuilderDashLibMod.PlatformPackager
import typings.appDashBuilderDashLib.outMacPackagerMod.default
import typings.tempDashFile.tempDashFileMod.TmpDir
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dmg-builder/out/dmgUtil", JSImport.Namespace)
@js.native
object outDmgUtilMod extends js.Object {
  @js.native
  class DmgTarget protected ()
    extends typings.dmgDashBuilder.dmgDashBuilderMod.DmgTarget {
    def this(packager: default, outDir: String) = this()
  }
  
  def attachAndExecute(dmgPath: String, readWrite: Boolean, task: js.Function0[js.Promise[_]]): js.Promise[_] = js.native
  def computeBackground(packager: PlatformPackager[_]): js.Promise[String] = js.native
  def detach(name: String): js.Promise[Unit] = js.native
  def getDmgTemplatePath(): String = js.native
  def getDmgVendorPath(): String = js.native
  def transformBackgroundFileIfNeed(file: String, tmpDir: TmpDir): js.Promise[String] = js.native
}

