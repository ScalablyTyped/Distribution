package typings.dialogflow.protosProtosMod.google.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ResourceReference. */
trait IResourceReference extends js.Object {
  /** ResourceReference childType */
  var childType: js.UndefOr[String | Null] = js.undefined
  /** ResourceReference type */
  var `type`: js.UndefOr[String | Null] = js.undefined
}

object IResourceReference {
  @scala.inline
  def apply(childType: String = null, `type`: String = null): IResourceReference = {
    val __obj = js.Dynamic.literal()
    if (childType != null) __obj.updateDynamic("childType")(childType)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IResourceReference]
  }
}

