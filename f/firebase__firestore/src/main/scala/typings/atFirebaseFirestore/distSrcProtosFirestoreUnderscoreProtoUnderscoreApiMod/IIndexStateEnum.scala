package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndexStateEnum extends js.Object {
  var CREATING: IndexState
  var ERROR: IndexState
  var READY: IndexState
  var STATE_UNSPECIFIED: IndexState
  def values(): js.Array[IndexState]
}

object IIndexStateEnum {
  @scala.inline
  def apply(
    CREATING: IndexState,
    ERROR: IndexState,
    READY: IndexState,
    STATE_UNSPECIFIED: IndexState,
    values: () => js.Array[IndexState]
  ): IIndexStateEnum = {
    val __obj = js.Dynamic.literal(CREATING = CREATING.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], READY = READY.asInstanceOf[js.Any], STATE_UNSPECIFIED = STATE_UNSPECIFIED.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
  
    __obj.asInstanceOf[IIndexStateEnum]
  }
}

