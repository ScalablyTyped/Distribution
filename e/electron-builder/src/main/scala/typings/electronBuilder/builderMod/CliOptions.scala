package typings.electronBuilder.builderMod

import typings.appBuilderLib.configurationMod.Configuration
import typings.appBuilderLib.coreMod.Platform
import typings.appBuilderLib.packagerApiMod.PackagerOptions
import typings.appBuilderLib.packagerMod.Packager
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.builderUtil.archMod.Arch
import typings.electronPublish.mod.PublishOptions
import typings.electronPublish.mod.PublishPolicy
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
    config: js.UndefOr[Null | Configuration | String] = js.undefined,
    dir: js.UndefOr[Boolean] = js.undefined,
    effectiveOptionComputed: /* options */ js.Any => js.Promise[Boolean] = null,
    ia32: js.UndefOr[Boolean] = js.undefined,
    linux: js.Array[String] = null,
    mac: js.Array[String] = null,
    platformPackagerFactory: js.UndefOr[Null | ((/* info */ Packager, /* platform */ Platform) => PlatformPackager[_])] = js.undefined,
    prepackaged: js.UndefOr[Null | String] = js.undefined,
    projectDir: js.UndefOr[Null | String] = js.undefined,
    publish: js.UndefOr[Null | PublishPolicy] = js.undefined,
    targets: Map[Platform, Map[Arch, js.Array[String]]] = null,
    win: js.Array[String] = null,
    x64: js.UndefOr[Boolean] = js.undefined
  ): CliOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arm64)) __obj.updateDynamic("arm64")(arm64.get.asInstanceOf[js.Any])
    if (!js.isUndefined(armv7l)) __obj.updateDynamic("armv7l")(armv7l.get.asInstanceOf[js.Any])
    if (!js.isUndefined(config)) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(dir)) __obj.updateDynamic("dir")(dir.get.asInstanceOf[js.Any])
    if (effectiveOptionComputed != null) __obj.updateDynamic("effectiveOptionComputed")(js.Any.fromFunction1(effectiveOptionComputed))
    if (!js.isUndefined(ia32)) __obj.updateDynamic("ia32")(ia32.get.asInstanceOf[js.Any])
    if (linux != null) __obj.updateDynamic("linux")(linux.asInstanceOf[js.Any])
    if (mac != null) __obj.updateDynamic("mac")(mac.asInstanceOf[js.Any])
    if (!js.isUndefined(platformPackagerFactory)) __obj.updateDynamic("platformPackagerFactory")(if (platformPackagerFactory != null) js.Any.fromFunction2(platformPackagerFactory.asInstanceOf[(/* info */ Packager, /* platform */ Platform) => PlatformPackager[_]]) else null)
    if (!js.isUndefined(prepackaged)) __obj.updateDynamic("prepackaged")(prepackaged.asInstanceOf[js.Any])
    if (!js.isUndefined(projectDir)) __obj.updateDynamic("projectDir")(projectDir.asInstanceOf[js.Any])
    if (!js.isUndefined(publish)) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (win != null) __obj.updateDynamic("win")(win.asInstanceOf[js.Any])
    if (!js.isUndefined(x64)) __obj.updateDynamic("x64")(x64.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CliOptions]
  }
}

