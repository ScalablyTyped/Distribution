package typings.gapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Volume2 extends js.Object {
  /** A list of volumes. */
  var items: js.UndefOr[js.Array[Volume]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object Volume2 {
  @scala.inline
  def apply(items: js.Array[Volume] = null, kind: String = null, nextPageToken: String = null): Volume2 = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volume2]
  }
}

