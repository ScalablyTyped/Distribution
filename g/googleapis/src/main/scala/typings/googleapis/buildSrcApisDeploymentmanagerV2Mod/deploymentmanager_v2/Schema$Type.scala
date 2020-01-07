package typings.googleapis.buildSrcApisDeploymentmanagerV2Mod.deploymentmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource type supported by Deployment Manager.
  */
@js.native
trait Schema$Type extends js.Object {
  var id: js.UndefOr[String] = js.native
  /**
    * Output only. Creation timestamp in RFC3339 text format.
    */
  var insertTime: js.UndefOr[String] = js.native
  /**
    * Name of the type.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The Operation that most recently ran, or is currently
    * running, on this type.
    */
  var operation: js.UndefOr[Schema$Operation] = js.native
  /**
    * Output only. Server defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object Schema$Type {
  @scala.inline
  def apply(
    id: String = null,
    insertTime: String = null,
    name: String = null,
    operation: Schema$Operation = null,
    selfLink: String = null
  ): Schema$Type = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (insertTime != null) __obj.updateDynamic("insertTime")(insertTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Type]
  }
}

