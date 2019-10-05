package typings.gapiDotClientDotServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogDescriptor extends js.Object {
  /**
    * A human-readable description of this log. This information appears in
    * the documentation and can contain details.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The human-readable name for this log. This information appears on
    * the user interface and should be concise.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * The set of labels that are available to describe a specific log entry.
    * Runtime requests that contain labels not specified here are
    * considered invalid.
    */
  var labels: js.UndefOr[js.Array[LabelDescriptor]] = js.undefined
  /**
    * The name of the log. It must be less than 512 characters long and can
    * include the following characters: upper- and lower-case alphanumeric
    * characters [A-Za-z0-9], and punctuation characters including
    * slash, underscore, hyphen, period [/_-.].
    */
  var name: js.UndefOr[String] = js.undefined
}

object LogDescriptor {
  @scala.inline
  def apply(
    description: String = null,
    displayName: String = null,
    labels: js.Array[LabelDescriptor] = null,
    name: String = null
  ): LogDescriptor = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[LogDescriptor]
  }
}

