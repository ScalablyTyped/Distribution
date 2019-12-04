package typings.atFirebaseFirestore.distSrcRemoteWatchUnderscoreChangeMod

import typings.atFirebaseFirestore.distSrcCoreTypesMod.TargetId
import typings.atFirebaseFirestore.distSrcLocalTargetUnderscoreDataMod.TargetData
import typings.atFirebaseFirestore.distSrcModelCollectionsMod.DocumentKeySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetMetadataProvider extends js.Object {
  /**
    * Returns the set of remote document keys for the given target ID as of the
    * last raised snapshot.
    */
  def getRemoteKeysForTarget(targetId: TargetId): DocumentKeySet
  /**
    * Returns the TargetData for an active target ID or 'null' if this target
    * has become inactive
    */
  def getTargetDataForTarget(targetId: TargetId): TargetData | Null
}

object TargetMetadataProvider {
  @scala.inline
  def apply(
    getRemoteKeysForTarget: TargetId => DocumentKeySet,
    getTargetDataForTarget: TargetId => TargetData | Null
  ): TargetMetadataProvider = {
    val __obj = js.Dynamic.literal(getRemoteKeysForTarget = js.Any.fromFunction1(getRemoteKeysForTarget), getTargetDataForTarget = js.Any.fromFunction1(getTargetDataForTarget))
  
    __obj.asInstanceOf[TargetMetadataProvider]
  }
}

