package typings.firebaseFirestore.localSharedClientStateMod

import typings.firebaseFirestore.modelCollectionsMod.TargetIdSet_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientState extends js.Object {
  val activeTargetIds: TargetIdSet_
}

object ClientState {
  @scala.inline
  def apply(activeTargetIds: TargetIdSet_): ClientState = {
    val __obj = js.Dynamic.literal(activeTargetIds = activeTargetIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientState]
  }
}

