package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initializers tracks the progress of initialization.
  */
@js.native
trait Schema$Initializers extends js.Object {
  /**
    * Pending is a list of initializers that must execute in order before this
    * object is visible. When the last pending initializer is removed, and no
    * failing result is set, the initializers struct will be set to nil and the
    * object is considered as initialized and visible to all clients.
    * +patchMergeKey=name +patchStrategy=merge
    */
  var pending: js.UndefOr[js.Array[Schema$Initializer]] = js.native
}

object Schema$Initializers {
  @scala.inline
  def apply(pending: js.Array[Schema$Initializer] = null): Schema$Initializers = {
    val __obj = js.Dynamic.literal()
    if (pending != null) __obj.updateDynamic("pending")(pending.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Initializers]
  }
}

