package typings
package electronDashBuilderLib.outBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CliOptions
  extends appDashBuilderDashLibLib.outPackagerApiMod.PackagerOptions
     with electronDashPublishLib.electronDashPublishMod.PublishOptions {
  var arch: js.UndefOr[java.lang.String] = js.undefined
  var arm64: js.UndefOr[scala.Boolean] = js.undefined
  var armv7l: js.UndefOr[scala.Boolean] = js.undefined
  var dir: js.UndefOr[scala.Boolean] = js.undefined
  var ia32: js.UndefOr[scala.Boolean] = js.undefined
  var platform: js.UndefOr[java.lang.String] = js.undefined
  var x64: js.UndefOr[scala.Boolean] = js.undefined
}

object CliOptions {
  @scala.inline
  def apply(
    arch: java.lang.String = null,
    arm64: js.UndefOr[scala.Boolean] = js.undefined,
    armv7l: js.UndefOr[scala.Boolean] = js.undefined,
    config: appDashBuilderDashLibLib.outConfigurationMod.Configuration | java.lang.String = null,
    dir: js.UndefOr[scala.Boolean] = js.undefined,
    effectiveOptionComputed: js.Function1[/* options */ js.Any, js.Promise[scala.Boolean]] = null,
    ia32: js.UndefOr[scala.Boolean] = js.undefined,
    linux: js.Array[java.lang.String] = null,
    mac: js.Array[java.lang.String] = null,
    platform: java.lang.String = null,
    platformPackagerFactory: js.Function2[
      /* info */ appDashBuilderDashLibLib.outPackagerMod.Packager, 
      /* platform */ appDashBuilderDashLibLib.outCoreMod.Platform, 
      appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[_]
    ] = null,
    prepackaged: java.lang.String = null,
    projectDir: java.lang.String = null,
    publish: electronDashPublishLib.electronDashPublishMod.PublishPolicy = null,
    targets: nodeLib.Map[
      appDashBuilderDashLibLib.outCoreMod.Platform, 
      nodeLib.Map[builderDashUtilLib.outArchMod.Arch, js.Array[java.lang.String]]
    ] = null,
    win: js.Array[java.lang.String] = null,
    x64: js.UndefOr[scala.Boolean] = js.undefined
  ): CliOptions = {
    val __obj = js.Dynamic.literal()
    if (arch != null) __obj.updateDynamic("arch")(arch)
    if (!js.isUndefined(arm64)) __obj.updateDynamic("arm64")(arm64)
    if (!js.isUndefined(armv7l)) __obj.updateDynamic("armv7l")(armv7l)
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(dir)) __obj.updateDynamic("dir")(dir)
    if (effectiveOptionComputed != null) __obj.updateDynamic("effectiveOptionComputed")(effectiveOptionComputed)
    if (!js.isUndefined(ia32)) __obj.updateDynamic("ia32")(ia32)
    if (linux != null) __obj.updateDynamic("linux")(linux)
    if (mac != null) __obj.updateDynamic("mac")(mac)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (platformPackagerFactory != null) __obj.updateDynamic("platformPackagerFactory")(platformPackagerFactory)
    if (prepackaged != null) __obj.updateDynamic("prepackaged")(prepackaged)
    if (projectDir != null) __obj.updateDynamic("projectDir")(projectDir)
    if (publish != null) __obj.updateDynamic("publish")(publish)
    if (targets != null) __obj.updateDynamic("targets")(targets)
    if (win != null) __obj.updateDynamic("win")(win)
    if (!js.isUndefined(x64)) __obj.updateDynamic("x64")(x64)
    __obj.asInstanceOf[CliOptions]
  }
}

