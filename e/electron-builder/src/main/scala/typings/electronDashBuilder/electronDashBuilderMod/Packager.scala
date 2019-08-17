package typings.electronDashBuilder.electronDashBuilderMod

import typings.appDashBuilderDashLib.outPackagerApiMod.PackagerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-builder", "Packager")
@js.native
class Packager protected ()
  extends typings.appDashBuilderDashLib.outMod.Packager {
  def this(options: PackagerOptions) = this()
  def this(
    options: PackagerOptions,
    cancellationToken: typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeMod.CancellationToken
  ) = this()
}

