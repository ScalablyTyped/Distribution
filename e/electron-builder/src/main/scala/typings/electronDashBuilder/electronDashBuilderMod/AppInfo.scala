package typings.electronDashBuilder.electronDashBuilderMod

import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-builder", "AppInfo")
@js.native
class AppInfo protected ()
  extends typings.appDashBuilderDashLib.outMod.AppInfo {
  def this(info: typings.appDashBuilderDashLib.outPackagerMod.Packager) = this()
  def this(info: typings.appDashBuilderDashLib.outPackagerMod.Packager, buildVersion: String) = this()
  def this(
    info: typings.appDashBuilderDashLib.outPackagerMod.Packager,
    buildVersion: js.UndefOr[scala.Nothing],
    platformSpecificOptions: PlatformSpecificBuildOptions
  ) = this()
  def this(
    info: typings.appDashBuilderDashLib.outPackagerMod.Packager,
    buildVersion: String,
    platformSpecificOptions: PlatformSpecificBuildOptions
  ) = this()
  def this(
    info: typings.appDashBuilderDashLib.outPackagerMod.Packager,
    buildVersion: Null,
    platformSpecificOptions: PlatformSpecificBuildOptions
  ) = this()
}

