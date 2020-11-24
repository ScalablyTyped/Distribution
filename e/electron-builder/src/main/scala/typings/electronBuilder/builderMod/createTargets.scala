package typings.electronBuilder.builderMod

import typings.appBuilderLib.mod.Platform
import typings.builderUtil.archMod.Arch
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron-builder/out/builder", "createTargets")
@js.native
object createTargets extends js.Object {
  
  def apply(platforms: js.Array[Platform]): Map[Platform, Map[Arch, js.Array[String]]] = js.native
  def apply(platforms: js.Array[Platform], `type`: js.UndefOr[scala.Nothing], arch: String): Map[Platform, Map[Arch, js.Array[String]]] = js.native
  def apply(platforms: js.Array[Platform], `type`: String): Map[Platform, Map[Arch, js.Array[String]]] = js.native
  def apply(platforms: js.Array[Platform], `type`: String, arch: String): Map[Platform, Map[Arch, js.Array[String]]] = js.native
  def apply(platforms: js.Array[Platform], `type`: Null, arch: String): Map[Platform, Map[Arch, js.Array[String]]] = js.native
}
