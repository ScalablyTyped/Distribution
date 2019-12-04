package typings.atFirebaseFirestore.distSrcLocalLocalUnderscoreStoreMod

import typings.atFirebaseFirestore.distSrcModelCollectionsMod.DocumentKeySet
import typings.atFirebaseFirestore.distSrcModelCollectionsMod.DocumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResult extends js.Object {
  val documents: DocumentMap
  val remoteKeys: DocumentKeySet
}

object QueryResult {
  @scala.inline
  def apply(documents: DocumentMap, remoteKeys: DocumentKeySet): QueryResult = {
    val __obj = js.Dynamic.literal(documents = documents.asInstanceOf[js.Any], remoteKeys = remoteKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryResult]
  }
}

