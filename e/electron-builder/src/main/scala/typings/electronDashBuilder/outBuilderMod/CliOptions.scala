package typings.electronDashBuilder.outBuilderMod

import typings.electronDashPublish.electronDashPublishMod.PublishOptions
import typings.electronDashPublish.electronDashPublishMod.PublishPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PackagerOptions * / any */ trait CliOptions extends PublishOptions {
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
    dir: js.UndefOr[Boolean] = js.undefined,
    ia32: js.UndefOr[Boolean] = js.undefined,
    publish: PublishPolicy = null,
    x64: js.UndefOr[Boolean] = js.undefined
  ): CliOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arm64)) __obj.updateDynamic("arm64")(arm64)
    if (!js.isUndefined(armv7l)) __obj.updateDynamic("armv7l")(armv7l)
    if (!js.isUndefined(dir)) __obj.updateDynamic("dir")(dir)
    if (!js.isUndefined(ia32)) __obj.updateDynamic("ia32")(ia32)
    if (publish != null) __obj.updateDynamic("publish")(publish)
    if (!js.isUndefined(x64)) __obj.updateDynamic("x64")(x64)
    __obj.asInstanceOf[CliOptions]
  }
}

