package typings.googleapis.buildSrcApisServiceusageV1Mod.serviceusage_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of a log type. Example in YAML format:      - name:
  * library.googleapis.com/activity_history       description: The history of
  * borrowing and returning library items.       display_name: Activity labels:
  * - key: /customer_id         description: Identifier of a library customer
  */
@js.native
trait Schema$LogDescriptor extends js.Object {
  /**
    * A human-readable description of this log. This information appears in the
    * documentation and can contain details.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The human-readable name for this log. This information appears on the
    * user interface and should be concise.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The set of labels that are available to describe a specific log entry.
    * Runtime requests that contain labels not specified here are considered
    * invalid.
    */
  var labels: js.UndefOr[js.Array[Schema$LabelDescriptor]] = js.native
  /**
    * The name of the log. It must be less than 512 characters long and can
    * include the following characters: upper- and lower-case alphanumeric
    * characters [A-Za-z0-9], and punctuation characters including slash,
    * underscore, hyphen, period [/_-.].
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$LogDescriptor {
  @scala.inline
  def apply(
    description: String = null,
    displayName: String = null,
    labels: js.Array[Schema$LabelDescriptor] = null,
    name: String = null
  ): Schema$LogDescriptor = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LogDescriptor]
  }
}

