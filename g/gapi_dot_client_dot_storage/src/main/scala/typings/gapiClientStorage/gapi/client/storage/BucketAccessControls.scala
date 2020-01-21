package typings.gapiClientStorage.gapi.client.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketAccessControls extends js.Object {
  /** The list of items. */
  var items: js.UndefOr[js.Array[BucketAccessControl]] = js.undefined
  /** The kind of item this is. For lists of bucket access control entries, this is always storage#bucketAccessControls. */
  var kind: js.UndefOr[String] = js.undefined
}

object BucketAccessControls {
  @scala.inline
  def apply(items: js.Array[BucketAccessControl] = null, kind: String = null): BucketAccessControls = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketAccessControls]
  }
}

