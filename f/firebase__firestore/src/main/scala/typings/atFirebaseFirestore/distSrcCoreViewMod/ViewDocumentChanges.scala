package typings.atFirebaseFirestore.distSrcCoreViewMod

import typings.atFirebaseFirestore.distSrcCoreViewUnderscoreSnapshotMod.DocumentChangeSet
import typings.atFirebaseFirestore.distSrcModelCollectionsMod.DocumentKeySet
import typings.atFirebaseFirestore.distSrcModelDocumentUnderscoreSetMod.DocumentSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewDocumentChanges extends js.Object {
  /** The diff of these docs with the previous set of docs. */
  var changeSet: DocumentChangeSet
  /** The new set of docs that should be in the view. */
  var documentSet: DocumentSet
  var mutatedKeys: DocumentKeySet
  /**
    * Whether the set of documents passed in was not sufficient to calculate the
    * new state of the view and there needs to be another pass based on the
    * local cache.
    */
  var needsRefill: Boolean
}

object ViewDocumentChanges {
  @scala.inline
  def apply(
    changeSet: DocumentChangeSet,
    documentSet: DocumentSet,
    mutatedKeys: DocumentKeySet,
    needsRefill: Boolean
  ): ViewDocumentChanges = {
    val __obj = js.Dynamic.literal(changeSet = changeSet.asInstanceOf[js.Any], documentSet = documentSet.asInstanceOf[js.Any], mutatedKeys = mutatedKeys.asInstanceOf[js.Any], needsRefill = needsRefill.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ViewDocumentChanges]
  }
}

