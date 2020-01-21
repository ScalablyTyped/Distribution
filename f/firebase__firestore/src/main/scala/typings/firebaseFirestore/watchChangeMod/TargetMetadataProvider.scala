package typings.firebaseFirestore.watchChangeMod

import typings.firebaseFirestore.collectionsMod.DocumentKeySet_
import typings.firebaseFirestore.targetDataMod.TargetData
import typings.firebaseFirestore.typesMod.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetMetadataProvider extends js.Object {
  /**
    * Returns the set of remote document keys for the given target ID as of the
    * last raised snapshot.
    */
  def getRemoteKeysForTarget(targetId: TargetId): DocumentKeySet_
  /**
    * Returns the TargetData for an active target ID or 'null' if this target
    * has become inactive
    */
  def getTargetDataForTarget(targetId: TargetId): TargetData | Null
}

object TargetMetadataProvider {
  @scala.inline
  def apply(
    getRemoteKeysForTarget: TargetId => DocumentKeySet_,
    getTargetDataForTarget: TargetId => TargetData | Null
  ): TargetMetadataProvider = {
    val __obj = js.Dynamic.literal(getRemoteKeysForTarget = js.Any.fromFunction1(getRemoteKeysForTarget), getTargetDataForTarget = js.Any.fromFunction1(getTargetDataForTarget))
  
    __obj.asInstanceOf[TargetMetadataProvider]
  }
}

