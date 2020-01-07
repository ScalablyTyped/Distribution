package typings.googleapis.buildSrcApisStorageV1beta2Mod.storage_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An access-control list.
  */
@js.native
trait Schema$BucketAccessControls extends js.Object {
  /**
    * The list of items.
    */
  var items: js.UndefOr[js.Array[Schema$BucketAccessControl]] = js.native
  /**
    * The kind of item this is. For lists of bucket access control entries,
    * this is always storage#bucketAccessControls.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$BucketAccessControls {
  @scala.inline
  def apply(items: js.Array[Schema$BucketAccessControl] = null, kind: String = null): Schema$BucketAccessControls = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BucketAccessControls]
  }
}

