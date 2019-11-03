package typings.dialogflow.protosProtosMod.google.api

import typings.dialogflow.protosProtosMod.google.api.ResourceDescriptor.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ResourceDescriptor. */
trait IResourceDescriptor extends js.Object {
  /** ResourceDescriptor history */
  var history: js.UndefOr[History | Null] = js.undefined
  /** ResourceDescriptor nameField */
  var nameField: js.UndefOr[String | Null] = js.undefined
  /** ResourceDescriptor pattern */
  var pattern: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** ResourceDescriptor type */
  var `type`: js.UndefOr[String | Null] = js.undefined
}

object IResourceDescriptor {
  @scala.inline
  def apply(
    history: History = null,
    nameField: String = null,
    pattern: js.Array[String] = null,
    `type`: String = null
  ): IResourceDescriptor = {
    val __obj = js.Dynamic.literal()
    if (history != null) __obj.updateDynamic("history")(history)
    if (nameField != null) __obj.updateDynamic("nameField")(nameField)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IResourceDescriptor]
  }
}

