package typings.gapiDotClientDotFusiontables.gapi.client.fusiontables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableList extends js.Object {
  /** List of all requested tables. */
  var items: js.UndefOr[js.Array[Table]] = js.undefined
  /** The kind of item this is. For table list, this is always fusiontables#tableList. */
  var kind: js.UndefOr[String] = js.undefined
  /** Token used to access the next page of this result. No token is displayed if there are no more pages left. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object TableList {
  @scala.inline
  def apply(items: js.Array[Table] = null, kind: String = null, nextPageToken: String = null): TableList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableList]
  }
}

