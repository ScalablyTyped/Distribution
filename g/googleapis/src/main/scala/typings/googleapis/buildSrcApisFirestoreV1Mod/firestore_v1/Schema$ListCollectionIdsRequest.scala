package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Firestore.ListCollectionIds.
  */
@js.native
trait Schema$ListCollectionIdsRequest extends js.Object {
  /**
    * The maximum number of results to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A page token. Must be a value from ListCollectionIdsResponse.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object Schema$ListCollectionIdsRequest {
  @scala.inline
  def apply(pageSize: Int | Double = null, pageToken: String = null): Schema$ListCollectionIdsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListCollectionIdsRequest]
  }
}

