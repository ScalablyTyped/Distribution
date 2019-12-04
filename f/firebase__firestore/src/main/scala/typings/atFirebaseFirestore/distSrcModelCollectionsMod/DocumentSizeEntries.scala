package typings.atFirebaseFirestore.distSrcModelCollectionsMod

import typings.atFirebaseFirestore.distSrcModelDocumentUnderscoreKeyMod.DocumentKey
import typings.atFirebaseFirestore.distSrcUtilSortedUnderscoreMapMod.SortedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentSizeEntries extends js.Object {
  var maybeDocuments: NullableMaybeDocumentMap
  var sizeMap: SortedMap[DocumentKey, Double]
}

object DocumentSizeEntries {
  @scala.inline
  def apply(maybeDocuments: NullableMaybeDocumentMap, sizeMap: SortedMap[DocumentKey, Double]): DocumentSizeEntries = {
    val __obj = js.Dynamic.literal(maybeDocuments = maybeDocuments.asInstanceOf[js.Any], sizeMap = sizeMap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DocumentSizeEntries]
  }
}

