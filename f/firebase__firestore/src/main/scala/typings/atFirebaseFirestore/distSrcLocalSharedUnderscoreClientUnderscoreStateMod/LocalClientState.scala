package typings.atFirebaseFirestore.distSrcLocalSharedUnderscoreClientUnderscoreStateMod

import typings.atFirebaseFirestore.distSrcCoreTypesMod.TargetId
import typings.atFirebaseFirestore.distSrcModelCollectionsMod.TargetIdSet
import typings.atFirebaseFirestore.distSrcUtilSortedUnderscoreSetMod.SortedSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/shared_client_state", "LocalClientState")
@js.native
class LocalClientState () extends ClientState {
  /* CompleteClass */
  override val activeTargetIds: TargetIdSet = js.native
  @JSName("activeTargetIds")
  var activeTargetIds_LocalClientState: SortedSet[Double] = js.native
  def addQueryTarget(targetId: TargetId): Unit = js.native
  def removeQueryTarget(targetId: TargetId): Unit = js.native
  /**
    * Converts this entry into a JSON-encoded format we can use for WebStorage.
    * Does not encode `clientId` as it is part of the key in WebStorage.
    */
  def toWebStorageJSON(): String = js.native
}

