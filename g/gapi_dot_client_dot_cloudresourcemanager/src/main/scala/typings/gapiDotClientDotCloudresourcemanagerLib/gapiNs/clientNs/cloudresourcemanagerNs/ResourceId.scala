package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceId extends js.Object {
  /**
    * Required field for the type-specific id. This should correspond to the id
    * used in the type-specific API's.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Required field representing the resource type this id is for.
    * At present, the valid types are: "organization"
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ResourceId {
  @scala.inline
  def apply(id: java.lang.String = null, `type`: java.lang.String = null): ResourceId = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResourceId]
  }
}

