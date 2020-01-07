package typings.googleapis.buildSrcApisStorageV1Mod.storage_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of buckets.
  */
@js.native
trait Schema$Buckets extends js.Object {
  /**
    * The list of items.
    */
  var items: js.UndefOr[js.Array[Schema$Bucket]] = js.native
  /**
    * The kind of item this is. For lists of buckets, this is always
    * storage#buckets.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The continuation token, used to page through large result sets. Provide
    * this value in a subsequent request to return the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$Buckets {
  @scala.inline
  def apply(items: js.Array[Schema$Bucket] = null, kind: String = null, nextPageToken: String = null): Schema$Buckets = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Buckets]
  }
}

