package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `ExecutionPolicy` can be used to control the scheduling of the action.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2ExecutionPolicy extends js.Object {
  /**
    * The priority (relative importance) of this action. Generally, a lower
    * value means that the action should be run sooner than actions having a
    * greater priority value, but the interpretation of a given value is
    * server- dependent. A priority of 0 means the *default* priority.
    * Priorities may be positive or negative, and such actions should run later
    * or sooner than actions having the default priority, respectively. The
    * particular semantics of this field is up to the server. In particular,
    * every server will have their own supported range of priorities, and will
    * decide how these map into scheduling policy.
    */
  var priority: js.UndefOr[Double] = js.native
}

object Schema$BuildBazelRemoteExecutionV2ExecutionPolicy {
  @scala.inline
  def apply(priority: Int | Double = null): Schema$BuildBazelRemoteExecutionV2ExecutionPolicy = {
    val __obj = js.Dynamic.literal()
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2ExecutionPolicy]
  }
}

