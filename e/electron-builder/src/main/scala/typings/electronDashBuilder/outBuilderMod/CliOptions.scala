package typings.electronDashBuilder.outBuilderMod

import typings.appDashBuilderDashLib.outConfigurationMod.Configuration
import typings.appDashBuilderDashLib.outCoreMod.Platform
import typings.appDashBuilderDashLib.outPackagerApiMod.PackagerOptions
import typings.appDashBuilderDashLib.outPackagerMod.Packager
import typings.appDashBuilderDashLib.outPlatformPackagerMod.PlatformPackager
import typings.builderDashUtil.outArchMod.Arch
import typings.electronDashPublish.electronDashPublishMod.PublishOptions
import typings.electronDashPublish.electronDashPublishMod.PublishPolicy
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CliOptions
  extends PackagerOptions
     with PublishOptions {
  var arch: js.UndefOr[String] = js.undefined
  var arm64: js.UndefOr[Boolean] = js.undefined
  var armv7l: js.UndefOr[Boolean] = js.undefined
  var dir: js.UndefOr[Boolean] = js.undefined
  var ia32: js.UndefOr[Boolean] = js.undefined
  var platform: js.UndefOr[String] = js.undefined
  var x64: js.UndefOr[Boolean] = js.undefined
}

object CliOptions {
  @scala.inline
  def apply(
    arch: String = null,
    arm64: js.UndefOr[Boolean] = js.undefined,
    armv7l: js.UndefOr[Boolean] = js.undefined,
    config: Configuration | String = null,
    dir: js.UndefOr[Boolean] = js.undefined,
    effectiveOptionComputed: /* options */ js.Any => js.Promise[Boolean] = null,
    ia32: js.UndefOr[Boolean] = js.undefined,
    linux: js.Array[String] = null,
    mac: js.Array[String] = null,
    platform: String = null,
    platformPackagerFactory: (/* info */ Packager, /* platform */ Platform) => PlatformPackager[_] = null,
    prepackaged: String = null,
    projectDir: String = null,
    publish: PublishPolicy = null,
    targets: Map[Platform, Map[Arch, js.Array[String]]] = null,
    win: js.Array[String] = null,
    x64: js.UndefOr[Boolean] = js.undefined
  ): CliOptions = {
    val __obj = js.Dynamic.literal()
    if (arch != null) __obj.updateDynamic("arch")(arch)
    if (!js.isUndefined(arm64)) __obj.updateDynamic("arm64")(arm64)
    if (!js.isUndefined(armv7l)) __obj.updateDynamic("armv7l")(armv7l)
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(dir)) __obj.updateDynamic("dir")(dir)
    if (effectiveOptionComputed != null) __obj.updateDynamic("effectiveOptionComputed")(js.Any.fromFunction1(effectiveOptionComputed))
    if (!js.isUndefined(ia32)) __obj.updateDynamic("ia32")(ia32)
    if (linux != null) __obj.updateDynamic("linux")(linux)
    if (mac != null) __obj.updateDynamic("mac")(mac)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (platformPackagerFactory != null) __obj.updateDynamic("platformPackagerFactory")(js.Any.fromFunction2(platformPackagerFactory))
    if (prepackaged != null) __obj.updateDynamic("prepackaged")(prepackaged)
    if (projectDir != null) __obj.updateDynamic("projectDir")(projectDir)
    if (publish != null) __obj.updateDynamic("publish")(publish)
    if (targets != null) __obj.updateDynamic("targets")(targets)
    if (win != null) __obj.updateDynamic("win")(win)
    if (!js.isUndefined(x64)) __obj.updateDynamic("x64")(x64)
    __obj.asInstanceOf[CliOptions]
  }
}

