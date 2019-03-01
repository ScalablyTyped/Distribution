package typings
package electronDashPublishLib.electronDashPublishMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishContext extends js.Object {
  val cancellationToken: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeMod.CancellationToken
  val progress: electronDashPublishLib.outMultiProgressMod.MultiProgress | scala.Null
}

object PublishContext {
  @scala.inline
  def apply(
    cancellationToken: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeMod.CancellationToken,
    progress: electronDashPublishLib.outMultiProgressMod.MultiProgress = null
  ): PublishContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancellationToken")(cancellationToken)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    __obj.asInstanceOf[PublishContext]
  }
}

