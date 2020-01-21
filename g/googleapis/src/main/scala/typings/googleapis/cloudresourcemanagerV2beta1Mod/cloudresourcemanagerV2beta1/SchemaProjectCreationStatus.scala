package typings.googleapis.cloudresourcemanagerV2beta1Mod.cloudresourcemanagerV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A status object which is used as the `metadata` field for the Operation
  * returned by CreateProject. It provides insight for when significant phases
  * of Project creation have completed.
  */
@js.native
trait SchemaProjectCreationStatus extends js.Object {
  /**
    * Creation time of the project creation workflow.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * True if the project can be retrieved using GetProject. No other
    * operations on the project are guaranteed to work until the project
    * creation is complete.
    */
  var gettable: js.UndefOr[Boolean] = js.native
  /**
    * True if the project creation process is complete.
    */
  var ready: js.UndefOr[Boolean] = js.native
}

object SchemaProjectCreationStatus {
  @scala.inline
  def apply(
    createTime: String = null,
    gettable: js.UndefOr[Boolean] = js.undefined,
    ready: js.UndefOr[Boolean] = js.undefined
  ): SchemaProjectCreationStatus = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (!js.isUndefined(gettable)) __obj.updateDynamic("gettable")(gettable.asInstanceOf[js.Any])
    if (!js.isUndefined(ready)) __obj.updateDynamic("ready")(ready.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProjectCreationStatus]
  }
}

