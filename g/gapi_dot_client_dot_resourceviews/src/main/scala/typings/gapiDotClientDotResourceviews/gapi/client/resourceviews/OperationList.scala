package typings.gapiDotClientDotResourceviews.gapi.client.resourceviews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationList extends js.Object {
  /** Unique identifier for the resource; defined by the server (output only). */
  var id: js.UndefOr[String] = js.undefined
  /** The operation resources. */
  var items: js.UndefOr[js.Array[Operation]] = js.undefined
  /** Type of resource. */
  var kind: js.UndefOr[String] = js.undefined
  /** A token used to continue a truncated list request (output only). */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Server defined URL for this resource (output only). */
  var selfLink: js.UndefOr[String] = js.undefined
}

object OperationList {
  @scala.inline
  def apply(
    id: String = null,
    items: js.Array[Operation] = null,
    kind: String = null,
    nextPageToken: String = null,
    selfLink: String = null
  ): OperationList = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[OperationList]
  }
}

