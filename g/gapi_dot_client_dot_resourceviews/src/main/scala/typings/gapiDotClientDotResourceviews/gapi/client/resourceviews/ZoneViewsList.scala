package typings.gapiDotClientDotResourceviews.gapi.client.resourceviews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneViewsList extends js.Object {
  /** The result that contains all resource views that meet the criteria. */
  var items: js.UndefOr[js.Array[ResourceView]] = js.undefined
  /** Type of resource. */
  var kind: js.UndefOr[String] = js.undefined
  /** A token used for pagination. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Server defined URL for this resource (output only). */
  var selfLink: js.UndefOr[String] = js.undefined
}

object ZoneViewsList {
  @scala.inline
  def apply(
    items: js.Array[ResourceView] = null,
    kind: String = null,
    nextPageToken: String = null,
    selfLink: String = null
  ): ZoneViewsList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneViewsList]
  }
}

