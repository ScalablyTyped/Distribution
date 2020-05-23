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

trait BuildOptions
  extends PackagerOptions
     with PublishOptions

object BuildOptions {
  @scala.inline
  def apply(
    config: js.UndefOr[Null | Configuration | String] = js.undefined,
    effectiveOptionComputed: /* options */ js.Any => js.Promise[Boolean] = null,
    linux: js.Array[String] = null,
    mac: js.Array[String] = null,
    platformPackagerFactory: js.UndefOr[Null | ((/* info */ Packager, /* platform */ Platform) => PlatformPackager[_])] = js.undefined,
    prepackaged: js.UndefOr[Null | String] = js.undefined,
    projectDir: js.UndefOr[Null | String] = js.undefined,
    publish: js.UndefOr[Null | PublishPolicy] = js.undefined,
    targets: Map[Platform, Map[Arch, js.Array[String]]] = null,
    win: js.Array[String] = null
  ): BuildOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(config)) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (effectiveOptionComputed != null) __obj.updateDynamic("effectiveOptionComputed")(js.Any.fromFunction1(effectiveOptionComputed))
    if (linux != null) __obj.updateDynamic("linux")(linux.asInstanceOf[js.Any])
    if (mac != null) __obj.updateDynamic("mac")(mac.asInstanceOf[js.Any])
    if (!js.isUndefined(platformPackagerFactory)) __obj.updateDynamic("platformPackagerFactory")(if (platformPackagerFactory != null) js.Any.fromFunction2(platformPackagerFactory.asInstanceOf[(/* info */ Packager, /* platform */ Platform) => PlatformPackager[_]]) else null)
    if (!js.isUndefined(prepackaged)) __obj.updateDynamic("prepackaged")(prepackaged.asInstanceOf[js.Any])
    if (!js.isUndefined(projectDir)) __obj.updateDynamic("projectDir")(projectDir.asInstanceOf[js.Any])
    if (!js.isUndefined(publish)) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (win != null) __obj.updateDynamic("win")(win.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOptions]
  }
}

