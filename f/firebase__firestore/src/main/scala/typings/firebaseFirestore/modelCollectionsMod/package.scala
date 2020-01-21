package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object modelCollectionsMod {
  type DocumentKeySet_ = typings.firebaseFirestore.utilSortedSetMod.SortedSet[typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey]
  type DocumentMap_ = typings.firebaseFirestore.utilSortedMapMod.SortedMap[
    typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey, 
    typings.firebaseFirestore.modelDocumentMod.Document
  ]
  type DocumentVersionMap_ = typings.firebaseFirestore.utilSortedMapMod.SortedMap[
    typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey, 
    typings.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
  ]
  type MaybeDocumentMap_ = typings.firebaseFirestore.utilSortedMapMod.SortedMap[
    typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey, 
    typings.firebaseFirestore.modelDocumentMod.MaybeDocument
  ]
  type NullableMaybeDocumentMap_ = typings.firebaseFirestore.utilSortedMapMod.SortedMap[
    typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey, 
    typings.firebaseFirestore.modelDocumentMod.MaybeDocument | scala.Null
  ]
  type TargetIdSet_ = typings.firebaseFirestore.utilSortedSetMod.SortedSet[typings.firebaseFirestore.coreTypesMod.TargetId]
}
