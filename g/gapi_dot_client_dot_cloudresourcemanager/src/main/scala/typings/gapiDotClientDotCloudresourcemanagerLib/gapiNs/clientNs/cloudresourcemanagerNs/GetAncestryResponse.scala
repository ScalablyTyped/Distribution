package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAncestryResponse extends js.Object {
  /**
    * Ancestors are ordered from bottom to top of the resource hierarchy. The
    * first ancestor is the project itself, followed by the project's parent,
    * etc.
    */
  var ancestor: js.UndefOr[js.Array[Ancestor]] = js.undefined
}

object GetAncestryResponse {
  @scala.inline
  def apply(ancestor: js.Array[Ancestor] = null): GetAncestryResponse = {
    val __obj = js.Dynamic.literal()
    if (ancestor != null) __obj.updateDynamic("ancestor")(ancestor)
    __obj.asInstanceOf[GetAncestryResponse]
  }
}

