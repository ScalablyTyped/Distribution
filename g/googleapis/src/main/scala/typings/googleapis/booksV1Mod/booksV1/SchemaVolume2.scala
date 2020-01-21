package typings.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVolume2 extends js.Object {
  /**
    * A list of volumes.
    */
  var items: js.UndefOr[js.Array[SchemaVolume]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaVolume2 {
  @scala.inline
  def apply(items: js.Array[SchemaVolume] = null, kind: String = null, nextPageToken: String = null): SchemaVolume2 = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVolume2]
  }
}

