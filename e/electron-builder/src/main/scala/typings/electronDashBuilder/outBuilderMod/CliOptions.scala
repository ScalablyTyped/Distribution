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
  var arm64: js.UndefOr[Boolean] = js.undefined
  var armv7l: js.UndefOr[Boolean] = js.undefined
  var dir: js.UndefOr[Boolean] = js.undefined
  var ia32: js.UndefOr[Boolean] = js.undefined
  var x64: js.UndefOr[Boolean] = js.undefined
}

object CliOptions {
  @scala.inline
  def apply(
    arm64: js.UndefOr[Boolean] = js.undefined,
    armv7l: js.UndefOr[Boolean] = js.undefined,
    config: Configuration | String = null,
    dir: js.UndefOr[Boolean] = js.undefined,
    effectiveOptionComputed: /* options */ js.Any => js.Promise[Boolean] = null,
    ia32: js.UndefOr[Boolean] = js.undefined,
    linux: js.Array[String] = null,
    mac: js.Array[String] = null,
    platformPackagerFactory: (/* info */ Packager, /* platform */ Platform) => PlatformPackager[_] = null,
    prepackaged: String = null,
    projectDir: String = null,
    publish: PublishPolicy = null,
    targets: Map[Platform, Map[Arch, js.Array[String]]] = null,
    win: js.Array[String] = null,
    x64: js.UndefOr[Boolean] = js.undefined
  ): CliOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arm64)) __obj.updateDynamic("arm64")(arm64.asInstanceOf[js.Any])
    if (!js.isUndefined(armv7l)) __obj.updateDynamic("armv7l")(armv7l.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(dir)) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (effectiveOptionComputed != null) __obj.updateDynamic("effectiveOptionComputed")(js.Any.fromFunction1(effectiveOptionComputed))
    if (!js.isUndefined(ia32)) __obj.updateDynamic("ia32")(ia32.asInstanceOf[js.Any])
    if (linux != null) __obj.updateDynamic("linux")(linux.asInstanceOf[js.Any])
    if (mac != null) __obj.updateDynamic("mac")(mac.asInstanceOf[js.Any])
    if (platformPackagerFactory != null) __obj.updateDynamic("platformPackagerFactory")(js.Any.fromFunction2(platformPackagerFactory))
    if (prepackaged != null) __obj.updateDynamic("prepackaged")(prepackaged.asInstanceOf[js.Any])
    if (projectDir != null) __obj.updateDynamic("projectDir")(projectDir.asInstanceOf[js.Any])
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (win != null) __obj.updateDynamic("win")(win.asInstanceOf[js.Any])
    if (!js.isUndefined(x64)) __obj.updateDynamic("x64")(x64.asInstanceOf[js.Any])
    __obj.asInstanceOf[CliOptions]
  }
}

