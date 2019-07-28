package typings.electronDashPublish.electronDashPublishMod

import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeMod.CancellationToken
import typings.electronDashPublish.outMultiProgressMod.MultiProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishContext extends js.Object {
  val cancellationToken: CancellationToken
  val progress: MultiProgress | Null
}

object PublishContext {
  @scala.inline
  def apply(cancellationToken: CancellationToken, progress: MultiProgress = null): PublishContext = {
    val __obj = js.Dynamic.literal(cancellationToken = cancellationToken)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    __obj.asInstanceOf[PublishContext]
  }
}

