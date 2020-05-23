package typings.firebaseFirestore.localStoreMod

import typings.firebaseFirestore.collectionsMod.DocumentKeySet_
import typings.firebaseFirestore.collectionsMod.DocumentMap_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResult extends js.Object {
  val documents: DocumentMap_
  val remoteKeys: DocumentKeySet_
}

object QueryResult {
  @scala.inline
  def apply(documents: DocumentMap_, remoteKeys: DocumentKeySet_): QueryResult = {
    val __obj = js.Dynamic.literal(documents = documents.asInstanceOf[js.Any], remoteKeys = remoteKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult]
  }
}

