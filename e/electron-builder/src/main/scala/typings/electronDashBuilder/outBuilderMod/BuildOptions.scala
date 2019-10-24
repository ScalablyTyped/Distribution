package typings.electronDashBuilder.outBuilderMod

import typings.electronDashPublish.electronDashPublishMod.PublishOptions
import typings.electronDashPublish.electronDashPublishMod.PublishPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PackagerOptions * / any */ trait BuildOptions extends PublishOptions

object BuildOptions {
  @scala.inline
  def apply(publish: PublishPolicy = null): BuildOptions = {
    val __obj = js.Dynamic.literal()
    if (publish != null) __obj.updateDynamic("publish")(publish)
    __obj.asInstanceOf[BuildOptions]
  }
}

