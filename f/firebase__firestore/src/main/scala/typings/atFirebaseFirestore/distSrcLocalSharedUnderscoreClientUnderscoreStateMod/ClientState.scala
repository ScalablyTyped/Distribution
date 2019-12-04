package typings.atFirebaseFirestore.distSrcLocalSharedUnderscoreClientUnderscoreStateMod

import typings.atFirebaseFirestore.distSrcModelCollectionsMod.TargetIdSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientState extends js.Object {
  val activeTargetIds: TargetIdSet
}

object ClientState {
  @scala.inline
  def apply(activeTargetIds: TargetIdSet): ClientState = {
    val __obj = js.Dynamic.literal(activeTargetIds = activeTargetIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientState]
  }
}

