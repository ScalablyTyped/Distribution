package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionSelector extends js.Object {
  var allDescendants: js.UndefOr[Boolean] = js.undefined
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

