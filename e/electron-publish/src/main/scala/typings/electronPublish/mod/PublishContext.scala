package typings.electronPublish.mod

import typings.builderUtilRuntime.mod.CancellationToken
import typings.electronPublish.multiProgressMod.MultiProgress
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
    val __obj = js.Dynamic.literal(cancellationToken = cancellationToken.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishContext]
  }
}

