package typings.atFirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSrcModelCollectionsMod {
  import typings.atFirebaseFirestore.distSrcCoreSnapshotUnderscoreVersionMod.SnapshotVersion
  import typings.atFirebaseFirestore.distSrcCoreTypesMod.TargetId
  import typings.atFirebaseFirestore.distSrcModelDocumentMod.Document
  import typings.atFirebaseFirestore.distSrcModelDocumentMod.MaybeDocument
  import typings.atFirebaseFirestore.distSrcModelDocumentUnderscoreKeyMod.DocumentKey
  import typings.atFirebaseFirestore.distSrcUtilSortedUnderscoreMapMod.SortedMap
  import typings.atFirebaseFirestore.distSrcUtilSortedUnderscoreSetMod.SortedSet

  type DocumentKeySet = SortedSet[DocumentKey]
  type DocumentMap = SortedMap[DocumentKey, Document]
  type DocumentVersionMap = SortedMap[DocumentKey, SnapshotVersion]
  type MaybeDocumentMap = SortedMap[DocumentKey, MaybeDocument]
  type NullableMaybeDocumentMap = SortedMap[DocumentKey, MaybeDocument | Null]
  type TargetIdSet = SortedSet[TargetId]
}
