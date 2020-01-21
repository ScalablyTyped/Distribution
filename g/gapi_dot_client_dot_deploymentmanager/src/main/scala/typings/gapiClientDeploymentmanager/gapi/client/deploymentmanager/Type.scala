package typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  /** Output only. Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  /** Output only. Timestamp when the type was created, in RFC3339 text format. */
  var insertTime: js.UndefOr[String] = js.undefined
  /** Name of the type. */
  var name: js.UndefOr[String] = js.undefined
  /** Output only. The Operation that most recently ran, or is currently running, on this type. */
  var operation: js.UndefOr[Operation] = js.undefined
  /** Output only. Self link for the type. */
  var selfLink: js.UndefOr[String] = js.undefined
}

object Type {
  @scala.inline
  def apply(
    id: String = null,
    insertTime: String = null,
    name: String = null,
    operation: Operation = null,
    selfLink: String = null
  ): Type = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (insertTime != null) __obj.updateDynamic("insertTime")(insertTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

