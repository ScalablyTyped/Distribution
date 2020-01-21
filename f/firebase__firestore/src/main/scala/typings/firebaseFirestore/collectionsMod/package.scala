package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object collectionsMod {
  type DocumentKeySet_ = typings.firebaseFirestore.sortedSetMod.SortedSet[typings.firebaseFirestore.documentKeyMod.DocumentKey]
  type DocumentMap_ = typings.firebaseFirestore.sortedMapMod.SortedMap[
    typings.firebaseFirestore.documentKeyMod.DocumentKey, 
    typings.firebaseFirestore.documentMod.Document
  ]
  type DocumentVersionMap_ = typings.firebaseFirestore.sortedMapMod.SortedMap[
    typings.firebaseFirestore.documentKeyMod.DocumentKey, 
    typings.firebaseFirestore.snapshotVersionMod.SnapshotVersion
  ]
  type MaybeDocumentMap_ = typings.firebaseFirestore.sortedMapMod.SortedMap[
    typings.firebaseFirestore.documentKeyMod.DocumentKey, 
    typings.firebaseFirestore.documentMod.MaybeDocument
  ]
  type NullableMaybeDocumentMap_ = typings.firebaseFirestore.sortedMapMod.SortedMap[
    typings.firebaseFirestore.documentKeyMod.DocumentKey, 
    typings.firebaseFirestore.documentMod.MaybeDocument | scala.Null
  ]
  type TargetIdSet_ = typings.firebaseFirestore.sortedSetMod.SortedSet[typings.firebaseFirestore.typesMod.TargetId]
}
