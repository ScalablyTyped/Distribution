package typings.googleCloudPubsub.protosMod.google.api

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
  def apply(
    childType: js.UndefOr[Null | String] = js.undefined,
    `type`: js.UndefOr[Null | String] = js.undefined
  ): IResourceReference = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(childType)) __obj.updateDynamic("childType")(childType.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResourceReference]
  }
}

