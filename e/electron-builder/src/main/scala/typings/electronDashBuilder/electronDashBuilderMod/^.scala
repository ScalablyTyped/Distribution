package typings.electronDashBuilder.electronDashBuilderMod

import typings.appDashBuilderDashLib.outForgeDashMakerMod.ForgeOptions
import typings.appDashBuilderDashLib.outPackagerApiMod.PackagerOptions
import typings.electronDashBuilder.electronDashBuilderStrings.default
import typings.electronDashBuilder.electronDashBuilderStrings.dir
import typings.electronDashBuilder.outBuilderMod.CliOptions
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-builder", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_TARGET: default = js.native
  val DIR_TARGET: dir = js.native
  def archFromString(name: String): typings.builderDashUtil.outArchMod.Arch = js.native
  def build(): js.Promise[js.Array[String]] = js.native
  def build(rawOptions: CliOptions): js.Promise[js.Array[String]] = js.native
  def buildForge(forgeOptions: ForgeOptions, options: PackagerOptions): js.Promise[js.Array[String]] = js.native
  def createTargets(platforms: js.Array[typings.appDashBuilderDashLib.outMod.Platform]): Map[
    typings.appDashBuilderDashLib.outMod.Platform, 
    Map[typings.builderDashUtil.outArchMod.Arch, js.Array[String]]
  ] = js.native
  def createTargets(platforms: js.Array[typings.appDashBuilderDashLib.outMod.Platform], `type`: String): Map[
    typings.appDashBuilderDashLib.outMod.Platform, 
    Map[typings.builderDashUtil.outArchMod.Arch, js.Array[String]]
  ] = js.native
  def createTargets(platforms: js.Array[typings.appDashBuilderDashLib.outMod.Platform], `type`: String, arch: String): Map[
    typings.appDashBuilderDashLib.outMod.Platform, 
    Map[typings.builderDashUtil.outArchMod.Arch, js.Array[String]]
  ] = js.native
  def createTargets(platforms: js.Array[typings.appDashBuilderDashLib.outMod.Platform], `type`: Null, arch: String): Map[
    typings.appDashBuilderDashLib.outMod.Platform, 
    Map[typings.builderDashUtil.outArchMod.Arch, js.Array[String]]
  ] = js.native
  def getArchSuffix(arch: typings.builderDashUtil.outArchMod.Arch): String = js.native
}

