package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativesList extends js.Object {
  /** A list of creatives. */
  var items: js.UndefOr[js.Array[Creative]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  /** Continuation token used to page through creatives. To retrieve the next page of results, set the next request's "pageToken" value to this. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object CreativesList {
  @scala.inline
  def apply(items: js.Array[Creative] = null, kind: String = null, nextPageToken: String = null): CreativesList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreativesList]
  }
}

