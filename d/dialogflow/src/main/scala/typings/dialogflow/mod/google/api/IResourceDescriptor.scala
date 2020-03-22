package typings.dialogflow.mod.google.api

import typings.dialogflow.mod.google.api.ResourceDescriptor.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ResourceDescriptor. */
trait IResourceDescriptor extends js.Object {
  /** ResourceDescriptor history */
  var history: js.UndefOr[History | String | Null] = js.undefined
  /** ResourceDescriptor nameField */
  var nameField: js.UndefOr[String | Null] = js.undefined
  /** ResourceDescriptor pattern */
  var pattern: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** ResourceDescriptor plural */
  var plural: js.UndefOr[String | Null] = js.undefined
  /** ResourceDescriptor singular */
  var singular: js.UndefOr[String | Null] = js.undefined
  /** ResourceDescriptor type */
  var `type`: js.UndefOr[String | Null] = js.undefined
}

object IResourceDescriptor {
  @scala.inline
  def apply(
    history: History | String = null,
    nameField: String = null,
    pattern: js.Array[String] = null,
    plural: String = null,
    singular: String = null,
    `type`: String = null
  ): IResourceDescriptor = {
    val __obj = js.Dynamic.literal()
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (nameField != null) __obj.updateDynamic("nameField")(nameField.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (plural != null) __obj.updateDynamic("plural")(plural.asInstanceOf[js.Any])
    if (singular != null) __obj.updateDynamic("singular")(singular.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResourceDescriptor]
  }
}

