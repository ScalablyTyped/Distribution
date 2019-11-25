package typings.gapiDotClientDotFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionSelector extends js.Object {
  /**
    * When false, selects only collections that are immediate children of
    * the `parent` specified in the containing `RunQueryRequest`.
    * When true, selects all descendant collections.
    */
  var allDescendants: js.UndefOr[Boolean] = js.undefined
  /**
    * The collection ID.
    * When set, selects only collections with this ID.
    */
  var collectionId: js.UndefOr[String] = js.undefined
}

object CollectionSelector {
  @scala.inline
  def apply(allDescendants: js.UndefOr[Boolean] = js.undefined, collectionId: String = null): CollectionSelector = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allDescendants)) __obj.updateDynamic("allDescendants")(allDescendants.asInstanceOf[js.Any])
    if (collectionId != null) __obj.updateDynamic("collectionId")(collectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionSelector]
  }
}

