package typings
package electronDashBuilderLib.outBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-builder/out/builder", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def build(): js.Promise[js.Array[java.lang.String]] = js.native
  def build(rawOptions: electronDashBuilderLib.outBuilderMod.CliOptions): js.Promise[js.Array[java.lang.String]] = js.native
  def coerceTypes(host: js.Any): js.Any = js.native
  def createTargets(platforms: js.Array[appDashBuilderDashLibLib.appDashBuilderDashLibMod.Platform]): nodeLib.Map[
    appDashBuilderDashLibLib.appDashBuilderDashLibMod.Platform, 
    nodeLib.Map[builderDashUtilLib.outArchMod.Arch, js.Array[java.lang.String]]
  ] = js.native
  def createTargets(
    platforms: js.Array[appDashBuilderDashLibLib.appDashBuilderDashLibMod.Platform],
    `type`: java.lang.String
  ): nodeLib.Map[
    appDashBuilderDashLibLib.appDashBuilderDashLibMod.Platform, 
    nodeLib.Map[builderDashUtilLib.outArchMod.Arch, js.Array[java.lang.String]]
  ] = js.native
  def createTargets(
    platforms: js.Array[appDashBuilderDashLibLib.appDashBuilderDashLibMod.Platform],
    `type`: java.lang.String,
    arch: java.lang.String
  ): nodeLib.Map[
    appDashBuilderDashLibLib.appDashBuilderDashLibMod.Platform, 
    nodeLib.Map[builderDashUtilLib.outArchMod.Arch, js.Array[java.lang.String]]
  ] = js.native
  def createTargets(
    platforms: js.Array[appDashBuilderDashLibLib.appDashBuilderDashLibMod.Platform],
    `type`: scala.Null,
    arch: java.lang.String
  ): nodeLib.Map[
    appDashBuilderDashLibLib.appDashBuilderDashLibMod.Platform, 
    nodeLib.Map[builderDashUtilLib.outArchMod.Arch, js.Array[java.lang.String]]
  ] = js.native
}

