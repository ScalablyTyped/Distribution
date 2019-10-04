package typings.electronDashBuilder.outBuilderMod

import typings.appDashBuilderDashLib.outMod.Platform
import typings.builderDashUtil.outArchMod.Arch
import typings.std.Map
import typings.yargs.yargsMod.Argv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-builder/out/builder", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def build(): js.Promise[js.Array[String]] = js.native
  def build(rawOptions: CliOptions): js.Promise[js.Array[String]] = js.native
  def coerceTypes(host: js.Any): js.Any = js.native
  def configureBuildCommand(yargs: Argv[js.Object]): Argv[js.Object] = js.native
  def createTargets(platforms: js.Array[Platform]): Map[Platform, Map[Arch, js.Array[String]]] = js.native
  def createTargets(platforms: js.Array[Platform], `type`: String): Map[Platform, Map[Arch, js.Array[String]]] = js.native
  def createTargets(platforms: js.Array[Platform], `type`: String, arch: String): Map[Platform, Map[Arch, js.Array[String]]] = js.native
  def createTargets(platforms: js.Array[Platform], `type`: Null, arch: String): Map[Platform, Map[Arch, js.Array[String]]] = js.native
  def createYargs(): Argv[js.Object] = js.native
  def normalizeOptions(args: CliOptions): BuildOptions = js.native
}

