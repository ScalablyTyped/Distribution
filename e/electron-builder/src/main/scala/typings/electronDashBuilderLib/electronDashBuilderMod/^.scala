package typings
package electronDashBuilderLib.electronDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-builder", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_TARGET: electronDashBuilderLib.electronDashBuilderLibStrings.default = js.native
  val DIR_TARGET: electronDashBuilderLib.electronDashBuilderLibStrings.dir = js.native
  def archFromString(name: java.lang.String): builderDashUtilLib.outArchMod.Arch = js.native
  def build(): js.Promise[js.Array[java.lang.String]] = js.native
  def build(rawOptions: electronDashBuilderLib.outBuilderMod.CliOptions): js.Promise[js.Array[java.lang.String]] = js.native
  def buildForge(
    forgeOptions: appDashBuilderDashLibLib.outForgeDashMakerMod.ForgeOptions,
    options: appDashBuilderDashLibLib.outPackagerApiMod.PackagerOptions
  ): js.Promise[js.Array[java.lang.String]] = js.native
  def createTargets(platforms: js.Array[appDashBuilderDashLibLib.appDashBuilderDashLibMod.Platform]): stdLib.Map[
    appDashBuilderDashLibLib.appDashBuilderDashLibMod.Platform, 
    stdLib.Map[builderDashUtilLib.outArchMod.Arch, js.Array[java.lang.String]]
  ] = js.native
  def createTargets(
    platforms: js.Array[appDashBuilderDashLibLib.appDashBuilderDashLibMod.Platform],
    `type`: java.lang.String
  ): stdLib.Map[
    appDashBuilderDashLibLib.appDashBuilderDashLibMod.Platform, 
    stdLib.Map[builderDashUtilLib.outArchMod.Arch, js.Array[java.lang.String]]
  ] = js.native
  def createTargets(
    platforms: js.Array[appDashBuilderDashLibLib.appDashBuilderDashLibMod.Platform],
    `type`: java.lang.String,
    arch: java.lang.String
  ): stdLib.Map[
    appDashBuilderDashLibLib.appDashBuilderDashLibMod.Platform, 
    stdLib.Map[builderDashUtilLib.outArchMod.Arch, js.Array[java.lang.String]]
  ] = js.native
  def createTargets(
    platforms: js.Array[appDashBuilderDashLibLib.appDashBuilderDashLibMod.Platform],
    `type`: scala.Null,
    arch: java.lang.String
  ): stdLib.Map[
    appDashBuilderDashLibLib.appDashBuilderDashLibMod.Platform, 
    stdLib.Map[builderDashUtilLib.outArchMod.Arch, js.Array[java.lang.String]]
  ] = js.native
  def getArchSuffix(arch: builderDashUtilLib.outArchMod.Arch): java.lang.String = js.native
}

